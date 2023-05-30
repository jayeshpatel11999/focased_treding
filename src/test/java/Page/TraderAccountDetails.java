package Page;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class TraderAccountDetails {
    WebDriver driver;
    Helper helper;
    String First_Value_Account;
    String View_Account_Title;
    String Edit_Button;
    String View_Equity_Curve;
    String View_Performance;
    String Comment_List;
    String Add_Comment_section;
    String Save_button_Comment;
    String Summary_Report_Title;
    String TraderEquityCurve_Title;
    String Strategy_field;
    String DescriptionForFollowers_disabled;
    String NameForFollowers_Disabled;
    String Followers_allowed;
    String NameForFollowers;
    String DescriptionForFollowers;
    String Account_Name;
    String Save_Button_editPage;
    String Validation_of_First_field;
    String History_Option;
    String Trade_Type;
    String Earnings_Option;
    String Gap_Option;
    String Divergence_Option;
    String Precise_Option;
    String Tech_Divergence_Option;
    String Earnings;
    String CrossIcon_TradeTypeOption;
    String HistoryCross_Icon;
    String EarningsCross_Icon;
    String PreceiseCross_Icon;
    String SteveGray_Option;
    String BrandonGray_Option;
    String SystemAdmin_Option;
    String Notification_menu;
    String SteveGreyCross_Icon;
    String BrandonGrayCross_Icon;
    String SystemAdminCross_Icon;
    String NotificationCross_Icon;
    String SearchIcon_CommentList;
    String ShowHideColumn_Icon;
    String Screen_Icon_On_Small_Screen_TraderAccount;
    String Screen_Icon_On_FullScreen_TraderAccount;
    String RowsPerPage_text;
    String Clear_Search;
    String SeachTextbox;
    String TestDataForSearch;
    String TestdataVisibleAfterSearch;
    String Comment_search_InvalidData;
    String SaveCommentButton;
    String DateAddedOption_CommentList;
    String DateAddedOffToggle_CommentList;
    String DateAddedTitle;
    String DateAddedOnToggle_CommentList;
    String CommentAddedSuccessfully;
    String Submit_Button;
    String Search_field;
    String OpenPageTitle;

    public TraderAccountDetails(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);
        First_Value_Account = helper.data_repository("xpathlist", "OpenTradePaga", "First_Value_Account");
        Search_field = helper.data_repository("xpathlist", "OpenTradePaga", "Search_field");
        View_Account_Title = helper.data_repository("xpathlist", "View_Account_Details", "View_Account_Title");
        Edit_Button = helper.data_repository("xpathlist", "View_Account_Details", "Edit_Button");
        View_Equity_Curve = helper.data_repository("xpathlist", "View_Account_Details", "View_Equity_Curve");
        View_Performance = helper.data_repository("xpathlist", "View_Account_Details", "View_Performance");
        Comment_List = helper.data_repository("xpathlist", "View_Account_Details", "Comment_List");
        Add_Comment_section = helper.data_repository("xpathlist", "View_Account_Details", "Add_Comment_section");
        Save_button_Comment = helper.data_repository("xpathlist", "View_Account_Details", "Save_button");
        Save_Button_editPage = helper.data_repository("xpathlist", "View_Account_Details", "Save_Button_editPage");
        Summary_Report_Title = helper.data_repository("xpathlist", "Summary_Report_Page", "Summary_Report_Title");
        TraderEquityCurve_Title = helper.data_repository("xpathlist", "Trader_Equity_Curve", "TraderEquityCurve_Title");
        Submit_Button = helper.data_repository("xpathlist", "Trader_Equity_Curve", "Submit_Button");
        Strategy_field = helper.data_repository("xpathlist", "View_Account_Details", "Strategy_field");
        DescriptionForFollowers_disabled = helper.data_repository("xpathlist", "View_Account_Details", "DescriptionForFollowers_disabled");
        NameForFollowers_Disabled = helper.data_repository("xpathlist", "View_Account_Details", "NameForFollowers_Disabled");
        Followers_allowed = helper.data_repository("xpathlist", "View_Account_Details", "Followers_allowed");
        NameForFollowers = helper.data_repository("xpathlist", "View_Account_Details", "NameForFollowers");
        DescriptionForFollowers = helper.data_repository("xpathlist", "View_Account_Details", "DescriptionForFollowers");
        Account_Name = helper.data_repository("xpathlist", "View_Account_Details", "Account_Name");
        Validation_of_First_field = helper.data_repository("xpathlist", "OpenTradePaga", "Validation_of_First_field");
        History_Option = helper.data_repository("xpathlist", "View_Account_Details", "History_Option");
        Trade_Type = helper.data_repository("xpathlist", "View_Account_Details", "Trade_Type");
        Earnings_Option = helper.data_repository("xpathlist", "View_Account_Details", "Earnings_Option");
        Gap_Option = helper.data_repository("xpathlist", "View_Account_Details", "Gap_Option");
        Divergence_Option = helper.data_repository("xpathlist", "View_Account_Details", "Divergence_Option");
        Precise_Option = helper.data_repository("xpathlist", "View_Account_Details", "Precise_Option");
        Tech_Divergence_Option = helper.data_repository("xpathlist", "View_Account_Details", "Tech_Divergence_Option");
        Earnings = helper.data_repository("xpathlist", "View_Account_Details", "Earnings");
        CrossIcon_TradeTypeOption = helper.data_repository("xpathlist", "View_Account_Details", "CrossIcon_TradeTypeOption");
        HistoryCross_Icon = helper.data_repository("xpathlist", "View_Account_Details", "HistoryCross_Icon");
        PreceiseCross_Icon = helper.data_repository("xpathlist", "View_Account_Details", "PreceiseCross_Icon");
        EarningsCross_Icon = helper.data_repository("xpathlist", "View_Account_Details", "EarningsCross_Icon");
        Notification_menu = helper.data_repository("xpathlist", "View_Account_Details", "Notification_menu");
        SteveGray_Option = helper.data_repository("xpathlist", "View_Account_Details", "SteveGray_Option");
        BrandonGray_Option = helper.data_repository("xpathlist", "View_Account_Details", "BrandonGray_Option");
        SystemAdmin_Option = helper.data_repository("xpathlist", "View_Account_Details", "SystemAdmin_Option");
        SteveGreyCross_Icon = helper.data_repository("xpathlist", "View_Account_Details", "SteveGreyCross_Icon");
        BrandonGrayCross_Icon = helper.data_repository("xpathlist", "View_Account_Details", "BrandonGrayCross_Icon");
        SystemAdminCross_Icon = helper.data_repository("xpathlist", "View_Account_Details", "SystemAdminCross_Icon");
        NotificationCross_Icon = helper.data_repository("xpathlist", "View_Account_Details", "NotificationCross_Icon");
        SearchIcon_CommentList = helper.data_repository("xpathlist", "View_Account_Details", "SearchIcon_CommentList");
        ShowHideColumn_Icon = helper.data_repository("xpathlist", "View_Account_Details", "ShowHideColumn_Icon");
        Screen_Icon_On_Small_Screen_TraderAccount = helper.data_repository("xpathlist", "View_Account_Details", "Screen_Icon_On_Small_Screen_TraderAccount");
        Screen_Icon_On_FullScreen_TraderAccount = helper.data_repository("xpathlist", "View_Account_Details", "Screen_Icon_On_FullScreen_TraderAccount");
        RowsPerPage_text = helper.data_repository("xpathlist", "View_Account_Details", "RowsPerPage_text");
        Clear_Search = helper.data_repository("xpathlist", "OpenTradePaga", "Clear_Search");
        SeachTextbox = helper.data_repository("xpathlist", "View_Account_Details", "SeachTextbox");
        TestDataForSearch = helper.data_repository("TestData", "ViewTradeAccount", "TestDataForSearch");
        TestdataVisibleAfterSearch = helper.data_repository("xpathlist", "View_Account_Details", "TestdataVisibleAfterSearch");
        Comment_search_InvalidData = helper.data_repository("TestData", "ViewTradeData", "Comment_search_InvalidData");
        SaveCommentButton = helper.data_repository("xpathlist", "View_Trade", "SaveCommentButton");
        DateAddedOption_CommentList = helper.data_repository("xpathlist", "View_Account_Details", "DateAddedOption_CommentList");
        DateAddedOffToggle_CommentList = helper.data_repository("xpathlist", "View_Account_Details", "DateAddedOffToggle_CommentList");
        DateAddedTitle = helper.data_repository("xpathlist", "View_Account_Details", "DateAddedTitle");
        DateAddedOnToggle_CommentList = helper.data_repository("xpathlist", "View_Account_Details", "DateAddedOnToggle_CommentList");
        OpenPageTitle = helper.data_repository("xpathlist", "MyTradesPage", "OpenPageTitle");
        CommentAddedSuccessfully = helper.data_repository("xpathlist", "View_Account_Details", "CommentAddedSuccessfully");

    }

    public void landOnTraderDetails() throws IOException, ParseException, InterruptedException {
        //TTC_01
        helper.click(First_Value_Account);
        helper.log("Click on first value of account");
        helper.getResponseCode();
        Assert.assertTrue(helper.findElement(View_Account_Title).isDisplayed());
        Assert.assertTrue(helper.findElement(Edit_Button).isDisplayed());
        Assert.assertTrue(helper.findElement(View_Equity_Curve).isDisplayed());
        Assert.assertTrue(helper.findElement(View_Performance).isDisplayed());
        helper.scrollToElement(Comment_List);
        helper.pause(2);
        Assert.assertTrue(helper.findElement(Comment_List).isDisplayed());
        helper.scrollDown(Save_button_Comment);
        Assert.assertTrue(helper.findElement(Add_Comment_section).isDisplayed());
        Assert.assertTrue(helper.findElement(Save_button_Comment).isDisplayed());
        helper.log("Title is visible of all elements of trader details page");
    }

    public void viewPerformance() throws IOException, ParseException, InterruptedException {
        //TTC_02
        helper.scrollToElement(View_Performance);
        helper.click(View_Performance);
        helper.log("Click on VIew Performance button");
        helper.waitForElement(Summary_Report_Title);
        Assert.assertTrue(helper.findElement(Summary_Report_Title).isDisplayed());
        helper.log("Summary report title is visible");
    }

    public void setView_Equity_Curve() throws IOException, ParseException, InterruptedException {
        //TTC_03
        helper.scrollToElement(View_Equity_Curve);
        helper.click(View_Equity_Curve);
        helper.log("Click on VIew Equity curve button");
        helper.waitForElement(TraderEquityCurve_Title);
        Assert.assertTrue(helper.findElement(TraderEquityCurve_Title).isDisplayed());
        helper.log("Trader Equity Curve title is visible");

        helper.click(Submit_Button);
        //Did not assert as graph does not shows, Once the issue is fixed will create further script

    }

    public void setEdit_Button() throws IOException, ParseException, InterruptedException {
        //TTC_04
        helper.scrollToElement(Edit_Button);
        helper.click(Edit_Button);
        helper.log("Click on VIew Equity curve button");
        helper.waitForElement(Strategy_field);
        Assert.assertTrue(helper.findElement(Strategy_field).isDisplayed());
        helper.log("Strategy field is visible");
    }

    public void editPage() throws IOException, ParseException, InterruptedException {
        //TTC_05
        helper.getResponseCode();
        helper.scrollToElement(Edit_Button);
        helper.click(Edit_Button);
        helper.log("Click on VIew Equity curve button");
        helper.waitForElement(Strategy_field);
        Assert.assertTrue(helper.findElement(DescriptionForFollowers_disabled).isDisplayed());
        Assert.assertTrue(helper.findElement(NameForFollowers_Disabled).isDisplayed());
        helper.log("description for followers and name for follower field is disabled");

        helper.getResponseCode();
        helper.click(Followers_allowed); //to check the checkbox of follower
        helper.log("CHeck the checkbox of follower allowed");
        helper.waitForElement(DescriptionForFollowers);
        Assert.assertTrue(helper.findElement(DescriptionForFollowers).isDisplayed());
        Assert.assertTrue(helper.findElement(NameForFollowers).isDisplayed());
        helper.log("description for followers and name for follower field is enabled");

        helper.click(Followers_allowed);
        Assert.assertTrue(helper.findElement(DescriptionForFollowers_disabled).isDisplayed());
        Assert.assertTrue(helper.findElement(NameForFollowers_Disabled).isDisplayed());
        helper.log("description for followers and name for follower field is disabled");

        helper.getResponseCode();
        helper.scrollToElement(Save_Button_editPage);
        helper.click(Save_Button_editPage);
        helper.log("Click on save button");

        helper.scrollToElement(View_Account_Title);
        helper.waitForElement(View_Account_Title);
        Assert.assertTrue(helper.findElement(View_Account_Title).isDisplayed());
    }

    public void editDataWithBlankFiled() throws IOException, ParseException, InterruptedException {
        helper.getResponseCode();
        helper.scrollToElement(Edit_Button);
        helper.click(Edit_Button);
        helper.log("Click on VIew Equity curve button");
        helper.getResponseCode();
        helper.removeDataFromField(Account_Name);
        helper.scrollandclick(Save_Button_editPage);
        helper.log("Click on save button");
        helper.pause(10);
        Assert.assertTrue(helper.findElement(Validation_of_First_field).isDisplayed());
    }

    public void tradeTypesField() throws IOException, ParseException, InterruptedException {
        //TTC_13
        helper.getResponseCode();
        helper.scrollToElement(Edit_Button);
        helper.click(Edit_Button);
        helper.getResponseCode();
        helper.scrollandclick(Trade_Type);
        helper.waitForElement(History_Option);
        Assert.assertTrue(helper.findElement(History_Option).isDisplayed());
        Assert.assertTrue(helper.findElement(Earnings_Option).isDisplayed());
        Assert.assertTrue(helper.findElement(Tech_Divergence_Option).isDisplayed());
        Assert.assertTrue(helper.findElement(Precise_Option).isDisplayed());
        Assert.assertTrue(helper.findElement(Divergence_Option).isDisplayed());
        Assert.assertTrue(helper.findElement(Gap_Option).isDisplayed());
    }

    public void selectTradeType() throws IOException, ParseException, InterruptedException {
        //TTC_14 and TTC_15
        helper.click(History_Option);
        helper.waitForElement(HistoryCross_Icon);
        Assert.assertTrue(helper.findElement(HistoryCross_Icon).isDisplayed());
        helper.log("Cross icon is visible with history option");
        helper.click(HistoryCross_Icon);
        helper.log(" Click on Cross icon");

        helper.click(Trade_Type);
        helper.click(History_Option);
        helper.click(Trade_Type);
        helper.click(Earnings_Option);
        helper.click(Trade_Type);
        helper.click(Precise_Option);
        helper.waitForElement(HistoryCross_Icon);
        Assert.assertTrue(helper.findElement(HistoryCross_Icon).isDisplayed());
        Assert.assertTrue(helper.findElement(EarningsCross_Icon).isDisplayed());
        Assert.assertTrue(helper.findElement(PreceiseCross_Icon).isDisplayed());
        helper.log("Cross icon is visible for all selected trade type");

        //TTC_16
        helper.click(CrossIcon_TradeTypeOption);
        Assert.assertFalse(Boolean.parseBoolean(History_Option));
    }

    public void notification() throws IOException, ParseException, InterruptedException {
        //TTC_17
        helper.scrollToElement(Edit_Button);
        helper.click(Edit_Button);
        helper.getResponseCode();
        helper.scrollandclick(Notification_menu);
        helper.waitForElement(SteveGray_Option);
        Assert.assertTrue(helper.findElement(SteveGray_Option).isDisplayed());
        Assert.assertTrue(helper.findElement(SystemAdmin_Option).isDisplayed());
        Assert.assertTrue(helper.findElement(BrandonGray_Option).isDisplayed());
        helper.log("Notification dropdown open and options visible");
    }

    public void selectnotificationUser() throws IOException, ParseException, InterruptedException {
        //TTC_17
        helper.click(SystemAdmin_Option);
        helper.waitForElement(SystemAdminCross_Icon);
        Assert.assertTrue(helper.findElement(SystemAdminCross_Icon).isDisplayed());
        helper.log("System admin cross icon");

        helper.click(SystemAdminCross_Icon);
        Assert.assertFalse(Boolean.parseBoolean(SystemAdmin_Option));

        helper.click(Notification_menu);
        helper.click(SystemAdmin_Option);
        helper.click(Notification_menu);
        helper.click(SteveGray_Option);
        helper.click(Notification_menu);
        helper.click(BrandonGray_Option);
        helper.waitForElement(NotificationCross_Icon);
        Assert.assertTrue(helper.findElement(SteveGreyCross_Icon).isDisplayed());
        Assert.assertTrue(helper.findElement(SystemAdminCross_Icon).isDisplayed());
        Assert.assertTrue(helper.findElement(BrandonGrayCross_Icon).isDisplayed());
        helper.click(NotificationCross_Icon);
        Assert.assertFalse(Boolean.parseBoolean(SystemAdmin_Option));
    }

    public void commentlist() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(View_Account_Title);
        helper.scrollDown(SaveCommentButton);
        helper.pause(2);
        Assert.assertFalse(Boolean.parseBoolean(SearchIcon_CommentList));
        Assert.assertFalse(Boolean.parseBoolean(ShowHideColumn_Icon));
        Assert.assertFalse(Boolean.parseBoolean(Screen_Icon_On_Small_Screen_TraderAccount));
        Assert.assertFalse(Boolean.parseBoolean(RowsPerPage_text));
    }
    public void search_Icon_CommentList() throws IOException, ParseException, InterruptedException {
        //TTC_23
        helper.pause(2);
//        driver.navigate().back();
//        helper.waitForElement(OpenPageTitle);
//        driver.navigate().forward();
        driver.navigate().refresh();
        helper.waitForElement(View_Account_Title);
        helper.scrollToElement(Search_field);
        helper.click(Search_field);
        helper.pause(3);
        Assert.assertTrue(helper.findElement(Clear_Search).isDisplayed());
        helper.log("Clear search is visible");

        //TTC_24
        helper.enterDataInField(Search_field, TestDataForSearch);
        helper.waitForElement(TestdataVisibleAfterSearch);
        Assert.assertTrue(helper.findElement(TestdataVisibleAfterSearch).isDisplayed());
        helper.log("Search data is visible");

        //TTC_25
        helper.enterDataInField(Search_field,Comment_search_InvalidData);
        helper.pause(2);
        Assert.assertFalse(helper.isElementPresent(TestdataVisibleAfterSearch));

        helper.click(Clear_Search);
        helper.log("Clicked on clear search icon");
        helper.waitForElement(TestdataVisibleAfterSearch);
        Assert.assertTrue(helper.isElementPresent(TestdataVisibleAfterSearch));
    }
    public void columnIcon_CommentList() throws IOException, ParseException, InterruptedException {
        driver.navigate().back();
        helper.pause(5);
        driver.navigate().forward();
        helper.pause(2);
        helper.scrollToElement(ShowHideColumn_Icon);
        helper.click(ShowHideColumn_Icon);
        helper.waitForElement(DateAddedOption_CommentList);
        Assert.assertTrue(helper.findElement(DateAddedOption_CommentList).isDisplayed());
        helper.log("Date added option is visible");

        helper.pause(2);
        if(helper.isElementPresent(DateAddedOffToggle_CommentList)){
            helper.click(DateAddedOffToggle_CommentList);
        }
        helper.click(DateAddedOnToggle_CommentList);
        Assert.assertFalse(helper.isElementPresent(DateAddedTitle));
    }
    public void fullScreenIcon_CommentList() throws IOException, ParseException, InterruptedException {
        helper.pause(2);
        helper.scrollToElement(Screen_Icon_On_Small_Screen_TraderAccount);
        helper.click(Screen_Icon_On_Small_Screen_TraderAccount);
        helper.pause(5);
        Assert.assertFalse(helper.isElementPresent(Screen_Icon_On_Small_Screen_TraderAccount));
        helper.click(Screen_Icon_On_FullScreen_TraderAccount);
        helper.pause(2);
        Assert.assertTrue(helper.isElementPresent(Comment_List));
        Assert.assertTrue(helper.isElementPresent(Screen_Icon_On_Small_Screen_TraderAccount));

    }
    public void saveComment_Functionality() throws IOException, ParseException, InterruptedException {
        helper.click(Save_button_Comment);
        helper.pause(4);
        Assert.assertTrue(helper.isElementPresent(Validation_of_First_field));

        helper.enterDataInField(Add_Comment_section,"Testing");
        helper.click(Save_button_Comment);
        helper.pause(2);
        Assert.assertTrue(helper.isElementPresent(CommentAddedSuccessfully));
    }

}

