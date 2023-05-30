package Page.Admin;

import Utils.BasePage;
import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class TraderAccountsPage extends BasePage {
    WebDriver driver;
    Helper helper;
    String RefreshIcon;
    String AdminTab;
    String TraderAccountsTab;
    String CreateTraderAccountButton;
    String ListOfTraderStrategiesTitle;
    String DropdownForTraderName;
    String ToggleButton;
    String SearchField;
    String ShowHideColumnButton;
    String FullScreenIcon;
    String TraderTitle;
    String SystemAdmin;
    String SearchedLength;
    String SearcheTraderName;
    String UpdateButton;
    String FirstTraderInList;
    String NoRecordsToDisplay;
    String FirstTraderEnabledResult;
    String StrategyLinkOfFirstTrader;
    String TraderAccountDetailsTitle;
    String PerformanceLinkOfFirstTrader;
    String SummaryReportTitle;
    String EquityCurveOfFirstTrader;
    String TraderEquityCurveTitle;


    public TraderAccountsPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);

        AdminTab = helper.data_repository("xpathlist", "TraderAccounts", "AdminTab");
        TraderAccountsTab = helper.data_repository("xpathlist", "TraderAccounts", "TraderAccountsTab");
        RefreshIcon = helper.data_repository("xpathlist", "TraderAccounts", "RefreshIcon");
        CreateTraderAccountButton = helper.data_repository("xpathlist", "TraderAccounts", "CreateTraderAccountButton");
        ListOfTraderStrategiesTitle = helper.data_repository("xpathlist", "TraderAccounts", "ListOfTraderStrategiesTitle");
        DropdownForTraderName = helper.data_repository("xpathlist", "TraderAccounts", "DropdownForTraderName");
        ToggleButton = helper.data_repository("xpathlist", "TraderAccounts", "ToggleButton");
        SearchField = helper.data_repository("xpathlist", "TraderAccounts", "SearchField");
        ShowHideColumnButton = helper.data_repository("xpathlist", "TraderAccounts", "ShowHideColumnButton");
        FullScreenIcon = helper.data_repository("xpathlist", "TraderAccounts", "FullScreenIcon");
        TraderTitle = helper.data_repository("xpathlist", "TraderAccounts", "TraderTitle");
        SystemAdmin = helper.data_repository("TestData", "TraderAccountsData", "SystemAdmin");
        SearchedLength = helper.data_repository("xpathlist", "TraderAccounts", "SearchedLength");
        SearcheTraderName = helper.data_repository("xpathlist", "TraderAccounts", "SearcheTraderName");
        UpdateButton = helper.data_repository("xpathlist", "TraderAccounts", "UpdateButton");
        FirstTraderInList = helper.data_repository("xpathlist", "TraderAccounts", "FirstTraderInList");
        NoRecordsToDisplay = helper.data_repository("xpathlist", "TraderAccounts", "NoRecordsToDisplay");
        FirstTraderEnabledResult = helper.data_repository("xpathlist", "TraderAccounts", "FirstTraderEnabledResult");
        TraderAccountDetailsTitle = helper.data_repository("xpathlist", "TraderAccounts", "TraderAccountDetailsTitle");
        StrategyLinkOfFirstTrader = helper.data_repository("xpathlist", "TraderAccounts", "StrategyLinkOfFirstTrader");
        PerformanceLinkOfFirstTrader = helper.data_repository("xpathlist", "TraderAccounts", "PerformanceLinkOfFirstTrader");
        SummaryReportTitle = helper.data_repository("xpathlist", "TraderAccounts", "SummaryReportTitle");
        EquityCurveOfFirstTrader = helper.data_repository("xpathlist", "TraderAccounts", "EquityCurveOfFirstTrader");
        TraderEquityCurveTitle = helper.data_repository("xpathlist", "TraderAccounts", "TraderEquityCurveTitle");
    }
    public void openTraderAccountsPage() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(AdminTab);
        helper.click(AdminTab);
        helper.click(TraderAccountsTab);
    }

    public void traderAccountsPageUI() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ListOfTraderStrategiesTitle);
        Assert.assertTrue(helper.isElementPresent(ListOfTraderStrategiesTitle));
        Assert.assertTrue(helper.isElementPresent(RefreshIcon));
        Assert.assertTrue(helper.isElementPresent(CreateTraderAccountButton));
        Assert.assertTrue(helper.isElementPresent(SearchField));
        Assert.assertTrue(helper.isElementPresent(DropdownForTraderName));
        Assert.assertTrue(helper.isElementPresent(ToggleButton));
        Assert.assertTrue(helper.isElementPresent(ShowHideColumnButton));
        Assert.assertTrue(helper.isElementPresent(FullScreenIcon));
    }

    public void verifyRefreshIcon() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ListOfTraderStrategiesTitle);
        helper.click(RefreshIcon);
        helper.waitForElement(RefreshIcon);
    }

    public void clickOnCreateTraderAccountButtonAndRedirectOnTraderDetailsPage() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(CreateTraderAccountButton);
        helper.click(CreateTraderAccountButton);
        helper.waitForElement(TraderTitle);
        Assert.assertTrue(helper.isElementPresent(TraderTitle));

    }
    public void searched_result_functionality() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(SearchField);
        helper.enterDataInField(SearchField , SystemAdmin);
        helper.PressEnter_Key();
        int ele_size = helper.getElementSize(SearchedLength);
        System.out.println(ele_size);
        String actual = helper.getText(SearcheTraderName);
        String Expected = SystemAdmin;
        Assert.assertEquals(actual , Expected);
    }
    public void selectTrader() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(DropdownForTraderName);
        helper.selectByVisibleText(DropdownForTraderName , "Select Trader");
        helper.click(UpdateButton);
        helper.waitForElement(NoRecordsToDisplay);
        helper.isElementPresent(NoRecordsToDisplay);
        helper.selectByVisibleText(DropdownForTraderName , "System Adm...");
        helper.click(UpdateButton);
        helper.waitForElement(FirstTraderInList);
        helper.isElementPresent(FirstTraderInList);
    }
    public void WhenToggleButtonIsOffThenItIsFalse() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ToggleButton);
        String EnabledResult = helper.getText(FirstTraderEnabledResult);
        helper.waitForElement(ToggleButton);
        helper.click(ToggleButton);
        helper.click(UpdateButton);
        helper.waitForElement(ToggleButton);
        String EnabledResultAfterClickOnToggle = helper.getText(FirstTraderEnabledResult);
        System.out.println(EnabledResultAfterClickOnToggle);
        Assert.assertEquals(EnabledResultAfterClickOnToggle , "false");
    }

    public void WhenToggleButtonIsOnThenItIsTrue() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ToggleButton);
        String EnabledResult = helper.getText(FirstTraderEnabledResult);
        System.out.println(EnabledResult);
        Assert.assertEquals(EnabledResult , "true");
    }
    public void select_System_Adm_and_click_on_strategy_link() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(DropdownForTraderName);
        helper.selectByVisibleText(DropdownForTraderName , "System Adm...");
        helper.click(UpdateButton);
        helper.waitForElement(DropdownForTraderName);
        helper.click(StrategyLinkOfFirstTrader);
        helper.waitForElement(TraderAccountDetailsTitle);
        Assert.assertTrue(helper.isElementPresent(TraderAccountDetailsTitle));
    }
    public void select_System_Adm_and_click_on_performance_link() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(DropdownForTraderName);
        helper.selectByVisibleText(DropdownForTraderName , "System Adm...");
        helper.click(UpdateButton);
        helper.waitForElement(DropdownForTraderName);
        helper.click(PerformanceLinkOfFirstTrader);
        helper.waitForElement(SummaryReportTitle);
        Assert.assertTrue(helper.isElementPresent(SummaryReportTitle));
    }
    public void select_System_Adm_and_click_on_Equity_Curve_icon() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(DropdownForTraderName);
        helper.selectByVisibleText(DropdownForTraderName , "System Adm...");
        helper.click(UpdateButton);
        helper.waitForElement(DropdownForTraderName);
        helper.click(EquityCurveOfFirstTrader);
        helper.waitForElement(TraderEquityCurveTitle);
        Assert.assertTrue(helper.isElementPresent(TraderEquityCurveTitle));
    }
}
