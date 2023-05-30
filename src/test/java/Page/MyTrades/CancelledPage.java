package Page.MyTrades;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class CancelledPage {
    WebDriver driver;
    Helper helper;
    String CancelledMenu;
    String No_record_found_text;
    String ActionOption;
    String Remove_button;
    String Close_button;
    String Search_button;
    String ColumnIcon;
    String FullScreenIcon;

    public CancelledPage (WebDriver d) throws IOException, ParseException {
            driver = d;
            helper = new Helper(d);
        PageFactory.initElements(this.driver, this);
        CancelledMenu = helper.data_repository("xpathlist", "OpenTradePaga", "Cancelled");
        No_record_found_text = helper.data_repository("xpathlist", "OpenTradePaga","No_record_found_text");
        FullScreenIcon = helper.data_repository("xpathlist", "OpenTradePaga", "FullScreenIcon");
        ActionOption = helper.data_repository("xpathlist", "OpenTradePaga", "ActionOption");
        Remove_button = helper.data_repository("xpathlist", "OpenTradePaga", "Remove_button");
        Close_button = helper.data_repository("xpathlist", "OpenTradePaga", "Close_button");
        Search_button = helper.data_repository("xpathlist", "OpenTradePaga", "Search_button");
        ColumnIcon = helper.data_repository("xpathlist", "OpenTradePaga", "ColumnIcon");

    }

    public void openCancelledPage() throws IOException, ParseException, InterruptedException {
        helper.getResponseCode();
        helper.click(CancelledMenu);
        System.out.println("CLicked on Cancel button");
        helper.log("Clicked on cancel button");
        helper.getResponseCode();

        helper.waitForElement(No_record_found_text);
        String no_record_found = helper.findElement(No_record_found_text).getText();
        System.out.println("No record found text shows:" +no_record_found);
        helper.log("No record found text shows:" +no_record_found);

        helper.waitForElement(ActionOption);
        System.out.println("Following element visible in Open page");
        String ActionButtonName = helper.getText(ActionOption);
        System.out.println(ActionButtonName);
        Assert.assertEquals(ActionButtonName, "Action");

        String RemoveButtonName = helper.getText(Remove_button);
        System.out.println(RemoveButtonName);
        Assert.assertEquals(RemoveButtonName, "Remove");

        String CloseButtonName = helper.getText(Close_button);
        System.out.println(CloseButtonName);
        Assert.assertEquals(CloseButtonName, "Close");

        Assert.assertTrue(helper.isElementPresent(Search_button));
        Assert.assertTrue(helper.findElement(ColumnIcon).isDisplayed());
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
