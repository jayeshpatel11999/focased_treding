package Page.Admin;

import Utils.BasePage;
import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class EditTrendPage extends BasePage {
    WebDriver driver;
    Helper helper;

    String RefreshIcon;
    String AdminTab;
    String EditTrendTab;
    String MarketDailyDirectionDropdown;
    String Bottom_Option_Of_MarketDailyDirectionDropdown;
    String Market233DirectionDropdown;
    String Top_Option_Of_MarketDailyDirectionDropdown;
    String EditTrendTitle;
    String Textarea_Of_AddMarketDailyComment;
    String Textarea_Of_AddMarket233Comment;
    String Textarea_Of_AddNasdaq55mFuturesComment;
    String Textarea_Of_Add_ES_55m_Futures_Comment;
    String Textarea_Of_AddIWM34Comment;
    String Save_Button;
    String SuccessToaster;
    String ErrorToaster;
    String Nasdaq_55m_Futures_Direction_Dropdown;
    String Bottom_Option_Of_Nasdaq_55m_Futures_Direction_Dropdown;
    String ES_55m_Futures_DirectionDropdown;
    String Bottom_Option_Of_ES_55m_Futures_DirectionDropdown;
    String IWM_34_Direction_Dropdown;
    String Top_Option_Of_IWM_34_Direction_Dropdown;

    public EditTrendPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);

        RefreshIcon = helper.data_repository("xpathlist", "EditTrend", "RefreshIcon");
        AdminTab = helper.data_repository("xpathlist", "EditTrend", "AdminTab");
        EditTrendTab = helper.data_repository("xpathlist", "EditTrend", "EditTrendTab");
        MarketDailyDirectionDropdown = helper.data_repository("xpathlist", "EditTrend", "MarketDailyDirectionDropdown");
        Bottom_Option_Of_MarketDailyDirectionDropdown = helper.data_repository("xpathlist", "EditTrend", "Bottom_Option_Of_MarketDailyDirectionDropdown");
        Market233DirectionDropdown = helper.data_repository("xpathlist", "EditTrend", "Market233DirectionDropdown");
        Top_Option_Of_MarketDailyDirectionDropdown = helper.data_repository("xpathlist", "EditTrend", "Top_Option_Of_MarketDailyDirectionDropdown");
        EditTrendTitle = helper.data_repository("xpathlist", "EditTrend", "EditTrendTitle");
        Textarea_Of_AddMarketDailyComment = helper.data_repository("xpathlist", "EditTrend", "Textarea_Of_AddMarketDailyComment");
        Textarea_Of_AddMarket233Comment = helper.data_repository("xpathlist", "EditTrend", "Textarea_Of_AddMarket233Comment");
        Textarea_Of_AddNasdaq55mFuturesComment = helper.data_repository("xpathlist", "EditTrend", "Textarea_Of_AddNasdaq55mFuturesComment");
        Textarea_Of_Add_ES_55m_Futures_Comment = helper.data_repository("xpathlist", "EditTrend", "Textarea_Of_Add_ES_55m_Futures_Comment");
        Textarea_Of_AddIWM34Comment = helper.data_repository("xpathlist", "EditTrend", "Textarea_Of_AddIWM34Comment");
        Save_Button = helper.data_repository("xpathlist", "EditTrend", "Save_Button");
        SuccessToaster = helper.data_repository("xpathlist", "EditTrend", "SuccessToaster");
        ErrorToaster = helper.data_repository("xpathlist", "EditTrend", "ErrorToaster");
        Nasdaq_55m_Futures_Direction_Dropdown = helper.data_repository("xpathlist", "EditTrend", "Nasdaq_55m_Futures_Direction_Dropdown");
        Bottom_Option_Of_Nasdaq_55m_Futures_Direction_Dropdown = helper.data_repository("xpathlist", "EditTrend", "Bottom_Option_Of_Nasdaq_55m_Futures_Direction_Dropdown");
        ES_55m_Futures_DirectionDropdown = helper.data_repository("xpathlist", "EditTrend", "ES_55m_Futures_DirectionDropdown");
        Bottom_Option_Of_ES_55m_Futures_DirectionDropdown = helper.data_repository("xpathlist", "EditTrend", "Bottom_Option_Of_ES_55m_Futures_DirectionDropdown");
        IWM_34_Direction_Dropdown = helper.data_repository("xpathlist", "EditTrend", "IWM_34_Direction_Dropdown");
        Top_Option_Of_IWM_34_Direction_Dropdown = helper.data_repository("xpathlist", "EditTrend", "Top_Option_Of_IWM_34_Direction_Dropdown");
    }
    public void openEditTrendPage() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(AdminTab);
        helper.click(AdminTab);
        helper.pause(1);
        helper.click(EditTrendTab);
        helper.waitForElement(EditTrendTitle);
        Assert.assertTrue(helper.isElementPresent(EditTrendTitle));
    }
    public void verifyMarketDailyDirectionField() throws IOException, ParseException, InterruptedException {
        Assert.assertTrue(helper.isElementPresent(MarketDailyDirectionDropdown));
        helper.pause(5);
        helper.click(MarketDailyDirectionDropdown);
        helper.click(Bottom_Option_Of_MarketDailyDirectionDropdown);
    }

    public void verifyMarket233DirectionField() throws IOException, ParseException, InterruptedException {
        Assert.assertTrue(helper.isElementPresent(Market233DirectionDropdown));
        helper.click(Market233DirectionDropdown);
        helper.click(Top_Option_Of_MarketDailyDirectionDropdown);
    }

    public void enterInvalidDataInMarket_Daily_Previous_Comment() throws IOException, ParseException, InterruptedException {
        Assert.assertTrue(helper.isElementPresent(Market233DirectionDropdown));
        helper.enterDataInField(Textarea_Of_AddMarketDailyComment , "%$#@#@#@");
        helper.scrollToElement(Save_Button);
        helper.click(Save_Button);
    }
    public void enterValidDataInMarket_Daily_Previous_Comment() throws IOException, ParseException, InterruptedException {
        Assert.assertTrue(helper.isElementPresent(Market233DirectionDropdown));
        helper.enterDataInField(Textarea_Of_AddMarketDailyComment , "ABCDFGHIJ12345");
        helper.scrollToElement(Save_Button);
        helper.click(Save_Button);
        helper.waitForElementWithoutLoading(SuccessToaster);
        Assert.assertTrue(helper.isElementPresent(SuccessToaster));

    }
    public void enterInvalidDataInMarket_233_Previous_Comment() throws IOException, ParseException, InterruptedException {
        Assert.assertTrue(helper.isElementPresent(Market233DirectionDropdown));
        helper.enterDataInField(Textarea_Of_AddMarket233Comment , "%$#@#@#@");
        helper.scrollToElement(Save_Button);
        helper.click(Save_Button);
    }
    public void enterValidDataInMarket_233_Previous_Comment() throws IOException, ParseException, InterruptedException {
        Assert.assertTrue(helper.isElementPresent(Market233DirectionDropdown));
        helper.enterDataInField(Textarea_Of_AddMarket233Comment , "ABCDFGHIJ12345");
        helper.scrollToElement(Save_Button);
        helper.click(Save_Button);
        helper.waitForElementWithoutLoading(SuccessToaster);
        Assert.assertTrue(helper.isElementPresent(SuccessToaster));

    }

    public void verifyNasdaq_55m_FuturesDirectionField() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(Nasdaq_55m_Futures_Direction_Dropdown);
        Assert.assertTrue(helper.isElementPresent(Nasdaq_55m_Futures_Direction_Dropdown));
        helper.pause(5);
        helper.click(Nasdaq_55m_Futures_Direction_Dropdown);
        helper.click(Bottom_Option_Of_Nasdaq_55m_Futures_Direction_Dropdown);
    }

    public void verifyES_55m_Futures_DirectionFField() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ES_55m_Futures_DirectionDropdown);
        Assert.assertTrue(helper.isElementPresent(ES_55m_Futures_DirectionDropdown));
        helper.pause(5);
        helper.click(ES_55m_Futures_DirectionDropdown);
        helper.click(Bottom_Option_Of_ES_55m_Futures_DirectionDropdown);
    }
    public void enterInvalidDataIn_Nasdaq_55m_Futures_Previous_Comment() throws IOException, ParseException, InterruptedException {
        Assert.assertTrue(helper.isElementPresent(Market233DirectionDropdown));
        helper.scrollToElement(Textarea_Of_AddNasdaq55mFuturesComment);
        helper.enterDataInField(Textarea_Of_AddNasdaq55mFuturesComment , "%$#@#@#@");
        helper.scrollToElement(Save_Button);
        helper.click(Save_Button);
    }
    public void enterValidDataIn_Nasdaq_55m_Futures_Previous_Comment() throws IOException, ParseException, InterruptedException {
        Assert.assertTrue(helper.isElementPresent(Market233DirectionDropdown));
        helper.scrollToElement(Textarea_Of_AddNasdaq55mFuturesComment);
        helper.enterDataInField(Textarea_Of_AddNasdaq55mFuturesComment , "ABCDFGHIJ12345");
        helper.scrollToElement(Save_Button);
        helper.click(Save_Button);
        helper.waitForElementWithoutLoading(SuccessToaster);
        Assert.assertTrue(helper.isElementPresent(SuccessToaster));
    }
    public void enterInvalidDataIn_ES_55m_Futures_Previous_Comment() throws IOException, ParseException, InterruptedException {
        Assert.assertTrue(helper.isElementPresent(Market233DirectionDropdown));
        helper.scrollToElement(Textarea_Of_Add_ES_55m_Futures_Comment);
        helper.enterDataInField(Textarea_Of_Add_ES_55m_Futures_Comment , "%$#@#@#@");
        helper.scrollToElement(Save_Button);
        helper.click(Save_Button);
    }
    public void enterValidDataIn_ES_55m_Futures_Previous_Comment() throws IOException, ParseException, InterruptedException {
        Assert.assertTrue(helper.isElementPresent(Market233DirectionDropdown));
        helper.scrollToElement(Textarea_Of_Add_ES_55m_Futures_Comment);
        helper.enterDataInField(Textarea_Of_Add_ES_55m_Futures_Comment , "ABCDFGHIJ12345");
        helper.scrollToElement(Save_Button);
        helper.click(Save_Button);
        helper.waitForElementWithoutLoading(SuccessToaster);
        Assert.assertTrue(helper.isElementPresent(SuccessToaster));
    }

    public void verify_IWM_34_DirectionFField() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ES_55m_Futures_DirectionDropdown);
        helper.scrollToElement(IWM_34_Direction_Dropdown);
        Assert.assertTrue(helper.isElementPresent(IWM_34_Direction_Dropdown));
        helper.pause(5);
        helper.click(IWM_34_Direction_Dropdown);
        helper.click(Top_Option_Of_IWM_34_Direction_Dropdown);
    }
    public void enterInvalidDataIn_IWM_34_Previous_Comment_Field() throws IOException, ParseException, InterruptedException {
        Assert.assertTrue(helper.isElementPresent(Market233DirectionDropdown));
        helper.scrollToElement(Textarea_Of_AddIWM34Comment);
        helper.enterDataInField(Textarea_Of_AddIWM34Comment , "%$#@#@#@");
        helper.scrollToElement(Save_Button);
        helper.click(Save_Button);
    }
    public void enterValidDataIn_IWM_34_Previous_Comment_Field() throws IOException, ParseException, InterruptedException {
        Assert.assertTrue(helper.isElementPresent(Market233DirectionDropdown));
        helper.scrollToElement(Textarea_Of_AddIWM34Comment);
        helper.enterDataInField(Textarea_Of_AddIWM34Comment , "ABCDFGHIJ12345");
        helper.scrollToElement(Save_Button);
        helper.click(Save_Button);
        helper.waitForElementWithoutLoading(SuccessToaster);
        Assert.assertTrue(helper.isElementPresent(SuccessToaster));
    }

    public void clickOnSaveButtonAfterEnterValidData() throws IOException, ParseException, InterruptedException {
        helper.click(MarketDailyDirectionDropdown);
        helper.click(Bottom_Option_Of_MarketDailyDirectionDropdown);
        helper.click(Market233DirectionDropdown);
        helper.click(Top_Option_Of_MarketDailyDirectionDropdown);
        helper.enterDataInField(Textarea_Of_AddMarketDailyComment , "ABCDFGHIJ12345");
        helper.enterDataInField(Textarea_Of_AddMarket233Comment , "ABCDFGHIJ12345");
        helper.click(Nasdaq_55m_Futures_Direction_Dropdown);
        helper.click(Bottom_Option_Of_Nasdaq_55m_Futures_Direction_Dropdown);
        helper.click(ES_55m_Futures_DirectionDropdown);
        helper.click(Bottom_Option_Of_ES_55m_Futures_DirectionDropdown);
        helper.scrollToElement(Textarea_Of_AddNasdaq55mFuturesComment);
        helper.enterDataInField(Textarea_Of_AddNasdaq55mFuturesComment , "ABCDFGHIJ12345");
        helper.enterDataInField(Textarea_Of_Add_ES_55m_Futures_Comment , "ABCDFGHIJ12345");
        helper.scrollToElement(IWM_34_Direction_Dropdown);
        helper.click(IWM_34_Direction_Dropdown);
        helper.click(Top_Option_Of_IWM_34_Direction_Dropdown);
        helper.scrollToElement(Textarea_Of_AddIWM34Comment);
        helper.enterDataInField(Textarea_Of_AddIWM34Comment , "ABCDFGHIJ12345");
        helper.scrollToElement(Save_Button);
        helper.click(Save_Button);
        helper.waitForElementWithoutLoading(SuccessToaster);
        Assert.assertTrue(helper.isElementPresent(SuccessToaster));
    }

}
