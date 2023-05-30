package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class MonthlyHistoryTestcases extends BasePage {
    @Test
    public void monthlyHistoryUI() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
    }
    @Test
    public void submitbutton() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.fillUpvalue();
        monthlyHistoryPage.submitButton();
    }
    @Test
    public void tableTest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.fillUpvalue();
        monthlyHistoryPage.table_MonthlyHistory();
    }
    @Test
    public void symbolLinkRedirection() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.symbolLink();
    }
    @Test
    public void chartLInkRedirection() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.chatLink();
    }
    @Test
    public void createTradelinkRedirection() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.createTradelink();
    }
    @Test
    public void downloadFileVerification() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        monthlyHistoryPage.monthly_History_Page_UI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.downloadTrades();
    }
}
