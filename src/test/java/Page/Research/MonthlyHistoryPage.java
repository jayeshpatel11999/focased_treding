package Page.Research;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.security.Key;

public class MonthlyHistoryPage {
    WebDriver driver;
    Helper helper;
    String Research_Tab;
    String Monthly_History_Option;
    String Monthly_History_Title;
    String Sectors_Field;
    String CallOrPutList;
    String Symbol_Field;
    String Substantial_history_list;
    String Month_Dropdown;
    String Submit_button;
    String DownloadIcon;
    String ListOfData;
    String Financial_Value_SectorsDropdown;
    String Up_Value_CallORPutList;
    String History_Value_Substanial;
    String Feb_value_MonthDropdown;
    String Symbol_Value;
    String Searchbar;
    String TableSearch_Data;
    String Clear_Search;
    String NOResultText;
    String ColumnIcon;
    String Currentprice_Column;
    String CurrentPriceON_Column;
    String Current_Price;
    String SearchTextBox;
    String FUllScreen_Icon_TraderAccount;
    String History_detail_Title;
    String ACIW_Symbol;
    String ChartIcon;
    String Chart_Details;
    String CreateTradeIcon;
    String Create_Trade_title;
    String GainColumn;
    String  First_Symbol_value;
    String SymbolFirstValue;
    String Search_field;

    public MonthlyHistoryPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);

        Research_Tab = helper.data_repository("xpathlist", "Research_Module", "Research_Tab");
        Monthly_History_Option = helper.data_repository("xpathlist", "Research_Module", "Monthly_History_Option");
        Monthly_History_Title = helper.data_repository("xpathlist", "Monthly_History", "Monthly_History_Title");
        Sectors_Field = helper.data_repository("xpathlist", "Monthly_History", "Sectors_Field");
        CallOrPutList = helper.data_repository("xpathlist", "Monthly_History", "CallOrPutList");
        Symbol_Field = helper.data_repository("xpathlist", "Monthly_History", "Symbol_Field");
        Substantial_history_list = helper.data_repository("xpathlist", "Monthly_History", "Substantial_history_list");
        Month_Dropdown = helper.data_repository("xpathlist", "Monthly_History", "Month_Dropdown");
        Submit_button = helper.data_repository("xpathlist", "Monthly_History", "Submit_button");
        DownloadIcon = helper.data_repository("xpathlist", "Monthly_History", "DownloadIcon");
        Submit_button = helper.data_repository("xpathlist", "Monthly_History", "Submit_button");
        ListOfData = helper.data_repository("xpathlist", "Monthly_History", "ListOfData");
        Financial_Value_SectorsDropdown = helper.data_repository("xpathlist", "Monthly_History", "Financial_Value_SectorsDropdown");
        Up_Value_CallORPutList = helper.data_repository("xpathlist", "Monthly_History", "Up_Value_CallORPutList");
        History_Value_Substanial = helper.data_repository("xpathlist", "Monthly_History", "History_Value_Substanial");
        Feb_value_MonthDropdown = helper.data_repository("xpathlist", "Monthly_History", "Feb_value_MonthDropdown");
        Symbol_Value = helper.data_repository("TestData", "Monthly_History_data", "Symbol_Value");
        Searchbar = helper.data_repository("xpathlist", "Monthly_History", "Searchbar");
        TableSearch_Data = helper.data_repository("xpathlist", "Monthly_History", "TableSearch_Data");
        Clear_Search = helper.data_repository("xpathlist", "OpenTradePaga", "Clear_Search");
        Search_field = helper.data_repository("xpathlist", "OpenTradePaga", "Search_field");
        NOResultText = helper.data_repository("xpathlist", "Monthly_History", "NOResultText");
        ColumnIcon = helper.data_repository("xpathlist", "OpenTradePaga", "ColumnIcon");
        Currentprice_Column = helper.data_repository("xpathlist", "Monthly_History", "Currentprice_Column");
        CurrentPriceON_Column = helper.data_repository("xpathlist", "Monthly_History", "CurrentPriceON_Column");
        Current_Price = helper.data_repository("xpathlist", "Monthly_History", "Current_Price");
        SearchTextBox = helper.data_repository("xpathlist", "Monthly_History", "SearchTextBox");
        FUllScreen_Icon_TraderAccount = helper.data_repository("xpathlist", "View_Account_Details", "FUllScreen_Icon_TraderAccount");
        ACIW_Symbol = helper.data_repository("xpathlist", "Monthly_History", "SearchTextBox");
        History_detail_Title = helper.data_repository("xpathlist", "History_Details", "History_detail_Title");
        ChartIcon = helper.data_repository("xpathlist", "Monthly_History", "ChartIcon");
        Chart_Details = helper.data_repository("xpathlist", "View_Trade", "Chart_Details");
        CreateTradeIcon = helper.data_repository("xpathlist", "Monthly_History", "CreateTradeIcon");
        GainColumn = helper.data_repository("xpathlist", "Monthly_History", "GainColumn");
        Create_Trade_title = helper.data_repository("xpathlist", "OpenTradePaga", "Create_Trade_title");
        First_Symbol_value = helper.data_repository("xpathlist", "Monthly_History", "First_Symbol_value");
        SymbolFirstValue = helper.data_repository("xpathlist", "History_Details", "SymbolFirstValue");

    }

    public void monthly_History_Page_UI() throws IOException, ParseException, InterruptedException {
        helper.click(Research_Tab);
        helper.getResponseCode();
        helper.click(Monthly_History_Option);

        helper.waitForElement(Monthly_History_Title);
        Assert.assertTrue(helper.isElementPresent(Monthly_History_Title));
        Assert.assertTrue(helper.findElement(Sectors_Field).isDisplayed());
        Assert.assertTrue(helper.isElementPresent(CallOrPutList));
        Assert.assertTrue(helper.isElementPresent(Symbol_Field));
        Assert.assertTrue(helper.isElementPresent(Substantial_history_list));
        Assert.assertTrue(helper.isElementPresent(Month_Dropdown));
        Assert.assertTrue(helper.isElementPresent(Submit_button));
    }

    public void submitButton() throws IOException, ParseException, InterruptedException {
        helper.click(Submit_button);
        helper.waitForElement(ListOfData);
        helper.pause(5);
        Assert.assertTrue(helper.isElementPresent(ListOfData));
        Assert.assertTrue(helper.isElementPresent(DownloadIcon));

    }

    public void downloadTrades() throws IOException, ParseException, InterruptedException {

        helper.click(DownloadIcon);
        helper.pause(10);
        helper.isFileDownloaded("Monthly History's Export CSV.xlsx");
    }

    public void fillUpvalue() throws IOException, ParseException, InterruptedException {
        helper.click(Sectors_Field);
        helper.waitForElement(Financial_Value_SectorsDropdown);
        Assert.assertTrue(helper.isElementPresent(Financial_Value_SectorsDropdown));
        helper.click(Financial_Value_SectorsDropdown);

        helper.click(CallOrPutList);
        helper.waitForElement(Up_Value_CallORPutList);
        Assert.assertTrue(helper.isElementPresent(Up_Value_CallORPutList));
        helper.click(CallOrPutList);

        helper.click(Substantial_history_list);
        helper.waitForElement(History_Value_Substanial);
        Assert.assertTrue(helper.isElementPresent(History_Value_Substanial));
        helper.click(History_Value_Substanial);

        helper.click(Month_Dropdown);
        helper.waitForElement(Feb_value_MonthDropdown);
        Assert.assertTrue(helper.isElementPresent(Feb_value_MonthDropdown));
        helper.click(Feb_value_MonthDropdown);

        helper.enterDataInField(Symbol_Field, Symbol_Value);
        helper.click(Submit_button);
    }

    public void table_MonthlyHistory() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(First_Symbol_value);
        helper.scrollToElement(First_Symbol_value);
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


        if (helper.isElementPresent(CurrentPriceON_Column)) {

            helper.click(CurrentPriceON_Column);
            driver.navigate().refresh();
            helper.waitForElement(ColumnIcon);
            helper.click(ColumnIcon);
        }
        helper.click(Currentprice_Column);
        helper.pause(10);
        helper.waitForElement(Current_Price);
        helper.scrollToElement(Current_Price);
        Assert.assertTrue(helper.isElementPresent(Current_Price));
        // Fail this due to bug

//        helper.click(FUllScreen_Icon_TraderAccount);
//        helper.pause(2);
//        helper.click(FUllScreen_Icon_TraderAccount);
    }

    public void symbolLink() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(First_Symbol_value);
        helper.pause(2);
        String symbol_value = helper.getText(First_Symbol_value);
        System.out.println(symbol_value);
        helper.scrollToElement("(//a[text()='"+symbol_value+"'])[1]");
        helper.click("(//a[text()='"+symbol_value+"'])[1]");
//        helper.click(ACIW_Symbol);
        helper.pause(10);
        helper.waitForElement(History_detail_Title);
        Assert.assertTrue(helper.isElementPresent(History_detail_Title));
    }
    public void chatLink() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(GainColumn);
        Actions a = new Actions(driver);
        a.sendKeys(Keys.ARROW_RIGHT);
        a.sendKeys(Keys.ARROW_RIGHT).perform();
        helper.pause(2);
        helper.scrollToElement(ChartIcon);
        helper.click(ChartIcon);
        helper.waitForElement(Chart_Details);
        Assert.assertTrue(helper.isElementPresent(Chart_Details));
    }
    public void createTradelink() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ChartIcon);

//        helper.click(GainColumn);
//        Actions a = new Actions(driver);
//        if (!(helper.isElementPresent(Create_Trade_title))) {
//            a.sendKeys(Keys.ARROW_RIGHT);
//            a.sendKeys(Keys.ARROW_RIGHT);
//            a.sendKeys(Keys.ARROW_RIGHT);
//            a.sendKeys(Keys.ARROW_RIGHT).perform();
//        }
        helper.scrollToElement(ChartIcon);
        helper.scrollToElement(CreateTradeIcon);
        helper.waitForElement(CreateTradeIcon);
        helper.click(CreateTradeIcon);
        helper.waitForElement(Create_Trade_title);
        Assert.assertTrue(helper.isElementPresent(Create_Trade_title));
    }

}
