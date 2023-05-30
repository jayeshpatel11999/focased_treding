package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class HistoryDetailsTestcases extends BasePage {
    @Test
    public void historyDetailsUI() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.symbolLink();
        historyDetailsPage.historyDetailPageUI();
    }
    @Test
    public void earningTABTest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.symbolLink();
        historyDetailsPage.earningtabFun();
    }
    @Test
    public void chaintabFUn() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.symbolLink();
        historyDetailsPage.chainTabFun();
    }
    @Test
    public void googleTabFun() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.symbolLink();
        historyDetailsPage.googleTabFUn();
    }
    @Test
    public void volatilityTabFun() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.symbolLink();
        historyDetailsPage.volatilityTabFUn();
    }
    @Test
    public void yahootabFUN() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.symbolLink();
        historyDetailsPage.yahoootabFun();
    }
    @Test
    public void symbolfieldSearchTest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.symbolLink();
        historyDetailsPage.symbolSearch();
    }
    @Test
    public void tableSearchFun() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.symbolLink();
        historyDetailsPage.symbolSearch();
    }
    @Test
    public void tableTest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.symbolLink();
        historyDetailsPage.symbolSearch();
        historyDetailsPage.tableTest();
    }
    @Test
    public void testBTBCT() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.symbolLink();
        historyDetailsPage.setBandToBandCallTrades();
    }
    @Test
    public void testBTBPT() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.symbolLink();
        historyDetailsPage.setBandToBandPutTrades();
    }

}
