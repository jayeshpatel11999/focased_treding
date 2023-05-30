package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class BackMonthHistoryTestCases extends BasePage {
    @Test
    public void backMonthHistoryUITest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        backMonthHistoryPage.backMonthHistoryUI();
    }
    @Test
    public void submitbutton() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        backMonthHistoryPage.backMonthHistoryUI();
        backMonthHistoryPage.fillUpvalue();
        monthlyHistoryPage.submitButton();
    }
    @Test
    public void tableTest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        backMonthHistoryPage.backMonthHistoryUI();
        backMonthHistoryPage.fillUpvalue();
        monthlyHistoryPage.table_MonthlyHistory();
    }
    @Test
    public void createTradelinkRedirection() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        backMonthHistoryPage.backMonthHistoryUI();
        backMonthHistoryPage.fillUpvalue();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.createTradelink();
    }
    @Test
    public void downloadFileVerification() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        backMonthHistoryPage.backMonthHistoryUI();
        backMonthHistoryPage.fillUpvalue();
        monthlyHistoryPage.submitButton();
        backMonthHistoryPage.downloadTrades();
    }
}
