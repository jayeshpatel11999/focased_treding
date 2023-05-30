package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class VerifiedPageTestcases extends BasePage {
    @Test
    public void verifiedPageUITest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        verifiedPage.verifiedPageUI();
    }
}
