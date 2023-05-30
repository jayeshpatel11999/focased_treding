package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class QuarterlyHistoryTestcases extends BasePage {
    @Test
    public void monthlyHistoryUI() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        quarterlyHistoryPage.quarterlyHistoryUI();
    }
    @Test
    public void submitbutton() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        quarterlyHistoryPage.quarterlyHistoryUI();
        monthlyHistoryPage.fillUpvalue();
        monthlyHistoryPage.submitButton();
    }
    @Test
    public void tableTest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        quarterlyHistoryPage.quarterlyHistoryUI();
        monthlyHistoryPage.fillUpvalue();
        monthlyHistoryPage.table_MonthlyHistory();
    }
    @Test
    public void createTradelinkRedirection() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        quarterlyHistoryPage.quarterlyHistoryUI();
        monthlyHistoryPage.submitButton();
        monthlyHistoryPage.createTradelink();
    }
    @Test
    public void downloadFileVerification() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        quarterlyHistoryPage.quarterlyHistoryUI();
        monthlyHistoryPage.submitButton();
        quarterlyHistoryPage.downloadTrades();
    }
}
