package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class ClientTestcases extends BasePage {
    @Test
    public void clientpageUI() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        clientsPage.openClientPage();
        clientsPage.clientpageUI();
    }
    @Test
    public void refreshpage() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        clientsPage.openClientPage();
        openTradesPage.refreshIcon();
    }
    @Test
    public void createNewClient() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        clientsPage.openClientPage();
        clientsPage.createNewClientRedirection();
    }
    @Test
    public void accountLinkRedirection() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        clientsPage.openClientPage();
        clientsPage.accountlinkredirection();
    }
    @Test
    public void fillupForm() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        clientsPage.openClientPage();
        clientsPage.createNewClientRedirection();
        clientsPage.firstNameField();
        clientsPage.lastNameField();
        clientsPage.emailField();
        clientsPage.setCompanyField();
        clientsPage.clientDropdown();
        clientsPage.mobileField();
        clientsPage.passwordField();
        clientsPage.confirmPassword();
        clientsPage.checkbox();
        clientsPage.setSaveButton();
    }
    @Test
    public void cancelButton() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        clientsPage.openClientPage();
        clientsPage.createNewClientRedirection();
        clientsPage.cancelButton();
    }
    @Test
    public void editClientProfile() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        clientsPage.openClientPage();
        clientsPage.editClientProfile();
    }

}
