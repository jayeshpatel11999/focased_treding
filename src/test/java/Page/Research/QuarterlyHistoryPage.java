package Page.Research;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class QuarterlyHistoryPage {
    WebDriver driver;
    Helper helper;
    String Research_Tab;
    String QuarterlyHistory_Option;
    String QuarterlyHistoryTitle;
    String Sector_field;
    String Month_field;
    String CallOrPut_field;
    String Symbol_field;
    String SubStanialHistory_Field;
    String DownloadIcon;
     public QuarterlyHistoryPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);

        Research_Tab = helper.data_repository("xpathlist", "Research_Module", "Research_Tab");
        QuarterlyHistory_Option = helper.data_repository("xpathlist", "Research_Module", "QuarterlyHistory_Option");
        QuarterlyHistoryTitle = helper.data_repository("xpathlist", "QuarterlyHistory", "QuarterlyHistoryTitle");
        Sector_field = helper.data_repository("xpathlist", "QuarterlyHistory", "Sector_field");
        CallOrPut_field = helper.data_repository("xpathlist", "QuarterlyHistory", "CallOrPut_field");
        Symbol_field = helper.data_repository("xpathlist", "QuarterlyHistory", "Symbol_field");
        SubStanialHistory_Field = helper.data_repository("xpathlist", "QuarterlyHistory", "SubStanialHistory_Field");
        Month_field = helper.data_repository("xpathlist", "QuarterlyHistory", "Month_field");
        DownloadIcon = helper.data_repository("xpathlist", "Monthly_History", "DownloadIcon");

     }
    public void quarterlyHistoryUI() throws IOException, ParseException, InterruptedException {
        helper.click(Research_Tab);
        helper.getResponseCode();
        helper.click(QuarterlyHistory_Option);

        helper.waitForElement(QuarterlyHistoryTitle);
        Assert.assertTrue(helper.isElementPresent(QuarterlyHistoryTitle));
        Assert.assertTrue(helper.isElementPresent(Sector_field));
        Assert.assertTrue(helper.isElementPresent(CallOrPut_field));
        Assert.assertTrue(helper.isElementPresent(Symbol_field));
        Assert.assertTrue(helper.isElementPresent(SubStanialHistory_Field));
        Assert.assertTrue(helper.isElementPresent(Month_field));
        helper.log("UI is visible");
    }
    public void downloadTrades() throws IOException, ParseException, InterruptedException {

        helper.click(DownloadIcon);
        helper.pause(10);
        helper.isFileDownloaded("Quarterly History's Export CSV.xlsx");
    }

}
