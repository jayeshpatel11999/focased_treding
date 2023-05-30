package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class ViewTradePageTestcases extends BasePage {
    @Test
    public void viewTradeUI() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        viewTrade.openViewTrade();
    }
    @Test
    public void editTrade() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        viewTrade.openViewTrade();
        viewTrade.EditTrade();
    }
    @Test
    public void flagTrade() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        viewTrade.openViewTrade();
        viewTrade.flagUnflag_Trade();
    }
    @Test
    public void manageTrades() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        viewTrade.openViewTrade();
        viewTrade.manageTrade();
    }
    @Test
    public void otherActionMenu() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        viewTrade.openViewTrade();
        viewTrade.setOther_ActionMenu();
    }
    @Test
    public void overviewTestcases() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        viewTrade.openViewTrade();
        viewTrade.overviewSection();
    }
    @Test
    public void commentSearchTestcases() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        viewTrade.openViewTrade();
        viewTrade.commentSection();
    }
    @Test
    public void addCommentBlankField() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        viewTrade.openViewTrade();
        viewTrade.addComment_withBlankfield();
    }
    @Test
    public void AddComment_longSentanceData() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        viewTrade.openViewTrade();
        viewTrade.addComment_withLongData();
    }
    @Test
    public void AddComment_SaveAndCloseTrade() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        viewTrade.openViewTrade();
        viewTrade.SaveCommentandcloseTread();
    }
}
