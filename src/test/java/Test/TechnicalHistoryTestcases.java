package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class TechnicalHistoryTestcases extends BasePage {
    @Test
    public void technicalHistoryUITest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        technicalHistoryPage.technicalHistoryUI();
    }
    @Test
    public void submitbutton() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        technicalHistoryPage.technicalHistoryUI();
        technicalHistoryPage.fillUpValue();
        monthlyHistoryPage.submitButton();
    }
    @Test
    public void tableTest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        technicalHistoryPage.technicalHistoryUI();
        technicalHistoryPage.fillUpValue();
        monthlyHistoryPage.table_MonthlyHistory();
    }
    @Test
    public void createTradelinkRedirection() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        technicalHistoryPage.technicalHistoryUI();
        technicalHistoryPage.fillUpValue();
        monthlyHistoryPage.createTradelink();
    }
    @Test
    public void downloadFileVerification() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        technicalHistoryPage.technicalHistoryUI();
        technicalHistoryPage.fillUpValue();
        technicalHistoryPage.downloadTrades();
    }
}
