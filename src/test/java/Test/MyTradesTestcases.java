package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Base64;

public class MyTradesTestcases extends BasePage {
    @Test
    public void my_Trade_value() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTradesMenu();
    }
    @Test
    public void my_Trade_menus() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        myTrades.myTrade_Redirection();
    }
}
