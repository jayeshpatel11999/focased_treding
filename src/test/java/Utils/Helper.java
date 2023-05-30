package Utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v109.network.Network;
import org.openqa.selenium.devtools.v109.network.model.Response;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Helper {

    protected WebDriver driver;

    public Helper(WebDriver driver) {

        this.driver = driver;
    }

    /**
     * Find web-element for given locator.
     *
     * @param elementName
     * @return
     */
    public WebElement findElement(String elementName) {

        String locator;

        locator = elementName;

        int count = 0;
        while (count < 4) {
            try {
                if (locator.startsWith("link=") || locator.startsWith("LINK=")) {
                    locator = locator.substring(5); // remove "link=" from
                    // locator
                    try {
                        if (locator.contains(" "))
                            return driver.findElement(By
                                    .partialLinkText(locator));

                        return driver.findElement(By.linkText(locator));
                    } catch (Exception e) {
                        return null;
                    }
                }
                if (locator.startsWith("id=")) {
                    locator = locator.substring(3); // remove "id=" from locator
                    try {
                        return driver.findElement(By.id(locator));
                    } catch (Exception e) {
                        return null;
                    }
                } else if (locator.startsWith("//")) {
                    try {
                        return driver.findElement(By.xpath(locator));
                    } catch (Exception e) {
                        return null;
                    }
                } else if (locator.startsWith("css=")) {

                    locator = locator.substring(4); // remove "css=" from
                    // locator
                    try {
                        return driver.findElement(By.cssSelector(locator));
                    } catch (Exception e) {
                        return null;
                    }
                } else if (locator.startsWith("name=")) {

                    locator = locator.substring(5); // remove "name=" from
                    // locator
                    try {
                        return driver.findElement(By.name(locator));
                    } catch (Exception e) {
                        return null;
                    }
                } else {
                    try {
                        return driver.findElement(By.id(locator));
                    } catch (Exception e) {
                        return null;
                    }

                }
            } catch (StaleElementReferenceException e) {
                e.toString();

                count = count + 1;
                // System.out.println("Trying["+
                // count+"] to recover from a stale element :" +
                // e.getMessage());


            }
            count = count + 4;
        }


        return null;

    }

    public String getCurrentTimeStampString() {

        Date date = new Date();

        SimpleDateFormat sd = new SimpleDateFormat("MMddHHmmssSS");
        TimeZone timeZone = TimeZone.getDefault();
        Calendar cal = Calendar.getInstance(new SimpleTimeZone(timeZone
                .getOffset(date.getTime()), "GMT"));
        sd.setCalendar(cal);
        return sd.format(date);
    }

    /**
     * Log given message to Reporter output.
     *
     * @param msg Message/Log to be reported.
     */
    public void log(String msg) {
        Reporter.log("Step :: " + msg);

    }

    /**
     * Wait up to String locator present
     *
     * @param selector
     */
    public void waitForElement(String selector) throws IOException, ParseException, InterruptedException {
        pause(1);
        wait_till_loading();
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selector)));
    }
    public void waitForElementWithoutLoading(String selector) throws IOException, ParseException, InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selector)));
    }

    public void getresponseCode2() throws IOException, ParseException, InterruptedException {

        try {
            // establish, open connection with URL
            HttpURLConnection cn = (HttpURLConnection) new URL(driver.getCurrentUrl()).openConnection();
            // set HEADER request
            cn.setRequestMethod("HEAD");
            // connection initiate
            cn.connect();
            //get response code
            int res = cn.getResponseCode();
            //Display
            System.out.println("Http response code: " + res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getResponseCode() {
        DevTools devTools = ((ChromeDriver) driver).getDevTools();

        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        devTools.addListener(Network.responseReceived(), response ->
        {
            Response res = response.getResponse();
            if (res.getStatus().toString().startsWith("5")) {
                System.out.println(res.getUrl() + " is having server error with status code " + res.getStatus());
                Reporter.log(res.getUrl() + " is having server error with status code " + res.getStatus());

            }
            if (res.getStatus().toString().startsWith("4")) {
                System.out.println(res.getUrl() + " is having client error with status code " + res.getStatus());
                Reporter.log(res.getUrl() + " is having client error with status code " + res.getStatus());
            }
            if (res.getStatus().toString().startsWith("3")) {
                System.out.println(res.getUrl() + " is redirect with status code " + res.getStatus());
                Reporter.log(res.getUrl() + " is redirect with status code " + res.getStatus());
            }
        });
    }


    public String generateRandomChars(int length) {
        String total = "iokijfmnbxcvfrpqsdfgvcxzdferiuytjndifur";
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char _char = total.charAt((int) (Math.random() * 100)
                    % total.length());
            buf.append(_char);
        }
        return buf.toString();
    }

    public static int generateRandomNumber(int length) {

        Random ran = new Random();
        int num = ran.nextInt(length);
        //   int numNoRange = ran.nextInt();
        return num;

    }

    public String getText(String elementName) throws IOException, ParseException, InterruptedException {

        String text;

        try {
            text = driver.findElement(By.xpath(elementName)).getText();

        } catch (Exception e) {

            text = "Element was not found";
        }

        return text;
    }

    public boolean isElementPresent(String locator) {

        WebElement webElement = this.findElement(locator);
        if (webElement != null) {
            return true;
        } else {

            return false;
        }
    }

    public void pause(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException interruptedException) {
        }
    }


    public void scrollDown(String ele3) throws IOException, ParseException, InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Ele2 = driver.findElement(By.xpath(String.valueOf(ele3)));
        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Ele2);
        System.out.println("Scrolled down to " + ele3);
        Reporter.log("Scrolled down to " + ele3);
        waitForElement(ele3);
    }

    public int getElementSize(String locator) throws IOException, ParseException, InterruptedException {
        waitForElement(locator);
        int size = driver.findElements(By.xpath(locator)).size();
        return size;
    }
//    public static boolean Exists(this IWebElement element)
//    {
//        if (element == null)
//        { return false; }
//        return true;
//    }


    public void scrollandclick(String ele3) throws InterruptedException, IOException, ParseException {
        wait_till_loading();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Ele2 = driver.findElement(By.xpath(String.valueOf(ele3)));
        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Ele2);
        System.out.println("Scrolled down to " + ele3);
        Reporter.log("Scrolled down to " + ele3);
        waitForElement(ele3);
        driver.findElement(By.xpath(ele3)).click();
        System.out.println("Clicked on " + ele3);
        Reporter.log("Clicked on " + ele3);
    }
    public void scrollToElement(String locator) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement e = driver.findElement(By.xpath(locator));
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript ("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", e);

    }

    public void click(String ele3) throws InterruptedException, IOException, ParseException {
        waitForElement(ele3);
        driver.findElement(By.xpath(ele3)).click();
        System.out.println("Clicked on element" + ele3);
        Reporter.log("Clicked on element" + ele3);
    }

    public boolean isEnabled(String ele3) throws IOException, ParseException, InterruptedException {
        waitForElement(ele3);
        boolean Result = driver.findElement(By.xpath(ele3)).isEnabled();
        System.out.println(ele3 + " is Enabled");
        return Result;

    }

    public void clear(String ele3) throws InterruptedException, IOException, ParseException {
        waitForElement(ele3);
        driver.findElement(By.xpath(ele3)).clear();
        System.out.println("Cleared on element" + ele3);
        Reporter.log("Cleared on element" + ele3);
    }


    public void enterDataInField(String ele2, String TestData) throws InterruptedException, IOException, ParseException {
        waitForElement(ele2);
        driver.findElement(By.xpath(ele2)).sendKeys(TestData);
        System.out.println("Clicked on element" + ele2);
        Reporter.log("Clicked on element" + ele2);
    }



    public String data_repository(String xpath1, String module1, String xpath) throws IOException, org.json.simple.parser.ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader xpathReader = new FileReader("src/test/java/Config/elements.json");
        Object obj = jsonParser.parse(xpathReader);

        JSONArray pathlist = (JSONArray) obj;
        JSONObject getIndex = (JSONObject) pathlist.get(0);

        JSONObject base = (JSONObject) getIndex.get(xpath1);
        JSONObject module = (JSONObject) base.get(module1);
        String xp = (String) module.get(xpath);
        return xp;
    }

    public void wait_till_loading() throws IOException, ParseException, InterruptedException {
        pause(1);
        String Loading_Icon;
        Loading_Icon = data_repository("xpathlist", "LoginPage", "Loading_Icon");
        try {
            for (int i = 0; i < 3; i++) {
                if (driver.findElement(By.xpath(Loading_Icon)).isDisplayed()) {
                    new WebDriverWait(driver, Duration.ofSeconds(30))
                            .until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath(Loading_Icon))));
                    System.out.println("Page is loading");
                    break;
                } else {
                    pause(1);
                    System.out.println("loading icon is not visible");
                }
            }
        } catch (Exception ignored) {
        }
    }

    public void PressDown_Key() {
        Actions a = new Actions(driver);
        a.sendKeys(Keys.ARROW_DOWN);
        a.sendKeys(Keys.ENTER).perform();
    }

    public void PressEnter_Key() {
        Actions a = new Actions(driver);
        a.sendKeys(Keys.ENTER).perform();
    }
    public void PressBackSpace_Key(int n) {
        for (int i=0 ;i < n ; i++){
            Actions a = new Actions(driver);
            a.sendKeys(Keys.BACK_SPACE).perform();
        }
    }


    public void selectByVisibleText(String locator , String text) {
        WebElement element = driver.findElement(By.xpath(locator));
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(text);
    }

    public void removeDataFromField(String ele3) throws IOException, ParseException, InterruptedException {
        waitForElement(ele3);
        WebElement l = driver.findElement(By.xpath(ele3));
        // sending Ctrl+a by Keys.Chord()
        String s = Keys.chord(Keys.CONTROL, "a");
        l.sendKeys(s);
        // sending DELETE key
        l.sendKeys(Keys.DELETE);
    }

    public void isFileDownloaded(String filenameWithExtension) throws IOException {
        String downloadPath = "C:\\Users\\hp\\Downloads";
        String fileName = filenameWithExtension; // Replace with the actual file name

        File downloadedFile = new File(downloadPath + File.separator + fileName);
        pause(2);
        if (downloadedFile.exists()) {
            System.out.println("File downloaded successfully.");
            downloadedFile.delete();
        } else {
            System.out.println("File download failed.");
        }
    }
    public void zoomOut() {
        ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='80%';");
    }
}


