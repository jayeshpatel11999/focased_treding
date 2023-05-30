package Page;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.swing.*;
import java.io.IOException;

public class ViewTrade {
    WebDriver driver;
    Helper helper;
    String First_value_Symbol;
    String View_trade_title;
    String ActionOption;
    String Other_ActionMenu;
    String VirtualRealMenu;
    String Overview;
    String Trade;
    String Position;
    String StopLossAndProfitTarget;
    String Comments;
    String AddCommentArea;
    String SaveCommentAndCloseTrade;
    String SaveCommentButton;
    String Stop_Value_Field;
    String EditTrade_Option;
    String UnFlagTrade_option;
    String FlagTrade_Option;
    String FlagTrade_SuccessMessage;
    String ManageTrade;
    String ConfirmationPopup_ManageTrade;
    String CrossIcon_ManagePopup;
    String ManageYes_button;
    String ManageNo_button;
    String Remove_manager_Trade;
    String Confirmationpopup_RemoveManageTrade;
    String Trade_detail_Title;
    String Create_Child_Trade;
    String Delete_Trade_PopupTitle;
    String DeleteTrade_CrossIcon;
    String DeleteTrade_YesButton;
    String DeleteTrade_NoButton;
    String Delete_Trade;
    String View_histroy_link;
    String Monthly_History_title;
    String Account_link;
    String Chart_Details;
    String Chart_icon;
    String Account_details;
    String Comment_search_InvalidData;
    String Comment_search_ValidData;
    String InvalidData_In_table;
    String Admin_name_in_table;
    String Searchbox_In_CommentSection;
    String No_data_displayed;
    String Validation_msg_ForComment;
    String Add_Comment_LongData;
    String SuccessMessage_for_Comment;
    String CommentDataVerified_inCommentSection;
    String Confirmation_pooup;
    String CloseIcon_ConfirmPopup;
    String CommentConfrimPopup_YesButton;
    String CommentConfirmPopup_NoButton;
    String Save_Button_editPage;
    String FlagOrUnflag;
    String ErrorMSG_CannotUpdateDuringMarketHours;
    String SuccessToaster;

    public ViewTrade(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);

        First_value_Symbol = helper.data_repository("xpathlist", "OpenTradePaga", "First_value_Symbol");
        View_trade_title = helper.data_repository("xpathlist", "View_Trade", "View_trade_title");
        ActionOption = helper.data_repository("xpathlist", "OpenTradePaga", "ActionOption");
        Other_ActionMenu = helper.data_repository("xpathlist", "View_Trade", "Other_ActionMenu");
        VirtualRealMenu = helper.data_repository("xpathlist", "View_Trade", "VirtualRealMenu");
        Overview = helper.data_repository("xpathlist", "View_Trade", "Overview");
        Trade = helper.data_repository("xpathlist", "View_Trade", "Trade");
        Position = helper.data_repository("xpathlist", "View_Trade", "Position");
        StopLossAndProfitTarget = helper.data_repository("xpathlist", "View_Trade", "StopLossAndProfitTarget");
        Comments = helper.data_repository("xpathlist", "View_Trade", "Comments");
        AddCommentArea = helper.data_repository("xpathlist", "View_Trade", "AddCommentArea");
        SaveCommentAndCloseTrade = helper.data_repository("xpathlist", "View_Trade", "SaveCommentAndCloseTrade");
        SaveCommentButton = helper.data_repository("xpathlist", "View_Trade", "SaveCommentButton");
        Stop_Value_Field = helper.data_repository("xpathlist", "View_Trade", "Stop_Value_Field");
        EditTrade_Option = helper.data_repository("xpathlist", "View_Trade", "EditTrade_Option");
        UnFlagTrade_option = helper.data_repository("xpathlist", "View_Trade", "UnFlagTrade_option");
        FlagTrade_Option = helper.data_repository("xpathlist", "View_Trade", "FlagTrade_Option");
        FlagTrade_SuccessMessage = helper.data_repository("xpathlist", "View_Trade", "FlagTrade_SuccessMessage");
        ManageTrade = helper.data_repository("xpathlist", "View_Trade", "ManageTrade");
        ConfirmationPopup_ManageTrade = helper.data_repository("xpathlist", "View_Trade", "ConfirmationPopup_ManageTrade");
        CrossIcon_ManagePopup = helper.data_repository("xpathlist", "View_Trade", "CrossIcon_ManagePopup");
        ManageNo_button = helper.data_repository("xpathlist", "View_Trade", "ManageNo_button");
        ManageYes_button = helper.data_repository("xpathlist", "View_Trade", "ManageYes_button");
        Remove_manager_Trade = helper.data_repository("xpathlist", "View_Trade", "Remove_manager_Trade");
        Confirmationpopup_RemoveManageTrade = helper.data_repository("xpathlist", "View_Trade", "Confirmationpopup_RemoveManageTrade");
        Trade_detail_Title = helper.data_repository("xpathlist", "View_Trade", "Trade_detail_Title");
        Create_Child_Trade = helper.data_repository("xpathlist", "View_Trade", "Create_Child_Trade");
        Delete_Trade_PopupTitle = helper.data_repository("xpathlist", "View_Trade", "Delete_Trade_PopupTitle");
        DeleteTrade_CrossIcon = helper.data_repository("xpathlist", "View_Trade", "DeleteTrade_CrossIcon");
        DeleteTrade_YesButton = helper.data_repository("xpathlist", "View_Trade", "DeleteTrade_YesButton");
        DeleteTrade_NoButton = helper.data_repository("xpathlist", "View_Trade", "DeleteTrade_NoButton");
        Delete_Trade = helper.data_repository("xpathlist", "View_Trade", "Delete_Trade");
        View_histroy_link = helper.data_repository("xpathlist", "View_Trade", "View_histroy_link");
        Monthly_History_title = helper.data_repository("xpathlist", "View_Trade", "Monthly_History_title");
        Account_link = helper.data_repository("xpathlist", "View_Trade", "Account_link");
        Chart_Details = helper.data_repository("xpathlist", "View_Trade", "Chart_Details");
        Chart_icon = helper.data_repository("xpathlist", "View_Trade", "Chart_icon");
        Account_details = helper.data_repository("xpathlist", "View_Trade", "Account_details");
        Admin_name_in_table = helper.data_repository("xpathlist", "View_Trade", "Admin_name_in_table");
        InvalidData_In_table = helper.data_repository("xpathlist", "View_Trade", "InvalidData_In_table");
        Comment_search_InvalidData = helper.data_repository("TestData", "ViewTradeData", "Comment_search_InvalidData");
        Comment_search_ValidData = helper.data_repository("TestData", "ViewTradeData", "Comment_search_ValidData");
        Searchbox_In_CommentSection = helper.data_repository("xpathlist", "View_Trade", "Searchbox_In_CommentSection");
        No_data_displayed = helper.data_repository("xpathlist", "View_Trade", "No_data_displayed");
        Validation_msg_ForComment = helper.data_repository("xpathlist", "View_Trade", "Validation_msg_ForComment");
        Add_Comment_LongData = helper.data_repository("TestData", "ViewTradeData", "Add_Comment_LongData");
        SuccessMessage_for_Comment = helper.data_repository("xpathlist", "View_Trade", "SuccessMessage_for_Comment");
        CommentDataVerified_inCommentSection = helper.data_repository("xpathlist", "View_Trade", "CommentDataVerified_inCommentSection");
        Confirmation_pooup = helper.data_repository("xpathlist", "View_Trade", "Confirmation_pooup");
        CloseIcon_ConfirmPopup = helper.data_repository("xpathlist", "View_Trade", "CloseIcon_ConfirmPopup");
        CommentConfrimPopup_YesButton = helper.data_repository("xpathlist", "View_Trade", "CommentConfrimPopup_YesButton");
        CommentConfirmPopup_NoButton = helper.data_repository("xpathlist", "View_Trade", "CommentConfirmPopup_NoButton");
        Save_Button_editPage = helper.data_repository("xpathlist", "View_Account_Details", "Save_Button_editPage");
        FlagOrUnflag = helper.data_repository("xpathlist", "View_Trade", "FlagOrUnflag");
        ErrorMSG_CannotUpdateDuringMarketHours = helper.data_repository("xpathlist", "View_Trade", "ErrorMSG_CannotUpdateDuringMarketHours");
        SuccessToaster = helper.data_repository("xpathlist", "View_Trade", "SuccessToaster");
    }

    public void openViewTrade() throws IOException, ParseException, InterruptedException {
        //VTC_01
        helper.getResponseCode();
        helper.click(First_value_Symbol);
        System.out.println("CLicked on First value of symbol column");
        helper.log("CLicked on First value of symbol column");

        helper.waitForElement(View_trade_title);
        Assert.assertTrue(driver.findElement(By.xpath(View_trade_title)).isDisplayed());
        System.out.println("View Trade title is visible");
        helper.log("View Trade title is visible");
        Assert.assertTrue(driver.findElement(By.xpath(ActionOption)).isDisplayed());
        System.out.println("Action option is visible");
        helper.log("Action option is visible");
        Assert.assertTrue(driver.findElement(By.xpath(Other_ActionMenu)).isDisplayed());
        System.out.println("Other_ActionMenu is visible");
        helper.log("Other_ActionMenu is visible");
        Assert.assertTrue(driver.findElement(By.xpath(VirtualRealMenu)).isDisplayed());
        System.out.println("VirtualRealMenu is visible");
        helper.log("VirtualRealMenu is visible");
        Assert.assertTrue(driver.findElement(By.xpath(Overview)).isDisplayed());
        System.out.println("Overview is visible");
        helper.log("Overview is visible");
        driver.findElement(By.xpath(Overview)).click();
        System.out.println("Overview is visible");
        helper.log("Overview is visible");
        Assert.assertTrue(driver.findElement(By.xpath(Trade)).isDisplayed());
        System.out.println("Trade is visible");
        helper.log("Trade is visible");
        Assert.assertTrue(driver.findElement(By.xpath(Position)).isDisplayed());
        System.out.println("Position is visible");
        helper.log("Position is visible");
        Assert.assertTrue(driver.findElement(By.xpath(StopLossAndProfitTarget)).isDisplayed());
        System.out.println("StopLossAndProfitTarget is visible");
        helper.log("StopLossAndProfitTarget is visible");
        Assert.assertTrue(driver.findElement(By.xpath(Comments)).isDisplayed());
        System.out.println("Comments is visible");
        helper.log("Comments is visible");
        Assert.assertTrue(driver.findElement(By.xpath(AddCommentArea)).isDisplayed());
        System.out.println("AddCommentArea is visible");
        helper.log("AddCommentArea is visible");
        Assert.assertTrue(driver.findElement(By.xpath(SaveCommentAndCloseTrade)).isDisplayed());
        System.out.println("SaveCommentAndCloseTrade is visible");
        helper.log("SaveCommentAndCloseTrade is visible");
        Assert.assertTrue(driver.findElement(By.xpath(SaveCommentButton)).isDisplayed());
        System.out.println("SaveComment Button is visible");
        helper.log("SaveComment Button is visible");
    }

    public void EditTrade() throws IOException, ParseException, InterruptedException {
        //VTC_02
        helper.getResponseCode();
        helper.click(ActionOption);
        System.out.println("Clicked on Action Option");
        helper.log("Clicked on Action Option");

        helper.click(EditTrade_Option);
        System.out.println("Clicked on Edit trade Option");
        helper.log("Clicked on Edit trade Option");

        helper.getResponseCode();
        helper.pause(2);
        helper.waitForElement(Save_Button_editPage);
        helper.pause(2);
        boolean editTradeScreen = helper.findElement(Save_Button_editPage).isDisplayed();
        Assert.assertTrue(editTradeScreen);
        System.out.println("Stop value field is visible");
        helper.log("Stop value field is visible");
    }

    public void flagUnflag_Trade() throws IOException, ParseException, InterruptedException {
        //VTC_03
        helper.getResponseCode();
        driver.navigate().refresh();
        helper.pause(2);
        helper.waitForElement(ActionOption);
        helper.scrollToElement(ActionOption);
        helper.click(ActionOption);
        helper.pause(4);
    //    helper.click(ActionOption);
        System.out.println("Clicked on Action Option");
        helper.log("Clicked on Action Option");
        String flagOrUnflagText = helper.getText(FlagOrUnflag);
        System.out.println(flagOrUnflagText);

//        if(!(helper.isElementPresent("//button[text()='Unflag trade' or text()='Flag trade']"))){
//            helper.click(Account_link);
//            System.out.println("Clicked on Action Option again");
//            helper.pause(2);
//        }

        if (helper.isElementPresent(UnFlagTrade_option)) {
            helper.click(UnFlagTrade_option);
            System.out.println("Clicked on Unflage Trade Option");
            helper.log("Clicked on Unflage Trade Option");

            helper.waitForElement(ActionOption);
            helper.pause(3);
            helper.click(ActionOption);
            System.out.println("Clicked on Action Option");
            helper.log("Clicked on Action Option");
            helper.pause(5);
            Assert.assertTrue(helper.isElementPresent(FlagTrade_Option));
        }
        System.out.println("Test 3");
//        helper.getResponseCode();
        helper.click(FlagTrade_Option);
        System.out.println("Clicked on Flage Trade Option");
        helper.log("Clicked on Flage Trade Option");

        helper.waitForElement(FlagTrade_SuccessMessage);
        String flageTradeSuccess = helper.findElement(FlagTrade_SuccessMessage).getText();
        System.out.println("Success message is visible: " + flageTradeSuccess);
        helper.log("Success message is visible: " + flageTradeSuccess);

        helper.pause(3);
        helper.click(ActionOption);
        System.out.println("Clicked on Action Option");
        helper.log("Clicked on Action Option");

        helper.pause(5);
        helper.waitForElement(UnFlagTrade_option);
        Assert.assertTrue(helper.findElement(UnFlagTrade_option).isDisplayed());
        System.out.println("Flag trade option work as expected");
        helper.log("Flag trade option work as expected");

        //VTC_04
        helper.getResponseCode();
        helper.click(UnFlagTrade_option);
        System.out.println("Clicked on Unflage Trade Option");
        helper.log("Clicked on Unflage Trade Option");


        String unflageTradeSuccess = helper.findElement(FlagTrade_SuccessMessage).getText();
        System.out.println("Success message is visible: " + unflageTradeSuccess);
        helper.log("Success message is visible: " + unflageTradeSuccess);
    }

    public void manageTrade() throws IOException, ParseException, InterruptedException {
        //VTC_5
        helper.getResponseCode();
        driver.navigate().refresh();
        helper.pause(2);
        helper.waitForElement(ActionOption);
        helper.scrollToElement(ActionOption);
        helper.click(ActionOption);
        System.out.println("Clicked on Action Option");
        helper.log("Clicked on Action Option");
        helper.pause(2);
        try {
            if (driver.findElement(By.xpath(Remove_manager_Trade)).isDisplayed()) {
                helper.click(Remove_manager_Trade);
                System.out.println("Clicked on remove manager trade");
                helper.log("Clicked on remove manager trade");

                helper.waitForElement(ManageYes_button);
                helper.click(ManageYes_button);
                System.out.println("Clicked on manager popup yes button");
                helper.log("Clicked on manager popup yes button");
                driver.navigate().refresh();

                helper.pause(10);
            }
        } catch (Exception ignored) {

        }
        helper.getResponseCode();
        helper.click(ManageTrade);
        System.out.println("Clicked on Manage Option");
        helper.log("Clicked on Manage Option");

        helper.pause(6);
        helper.waitForElement(ConfirmationPopup_ManageTrade);
        Assert.assertTrue(driver.findElement(By.xpath(ConfirmationPopup_ManageTrade)).isDisplayed());
        System.out.println("Confirmation popup is visible");
        helper.log("Confirmation popup is visible");
        Assert.assertTrue(driver.findElement(By.xpath(ManageNo_button)).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath(ManageYes_button)).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath(CrossIcon_ManagePopup)).isDisplayed());

        //VTC_6
        helper.getResponseCode();
        helper.click(CrossIcon_ManagePopup);
        System.out.println("Clicked on cross icon");
        helper.log("Clicked on cross icon");

        helper.click(ActionOption);
        System.out.println("Clicked on Action option");
        helper.log("Clicked on Action option");

        helper.pause(5);
        helper.waitForElement(EditTrade_Option);
        Assert.assertTrue(helper.findElement(ManageTrade).isDisplayed(), "Element is visible");

        //VTC_07
        helper.getResponseCode();
        helper.click(ManageTrade);
        System.out.println("Clicked on Manage Trade");
        helper.log("Clicked on Manage Trade");

        helper.getResponseCode();
        helper.click(ManageNo_button);
        System.out.println("Clicked on No option in Manage Trade confirmation popup");
        helper.log("Clicked on No option in Manage Trade confirmation popup");

        helper.getResponseCode();
        helper.click(ActionOption);
        System.out.println("Clicked on Action option");
        helper.log("Clicked on Action option");

        helper.pause(5);
        helper.waitForElement(EditTrade_Option);
        Assert.assertTrue(helper.findElement(ManageTrade).isDisplayed(), "Element is visible");

        //VTC_08
        helper.click(ManageTrade);
        System.out.println("Clicked on Manage Trade");
        helper.log("Clicked on Manage Trade");

        helper.getResponseCode();
        helper.click(ManageYes_button);
        System.out.println("Clicked on Yes option in Manage Trade confirmation popup");
        helper.log("Clicked on Yes option in Manage Trade confirmation popup");

        helper.waitForElement(ErrorMSG_CannotUpdateDuringMarketHours);

//        helper.pause(2);
//        helper.waitForElement(ErrorMSG_CannotUpdateDuringMarketHours);
//        if(driver.findElement(By.xpath(ErrorMSG_CannotUpdateDuringMarketHours)).isDisplayed()){
//            System.out.println("Can not update during Market");
//        }else {
//
//        driver.navigate().refresh();
//        helper.getResponseCode();
//        helper.click(ActionOption);
//        System.out.println("Clicked on Action option");
//        helper.log("Clicked on Action option");
//
//        helper.pause(5);
//        helper.waitForElement(Remove_manager_Trade);
//        Assert.assertTrue(helper.findElement(Remove_manager_Trade).isDisplayed(), "Remove manager trade Element is visible");
//
//        //VTC_09
//        helper.getResponseCode();
//        helper.click(Remove_manager_Trade);
//        System.out.println("Clicked on Remove Manageer Trade");
//        helper.log("Clicked on Remove Manager Trade");
//
//        helper.pause(5);
//        Assert.assertTrue(driver.findElement(By.xpath(Confirmationpopup_RemoveManageTrade)).isDisplayed());
//        System.out.println("Confirmation popup is visible for remove manage trade");
//        helper.log("Confirmation popup is visible for remove manage trade");
//        Assert.assertTrue(driver.findElement(By.xpath(ManageNo_button)).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath(ManageYes_button)).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath(CrossIcon_ManagePopup)).isDisplayed());
//
//        //VTC_10
//        helper.getResponseCode();
//        helper.click(CrossIcon_ManagePopup);
//        System.out.println("Clicked on cross icon");
//        helper.log("Clicked on cross icon");
//
//        helper.getResponseCode();
//        helper.click(ActionOption);
//        System.out.println("Clicked on Action option");
//        helper.log("Clicked on Action option");
//
//        helper.pause(5);
//        helper.waitForElement(EditTrade_Option);
//        Assert.assertTrue(helper.findElement(Remove_manager_Trade).isDisplayed(), "Remove Manager trade Element is visible");
//
//        //VTC_11
//        helper.click(Remove_manager_Trade);
//        System.out.println("Clicked on Remove Manage Trade");
//        helper.log("Clicked on Remove Manage Trade");
//
//        helper.getResponseCode();
//        helper.click(ManageNo_button);
//        System.out.println("Clicked on No option in Remove Manage Trade confirmation popup");
//        helper.log("Clicked on No option in Remove Manage Trade confirmation popup");
//
//        helper.click(ActionOption);
//        System.out.println("Clicked on Action option");
//        helper.log("Clicked on Action option");
//
//        helper.pause(5);
//        helper.waitForElement(EditTrade_Option);
//        Assert.assertTrue(helper.findElement(Remove_manager_Trade).isDisplayed(), "Remove manager trade Element is visible");
//
//        //VTC_12
//        helper.click(Remove_manager_Trade);
//        System.out.println("Clicked on Remove Manage Trade");
//        helper.log("Clicked on  Remove Manage Trade");
//
//        helper.getResponseCode();
//        helper.click(ManageYes_button);
//        System.out.println("Clicked on Yes option in Manage Trade confirmation popup");
//        helper.log("Clicked on Yes option in Manage Trade confirmation popup");
//
//        helper.getResponseCode();
//        helper.click(ActionOption);
//        System.out.println("Clicked on Action option");
//        helper.log("Clicked on Action option");
//
//        helper.pause(5);
//        helper.waitForElement(EditTrade_Option);
//        Assert.assertTrue(helper.findElement(ManageTrade).isDisplayed(), "manage Trade Element is visible");
//        }


    }

    public void setOther_ActionMenu() throws InterruptedException, IOException, ParseException {
        //VTC_13
        helper.getResponseCode();
        helper.click(Other_ActionMenu);
        System.out.println("Clicked on Other Action Option");
        helper.log("Clicked on other Action Option");

        helper.click(Create_Child_Trade);
        System.out.println("Clicked on Create child trade Option");
        helper.log("Clicked on Create child trade Option");

        helper.waitForElement(Trade_detail_Title);
        Assert.assertTrue(driver.findElement(By.xpath(Trade_detail_Title)).isDisplayed());
        System.out.println("Clicked on Trade details title");
        helper.log("Clicked on Trade details title");

        //VTC_14
        helper.pause(5);
        driver.navigate().back();
        helper.click(Other_ActionMenu);
        System.out.println("Clicked on Other Action Option");
        helper.log("Clicked on other Action Option");

        helper.getResponseCode();
        helper.click(Delete_Trade);
        System.out.println("Clicked on Delete trade Option");
        helper.log("Clicked on Delete trade Option");

        helper.pause(5);
        helper.waitForElement(Delete_Trade_PopupTitle);
        Assert.assertTrue(driver.findElement(By.xpath(Delete_Trade_PopupTitle)).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath(DeleteTrade_CrossIcon)).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath(DeleteTrade_NoButton)).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath(DeleteTrade_YesButton)).isDisplayed());
        System.out.println("Clicked on Trade details title");
        helper.log("Clicked on Trade details title");

        //VTC_15
        helper.getResponseCode();
        helper.click(DeleteTrade_CrossIcon);
        System.out.println("Clicked on Delete option");
        helper.log("Clicked on Delete option");

        helper.getResponseCode();
        helper.click(Other_ActionMenu);
        System.out.println("Clicked on Other Action option");
        helper.log("Clicked on other Action option");

        helper.pause(13);
        helper.waitForElement(Delete_Trade);
        Assert.assertTrue(helper.findElement(Delete_Trade).isDisplayed(), "Delete Trade Element is visible");

        //VTC_16
        helper.getResponseCode();
        helper.click(Delete_Trade);
        System.out.println("Clicked on Delete option");
        helper.log("Clicked on Delete option");

        helper.getResponseCode();
        helper.click(DeleteTrade_NoButton);
        System.out.println("Clicked on No option in Delete Trade popup");
        helper.log("Clicked on No option in Delete Trade popup");

        helper.getResponseCode();
        helper.click(Other_ActionMenu);
        System.out.println("Clicked on Action option");
        helper.log("Clicked on Action option");

        helper.pause(5);
        helper.waitForElement(Delete_Trade);
        Assert.assertTrue(helper.findElement(Delete_Trade).isDisplayed(), "Delete Trade Element is visible");

        //VTC_17
        helper.getResponseCode();
        helper.click(Delete_Trade);
        helper.pause(2);
        helper.getResponseCode();
        helper.click(DeleteTrade_YesButton);
        helper.pause(7);

        helper.pause(5);
        helper.getResponseCode();
        helper.waitForElement(First_value_Symbol);
        Assert.assertTrue(helper.findElement(First_value_Symbol).isDisplayed(), "Trade is removed");
    }

    public void overviewSection() throws InterruptedException, IOException, ParseException {
        //VTC_18
        helper.getResponseCode();
        helper.click(Overview);
        helper.click(View_histroy_link);
        helper.pause(15);
        Assert.assertTrue(driver.findElement(By.xpath(Monthly_History_title)).isDisplayed(), "Monthly history title is display hence view history link working fine");
        helper.log("Monthly history title is display hence view history link working fine");

        //VTC-19
        driver.navigate().back();
        helper.getResponseCode();
        helper.click(Chart_icon);
        helper.pause(15);
        Assert.assertTrue(driver.findElement(By.xpath(Chart_Details)).isDisplayed(), "Chart details title is display hence view Chart icon link working fine");
        helper.log("Chart details title is display hence view Chart icon link working fine");

        //VTC_20
        driver.navigate().back();
        helper.getResponseCode();
        helper.click(Account_link);
        helper.pause(15);
        Assert.assertTrue(driver.findElement(By.xpath(Account_details)).isDisplayed(), "Chart details title is display hence view Chart icon link working fine");
        helper.log("Chart details title is display hence view Chart icon link working fine");
    }

    public void commentSection() throws InterruptedException, IOException, ParseException {
        //VTC_21
        //     helper.click(Overview);
        helper.getResponseCode();
        helper.click(Comments);
        helper.enterDataInField(Searchbox_In_CommentSection, Comment_search_ValidData);

        helper.pause(4);
        Assert.assertTrue(driver.findElement(By.xpath(Admin_name_in_table)).isDisplayed(), "Admin name is displayed in the table");

        //VTC_22
        helper.enterDataInField(Searchbox_In_CommentSection, Comment_search_InvalidData);
        helper.pause(5);
        Assert.assertTrue(driver.findElement(By.xpath(No_data_displayed)).isDisplayed(), "There is no data is displayed");
    }

    public void addComment_withBlankfield() throws IOException, ParseException, InterruptedException {
        //VTC_23
        helper.getResponseCode();
        helper.scrollandclick(SaveCommentButton);
        helper.log("Clicked on save comment button");
        Assert.assertTrue(driver.findElement(By.xpath(Validation_msg_ForComment)).isDisplayed());
        helper.log("Validation message shows for comment");
    }

    public void addComment_withLongData() throws IOException, ParseException, InterruptedException {
        helper.getResponseCode();
        helper.enterDataInField(AddCommentArea, Add_Comment_LongData);
        helper.log("Added comment in comment field");
        helper.getResponseCode();
        helper.scrollandclick(SaveCommentButton);
        helper.log("Clicked on save comment button");
        helper.waitForElement(SuccessMessage_for_Comment);
        Assert.assertTrue(helper.findElement(SuccessMessage_for_Comment).isDisplayed());
        String timeWHenComment = helper.getCurrentTimeStampString();
        helper.log("Success message is displayed");

        helper.getResponseCode();
        helper.click(Comments);
        helper.log("Added comment in comment section");
        helper.waitForElement(CommentDataVerified_inCommentSection);
        Assert.assertTrue(helper.findElement(CommentDataVerified_inCommentSection).isDisplayed());
        String CommentInTimeStep = helper.getText("//table[@class='table table-bordered']/tbody/tr/td[@tabindex=\"1\"]");
    //    Assert.assertEquals(timeWHenComment, CommentInTimeStep);
        helper.log("Data is visible properly in comment section");
    }

    public void SaveCommentandcloseTread() throws IOException, ParseException, InterruptedException {
        helper.getResponseCode();
        helper.scrollandclick(SaveCommentAndCloseTrade);
        helper.log("Clicked on save comment and close trade button");

        helper.waitForElement(Confirmation_pooup);
        Assert.assertTrue(helper.findElement(Confirmation_pooup).isDisplayed());
        Assert.assertTrue(helper.findElement(CloseIcon_ConfirmPopup).isDisplayed());
        Assert.assertTrue(helper.findElement(CommentConfirmPopup_NoButton).isDisplayed());
        Assert.assertTrue(helper.findElement(CommentConfrimPopup_YesButton).isDisplayed());
        helper.log("Confirmation popoup is visible");

        helper.getResponseCode();
        helper.click(CloseIcon_ConfirmPopup);
        helper.log("Clicked on close icon of confirmation popup");

        helper.getResponseCode();
        helper.click(SaveCommentAndCloseTrade);
        helper.click(CommentConfirmPopup_NoButton);
        helper.log("Clicked on No button of confirmation popup");

        helper.getResponseCode();
        helper.click(SaveCommentAndCloseTrade);
        helper.click(CommentConfrimPopup_YesButton);
        helper.log("Clicked on Yes button of confirmation popup");

        Assert.assertTrue(helper.findElement(Validation_msg_ForComment).isDisplayed());
        helper.log("Validation is display for blank and field");

        helper.enterDataInField(AddCommentArea, Add_Comment_LongData);
        helper.click(SaveCommentAndCloseTrade);
        helper.log("Clicked on save comment and close trade button");

        //Not able to create script as face one blocker issue
    }
}
