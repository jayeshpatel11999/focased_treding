package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class CancelledPageTestcases extends BasePage {
    @Test
    public void cancelledPageUI() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
        cancelledPage.openCancelledPage();
    }

}
