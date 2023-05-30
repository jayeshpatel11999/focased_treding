package Page.MyTrades;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class MyTeamPage {
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
    String My_Team;
    String MyTradesPageTitle;



    public MyTeamPage(WebDriver d) throws IOException, org.json.simple.parser.ParseException, InterruptedException {
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
        My_Team = helper.data_repository("xpathlist", "OpenTradePaga", "My_Team");
        MyTradesPageTitle = helper.data_repository("xpathlist", "MyTradesPage", "MyTradesPageTitle");


    }

    public void myTeamPageUI() throws IOException, ParseException, InterruptedException {
        helper.click(MyTradesMenu);
        System.out.println("Clicked on trade menu");
        helper.log("Clicked on trade menu");

        helper.getResponseCode();
        helper.click(My_Team);
        System.out.println("Clicked on My Team menu");
        helper.log("Clicked on My Team menu");
        helper.getResponseCode();

        helper.waitForElement(MyTradesPageTitle);
        String TeamPageTitle = helper.getText(MyTradesPageTitle);
        Assert.assertEquals(TeamPageTitle, "LIST OF MY TRADES");

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