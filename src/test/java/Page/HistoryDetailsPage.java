package Page;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.ArrayList;

public class HistoryDetailsPage {
    WebDriver driver;
    Helper helper;
    String Cross_Icon_searchTable;
    String SearchIcon_FirstTable;
    String BandToBandPutTrades;
    String BandToBandCallTrades;
    String SubmitButton;
    String MonthDropdown;
    String SymbolField;
    String ChainTab;
    String YahooTab;
    String GoogleTab;
    String VolatilityTab;
    String EarningTab;
    String History_detail_Title;
    String SymbolFirstValue;
    String Symbol_Value;
    String ADI_History;
    String ACIW_History;
    String May_Month;
    String First_Symbol_value;
    String Search_field;
    String Clear_Search;
    String NOResultText;
    String ColumnIcon;
    String BandtoBandCallSection;
    String BandtoBandCallCollapse;
    public HistoryDetailsPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver,this);

        Cross_Icon_searchTable = helper.data_repository("xpathlist", "History_Details", "Cross_Icon_searchTable");
        SearchIcon_FirstTable = helper.data_repository("xpathlist", "History_Details", "SearchIcon_FirstTable");
        BandToBandPutTrades = helper.data_repository("xpathlist", "History_Details", "BandToBandPutTrades");
        BandToBandCallTrades = helper.data_repository("xpathlist", "History_Details", "BandToBandCallTrades");
        SubmitButton = helper.data_repository("xpathlist", "History_Details", "SubmitButton");
        MonthDropdown = helper.data_repository("xpathlist", "History_Details", "MonthDropdown");
        SymbolField = helper.data_repository("xpathlist", "History_Details", "SymbolField");
        ChainTab = helper.data_repository("xpathlist", "History_Details", "ChainTab");
        YahooTab = helper.data_repository("xpathlist", "History_Details", "YahooTab");
        GoogleTab = helper.data_repository("xpathlist", "History_Details", "GoogleTab");
        VolatilityTab = helper.data_repository("xpathlist", "History_Details", "VolatilityTab");
        EarningTab = helper.data_repository("xpathlist", "History_Details", "EarningTab");
        History_detail_Title = helper.data_repository("xpathlist", "History_Details", "History_detail_Title");
        SymbolFirstValue = helper.data_repository("xpathlist", "History_Details", "SymbolFirstValue");
        Symbol_Value = helper.data_repository("TestData", "Monthly_History_data", "Symbol_Value");
        ACIW_History = helper.data_repository("xpathlist", "History_Details", "ACIW_History");
        May_Month = helper.data_repository("xpathlist", "History_Details", "May_Month");
        First_Symbol_value = helper.data_repository("xpathlist", "History_Details", "First_Symbol_value");
        Search_field = helper.data_repository("xpathlist", "OpenTradePaga", "Search_field");
        Clear_Search = helper.data_repository("xpathlist", "OpenTradePaga", "Clear_Search");
        NOResultText = helper.data_repository("xpathlist", "Monthly_History", "NOResultText");
        ColumnIcon = helper.data_repository("xpathlist", "OpenTradePaga", "ColumnIcon");
        BandtoBandCallSection = helper.data_repository("xpathlist", "History_Details", "BandtoBandCallSection");
        BandtoBandCallCollapse = helper.data_repository("xpathlist", "History_Details", "BandtoBandCallCollapse");

    }
    public void historyDetailPageUI() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(EarningTab);
        Assert.assertTrue(helper.isElementPresent(EarningTab));
        Assert.assertTrue(helper.isElementPresent(VolatilityTab));
        Assert.assertTrue(helper.isElementPresent(GoogleTab));
        Assert.assertTrue(helper.isElementPresent(YahooTab));
        Assert.assertTrue(helper.isElementPresent(ChainTab));
        Assert.assertTrue(helper.isElementPresent(SymbolField));
        Assert.assertTrue(helper.isElementPresent(MonthDropdown));
        Assert.assertTrue(helper.isElementPresent(SubmitButton));
        helper.scrollDown(BandToBandCallTrades);
        Assert.assertTrue(helper.isElementPresent(BandToBandCallTrades));
        helper.scrollDown(BandToBandPutTrades);
        Assert.assertTrue(helper.isElementPresent(BandToBandPutTrades));
    }
    public void earningtabFun() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(EarningTab);
        helper.click(EarningTab);
        helper.wait_till_loading();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String earningTabURL = driver.getCurrentUrl();
        Assert.assertEquals(earningTabURL, "https://www.zacks.com/stock/research/ADI/earnings-calendar");
    }
    public void volatilityTabFUn() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(VolatilityTab);
        helper.click(VolatilityTab);
        helper.wait_till_loading();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String earningTabURL = driver.getCurrentUrl();
        Assert.assertEquals(earningTabURL, "https://www.ivolatility.com/options.j?ticker=ADI&R=1&period=12&chart=2&vct=");
    }
    public void googleTabFUn() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(GoogleTab);
        helper.click(GoogleTab);
        helper.wait_till_loading();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String earningTabURL = driver.getCurrentUrl();
        Assert.assertEquals(earningTabURL, "https://www.google.com/finance/quote/ADI:NASDAQ");
    }
    public void yahoootabFun() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(YahooTab);
        helper.click(YahooTab);
        helper.wait_till_loading();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String earningTabURL = driver.getCurrentUrl();
        Assert.assertEquals(earningTabURL, "https://finance.yahoo.com/quote/ADI?ltr=1");
    }
    public void chainTabFun() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ChainTab);
        helper.click(ChainTab);
        helper.wait_till_loading();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String earningTabURL = driver.getCurrentUrl();
        Assert.assertEquals(earningTabURL, "https://finance.yahoo.com/quote/ADI/options?p=ADI");
    }
    public void symbolSearch() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(SymbolField);
        helper.removeDataFromField(SymbolField);
        helper.enterDataInField(SymbolField,Symbol_Value);
        helper.waitForElement(MonthDropdown);
        helper.click(MonthDropdown);
        helper.click(May_Month);
        helper.click(SubmitButton);
        helper.waitForElement(ACIW_History);
        Assert.assertTrue(helper.isElementPresent(ACIW_History));
    }
    public void tableTest() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(First_Symbol_value);
        String symbol_value = helper.getText(First_Symbol_value);
        String str = new String(symbol_value);
        System.out.println(str);

        helper.click(Search_field);
        helper.enterDataInField(Search_field, str);
        Assert.assertTrue(helper.isElementPresent("//*[normalize-space()='"+str+"']"));

        helper.click(Clear_Search);
        helper.enterDataInField(Search_field, "dasffsdf");
        helper.waitForElement(NOResultText);
        Assert.assertTrue(helper.isElementPresent(NOResultText));
        helper.click(Clear_Search);
        Assert.assertTrue(helper.isElementPresent("//*[normalize-space()='"+symbol_value+"']"));

        helper.click(ColumnIcon);
        System.out.println("Column icon should visible properly");
        helper.log("Column icon should visible properly");
    }
    public void setBandToBandCallTrades() throws IOException, ParseException, InterruptedException {
        helper.scrollDown(Search_field);
        helper.pause(3);
        helper.click(BandToBandCallTrades);
        helper.pause(2);
        helper.scrollDown(BandtoBandCallCollapse);
        Assert.assertTrue(helper.isElementPresent(BandtoBandCallCollapse));
    }
    public void setBandToBandPutTrades() throws IOException, ParseException, InterruptedException {
        helper.scrollDown(BandToBandPutTrades);
        helper.pause(3);
        helper.click(BandToBandPutTrades);
        helper.pause(2);
        helper.scrollDown(BandtoBandCallCollapse);
        Assert.assertTrue(helper.isElementPresent(BandtoBandCallCollapse));
    }




}
