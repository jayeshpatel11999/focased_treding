package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignupPageTestCases extends BasePage {
@Test
    public void signupPageTestcases() throws InterruptedException, IOException, ParseException {
        loginPage.gotoURL();
        signupPage.createAccountLink();
        signupPage.firstNamefiled();
        signupPage.lastNameField();
        signupPage.setEmail_Field();
        signupPage.passwordField();
        signupPage.confirmPS();
        signupPage.createAccountButton();
        signupPage.successMessage();
    }
}
