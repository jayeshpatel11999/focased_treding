package Page.MyTrades;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class OpenTradesPage {

    WebDriver driver;
    Helper helper;
    String MyTradesMenu;
    String OpenMenu;
    String ActionOption;
    String CreateTrade;
    String SecurityType_Field;
    String ProfitCondition;
    String TradeType;
    String Profit_price;
    String Symbol;
    String Profit_Time_Frame;
    String Direction;
    String Stop_Condition;
    String Time_frame;
    String Stop_price;
    String Entry_Condition;
    String Stop_time_frame;
    String Exit_Condition;
    String All_In_Checkbox;
    String Add_Comment;
    String Save_button;
    String Title_of_Pending_Page;
    String ProfilePrice_data;
    String StopPrice_data;
    String Comment_Data;
    String Remove_button;
    String Cancel_button;
    String Close_button;
    String Search_button;
    String ColumnIcon;
    String FullScreenIcon;
    String Profit_price_disabled;
    String Validation_of_First_field;
    String Stop_Price_disabled;
    String Stop_time_Frame_disabled;
    String Virtual_Checkbox;
    String Remove_Button;
    String All_Cancelled_Option;
    String SuccessMessage_AllCancelled;
    String No_record_found_text;
    String All_Pending_Option;
    String Successmessage_AllPending;
    String All_Pending_Calls;
    String All_Pending_Puts;
    String up_direction_entry;
    String PendingMenu;
    String Down_direction_entry;
    String search_icon;
    String Clear_Search;
    String textField_ofSearch;
    String SearchData_Open;
    String APA_Text;
    String ALB_text;
    String Max_Loss_column;
    String Entry_date_column;
    String Toggle_EntryDate;
    String Open_Title;
    String First_value_Symbol;
    String Loading_Icon;
    String View_trade_title;
    String First_Value_Account;
    String View_Account_Title;
    String Next_icon_table;
    String Chart_icon_table;
    String Chart_details_title;
    String Pagination_Action;
    String GOToFirstPage;
    String PreviousIcon_table;
    String NextIcon_Table;
    String GoToLastPage_Table;
    String Rows_count;
    String GoToFirstPage_disabled;
    String PreviousIcon_Disabled;
    String Rows_Count_25;
    String Number_of_OpenTrade;
    String First_Value_Direction;
    String Refresh_Icon;
    String Search_field;

    public OpenTradesPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);

        MyTradesMenu = helper.data_repository("xpathlist", "OpenTradePaga", "MyTradesMenu");
        OpenMenu = helper.data_repository("xpathlist", "OpenTradePaga", "OpenMenu");
        ActionOption = helper.data_repository("xpathlist", "OpenTradePaga", "ActionOption");
        CreateTrade = helper.data_repository("xpathlist", "OpenTradePaga", "CreateTrade");
        SecurityType_Field = helper.data_repository("xpathlist", "OpenTradePaga", "SecurityType_Field");
        ProfitCondition = helper.data_repository("xpathlist", "OpenTradePaga", "ProfitCondition");
        TradeType = helper.data_repository("xpathlist", "OpenTradePaga", "TradeType");
        Profit_price = helper.data_repository("xpathlist", "OpenTradePaga", "Profit_price");
        Symbol = helper.data_repository("xpathlist", "OpenTradePaga", "Symbol");
        Profit_Time_Frame = helper.data_repository("xpathlist", "OpenTradePaga", "Profit_Time_Frame");
        Direction = helper.data_repository("xpathlist", "OpenTradePaga", "Direction");
        Stop_Condition = helper.data_repository("xpathlist", "OpenTradePaga", "Stop_Condition");
        Time_frame = helper.data_repository("xpathlist", "OpenTradePaga", "Time_frame");
        Stop_price = helper.data_repository("xpathlist", "OpenTradePaga", "Stop_price");
        Entry_Condition = helper.data_repository("xpathlist", "OpenTradePaga", "Entry_Condition");
        Stop_time_frame = helper.data_repository("xpathlist", "OpenTradePaga", "Stop_time_frame");
        Exit_Condition = helper.data_repository("xpathlist", "OpenTradePaga", "Exit_Condition");
        All_In_Checkbox = helper.data_repository("xpathlist", "OpenTradePaga", "All_In_Checkbox");
        Add_Comment = helper.data_repository("xpathlist", "OpenTradePaga", "Add_Comment");
        Save_button = helper.data_repository("xpathlist", "OpenTradePaga", "Save_button");
        Title_of_Pending_Page = helper.data_repository("xpathlist", "OpenTradePaga", "Title_of_Pending_Page");
        ProfilePrice_data = helper.data_repository("TestData", "CreateTradeData", "ProfilePrice_data");
        StopPrice_data = helper.data_repository("TestData", "CreateTradeData", "StopPrice_data");
        Comment_Data = helper.data_repository("TestData", "CreateTradeData", "Comment_Data");
        Remove_button = helper.data_repository("xpathlist", "OpenTradePaga", "Remove_button");
        Cancel_button = helper.data_repository("xpathlist", "OpenTradePaga", "Cancel_button");
        Close_button = helper.data_repository("xpathlist", "OpenTradePaga", "Close_button");
        Search_button = helper.data_repository("xpathlist", "OpenTradePaga", "Search_button");
        ColumnIcon = helper.data_repository("xpathlist", "OpenTradePaga", "ColumnIcon");
        FullScreenIcon = helper.data_repository("xpathlist", "OpenTradePaga", "FullScreenIcon");
        Profit_price_disabled = helper.data_repository("xpathlist", "OpenTradePaga", "Profit_price_disabled");
        Validation_of_First_field = helper.data_repository("xpathlist", "OpenTradePaga", "Validation_of_First_field");
        Stop_Price_disabled = helper.data_repository("xpathlist", "OpenTradePaga", "Stop_Price_disabled");
        Stop_time_Frame_disabled = helper.data_repository("xpathlist", "OpenTradePaga", "Stop_time_Frame_disabled");
        Virtual_Checkbox = helper.data_repository("xpathlist", "OpenTradePaga", "Virtual_Checkbox");
        Remove_Button = helper.data_repository("xpathlist", "OpenTradePaga", "Remove_Button");
        All_Cancelled_Option = helper.data_repository("xpathlist", "OpenTradePaga", "All_Cancelled_Option");
        SuccessMessage_AllCancelled = helper.data_repository("xpathlist", "OpenTradePaga", "SuccessMessage_AllCancelled");
        No_record_found_text = helper.data_repository("xpathlist", "OpenTradePaga", "No_record_found_text");
        All_Pending_Option = helper.data_repository("xpathlist", "OpenTradePaga", "All_Pending_Option");
        Successmessage_AllPending = helper.data_repository("xpathlist", "OpenTradePaga", "Successmessage_AllPending");
        All_Pending_Calls = helper.data_repository("xpathlist", "OpenTradePaga", "All_Pending_Calls");
        All_Pending_Puts = helper.data_repository("xpathlist", "OpenTradePaga", "All_Pending_Puts");
        up_direction_entry = helper.data_repository("xpathlist", "OpenTradePaga", "up_direction_entry");
        PendingMenu = helper.data_repository("xpathlist", "OpenTradePaga", "PendingMenu");
        Down_direction_entry = helper.data_repository("xpathlist", "OpenTradePaga", "Down_direction_entry");
        search_icon = helper.data_repository("xpathlist", "OpenTradePaga", "search_icon");
        Clear_Search = helper.data_repository("xpathlist", "OpenTradePaga", "Clear_Search");
        textField_ofSearch = helper.data_repository("xpathlist", "OpenTradePaga", "textField_ofSearch");
        SearchData_Open = helper.data_repository("TestData", "OpenPageData", "SearchData_Open");
        APA_Text = helper.data_repository("xpathlist", "OpenTradePaga", "APA_Text");
        ALB_text = helper.data_repository("xpathlist", "OpenTradePaga", "ALB_text");
        Search_field = helper.data_repository("xpathlist", "OpenTradePaga", "Search_field");
        Max_Loss_column = helper.data_repository("xpathlist", "OpenTradePaga", "Max_Loss_column");
        Entry_date_column = helper.data_repository("xpathlist", "OpenTradePaga", "Entry_date_column");
        Toggle_EntryDate = helper.data_repository("xpathlist", "OpenTradePaga", "Toggle_EntryDate");
        Open_Title = helper.data_repository("xpathlist", "OpenTradePaga", "Open_Title");
        First_value_Symbol = helper.data_repository("xpathlist", "OpenTradePaga", "First_value_Symbol");
        Loading_Icon = helper.data_repository("xpathlist", "LoginPage", "Loading_Icon");
        View_trade_title = helper.data_repository("xpathlist", "View_Trade", "View_trade_title");
        First_Value_Account = helper.data_repository("xpathlist", "OpenTradePaga", "First_Value_Account");
        View_Account_Title = helper.data_repository("xpathlist", "View_Account_Details", "View_Account_Title");
        Next_icon_table = helper.data_repository("xpathlist", "OpenTradePaga", "Next_icon_table");
        Chart_icon_table = helper.data_repository("xpathlist", "OpenTradePaga", "Chart_icon_table");
        Chart_details_title = helper.data_repository("xpathlist", "Chart_Details_Page", "Chart_details_title");
        Pagination_Action = helper.data_repository("xpathlist", "OpenTradePaga", "Pagination_Action");
        GOToFirstPage = helper.data_repository("xpathlist", "OpenTradePaga", "GOToFirstPage");
        PreviousIcon_table = helper.data_repository("xpathlist", "OpenTradePaga", "PreviousIcon_table");
        NextIcon_Table = helper.data_repository("xpathlist", "OpenTradePaga", "NextIcon_Table");
        GoToLastPage_Table = helper.data_repository("xpathlist", "OpenTradePaga", "GoToLastPage_Table");
        Rows_count = helper.data_repository("xpathlist", "OpenTradePaga", "Rows_count");
        GoToFirstPage_disabled = helper.data_repository("xpathlist", "OpenTradePaga", "GoToFirstPage_disabled");
        PreviousIcon_Disabled = helper.data_repository("xpathlist", "OpenTradePaga", "PreviousIcon_Disabled");
        Rows_Count_25 = helper.data_repository("xpathlist", "OpenTradePaga", "Rows_Count_25");
        Number_of_OpenTrade = helper.data_repository("xpathlist", "OpenTradePaga", "Number_of_OpenTrade");
        First_Value_Direction = helper.data_repository("xpathlist", "OpenTradePaga", "First_Value_Direction");
        Refresh_Icon = helper.data_repository("xpathlist", "OpenTradePaga", "Refresh_Icon");
    }

    public void openPageUI() throws InterruptedException, IOException, ParseException {
        helper.pause(1);
        helper.click(MyTradesMenu);
        for (int i = 0; i < 5; i++) {
            if (!helper.findElement(OpenMenu).isDisplayed()) {
                helper.click(MyTradesMenu);
                helper.pause(2);
                if (helper.findElement(OpenMenu).isDisplayed()) {
                    break;
                }
            }
        }
        helper.getResponseCode();
        helper.click(OpenMenu);
        System.out.println("Clicked on Open menu");
        helper.log("Clicked on open menu");

        helper.waitForElement(ActionOption);
        System.out.println("Following element visible in Open page");
        String ActionButtonName = helper.getText(ActionOption);
        System.out.println(ActionButtonName);
        Assert.assertEquals(ActionButtonName, "Action");

        String RemoveButtonName = helper.getText(Remove_button);
        System.out.println(RemoveButtonName);
        Assert.assertEquals(RemoveButtonName, "Remove");

        String CloseButtonName = helper.getText(Close_button);
        System.out.println(CloseButtonName);
        Assert.assertEquals(CloseButtonName, "Close");

        Assert.assertTrue(helper.isElementPresent(Search_button));
        Assert.assertTrue(helper.findElement(ColumnIcon).isDisplayed());
        Assert.assertTrue(helper.findElement(FullScreenIcon).isDisplayed());
        if (helper.findElement(ColumnIcon).isDisplayed()) {
            System.out.println("Column icon is visible");
        } else {
            System.out.println("Column icon is not visible");
        }
        if (helper.findElement(FullScreenIcon).isDisplayed()) {
            System.out.println("FUll screen icon is visible");
        } else {
            System.out.println("Full screen icon is not visible");
        }
    }

    public void createTrade() throws InterruptedException, IOException, ParseException {

        helper.getResponseCode();
        helper.click(OpenMenu);
        System.out.println("Clicked on Open menu");
        helper.log("Clicked on open menu");

        helper.click(ActionOption);
        System.out.println("Clicked on Action option");
        helper.log("Clicked on Action option");

        helper.getResponseCode();
        helper.click(CreateTrade);
        System.out.println("Clicked on Create trade option");
        helper.log("Clicked on Create trade option");
    }

    public void validData() throws InterruptedException, IOException, ParseException {

        helper.getResponseCode();
        helper.click(SecurityType_Field);
        helper.PressDown_Key();
        System.out.println("Select security type field");
        helper.log("Select security type field");

        helper.click(ProfitCondition);
        helper.PressDown_Key();
        System.out.println("Select profile condition");
        helper.log("Select profile condition");

        helper.click(TradeType);
        helper.PressDown_Key();
        System.out.println("Select Trade type condition");
        helper.log("Select Trade type condition");

        helper.enterDataInField(Profit_price, ProfilePrice_data);
        System.out.println("Add data in profile price field");
        helper.log("Add data in profile price field");

        helper.click(Symbol);
        helper.PressDown_Key();
        System.out.println("Select symbol from dropdown");
        helper.log("Select symbol from dropdown");

        helper.click(Direction);
        helper.PressDown_Key();
        System.out.println("Select Direction");
        helper.log("Select Direction");

        helper.click(Stop_Condition);
        helper.PressDown_Key();
        System.out.println("Select profile condition");
        helper.log("Select profile condition");

        helper.click(Time_frame);
        helper.PressDown_Key();
        System.out.println("Select Time frame");
        helper.log("Select Time frame");

        helper.enterDataInField(Stop_price, StopPrice_data);
        System.out.println("Select Stop Price");
        helper.log("Select Stop Price");

        helper.click(Entry_Condition);
        helper.PressDown_Key();
        System.out.println("Select Entry condition");
        helper.log("Select Entry condition");

        helper.scrollToElement(Stop_time_frame);
        helper.click(Stop_time_frame);
        helper.PressDown_Key();
        System.out.println("Select stop time frame condition");
        helper.log("Select Stop timeframe condition");

        helper.scrollToElement(Exit_Condition);
        helper.click(Exit_Condition);
        helper.PressDown_Key();
        System.out.println("Select Exit condition");
        helper.log("Select Exit condition");

        helper.click(All_In_Checkbox);
        System.out.println("Select Checkbox all in");
        helper.log("Select checkbox all in");

        helper.enterDataInField(Add_Comment, Comment_Data);
        System.out.println("Add comment field filled up");
        helper.log("Add comment field filled up");

        helper.getResponseCode();
        helper.scrollandclick(Save_button);
        System.out.println("Clicked on Save button");
        helper.log("Clicked on Save button");
    }
    public void verificationAfterValidData() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(Title_of_Pending_Page);
        String Pending_page_title = driver.findElement(By.xpath(Title_of_Pending_Page)).getText();
        System.out.println(Pending_page_title);
        Assert.assertEquals(Pending_page_title, "LIST OF PENDING");
        System.out.println("List of pending page title show after create trade");
        helper.log("List of pending page title show after create trade");
    }

    public void profitprice_Condition() throws InterruptedException, IOException, ParseException {
        helper.pause(6);
        Assert.assertTrue(helper.findElement(Profit_price_disabled).isDisplayed());
        System.out.println("Profit price field is disabled");

        helper.getResponseCode();
        helper.click(ProfitCondition);
        helper.PressDown_Key();
        System.out.println("Select profile condition: Price");
        helper.log("Select profile condition");

        helper.pause(2);
        Assert.assertFalse(helper.isElementPresent(Profit_price_disabled));

        helper.click(ProfitCondition);
        helper.PressDown_Key();
        System.out.println("Select profile condition: BB");

        helper.pause(5);
        Assert.assertTrue(helper.findElement(Profit_price_disabled).isDisplayed());
        System.out.println("Profit price field is disabled");

    }

    public void submitWithBlankField() throws InterruptedException, IOException, ParseException {
        //Testcase number TC_04
        helper.getResponseCode();
        helper.scrollToElement(Save_button);
        helper.click(Save_button);
        System.out.println("Clicked on save button");

        //helper.waitForElement(Validation_of_First_field);
       // Assert.assertTrue(helper.findElement(Validation_of_First_field).isDisplayed());
       // System.out.println("Validation message is displayed below the first field");

        //Testcase number TC_11
       // helper.click(SecurityType_Field);

       // helper.getResponseCode();
        helper.scrollToElement(Save_button);
        helper.click(Save_button);

        helper.waitForElement(Validation_of_First_field);
        Assert.assertTrue(helper.findElement(Validation_of_First_field).isDisplayed());
        System.out.println("Validation message is displayed below the first field");
    }

    public void stopCondition_field() throws InterruptedException, IOException, ParseException {
        //Testcase number TC_07
        helper.getResponseCode();
        helper.click(Stop_Condition);

        Actions a = new Actions(driver);
        Thread.sleep(5000);
        a.sendKeys(Keys.ARROW_DOWN);
        a.sendKeys(Keys.ARROW_DOWN);
        a.sendKeys(Keys.ENTER).perform();
        System.out.println("Time stemp selected");

        Assert.assertTrue(helper.findElement(Stop_Price_disabled).isDisplayed());
        System.out.println("Stop Price field is disabled");
        Assert.assertTrue(helper.findElement(Stop_time_Frame_disabled).isDisplayed());
        System.out.println("Stop time frame field is disabled");

        //Testcase number TC_08
        Thread.sleep(5000);
        a.sendKeys(Keys.ARROW_DOWN);
        a.sendKeys(Keys.ENTER).perform();
        System.out.println("Price stemp selected");

        Assert.assertTrue(helper.findElement(Stop_price).isDisplayed());
        System.out.println("Stop Price field is Enabled");
        Assert.assertTrue(helper.findElement(Stop_time_frame).isDisplayed());
        System.out.println("Stop time frame field is Enabled");

        //Testcase number TC_09
        Thread.sleep(5000);
        a.sendKeys(Keys.ARROW_UP);
        a.sendKeys(Keys.ARROW_UP);
        a.sendKeys(Keys.ENTER).perform();
        System.out.println("None option stemp selected");

        Assert.assertTrue(helper.findElement(Stop_price).isDisplayed());
        System.out.println("Stop Price field is Enabled");
        Assert.assertTrue(helper.findElement(Stop_time_frame).isDisplayed());
        System.out.println("Stop time frame field is Enabled");

        //Testcase number TC_10
        Thread.sleep(5000);
        a.sendKeys(Keys.ARROW_DOWN);
        a.sendKeys(Keys.ARROW_DOWN);
        a.sendKeys(Keys.ARROW_DOWN);
        a.sendKeys(Keys.ENTER).perform();
        System.out.println("None option stemp selected");

        Assert.assertTrue(helper.findElement(Stop_price).isDisplayed());
        System.out.println("Stop Price field is Enabled");
        Assert.assertTrue(helper.findElement(Stop_time_frame).isDisplayed());
        System.out.println("Stop time frame field is Enabled");

        Thread.sleep(5000);
    }

    public void checkbox() throws InterruptedException, IOException, ParseException {
        helper.scrollandclick(All_In_Checkbox);
        System.out.println("Selected Checkbox all in");
        helper.log("Selected checkbox all in");

        helper.click(Virtual_Checkbox);
        System.out.println("Selected virtual checkbox");
        helper.log("Selected virtual checkbox");
    }

    public void remove() throws InterruptedException, IOException, ParseException {
        //OTC_15
        helper.getResponseCode();
        helper.click(Remove_button);
        System.out.println("Clicked on remove button");
        helper.log("Clicked on remove button");

        helper.getResponseCode();
        helper.click(All_Cancelled_Option);
        System.out.println("Clicked on All cancelled option");
        helper.log("Clicked on All cancelled option");

        helper.pause(1);
        helper.waitForElement(SuccessMessage_AllCancelled);
        String Cancelled_SuccessMessage = helper.getText(SuccessMessage_AllCancelled);
        System.out.println(Cancelled_SuccessMessage);
        Assert.assertEquals(Cancelled_SuccessMessage, "Removed All Cancelled Trades Processed Successfully");

        //OTC_16
        helper.click(Remove_button);
        System.out.println("Clicked on remove button");
        helper.log("Clicked on remove button");

        helper.getResponseCode();
        helper.click(All_Pending_Option);
        System.out.println("Clicked on All pending option");
        helper.log("Clicked on All pending option");

        helper.pause(1);
        helper.waitForElement(Successmessage_AllPending);
        String Pending_SuccessMessage = helper.getText(Successmessage_AllPending);
        System.out.println(Pending_SuccessMessage);
        Assert.assertEquals(Pending_SuccessMessage, "Removed All Pending Trades Processed Successfully");
    }

    public void cancelUpCalls() throws IOException, ParseException, InterruptedException {
        helper.getResponseCode();
        helper.click(Cancel_button);
        System.out.println("Clicked on cancelled button");
        helper.log("Clicked on cancelled button");

        helper.getResponseCode();
        helper.click(All_Pending_Calls);
        System.out.println("Clicked on All pending calls");
        helper.log("clicked on all pending calls");
    }

    public void cancleDownPuts() throws IOException, ParseException, InterruptedException {
        helper.click(Cancel_button);
        System.out.println("Clicked on cancelled button");
        helper.log("Clicked on cancelled button");

        helper.getResponseCode();
        helper.click(All_Pending_Puts);
        System.out.println("Clicked on All pending puts");
        helper.log("clicked on all pending puts");
    }

    public void searchIcon() throws InterruptedException, IOException, ParseException {
        //OTC_19
        helper.getResponseCode();
        helper.click(Search_field);
        System.out.println("Clicked on Search icon");
        helper.log("Clicked on Search icon");

        Thread.sleep(2);
        helper.getResponseCode();
        helper.waitForElement(Clear_Search);
        Assert.assertTrue(driver.findElement(By.xpath(Clear_Search)).isDisplayed());
        System.out.println("Clear search icon is visible");
        helper.log("Clear search icon is visible");

        //OTC_20
        helper.enterDataInField(Search_field, SearchData_Open);
        System.out.println("Enter data in Search field");
        helper.log("Enter data in Search field");

        helper.pause(5);
        Assert.assertTrue(driver.findElement(By.xpath(APA_Text)).isDisplayed());
        System.out.println("Result is visible");
        helper.log("Result is visible");

        //OTC_21
        helper.getResponseCode();
        helper.click(Clear_Search);
        System.out.println("Clicked on clear search");
        helper.log("Clicked on clear search");

        helper.pause(5);
        Assert.assertEquals(driver.findElement(By.xpath(ALB_text)).isDisplayed(), true);
        System.out.println("Result is not visible hence testcase passed");
        helper.log("Result is not visible hence testcase passed");

    }

    public void column() throws IOException, ParseException, InterruptedException {
        //OTC_22
        helper.getResponseCode();
        helper.click(ColumnIcon);
        System.out.println("Column icon should visible properly");
        helper.log("Column icon should visible properly");

        helper.waitForElement(Max_Loss_column);
        Assert.assertEquals(helper.findElement(Max_Loss_column).isDisplayed(), true);
        System.out.println("max loss option is visible properly");
        helper.log("max loss option is visible properly");

        helper.click(Toggle_EntryDate);
        System.out.println("Entry date option turn on");
        helper.log("Entry date option turn on");

//        helper.pause(4);
//        driver.findElement(By.xpath(ColumnIcon)).click();
//        helper.pause(2);
//        Actions a = new Actions(driver);
//        a.sendKeys(Keys.ARROW_RIGHT);
//        a.sendKeys(Keys.ARROW_RIGHT);
//        a.sendKeys(Keys.ARROW_RIGHT);
//        helper.pause(7);
//        helper.waitForElement(ColumnIcon);
//        helper.findElement(ColumnIcon).click();
//        System.out.println("CLicked out side popup");
//        helper.log("CLicked out side popup");

//        helper.pause(5);
//        helper.waitForElement(Entry_date_column);
//        Assert.assertTrue(helper.findElement(Entry_date_column).isDisplayed());
//        System.out.println("Entry date column is visible");
//        helper.log("Entry date column is visible");

//        //OTC_23
//        helper.pause(5);
//        helper.waitForElement(ColumnIcon);
//        helper.findElement(ColumnIcon).click();
//        System.out.println("Column icon should visible properly");
//        helper.log("Column icon should visible properly");

        helper.click(Toggle_EntryDate);
        System.out.println("Entry date option turn off");
        helper.log("Entry date option turn off");

//        helper.pause(7);
//        helper.waitForElement(Open_Title);
//        helper.findElement(Open_Title).click();
//        System.out.println("CLicked out side popup");
//        helper.log("CLicked out side popup");

//        helper.pause(5);
//        helper.waitForElement(Entry_date_column);
//        Assert.assertEquals(helper.findElement(Entry_date_column).isDisplayed(), false);
//        System.out.println("Entry date column is not visible");
//        helper.log("Entry date column is not visible");
    }

    public void fullScreen() throws InterruptedException, IOException, ParseException {
        //OTC_26
        helper.getResponseCode();
        helper.click(FullScreenIcon);
        System.out.println("CLicked on full screen icon to zoom out mode");
        helper.log("CLicked on full screen icon to zoom out mode");

        helper.pause(4);
        Assert.assertFalse(driver.findElement(By.xpath(ActionOption)).isSelected());
        System.out.println("Zoom in mode open");
        helper.log("Zoom in mode open");

        //OTC_27
        helper.getResponseCode();
        helper.click(FullScreenIcon);
        System.out.println("CLicked on full screen icon to zoom in mode");
        helper.log("CLicked on full screen icon to zoom in mode");

        helper.pause(4);
        Assert.assertTrue(driver.findElement(By.xpath(ActionOption)).isDisplayed());
        System.out.println("Back to zoom out mode open");
        helper.log("Back to zoom out mode open");
    }

    public void tables() throws InterruptedException, IOException, ParseException {
        //OTC_28
        helper.getResponseCode();
        helper.click(First_value_Symbol);
        System.out.println("CLicked on First value of symbol column");
        helper.log("CLicked on First value of symbol column");

        helper.getResponseCode();
        helper.waitForElement(View_trade_title);
        Assert.assertTrue(driver.findElement(By.xpath(View_trade_title)).isDisplayed());
        System.out.println("View Trade title is visible");
        helper.log("View Trade title is visible");

        //OTC_29
        helper.pause(3);
        driver.navigate().back();
        helper.pause(10);
        helper.getResponseCode();
        helper.click(First_Value_Account);
        System.out.println("CLicked on First value of Account column");
        helper.log("CLicked on First value of Account column");

        helper.waitForElement(View_Account_Title);
        Assert.assertTrue(driver.findElement(By.xpath(View_Account_Title)).isDisplayed());
        System.out.println("View Trade title is visible");
        helper.log("View Trade title is visible");

        //OTC_29
        helper.pause(3);
        driver.navigate().back();
        helper.pause(10);
//        helper.scrollDown(Next_icon_table);
        Actions a = new Actions(driver);
        helper.waitForElement(Open_Title);
        if(!(helper.isElementPresent(Chart_icon_table))){
            a.sendKeys(Keys.ARROW_RIGHT);
            a.sendKeys(Keys.ARROW_RIGHT);
            a.sendKeys(Keys.ARROW_RIGHT);
            System.out.println("Keyboard right arrow key pressed");
            helper.log("Keyboard right arrow key pressed");
        }
        helper.getResponseCode();
        helper.click(Chart_icon_table);
        System.out.println("CLicked on  chart icon in first row");
        helper.log("CLicked on  chart icon in first row");

        helper.waitForElement(Chart_details_title);
        String ChartDetails_title = helper.getText(Chart_details_title);
        Assert.assertEquals(ChartDetails_title, "CHART DETAILS");
        System.out.println("Chart details title is visible");
        helper.log("Chart details title is visible");
    }

    public void setPagination_Action() throws IOException, ParseException, InterruptedException {
        //OTC_31
        helper.scrollDown(Rows_count);
        helper.pause(1);
        Assert.assertTrue(driver.findElement(By.xpath(Rows_count)).isDisplayed(), "Row count elemnet is visible");
        Assert.assertTrue(driver.findElement(By.xpath(GOToFirstPage)).isDisplayed(), "GO to first page elemnet is visible");
        Assert.assertTrue(driver.findElement(By.xpath(PreviousIcon_table)).isDisplayed(), "Previous icon elemnet is visible");
        Assert.assertTrue(driver.findElement(By.xpath(NextIcon_Table)).isDisplayed(), "Next icon elemnet is visible");
        Assert.assertTrue(driver.findElement(By.xpath(GoToLastPage_Table)).isDisplayed(), "Go to Last page elemnet is visible");

        //OTC_32
        helper.getResponseCode();
        helper.click(NextIcon_Table);
        System.out.println("CLicked on Next icon");
        helper.log("Clicked on Next icon");

        helper.click(PreviousIcon_table);
        System.out.println("CLicked on Previous icon");
        helper.log("Clicked on Previous icon");

        Assert.assertTrue(driver.findElement(By.xpath(PreviousIcon_Disabled)).isDisplayed());
        System.out.println("Previous icon is not visible hence functionality is working fine");
        helper.log("Previous icon is not visible hence functionality is working fine");

        //OTC_33
        helper.getResponseCode();
        helper.click(GoToLastPage_Table);
        System.out.println("CLicked on last page icon");
        helper.log("Clicked on last page icon");

        helper.getResponseCode();
        helper.click(GOToFirstPage);
        System.out.println("CLicked on First page view icon");
        helper.log("Clicked on First page view icon");

        Assert.assertTrue(driver.findElement(By.xpath(GoToFirstPage_disabled)).isDisplayed());
        System.out.println("Go to first page and Last page icon is disabled hence functionality is working fine");
        helper.log("Go to first page icon is disabled hence functionality is working fine");

        //OTC_34
        driver.navigate().refresh();
        helper.scrollandclick(Rows_count);
        System.out.println("Clicked on Row count");
        helper.log("Clicked on Row count");

        helper.click(Rows_Count_25);
        System.out.println("Clicked on Row count 25");
        helper.log("Clicked on Row count 25");

        List<WebElement> myElement = driver.findElements(By.xpath(Number_of_OpenTrade));
        int Element_size = myElement.size();
        System.out.println(Element_size);

        Assert.assertEquals(Element_size, 25);
        System.out.println("Element size is 25");
        helper.log("Element size is 25");
    }

    public void refreshIcon() throws IOException, ParseException, InterruptedException {
        helper.click(Refresh_Icon);
        helper.pause(2);
        Assert.assertTrue(helper.findElement(Loading_Icon).isDisplayed());
    }
}
