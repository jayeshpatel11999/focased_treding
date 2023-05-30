package Page.Research;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class BackMonthHistoryPage {
    WebDriver driver;
    Helper helper;
    String Research_Tab;
    String BackMonthHistoryTitle;
    String MovementList;
    String Type_dropdown;
    String Month_Dropdown;
    String Symbol_Field;
    String Substantial_history_list;
    String History_Value_Substanial;
    String CallOrPutList;
    String Up_Value_CallORPutList;
    String Month_Dropdown_Value;
    String TypeDropdown_value;
    String BackMonth_History;
    String Sectors_Field;
    String Financial_Value_SectorsDropdown;
    String MovementListValue;
    String Submit_button;
    String DownloadIcon;

    public BackMonthHistoryPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);

        Research_Tab = helper.data_repository("xpathlist", "Research_Module", "Research_Tab");
        BackMonth_History = helper.data_repository("xpathlist", "Research_Module", "BackMonth_History");
        BackMonthHistoryTitle = helper.data_repository("xpathlist", "BackMonthHistory", "BackMonthHistoryTitle");
        MovementList = helper.data_repository("xpathlist", "BackMonthHistory", "MovementList");
        Type_dropdown = helper.data_repository("xpathlist", "BackMonthHistory", "Type_dropdown");
        Month_Dropdown = helper.data_repository("xpathlist", "BackMonthHistory", "Month_Dropdown");
        Symbol_Field = helper.data_repository("xpathlist", "Monthly_History", "Symbol_Field");
        Substantial_history_list = helper.data_repository("xpathlist", "Monthly_History", "Substantial_history_list");
        History_Value_Substanial = helper.data_repository("xpathlist", "Monthly_History", "History_Value_Substanial");
        CallOrPutList = helper.data_repository("xpathlist", "Monthly_History", "CallOrPutList");
        Up_Value_CallORPutList = helper.data_repository("xpathlist", "Monthly_History", "Up_Value_CallORPutList");
        Month_Dropdown_Value = helper.data_repository("xpathlist", "BackMonthHistory", "Month_Dropdown_Value");
        TypeDropdown_value = helper.data_repository("xpathlist", "BackMonthHistory", "TypeDropdown_value");
        MovementListValue = helper.data_repository("xpathlist", "BackMonthHistory", "MovementListValue");
        Submit_button = helper.data_repository("xpathlist", "Monthly_History", "Submit_button");
        Sectors_Field = helper.data_repository("xpathlist", "Monthly_History", "Sectors_Field");
        Financial_Value_SectorsDropdown = helper.data_repository("xpathlist", "Monthly_History", "Financial_Value_SectorsDropdown");
        Submit_button = helper.data_repository("xpathlist", "Monthly_History", "Submit_button");
        DownloadIcon = helper.data_repository("xpathlist", "Monthly_History", "DownloadIcon");

    }
    public void backMonthHistoryUI() throws IOException, ParseException, InterruptedException {
        helper.click(Research_Tab);
        helper.getResponseCode();
        helper.click(BackMonth_History);

        helper.waitForElement(BackMonthHistoryTitle);
        Assert.assertTrue(helper.isElementPresent(BackMonthHistoryTitle));
        Assert.assertTrue(helper.isElementPresent(MovementList));
        Assert.assertTrue(helper.isElementPresent(Type_dropdown));
        Assert.assertTrue(helper.isElementPresent(Symbol_Field));
        Assert.assertTrue(helper.isElementPresent(Substantial_history_list));
        Assert.assertTrue(helper.isElementPresent(CallOrPutList));
        Assert.assertTrue(helper.isElementPresent(Month_Dropdown));
        Assert.assertTrue(helper.isElementPresent(Month_Dropdown));
        Assert.assertTrue(helper.isElementPresent(Month_Dropdown));
        helper.log("UI is visible properly");
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

        helper.click(MovementList);
        helper.waitForElement(MovementListValue);
        Assert.assertTrue(helper.isElementPresent(MovementListValue));
        helper.click(MovementListValue);

        helper.click(Symbol_Field);
        Assert.assertTrue(helper.isElementPresent(Symbol_Field));

        helper.click(Substantial_history_list);
        helper.waitForElement(History_Value_Substanial);
        Assert.assertTrue(helper.isElementPresent(History_Value_Substanial));
        helper.click(History_Value_Substanial);

        helper.click(Month_Dropdown);
        helper.waitForElement(Month_Dropdown_Value);
        Assert.assertTrue(helper.isElementPresent(Month_Dropdown_Value));
        helper.click(Month_Dropdown_Value);

        helper.click(Type_dropdown);
        helper.waitForElement(TypeDropdown_value);
        Assert.assertTrue(helper.isElementPresent(TypeDropdown_value));
        helper.click(TypeDropdown_value);

        helper.click(Submit_button);
    }
    public void downloadTrades() throws IOException, ParseException, InterruptedException {

        helper.click(DownloadIcon);
        helper.pause(10);
        helper.isFileDownloaded("Back Month's Export CSV.xlsx");
    }
}
