package Page.Research;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class TechnicalHistoryPage {
    WebDriver driver;
    Helper helper;
    String Research_Tab;
    String Technical_History;
    String StartDate_Disabled;
    String Technical_History_Title;
    String Dates_dropdown;
    String Conditional_dropdown;
    String TimeFrameDropdown;
    String EndDate;
    String Sectors_Field;
    String Financial_Value_SectorsDropdown;
    String YesterDay_Date;
    String ConditionType_Value;
    String TimeFrame_value;
    String Submit_button;
    String CustomValue_DateField;
    String Start_date_field;
    String Start_Date_value;
    String End_Date_Value;
    String MonthSelect_Calender;
    String MarchSelect_Calender;
    String DateSelect_Calender;
    String DownloadIcon;


    public TechnicalHistoryPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);

        Research_Tab = helper.data_repository("xpathlist", "Research_Module", "Research_Tab");
        Technical_History = helper.data_repository("xpathlist", "Research_Module", "Technical_History");
        Technical_History_Title = helper.data_repository("xpathlist", "Tachnical_History", "Technical_History_Title");
        Dates_dropdown = helper.data_repository("xpathlist", "Tachnical_History", "Dates_dropdown");
        Conditional_dropdown = helper.data_repository("xpathlist", "Tachnical_History", "Conditional_dropdown");
        TimeFrameDropdown = helper.data_repository("xpathlist", "Tachnical_History", "TimeFrameDropdown");
        StartDate_Disabled = helper.data_repository("xpathlist", "Tachnical_History", "StartDate_Disabled");
        EndDate = helper.data_repository("xpathlist", "Tachnical_History", "EndDate");
        Sectors_Field = helper.data_repository("xpathlist", "Monthly_History", "Sectors_Field");
        Financial_Value_SectorsDropdown = helper.data_repository("xpathlist", "Monthly_History", "Financial_Value_SectorsDropdown");
        YesterDay_Date = helper.data_repository("xpathlist", "Tachnical_History", "YesterDay_Date");
        ConditionType_Value = helper.data_repository("xpathlist", "Tachnical_History", "ConditionType_Value");
        TimeFrame_value = helper.data_repository("xpathlist", "Tachnical_History", "TimeFrame_value");
        Submit_button = helper.data_repository("xpathlist", "Monthly_History", "Submit_button");
        CustomValue_DateField = helper.data_repository("xpathlist", "Tachnical_History", "CustomValue_DateField");
        Start_date_field = helper.data_repository("xpathlist", "Tachnical_History", "Start_date_field");
        Start_Date_value = helper.data_repository("xpathlist", "Tachnical_History", "Start_Date_value");
        End_Date_Value = helper.data_repository("xpathlist", "Tachnical_History", "End_Date_Value");
        MonthSelect_Calender = helper.data_repository("xpathlist", "Tachnical_History", "MonthSelect_Calender");
        DateSelect_Calender = helper.data_repository("xpathlist", "Tachnical_History", "DateSelect_Calender");
        MarchSelect_Calender = helper.data_repository("xpathlist", "Tachnical_History", "MarchSelect_Calender");
        DownloadIcon = helper.data_repository("xpathlist", "Monthly_History", "DownloadIcon");

    }
    public void technicalHistoryUI() throws IOException, ParseException, InterruptedException {
        helper.click(Research_Tab);
        helper.getResponseCode();
        helper.click(Technical_History);

        helper.waitForElement(Dates_dropdown);
        Assert.assertTrue(helper.isElementPresent(Technical_History_Title));
        Assert.assertTrue(helper.isElementPresent(Dates_dropdown));
        Assert.assertTrue(helper.isElementPresent(Conditional_dropdown));
        Assert.assertTrue(helper.isElementPresent(TimeFrameDropdown));
        Assert.assertTrue(helper.isElementPresent(StartDate_Disabled));
        helper.log("UI is visible properly");
    }
    public void fillUpValue() throws IOException, ParseException, InterruptedException {
        helper.click(Sectors_Field);
        helper.waitForElement(Financial_Value_SectorsDropdown);
        Assert.assertTrue(helper.isElementPresent(Financial_Value_SectorsDropdown));
        helper.click(Financial_Value_SectorsDropdown);

        helper.click(Dates_dropdown);
        helper.waitForElement(CustomValue_DateField);
        Assert.assertTrue(helper.isElementPresent(CustomValue_DateField));
        helper.click(CustomValue_DateField);

        helper.click(Conditional_dropdown);
        helper.waitForElement(ConditionType_Value);
        Assert.assertTrue(helper.isElementPresent(ConditionType_Value));
        helper.click(ConditionType_Value);

        helper.click(Start_date_field);
        helper.waitForElement(MonthSelect_Calender);
        helper.click(MonthSelect_Calender);
        helper.waitForElement(MarchSelect_Calender);
        helper.click(MarchSelect_Calender);
        helper.waitForElement(DateSelect_Calender);
        helper.click(DateSelect_Calender);

        helper.click(TimeFrameDropdown);
        helper.waitForElement(TimeFrame_value);
        Assert.assertTrue(helper.isElementPresent(TimeFrame_value));
        helper.click(TimeFrame_value);

        helper.click(Submit_button);
    }
    public void downloadTrades() throws IOException, ParseException, InterruptedException {

        helper.click(DownloadIcon);
        helper.pause(10);
        helper.isFileDownloaded("Technical History's Export CSV.xlsx");
    }

}
