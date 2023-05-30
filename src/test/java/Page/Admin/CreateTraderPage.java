package Page.Admin;

import Utils.BasePage;
import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CreateTraderPage extends BasePage {
    WebDriver driver;
    Helper helper;
    String AdminTab;
    String TradersTab;
    String CreateNewTradesButton;

    public CreateTraderPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);

        AdminTab = helper.data_repository("xpathlist", "CreateTrader", "AdminTab");
        TradersTab = helper.data_repository("xpathlist", "CreateTrader", "TradersTab");
        CreateNewTradesButton = helper.data_repository("xpathlist", "CreateTrader", "CreateNewTradesButton");
    }

    public void openTradersDetailsPage() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(AdminTab);
        helper.click(AdminTab);
        helper.click(TradersTab);
        helper.click(CreateNewTradesButton);

    }
}
