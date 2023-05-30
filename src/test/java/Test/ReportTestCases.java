package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class ReportTestCases extends BasePage {
    @Test
    public void reportPageUI() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        reportsPage.reportPageUI();
    }
    @Test
    public void submitButtonTest() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        reportsPage.reportPageUI();
        reportsPage.submitButton();
    }
    @Test
    public void filterVerification() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        reportsPage.reportPageUI();
        reportsPage.datefield();
        reportsPage.checkboxes();
        reportsPage.submitButton();
    }
    @Test
    public void searchFunctionalityTest() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        reportsPage.reportPageUI();
        reportsPage.searchBox();
    }
}
