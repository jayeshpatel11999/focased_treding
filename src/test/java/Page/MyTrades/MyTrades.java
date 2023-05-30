package Page.MyTrades;

import Utils.BasePage;
import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class MyTrades extends BasePage {
    WebDriver driver;
    Helper helper;
    String MyTradesMenu;

    String OpenMenu;
    String CloseMenu;
    String PendingMenu;
    String CancelledMenu;
    String VerifiedMenu;
    String My_Team;
    String OpenPageTitle;
    String ClosePageTitle;
    String PendingPageTitle;
    String CancelledPageTitle;
    String VerifiedPageTitle;
    String MyTradesPageTitle;

    public MyTrades(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);

        MyTradesMenu = helper.data_repository("xpathlist", "OpenTradePaga", "MyTradesMenu");
        OpenMenu = helper.data_repository("xpathlist", "OpenTradePaga", "OpenMenu");
        CloseMenu = helper.data_repository("xpathlist", "OpenTradePaga", "CloseMenu");
        PendingMenu = helper.data_repository("xpathlist", "OpenTradePaga", "Pending");
        CancelledMenu = helper.data_repository("xpathlist", "OpenTradePaga", "Cancelled");
        VerifiedMenu = helper.data_repository("xpathlist", "OpenTradePaga", "Verified");
        My_Team = helper.data_repository("xpathlist", "OpenTradePaga", "My_Team");
        OpenPageTitle = helper.data_repository("xpathlist", "MyTradesPage", "OpenPageTitle");
        ClosePageTitle = helper.data_repository("xpathlist", "MyTradesPage", "ClosePageTitle");
        PendingPageTitle = helper.data_repository("xpathlist", "MyTradesPage", "PendingPageTitle");
        CancelledPageTitle = helper.data_repository("xpathlist", "MyTradesPage", "CancelledPageTitle");
        VerifiedPageTitle = helper.data_repository("xpathlist", "MyTradesPage", "VerifiedPageTitle");
        MyTradesPageTitle = helper.data_repository("xpathlist", "MyTradesPage", "MyTradesPageTitle");
    }

    public void myTradesMenu() throws InterruptedException, IOException, ParseException {
        helper.click(MyTradesMenu);
        System.out.println("Clicked on trade menu");
        helper.log("Clicked on trade menu");
        helper.getResponseCode();

        for (int i = 0; i < 6; i++) {
            if (driver.findElement(By.xpath(OpenMenu)).isDisplayed()) {
                String Open = driver.findElement(By.xpath(OpenMenu)).getText();
                System.out.println("Verified Element: " + Open);
                String Closed = driver.findElement(By.xpath(CloseMenu)).getText();
                System.out.println("Verified Element: " + Closed);
                String Pending = driver.findElement(By.xpath(PendingMenu)).getText();
                System.out.println("Verified Element:" + Pending);
                String Cancelled = driver.findElement(By.xpath(CancelledMenu)).getText();
                System.out.println("Verified Element: " + Cancelled);
                String Verified = driver.findElement(By.xpath(VerifiedMenu)).getText();
                System.out.println("Verified Element: " + Verified);
                String MyTeam = driver.findElement(By.xpath(My_Team)).getText();
                System.out.println("Verified Element: " + MyTeam);


                //Velidate that all 6 option is visible or not
                Assert.assertEquals(Open, "Open");
                Assert.assertEquals(Closed, "Closed");
                Assert.assertEquals(Pending, "Pending");
                Assert.assertEquals(Cancelled, "Cancelled");
                Assert.assertEquals(Verified, "Verified");
                Assert.assertEquals(MyTeam, "My Team");

                break;
            } else {
                helper.click(MyTradesMenu);
            }
        }
    }

    public void myTrade_Redirection() throws InterruptedException, IOException, ParseException {

        helper.click(MyTradesMenu);
        System.out.println("Clicked on trade menu");
        helper.log("Clicked on trade menu");

        helper.getResponseCode();
        helper.click(OpenMenu);
        System.out.println("Clicked on Open Menu");
        helper.log("Clicked on Open menu");
        helper.getResponseCode();

        helper.waitForElement(OpenPageTitle);
        String OPageTitle = helper.getText(OpenPageTitle);
        Assert.assertEquals(OPageTitle, "LIST OF OPEN");

        helper.click(MyTradesMenu);
        System.out.println("Clicked on trade menu");
        helper.log("Clicked on trade menu");

        helper.getResponseCode();
        helper.click(CloseMenu);
        System.out.println("Clicked on Closed Menu");
        helper.log("Clicked on Closed menu");
        helper.getResponseCode();

        helper.waitForElement(ClosePageTitle);
        String ClPageTitle = helper.getText(ClosePageTitle);
        Assert.assertEquals(ClPageTitle, "LIST OF CLOSED");

        helper.click(MyTradesMenu);
        System.out.println("Clicked on trade menu");
        helper.log("Clicked on trade menu");

        helper.getResponseCode();
        helper.click(PendingMenu);
        System.out.println("Clicked on Pending menu");
        helper.log("Clicked on Pending menu");
        helper.getResponseCode();

        helper.wait_till_loading();
        helper.waitForElement(PendingPageTitle);
        String PPageTitle = helper.getText(PendingPageTitle);
        Assert.assertEquals(PPageTitle, "LIST OF PENDING");

        helper.click(MyTradesMenu);
        System.out.println("Clicked on trade menu");
        helper.log("Clicked on trade menu");

        helper.getResponseCode();
        helper.click(CancelledMenu);
        System.out.println("Clicked on Cancelled menu");
        helper.log("Clicked on Cancelled menu");
        helper.getResponseCode();

        helper.waitForElement(CancelledPageTitle);
        String CanPageTitle = helper.getText(CancelledPageTitle);
        Assert.assertEquals(CanPageTitle, "LIST OF CANCELLED");

        helper.click(MyTradesMenu);
        System.out.println("Clicked on trade menu");
        helper.log("Clicked on trade menu");

        helper.getResponseCode();
        helper.click(VerifiedMenu);
        System.out.println("Clicked on Verification menu");
        helper.log("Clicked on Verification menu");
        helper.getResponseCode();

        helper.waitForElement(VerifiedPageTitle);
        String VerPageTitle = helper.getText(VerifiedPageTitle);
        Assert.assertEquals(VerPageTitle, "LIST OF VERIFIED");

        helper.click(MyTradesMenu);
        System.out.println("Clicked on trade menu");
        helper.log("Clicked on trade menu");

        helper.getResponseCode();
        helper.click(My_Team);
        System.out.println("Clicked on My Team menu");
        helper.log("Clicked on My Team menu");
        helper.getResponseCode();

        helper.waitForElement(MyTradesPageTitle);
        String TeamPageTitle = helper.getText(MyTradesPageTitle);
        Assert.assertEquals(TeamPageTitle, "LIST OF MY TRADES");
    }
}
