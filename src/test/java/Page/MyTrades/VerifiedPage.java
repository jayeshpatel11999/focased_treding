package Page.MyTrades;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class VerifiedPage {
    WebDriver driver;
    Helper helper;
    String CloseMenu;
    String MyTradesMenu;
    String ClosePageTitle;
    String ActionOption;
    String Remove_button;
    String Close_button;
    String Search_button;
    String ColumnIcon;
    String FullScreenIcon;
    String VerifiedMenu;
    String VerifiedPageTitle;
    String VerifyButton;
    String ShowVerified_toggleButton;

    public VerifiedPage(WebDriver d) throws IOException, ParseException, InterruptedException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);
        MyTradesMenu = helper.data_repository("xpathlist", "OpenTradePaga", "MyTradesMenu");
        FullScreenIcon = helper.data_repository("xpathlist", "OpenTradePaga", "FullScreenIcon");
        ActionOption = helper.data_repository("xpathlist", "OpenTradePaga", "ActionOption");
        Remove_button = helper.data_repository("xpathlist", "OpenTradePaga", "Remove_button");
        Close_button = helper.data_repository("xpathlist", "OpenTradePaga", "Close_button");
        Search_button = helper.data_repository("xpathlist", "OpenTradePaga", "Search_button");
        ColumnIcon = helper.data_repository("xpathlist", "OpenTradePaga", "ColumnIcon");
        VerifiedMenu = helper.data_repository("xpathlist", "OpenTradePaga", "Verified");
        VerifiedPageTitle = helper.data_repository("xpathlist", "MyTradesPage", "VerifiedPageTitle");
        VerifyButton = helper.data_repository("xpathlist", "Verified_Page", "VerifyButton");
        ShowVerified_toggleButton = helper.data_repository("xpathlist", "Verified_Page", "ShowVerified_toggleButton");
    }
    public void verifiedPageUI() throws IOException, ParseException, InterruptedException {
        helper.click(MyTradesMenu);
        System.out.println("Clicked on trade menu");
        helper.log("Clicked on trade menu");

        helper.getResponseCode();
        helper.click(VerifiedMenu);
        System.out.println("Clicked on Verification menu");
        helper.log("Clicked on Verification menu");
        helper.getResponseCode();

        helper.waitForElement(VerifiedPageTitle);
        String VerPageTitle = helper.getText(VerifiedPageTitle);
        Assert.assertEquals(VerPageTitle, "LIST OF VERIFIED");

        helper.waitForElement(VerifyButton);
        Assert.assertTrue(helper.findElement(VerifyButton).isDisplayed());

        Assert.assertTrue(helper.isElementPresent(Search_button));
        Assert.assertTrue(helper.findElement(ColumnIcon).isDisplayed());
        Assert.assertTrue(helper.isElementPresent(ShowVerified_toggleButton));
        Assert.assertTrue(helper.findElement(FullScreenIcon).isDisplayed());
        if (helper.findElement(ColumnIcon).isDisplayed()) {
            System.out.println("Column icon is visible");
        } else {
            System.out.println("Column icon is not visible");
        }
        if (helper.findElement(FullScreenIcon).isDisplayed()) {
            System.out.println("FUll screen icon is visible");
        } else {
            System.out.println("Full screen icon is not visible");
        }
    }
}
