package Page;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class SignupPage {
    WebDriver driver;
    Helper helper;
    String CreateAccount_link;
    String First_Name;
    String Last_Name;
    String Email_Field;
    String Password_field;
    String ConfirmPS_field;
    String Create_AN_Account_Button;
    String First_Name_Data;
    String Last_Name_Data;
    String Email_ID_Data;
    String Password_Data;
    String ConfirmPS_Data;
    String Success_Message_Signup;
    String Okay_button;
    String Login_Title;

    public SignupPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver,this);
        CreateAccount_link = helper.data_repository("xpathlist","SignupPage","CreateAccount_link");
        First_Name = helper.data_repository("xpathlist","SignupPage","First_Name");
        Last_Name = helper.data_repository("xpathlist","SignupPage","Last_Name");
        Email_Field = helper.data_repository("xpathlist","SignupPage","Email_Field");
        Password_field = helper.data_repository("xpathlist","SignupPage","Password_field");
        ConfirmPS_field = helper.data_repository("xpathlist","SignupPage","ConfirmPS_field");
        Create_AN_Account_Button = helper.data_repository("xpathlist","SignupPage","Create_AN_Account_Button");
        First_Name_Data = helper.data_repository("TestData","SignupPageData","First_Name_Data");
        Last_Name_Data = helper.data_repository("TestData","SignupPageData","Last_Name_Data");
        Email_ID_Data = helper.data_repository("TestData","SignupPageData","Email_ID_Data");
        Password_Data = helper.data_repository("TestData","SignupPageData","Password_Data");
        ConfirmPS_Data = helper.data_repository("TestData","SignupPageData","ConfirmPS_Data");
        Success_Message_Signup = helper.data_repository("xpathlist","SignupPage","Success_Message_Signup");
        Okay_button = helper.data_repository("xpathlist","SignupPage","Okay_button");
        Login_Title = helper.data_repository("xpathlist","LoginPage","Login_Title");

    }

    public void createAccountLink() throws InterruptedException, IOException, ParseException {
        helper.getResponseCode();
        helper.click(CreateAccount_link);
        helper.getResponseCode();
        System.out.println("Steps: Clicked on Create Account link");
        helper.log("Steps: Clicked on Create Account link");
    }
    public void firstNamefiled() throws IOException, ParseException, InterruptedException {
        helper.enterDataInField(First_Name, First_Name_Data);
        System.out.println("Steps: Entered data in First name field");
        helper.log("Steps: Entered data in First name field");
    }
    public void lastNameField() throws IOException, ParseException, InterruptedException {
        helper.enterDataInField(Last_Name, Last_Name_Data);
        System.out.println("Steps: Entered data in Last name field");
        helper.log("Steps: Entered data in Last name field");
    }
    public void setEmail_Field() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(Email_Field);
        String Email_ID = helper.generateRandomChars(5);
        driver.findElement(By.xpath(Email_Field)).sendKeys(Email_ID + Email_ID_Data);
        System.out.println("Steps: Email ID entered: " + Email_ID + Email_ID_Data);
        helper.log("Steps: Email ID entered");
    }
    public void passwordField() throws IOException, ParseException, InterruptedException {

        helper.enterDataInField(Password_field, Password_Data);
        System.out.println("Steps: Entered Data in Password Field");
        helper.log("Steps: Entered Data in Password Field");
    }
    public void confirmPS() throws IOException, ParseException, InterruptedException {
        helper.enterDataInField(ConfirmPS_field, ConfirmPS_Data);
        System.out.println("Steps: Entered Data in Confirm Password Field");
        helper.log("Steps: Entered Data in Confirm Password Field");
    }

    public void createAccountButton() throws IOException, ParseException, InterruptedException {
        helper.getResponseCode();
        helper.click(Create_AN_Account_Button);
        helper.getResponseCode();
        System.out.println("Steps: Clicked on create account button");
        helper.log("Steps: Clicked on create account button");
    }
    public void successMessage() throws IOException, ParseException, InterruptedException {
        //Verification of signup successfully
        helper.waitForElement(Success_Message_Signup);
        String Success_Message = helper.getText(Success_Message_Signup);
        System.out.println(Success_Message);
        Assert.assertEquals(Success_Message, "Your account has been successfully created.");
        System.out.println("Steps: Signup Success message");
        helper.log("Steps: Signup Success message");

        helper.click(Okay_button);
        System.out.println("Steps: Clicked on Okay button");
        helper.log("Steps: Clicked on Okay button");

        helper.waitForElement(Login_Title);
        String LoginTitle = helper.getText(Login_Title);
        System.out.println("Login screen title:" +LoginTitle);
        Assert.assertEquals(LoginTitle, "LOGIN TO YOUR ACCOUNT");
    }
}
