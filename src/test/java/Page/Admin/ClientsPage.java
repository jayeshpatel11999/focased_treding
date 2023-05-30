package Page.Admin;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class ClientsPage {
    WebDriver driver;
    Helper helper;
    String FullScreenIcon;
    String ColumnIcon;
    String SearchField;
    String CreateNewClientButton;
    String ClientTitle;
    String ClientTab;
    String AdminTab;
    String ClientDetails;
    String AccountLink;
    String ListOfTraderStategies;
    String FirstName;
    String LastName;
    String EmailField;
    String CompanyField;
    String ClientDropdown;
    String MobileNumber;
    String PasswordField;
    String ConfirmPasswordField;
    String CancelButton;
    String SaveButton;
    String FirstnameInvalid;
    String FirstFIeldValidation;
    String CompanyNameValid;
    String CompanyNameInvalid;
    String EmailIDInvalid;
    String LastNameValid;
    String FirstNameValid;
    String LastNameInvalid;
    String LastFieldValidation;
    String EmailFieldValidation;
    String CompanyValidation;
    String Email_ID_Data;
    String ClientDropdownValidation;
    String ClientDropdownValue;
    String MobileNumberInvalid;
    String PasswordFiledValidation;
    String MobileNumberValidation;
    String SendTextNotifications;
    String SendEmailNotifications;
    String MobileNumberValid;
    String PasswordInvalid;
    String PasswordValid;
    String ClientDetailTitle;
    String EditProfileButton;
    String FirstClientName;


    public ClientsPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);

        FullScreenIcon = helper.data_repository("xpathlist", "Client", "FullScreenIcon");
        ColumnIcon = helper.data_repository("xpathlist", "Client", "ColumnIcon");
        SearchField = helper.data_repository("xpathlist", "Client", "SearchField");
        CreateNewClientButton = helper.data_repository("xpathlist", "Client", "CreateNewClientButton");
        ClientTitle = helper.data_repository("xpathlist", "Client", "ClientTitle");
        ClientTab = helper.data_repository("xpathlist", "Client", "ClientTab");
        AdminTab = helper.data_repository("xpathlist", "Client", "AdminTab");
        ClientDetails = helper.data_repository("xpathlist", "Client", "ClientDetails");
        AccountLink = helper.data_repository("xpathlist", "Client", "AccountLink");
        ListOfTraderStategies = helper.data_repository("xpathlist", "Client", "ListOfTraderStategies");
        FirstName = helper.data_repository("xpathlist", "Client", "FirstName");
        LastName = helper.data_repository("xpathlist", "Client", "LastName");
        EmailField = helper.data_repository("xpathlist", "Client", "EmailField");
        CompanyField = helper.data_repository("xpathlist", "Client", "CompanyField");
        ClientDropdown = helper.data_repository("xpathlist", "Client", "ClientDropdown");
        MobileNumber = helper.data_repository("xpathlist", "Client", "MobileNumber");
        PasswordField = helper.data_repository("xpathlist", "Client", "PasswordField");
        ConfirmPasswordField = helper.data_repository("xpathlist", "Client", "ConfirmPasswordField");
        CancelButton = helper.data_repository("xpathlist", "Client", "CancelButton");
        SaveButton = helper.data_repository("xpathlist", "Client", "SaveButton");
        FirstnameInvalid = helper.data_repository("TestData", "ClientTestData", "FirstnameInvalid");
        FirstFIeldValidation = helper.data_repository("xpathlist", "Client", "FirstFIeldValidation");
        FirstNameValid = helper.data_repository("TestData", "ClientTestData", "FirstNameValid");
        LastNameInvalid = helper.data_repository("TestData", "ClientTestData", "LastNameInvalid");
        LastNameValid = helper.data_repository("TestData", "ClientTestData", "LastNameValid");
        EmailIDInvalid = helper.data_repository("TestData", "ClientTestData", "EmailIDInvalid");
        CompanyNameInvalid = helper.data_repository("TestData", "ClientTestData", "CompanyNameInvalid");
        CompanyNameValid = helper.data_repository("TestData", "ClientTestData", "CompanyNameValid");
        LastFieldValidation = helper.data_repository("xpathlist", "Client", "LastFieldValidation");
        EmailFieldValidation = helper.data_repository("xpathlist", "Client", "EmailFieldValidation");
        CompanyValidation = helper.data_repository("xpathlist", "Client", "CompanyValidation");
        Email_ID_Data = helper.data_repository("TestData","SignupPageData","Email_ID_Data");
        ClientDropdownValidation = helper.data_repository("xpathlist","Client","ClientDropdownValidation");
        ClientDropdownValue = helper.data_repository("xpathlist","Client","ClientDropdownValue");
        MobileNumberInvalid = helper.data_repository("TestData","ClientTestData","MobileNumberInvalid");
        PasswordFiledValidation = helper.data_repository("xpathlist","Client","PasswordFiledValidation");
        MobileNumberValidation = helper.data_repository("xpathlist","Client","MobileNumberValidation");
        PasswordInvalid = helper.data_repository("TestData","ClientTestData","PasswordInvalid");
        MobileNumberValid = helper.data_repository("TestData","ClientTestData","MobileNumberValid");
        PasswordValid = helper.data_repository("TestData","ClientTestData","PasswordValid");
        SendTextNotifications = helper.data_repository("xpathlist","Client","SendTextNotifications");
        SendEmailNotifications = helper.data_repository("xpathlist","Client","SendEmailNotifications");
        FirstClientName = helper.data_repository("xpathlist","Client","FirstClientName");
        EditProfileButton = helper.data_repository("xpathlist","Client","EditProfileButton");
        ClientDetailTitle = helper.data_repository("xpathlist","Client","ClientDetailTitle");

    }
    public void openClientPage() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(AdminTab);
        helper.click(AdminTab);
        helper.click(ClientTab);
    }
    public void clientpageUI() throws IOException, ParseException, InterruptedException {

        helper.waitForElement(ClientTitle);
        Assert.assertTrue(helper.isElementPresent(ClientTitle));
        Assert.assertTrue(helper.isElementPresent(FullScreenIcon));
        Assert.assertTrue(helper.isElementPresent(ColumnIcon));
        Assert.assertTrue(helper.isElementPresent(SearchField));
        Assert.assertTrue(helper.isElementPresent(CreateNewClientButton));
        Assert.assertTrue(helper.isElementPresent(ClientTab));
    }
    public void createNewClientRedirection() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ClientTitle);
        helper.click(CreateNewClientButton);
        helper.waitForElement(ClientDetails);
        Assert.assertTrue(helper.isElementPresent(ClientDetails));
    }
    public void accountlinkredirection() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ClientTitle);
        helper.click(AccountLink);
        helper.waitForElement(ListOfTraderStategies);
        Assert.assertTrue(helper.isElementPresent(ListOfTraderStategies));
    }
    public void firstNameField() throws IOException, ParseException, InterruptedException {
        helper.enterDataInField(FirstName, FirstnameInvalid);
        helper.scrollandclick(SaveButton);
        helper.waitForElement(FirstFIeldValidation);
        Assert.assertTrue(helper.isElementPresent(FirstFIeldValidation));
        helper.removeDataFromField(FirstName);
        helper.enterDataInField(FirstName, FirstNameValid);
    }
    public void lastNameField() throws IOException, ParseException, InterruptedException {

        helper.enterDataInField(LastName, LastNameInvalid);
        helper.scrollandclick(SaveButton);
        helper.waitForElement(LastFieldValidation);
        Assert.assertTrue(helper.isElementPresent(LastFieldValidation));
        helper.removeDataFromField(LastName);
        helper.enterDataInField(LastName, LastNameValid);
    }
    public void emailField() throws IOException, ParseException, InterruptedException {

        helper.enterDataInField(EmailField, EmailIDInvalid);
        helper.scrollandclick(SaveButton);
        helper.waitForElement(EmailFieldValidation);
        Assert.assertTrue(helper.isElementPresent(EmailFieldValidation));
        helper.removeDataFromField(EmailField);
        String Email_ID = helper.generateRandomChars(5);
        driver.findElement(By.xpath(EmailField)).sendKeys(Email_ID + Email_ID_Data);
        String emailAddress = Email_ID + Email_ID_Data;
        System.out.println("Steps: Email ID entered: " + emailAddress);
        helper.log("Steps: Email ID entered");
    }

    public void setCompanyField() throws IOException, ParseException, InterruptedException {

        helper.enterDataInField(CompanyField, CompanyNameInvalid);
        helper.scrollandclick(SaveButton);
        helper.waitForElement(CompanyValidation);
        Assert.assertTrue(helper.isElementPresent(CompanyValidation));
        helper.removeDataFromField(CompanyField);
        helper.enterDataInField(CompanyField, CompanyNameValid);
    }

    public void clientDropdown() throws IOException, ParseException, InterruptedException {

        helper.click(ClientDropdown);
        helper.scrollandclick(SaveButton);
        helper.waitForElement(ClientDropdownValidation);
        Assert.assertTrue(helper.isElementPresent(ClientDropdownValidation));
        helper.click(ClientDropdown);
        helper.click(ClientDropdownValue);
    }
    public void mobileField() throws IOException, ParseException, InterruptedException {

        helper.enterDataInField(MobileNumber, MobileNumberInvalid);
        helper.scrollandclick(SaveButton);
        helper.waitForElement(MobileNumberValidation);
        Assert.assertTrue(helper.isElementPresent(MobileNumberValidation));
        helper.removeDataFromField(MobileNumber);
        helper.enterDataInField(MobileNumber, MobileNumberValid);
    }
    public void passwordField() throws IOException, ParseException, InterruptedException {
        helper.enterDataInField(PasswordField, PasswordInvalid);
        helper.scrollandclick(SaveButton);
        helper.waitForElement(PasswordFiledValidation);
        Assert.assertTrue(helper.isElementPresent(PasswordFiledValidation));
        helper.removeDataFromField(PasswordField);
        helper.enterDataInField(PasswordField, PasswordValid);
    }
    public void confirmPassword() throws IOException, ParseException, InterruptedException {
        helper.enterDataInField(ConfirmPasswordField, PasswordInvalid);
        helper.scrollandclick(SaveButton);
        helper.waitForElement(PasswordFiledValidation);
        Assert.assertTrue(helper.isElementPresent(PasswordFiledValidation));
        helper.removeDataFromField(ConfirmPasswordField);
        helper.enterDataInField(ConfirmPasswordField, PasswordValid);
    }
    public void checkbox() throws IOException, ParseException, InterruptedException {

        helper.click(SendEmailNotifications);
        helper.click(SendTextNotifications);
    }
    public void setSaveButton() throws IOException, ParseException, InterruptedException {
        helper.click(SaveButton);
        helper.waitForElement(ClientTitle);
        Assert.assertTrue(helper.isElementPresent(ClientTitle));
    }

    public void cancelButton() throws IOException, ParseException, InterruptedException {
        helper.click(CancelButton);
        helper.waitForElement(ClientTitle);
        Assert.assertTrue(helper.isElementPresent(ClientTitle));
    }
    public void editClientProfile() throws IOException, ParseException, InterruptedException {
        helper.click(FirstClientName);
        helper.click(EditProfileButton);
        helper.waitForElement(ClientDetailTitle);
        Assert.assertTrue(helper.isElementPresent(ClientDetailTitle));
    }
}
