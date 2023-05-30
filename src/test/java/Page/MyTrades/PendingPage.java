package Page.MyTrades;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class PendingPage {
    WebDriver driver;
    Helper helper;
    String PendingMenu;
    String No_record_found_text;
    String Successmessage_AllPending;
    String up_direction_entry;
    String Down_direction_entry;


    public PendingPage(WebDriver d) throws IOException, ParseException {
        driver =d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver,this);

        PendingMenu = helper.data_repository("xpathlist", "OpenTradePaga", "Pending");
        No_record_found_text = helper.data_repository("xpathlist", "OpenTradePaga","No_record_found_text");
        up_direction_entry = helper.data_repository("xpathlist", "OpenTradePaga","up_direction_entry");
        Down_direction_entry = helper.data_repository("xpathlist", "Pending_Page","Down_direction_entry");
    }

    public void pendingScreen() throws IOException, ParseException, InterruptedException {
        helper.click(PendingMenu);
        System.out.println("Clicked on pending menu");
        helper.log("Clicked on pending menu");

        helper.pause(5);
        helper.waitForElement(No_record_found_text);
        Assert.assertTrue(driver.findElement(By.xpath(No_record_found_text)).isDisplayed());
    }

    public void pendingUpdirectionCheck() throws IOException, ParseException, InterruptedException {

        helper.click(PendingMenu);
        System.out.println("Clicked on pending menu");
        helper.log("Clicked on pending menu");

        helper.pause(20);
        Assert.assertFalse(Boolean.parseBoolean(up_direction_entry));
        System.out.println("Up direction entry is not visible");
        helper.log("Up direction entry is not visible");

    }

    public void pendingDownDirectionCheck() throws IOException, ParseException, InterruptedException {

        helper.click(PendingMenu);
        System.out.println("Clicked on pending menu");
        helper.log("Clicked on pending menu");

        helper.pause(20);
        Assert.assertEquals(driver.findElement(By.xpath(Down_direction_entry)).isDisplayed(), false);
        System.out.println("Down direction entry is not visible");
        helper.log("Down direction entry is not visible");

    }
}
