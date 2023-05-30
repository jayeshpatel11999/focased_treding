package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class CreateTraderTestCases extends BasePage {

    @Test
    public void traderAccountsUI() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        createTraderPage.openTradersDetailsPage();
    }
}
