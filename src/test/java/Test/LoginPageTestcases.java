package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTestcases extends BasePage {
    @Test(priority = 1)
    public void login_with_validData() throws InterruptedException, IOException, ParseException {
            loginPage.gotoURL();
            loginPage.login_with_Valid_data();
    }

    @Test (priority = 2)
    public void login_with_invalidData() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        loginPage.login_with_invalid_data();
    }
}
