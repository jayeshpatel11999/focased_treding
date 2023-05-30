package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class OpenTradesTestcases extends BasePage {

    @Test
    public void createTrades() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.createTrade();
        openTradesPage.validData();
        openTradesPage.verificationAfterValidData();
    }

    @Test
    public void openTradesUI() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
    }

    @Test
    public void profile_price_Check() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.createTrade();
        openTradesPage.profitprice_Condition();
    }
    @Test
    public void submitWithBlankFieldTest() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.createTrade();
        openTradesPage.submitWithBlankField();
    }
    @Test
    public void stop_Condition_Check() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.createTrade();
        openTradesPage.stopCondition_field();
    }
    @Test
    public void checkbox_Test() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.createTrade();
        openTradesPage.checkbox();
    }

    @Test
    public void removeOption_Test() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        openTradesPage.remove();
        myTrades.myTradesMenu();
        pendingPage.pendingScreen();
        myTrades.myTradesMenu();
        cancelledPage.openCancelledPage();
    }
    @Test
    public void cancleOption_CallTest() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        openTradesPage.cancelUpCalls();
        myTrades.myTradesMenu();
        pendingPage.pendingUpdirectionCheck();
    }
    @Test
    public void cancelOption_Put_Test() throws InterruptedException, IOException, ParseException {
        //OTC_18_Bug
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        openTradesPage.cancleDownPuts();
        myTrades.myTradesMenu();
        pendingPage.pendingDownDirectionCheck();
    }
    @Test
    public void searchbar() throws InterruptedException, IOException, ParseException {
        //OTC_18_Bug
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        openTradesPage.searchIcon();
    }
    @Test
    public void column_Test() throws InterruptedException, IOException, ParseException {
        //OTC_18_Bug
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        openTradesPage.column();
    }
    @Test
    public void fullScreen_Test() throws InterruptedException, IOException, ParseException {
        //OTC_26
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        openTradesPage.fullScreen();
    }
    @Test
    public void table_Test() throws InterruptedException, IOException, ParseException {
        //OTC_27
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        openTradesPage.tables();
    }
    @Test
    public void pagination_Test() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        openTradesPage.setPagination_Action();
    }
    @Test
    public void refreshData() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        openTradesPage.openPageUI();
        openTradesPage.refreshIcon();
    }





}
