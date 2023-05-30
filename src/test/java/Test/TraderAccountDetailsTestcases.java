package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class TraderAccountDetailsTestcases extends BasePage {
    @Test
    public void traderAccountDetailsUI() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
    }
    @Test
    public void redirectionOf_ViewEquity() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
        traderAccountDetails.setView_Equity_Curve();
    }
    @Test
    public void redirectionOf_Edit_Button() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
        traderAccountDetails.setEdit_Button();
    }
    @Test
    public void redirectionOf_ViewPerformance_Button() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
        traderAccountDetails.setEdit_Button();
    }
    @Test
    public void editpageFunctionality() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
        traderAccountDetails.editPage();
    }
    @Test
    public void viewPerformanceFunctionality() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
        traderAccountDetails.viewPerformance();
    }
    @Test
    public void editDataWithBlankFieldTest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
        traderAccountDetails.editDataWithBlankFiled();
    }
    @Test
    public void tradeTypeFieldDropdownTest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
        traderAccountDetails.tradeTypesField();
    }
    @Test
    public void selectmultipleOptionInTradeType() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
        traderAccountDetails.tradeTypesField();
        traderAccountDetails.selectTradeType();
    }
    @Test
    public void notificationFieldUITest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
        traderAccountDetails.notification();
    }
    @Test
    public void notificationFieldTest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
        traderAccountDetails.notification();
        traderAccountDetails.selectnotificationUser();
    }
    @Test
    public void commentSectionTest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
        traderAccountDetails.commentlist();
        traderAccountDetails.search_Icon_CommentList();
    }
    @Test
    public void columnIcon_CommentList_Test() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
        traderAccountDetails.commentlist();
        traderAccountDetails.columnIcon_CommentList();
    }
    @Test
    public void fullScreenIcon_Commentlist_Test() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
        traderAccountDetails.commentlist();
        traderAccountDetails.fullScreenIcon_CommentList();
    }
    @Test
    public void savecomment_traderList_Test() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        traderAccountDetails.landOnTraderDetails();
        traderAccountDetails.commentlist();
        traderAccountDetails.saveComment_Functionality();
    }
}
