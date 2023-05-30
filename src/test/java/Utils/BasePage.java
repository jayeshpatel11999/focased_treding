package Utils;

import Page.*;
import Page.Admin.*;
import Page.MyTrades.*;
import Page.Research.BackMonthHistoryPage;
import Page.Research.MonthlyHistoryPage;
import Page.Research.QuarterlyHistoryPage;
import Page.Research.TechnicalHistoryPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

public class BasePage {
    protected WebDriver driver;
    private Helper helper = new Helper(driver);
    public static String currentTest;
    protected static String screenshot_folder_path = null;
    public String browser;
    public String headless;

    public LoginPage loginPage;
    public SignupPage signupPage;
    public OpenTradesPage openTradesPage;
    public MyTrades myTrades;
    public CancelledPage cancelledPage;
    public PendingPage pendingPage;
    public ViewTrade viewTrade;
    public TraderAccountDetails traderAccountDetails;
    public ClosedPage closedPage;
    public VerifiedPage verifiedPage;
    public MyTeamPage myTeamPage;
    public MonthlyHistoryPage monthlyHistoryPage;
    public QuarterlyHistoryPage quarterlyHistoryPage;
    public TechnicalHistoryPage technicalHistoryPage;
    public BackMonthHistoryPage backMonthHistoryPage;
    public HistoryDetailsPage historyDetailsPage;
    public ReportsPage reportsPage;
    public ChartPage chartPage;
    public ResourcesPage resourcesPage;
    public ClientsPage clientsPage;
    public TraderAccountsPage traderAccountsPage;
    public CreateTraderPage createTraderPage;
    public BrokerageAccountsPage brokerageAccountsPage;
    public EditTrendPage editTrendPage;
    @BeforeMethod(alwaysRun = true)
    @Parameters("browser")
    public void setup(Method method, @Optional String Browser) throws IOException, ParseException, InterruptedException {

        String SCREENSHOT_FOLDER_NAME = "screenshots";
        screenshot_folder_path = new File(SCREENSHOT_FOLDER_NAME).getAbsolutePath();

        browser = helper.data_repository("xpathlist", "config", "browser");
        headless = helper.data_repository("xpathlist", "config", "headless");

        currentTest = method.getName(); // get Name of current test.

        //++++++++++++++If Browser value null means run directly via class then also it can run++++++++++++++++++++++
        if (Browser == null) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.out.println("Browser open: " + Thread.currentThread().getName());
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                if (headless.equals("true")) {
                    chromeOptions.addArguments("--no-sandbox");
                    chromeOptions.addArguments("--headless");
                    chromeOptions.addArguments("disable-gpu");
                    chromeOptions.addArguments("--window-size=1280,800");
                    chromeOptions.addArguments("--allow-insecure-localhost");
                    ChromeDriver driver = new ChromeDriver(chromeOptions);
                }
                driver = new ChromeDriver(chromeOptions);
            } else if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                EdgeDriverManager edgeDriverManager = new EdgeDriverManager();
                driver = new EdgeDriver();
            }
        } else {
            if (Browser.equalsIgnoreCase("chrome")) {
                System.out.println("parallel execution on chrome: " + Thread.currentThread().getName());
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-privacy");
                if (headless.equals("true")) {
                    chromeOptions.addArguments("--no-sandbox");
                    chromeOptions.addArguments("--headless");
                    chromeOptions.addArguments("disable-gpu");
                    ChromeDriver driver = new ChromeDriver(chromeOptions);
                }
                driver = new ChromeDriver(chromeOptions);
            } else if (Browser.equalsIgnoreCase("firefox")) {
                System.out.println("parallel execution on firefox: " + Thread.currentThread().getName());
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                driver = new FirefoxDriver();
            } else if (Browser.equalsIgnoreCase("edge")) {
                System.out.println("parallel execution on edge: " + Thread.currentThread().getName());
                WebDriverManager.edgedriver().setup();
                EdgeDriverManager edgeDriverManager = new EdgeDriverManager();
                driver = new EdgeDriver();
            } else {
                System.out.println("browser is null");
            }
        }


        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        signupPage = new SignupPage(driver);
        openTradesPage = new OpenTradesPage(driver);
        myTrades = new MyTrades(driver);
        cancelledPage = new CancelledPage(driver);
        pendingPage = new PendingPage(driver);
        viewTrade = new ViewTrade(driver);
        traderAccountDetails = new TraderAccountDetails(driver);
        closedPage = new ClosedPage(driver);
        verifiedPage = new VerifiedPage(driver);
        myTeamPage = new MyTeamPage(driver);
        monthlyHistoryPage = new MonthlyHistoryPage(driver);
        quarterlyHistoryPage = new QuarterlyHistoryPage(driver);
        technicalHistoryPage = new TechnicalHistoryPage(driver);
        backMonthHistoryPage = new BackMonthHistoryPage(driver);
        historyDetailsPage = new HistoryDetailsPage(driver);
        reportsPage = new ReportsPage(driver);
        chartPage = new ChartPage(driver);
        resourcesPage = new ResourcesPage(driver);
        clientsPage = new ClientsPage(driver);
        traderAccountsPage = new TraderAccountsPage(driver);
        createTraderPage = new CreateTraderPage(driver);
        brokerageAccountsPage = new BrokerageAccountsPage(driver);
        editTrendPage = new EditTrendPage(driver);
    }

    /**
     * After Method {TearDown}
     *
     * @param testResult
     */
    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult testResult) {
        try {

            String testName = testResult.getName();

            if (!testResult.isSuccess()) {

                System.out.println("TEST FAILED - " + testName);

                /* Make a screenshot for test that failed */
                TakesScreenshot ts = (TakesScreenshot) driver;
                File source = ts.getScreenshotAs(OutputType.FILE);
                try {
                    FileHandler.copy(source, new File("./Screenshots/" + testResult.getName() + ".png"));
                    System.out.println("Screenshot taken");
                } catch (Exception e) {
                    System.out.println("Exception while taking screenshot " + e.getMessage());
                }

                String screenshotName = helper.getCurrentTimeStampString()
                        + testName;
                Reporter.log("<br> <b>Please look to the screenshot - </b>" + screenshotName);
            } else {
                System.out.println("TEST PASSED - " + testName + "\n");
            }

            driver.manage().deleteAllCookies();
            driver.quit();

        } catch (WebDriverException e) {
        }
    }
}
