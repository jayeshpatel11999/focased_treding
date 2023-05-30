package Page;

import Utils.BasePage;
import Utils.Helper;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.apache.commons.logging.Log;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v109.network.Network;
import org.openqa.selenium.devtools.v109.network.model.Request;
import org.openqa.selenium.devtools.v109.network.model.Response;
import org.openqa.selenium.devtools.v111.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;
import java.util.Optional;

public class LoginPage extends BasePage {

    WebDriver driver;
    Helper helper;
    String URL;
    String Login_Title;
    String User_Name_filed;
    String Password_field;
    String Login_button;
    String Dashboard_text;
    String Valid_UserName;
    String Valid_Password;
    String Invalid_Password;
    String Invalid_creds_message;

    public LoginPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);

        URL = helper.data_repository("xpathlist","LoginPage","URL");
        Login_Title = helper.data_repository("xpathlist","LoginPage","Login_Title");
        User_Name_filed = helper.data_repository("xpathlist","LoginPage","User_Name_filed");
        Password_field = helper.data_repository("xpathlist","LoginPage","Password_field");
        Login_button = helper.data_repository("xpathlist","LoginPage","Login_button");
        Dashboard_text = helper.data_repository("xpathlist","LoginPage","Dashboard_text");
        Valid_UserName = helper.data_repository("TestData","LoginPageData","Valid_UserName");
        Valid_Password = helper.data_repository("TestData","LoginPageData","Valid_Password");
        Invalid_Password = helper.data_repository("TestData","LoginPageData","Invalid_Password");
        Invalid_creds_message = helper.data_repository("xpathlist","LoginPage","Invalid_creds_message");
    }
    public void gotoURL() throws InterruptedException, IOException, ParseException {
        helper.getResponseCode();
        driver.get(URL);
        System.out.println("Steps: Open URL - " +URL);
        helper.log("Steps: Open URL - " +URL);
        helper.waitForElement(Login_Title);
        String LoginTitle = helper.getText(Login_Title);
        System.out.println("Login screen title:" +LoginTitle);
        Assert.assertEquals(LoginTitle, "LOGIN TO YOUR ACCOUNT");
    }
    public void checkAPIResponse() throws InterruptedException, IOException, ParseException {
        helper.getResponseCode();
        driver.get(URL);
        System.out.println("Steps: Open URL - " +URL);
        helper.log("Steps: Open URL - " +URL);

        String LoginTitle = helper.getText(Login_Title);
        System.out.println("Login screen title:" +LoginTitle);
        Assert.assertEquals(LoginTitle, "LOGIN TO YOUR ACCOUNT");

    }
    public void login_with_Valid_data() throws InterruptedException, IOException, ParseException {
        helper.enterDataInField(User_Name_filed, Valid_UserName);
        System.out.println("Step: Username entered");
        helper.log("Step: Username entered");

        helper.enterDataInField(Password_field,Valid_Password);
        System.out.println("Step: Password entered");
        helper.log("Step: Password entered");

        helper.getResponseCode();
        helper.click(Login_button);
        System.out.println("Step: Clicked on login button");
        helper.log("Step: Clicked on login button");
        System.out.println("Response code after login");
        helper.getResponseCode();
        helper.waitForElement(Dashboard_text);
        System.out.println("Response code after login");
        String Dashboard = helper.getText(Dashboard_text);
        Assert.assertEquals(Dashboard, "Dashboard");
        System.out.println("Login successfully");


    }
    public void login_with_invalid_data() throws InterruptedException, IOException, ParseException {
        helper.enterDataInField(User_Name_filed,Valid_UserName);
        System.out.println("Step: Username entered");
        helper.log("Step: Username entered");

        helper.enterDataInField(Password_field,Invalid_Password);
        System.out.println("Step: Password entered");
        helper.log("Step: Password entered");

        helper.click(Login_button);
        System.out.println("Step: Clicked on login button");
        helper.log("Step: Clicked on login button");
        System.out.println("Response code after click on login button");
        helper.getResponseCode();

        helper.waitForElement(Invalid_creds_message);
        String Validation_message = helper.getText(Invalid_creds_message);
        Assert.assertEquals(Validation_message, "Invalid Username or Password Remaining Login Attempt 4");
        System.out.println("System should show validation message that: " +Validation_message);
    }

}
