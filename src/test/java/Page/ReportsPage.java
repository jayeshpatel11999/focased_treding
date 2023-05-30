package Page;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.Date;

public class ReportsPage {
    WebDriver driver;
    Helper helper;
    String Performance_Overview_Title;
    String ReportsTab;
    String SubmitButton;
    String ViewChildTrades;
    String OnlyRealTrades;
    String IncludeDisabledAccounts;
    String EndDate;
    String StartDate;
    String IncludeOpenTrades;
    String UseEntryDate_field;
    String IncludeOptionTrades;
    String Date_field;
    String This_month;
    String IncludeStockTrades;
    String NoRecordFoundText;
    String EndDate_disabled;
    String StartDate_disabled;
    String Custom;
    String SelectStartDate;
    String SelectEndDate;
    String Last_year;
    String Search_field;
    public ReportsPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver,this);

        Performance_Overview_Title = helper.data_repository("xpathlist", "Reports", "Performance_Overview_Title");
        ReportsTab = helper.data_repository("xpathlist", "Reports", "ReportsTab");
        SubmitButton = helper.data_repository("xpathlist", "Reports", "SubmitButton");
        ViewChildTrades = helper.data_repository("xpathlist", "Reports", "ViewChildTrades");
        OnlyRealTrades = helper.data_repository("xpathlist", "Reports", "OnlyRealTrades");
        IncludeDisabledAccounts = helper.data_repository("xpathlist", "Reports", "IncludeDisabledAccounts");
        EndDate = helper.data_repository("xpathlist", "Reports", "EndDate");
        StartDate = helper.data_repository("xpathlist", "Reports", "StartDate");
        IncludeOpenTrades = helper.data_repository("xpathlist", "Reports", "IncludeOpenTrades");
        IncludeOptionTrades = helper.data_repository("xpathlist", "Reports", "IncludeOptionTrades");
        UseEntryDate_field = helper.data_repository("xpathlist", "Reports", "UseEntryDate_field");
        IncludeStockTrades = helper.data_repository("xpathlist", "Reports", "IncludeStockTrades");
        This_month = helper.data_repository("xpathlist", "Reports", "This_month");
        Date_field = helper.data_repository("xpathlist", "Reports", "Date_field");
        NoRecordFoundText = helper.data_repository("xpathlist", "Reports", "NoRecordFoundText");
        StartDate_disabled = helper.data_repository("xpathlist", "Reports", "StartDate_disabled");
        EndDate_disabled = helper.data_repository("xpathlist", "Reports", "EndDate_disabled");
        Custom = helper.data_repository("xpathlist", "Reports", "Custom");
        SelectStartDate = helper.data_repository("xpathlist", "Reports", "SelectStartDate");
        SelectEndDate = helper.data_repository("xpathlist", "Reports", "SelectEndDate");
        Last_year = helper.data_repository("xpathlist", "Reports", "Last_year");
        Search_field = helper.data_repository("xpathlist", "OpenTradePaga", "Search_field");

    }
    public void reportPageUI() throws IOException, ParseException, InterruptedException {
        helper.click(ReportsTab);
        helper.waitForElement(SubmitButton);
        helper.pause(5);
        Assert.assertTrue(helper.isElementPresent(Performance_Overview_Title));
        Assert.assertTrue(helper.isElementPresent(ViewChildTrades));
        Assert.assertTrue(helper.isElementPresent(OnlyRealTrades));
        Assert.assertTrue(helper.isElementPresent(IncludeDisabledAccounts));
        Assert.assertTrue(helper.isElementPresent(EndDate));
        Assert.assertTrue(helper.isElementPresent(StartDate));
        Assert.assertTrue(helper.isElementPresent(IncludeOpenTrades));
        Assert.assertTrue(helper.isElementPresent(IncludeOptionTrades));
        Assert.assertTrue(helper.isElementPresent(UseEntryDate_field));
        Assert.assertTrue(helper.isElementPresent(IncludeStockTrades));
        Assert.assertTrue(helper.isElementPresent(This_month));
        Assert.assertTrue(helper.isElementPresent(Date_field));
        Assert.assertTrue(helper.isElementPresent(SubmitButton));
    }
    public void submitButton() throws IOException, ParseException, InterruptedException {
        helper.click(SubmitButton);
        helper.pause(3);
        helper.waitForElement(NoRecordFoundText);
        Assert.assertTrue(helper.isElementPresent(NoRecordFoundText));
    }
    public void datefield() throws IOException, ParseException, InterruptedException {
        helper.click(Date_field);
        helper.click(This_month);

        Assert.assertTrue(helper.isElementPresent(StartDate_disabled));
        Assert.assertTrue(helper.isElementPresent(EndDate_disabled));

        helper.click(Date_field);
        helper.click(Custom);
        helper.pause(2);
        helper.click(StartDate);
        helper.click(SelectStartDate);
        helper.click(EndDate);
        helper.click(SelectEndDate);
    }
    public void checkboxes() throws IOException, ParseException, InterruptedException {
        helper.click(IncludeStockTrades);
        helper.click(UseEntryDate_field);
        helper.click(IncludeOptionTrades);
        helper.click(IncludeOpenTrades);
        helper.click(IncludeDisabledAccounts);
        helper.click(OnlyRealTrades);
        helper.click(ViewChildTrades);
    }
    public void searchBox() throws IOException, ParseException, InterruptedException {
        helper.click(Date_field);
        helper.click(Last_year);
        helper.click(SubmitButton);
        helper.enterDataInField(Search_field,"History");
        //Bugs in table so not able to create further script of this module: https://prnt.sc/8gxKJRcF3A6Q
    }
}
