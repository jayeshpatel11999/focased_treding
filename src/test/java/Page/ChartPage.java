package Page;

import Utils.Helper;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class ChartPage {
    WebDriver driver;
    Helper helper;
    String TimeFrame_ThirdOption;
    String Timeframe_OneDay;
    String Timeframe_OneWeek;
    String RecentSymbolsFIeld;
    String SymbolField;
    String ChartPageTitle;
    String ChartTab;
    String CreateTrade;
    String NextMonth;
    String PreviousMonth;
    String NextYear;
    String PreviousYearButton;
    String SHows_HideDataBox;
    String SHows_HideDrawings;
    String Shows_HideDI;
    String SHows_ShowMACD;
    String Shows_HideStochRSI;
    String SHows_HidePrice;
    String AAL_SymbolValue;
    String ListOfSymbolValue;
    String ListofRecentSymbolValue;
    String ChartID;
    String TextBoxONChart;
    String Shows_ShowStochRSI;
    String Shows_showDI;
    String Shows_Box;
    String Shows_SHowDrawings;
    String Shows_ShowPrice;
    String CreateTradeTitle;
    String ZoomChart_All;
    String ZoomChart_1Y;
    String ZoomChart_YTD;
    String ZoomChart_6m;
    String ZoomChart_3m;
    String ZoomChart_1m;
    String DownloadSVGVectorImage;
    String DownloadPDFDocument;
    String DownloadJPEGImage;
    String DownloadPNGImage;
    String PrintChartOPtion;
    String HamburgerMenu;
    String SendAnywayButton;
    public ChartPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver,this);

        TimeFrame_ThirdOption = helper.data_repository("xpathlist", "ChartPage", "TimeFrame_ThirdOption");
        Timeframe_OneDay = helper.data_repository("xpathlist", "ChartPage", "Timeframe_OneDay");
        Timeframe_OneWeek = helper.data_repository("xpathlist", "ChartPage", "Timeframe_OneWeek");
        RecentSymbolsFIeld = helper.data_repository("xpathlist", "ChartPage", "RecentSymbolsFIeld");
        SymbolField = helper.data_repository("xpathlist", "ChartPage", "SymbolField");
        ChartPageTitle = helper.data_repository("xpathlist", "ChartPage", "ChartPageTitle");
        ChartTab = helper.data_repository("xpathlist", "ChartPage", "ChartTab");
        CreateTrade = helper.data_repository("xpathlist", "ChartPage", "CreateTrade");
        NextMonth = helper.data_repository("xpathlist", "ChartPage", "NextMonth");
        PreviousMonth = helper.data_repository("xpathlist", "ChartPage", "PreviousMonth");
        NextYear = helper.data_repository("xpathlist", "ChartPage", "NextYear");
        PreviousYearButton = helper.data_repository("xpathlist", "ChartPage", "PreviousYearButton");
        SHows_HideDataBox = helper.data_repository("xpathlist", "ChartPage", "SHows_HideDataBox");
        SHows_HideDrawings = helper.data_repository("xpathlist", "ChartPage", "SHows_HideDrawings");
        Shows_HideDI = helper.data_repository("xpathlist", "ChartPage", "Shows_HideDI");
        SHows_ShowMACD = helper.data_repository("xpathlist", "ChartPage", "SHows_ShowMACD");
        Shows_HideStochRSI = helper.data_repository("xpathlist", "ChartPage", "Shows_HideStochRSI");
        SHows_HidePrice = helper.data_repository("xpathlist", "ChartPage", "SHows_HidePrice");
        AAL_SymbolValue = helper.data_repository("xpathlist", "ChartPage", "AAL_SymbolValue");
        ListOfSymbolValue = helper.data_repository("xpathlist", "ChartPage", "ListOfSymbolValue");
        ListofRecentSymbolValue = helper.data_repository("xpathlist", "ChartPage", "ListofRecentSymbolValue");
        ChartID = helper.data_repository("xpathlist", "ChartPage", "ChartID");
        TextBoxONChart = helper.data_repository("xpathlist", "ChartPage", "TextBoxONChart");
        Shows_ShowStochRSI = helper.data_repository("xpathlist", "ChartPage", "Shows_ShowStochRSI");
        Shows_showDI = helper.data_repository("xpathlist", "ChartPage", "Shows_showDI");
        Shows_Box = helper.data_repository("xpathlist", "ChartPage", "Shows_Box");
        Shows_SHowDrawings = helper.data_repository("xpathlist", "ChartPage", "Shows_SHowDrawings");
        Shows_ShowPrice = helper.data_repository("xpathlist", "ChartPage", "Shows_ShowPrice");
        CreateTradeTitle = helper.data_repository("xpathlist", "ChartPage", "CreateTradeTitle");
        ZoomChart_All = helper.data_repository("xpathlist", "ChartPage", "ZoomChart_All");
        ZoomChart_1Y = helper.data_repository("xpathlist", "ChartPage", "ZoomChart_1Y");
        ZoomChart_YTD = helper.data_repository("xpathlist", "ChartPage", "ZoomChart_YTD");
        ZoomChart_6m = helper.data_repository("xpathlist", "ChartPage", "ZoomChart_6m");
        ZoomChart_3m = helper.data_repository("xpathlist", "ChartPage", "ZoomChart_3m");
        ZoomChart_1m = helper.data_repository("xpathlist", "ChartPage", "ZoomChart_1m");
        DownloadSVGVectorImage = helper.data_repository("xpathlist", "ChartPage", "DownloadSVGVectorImage");
        DownloadPDFDocument = helper.data_repository("xpathlist", "ChartPage", "DownloadPDFDocument");
        DownloadJPEGImage = helper.data_repository("xpathlist", "ChartPage", "DownloadJPEGImage");
        DownloadPNGImage = helper.data_repository("xpathlist", "ChartPage", "DownloadPNGImage");
        PrintChartOPtion = helper.data_repository("xpathlist", "ChartPage", "PrintChartOPtion");
        HamburgerMenu = helper.data_repository("xpathlist", "ChartPage", "HamburgerMenu");
        SendAnywayButton = helper.data_repository("xpathlist", "ChartPage", "SendAnywayButton");
    }
    public void chartpageUI() throws IOException, ParseException, InterruptedException {
        helper.getResponseCode();
        helper.click(ChartTab);
        helper.waitForElement(Shows_HideStochRSI);
        helper.pause(2);
        Assert.assertTrue(helper.isElementPresent(TimeFrame_ThirdOption));
        Assert.assertTrue(helper.isElementPresent(Timeframe_OneDay));
        helper.waitForElement(Timeframe_OneWeek);
        Assert.assertTrue(helper.isElementPresent(Timeframe_OneWeek));
        helper.waitForElement(RecentSymbolsFIeld);
        Assert.assertTrue(helper.isElementPresent(RecentSymbolsFIeld));
        Assert.assertTrue(helper.isElementPresent(SymbolField));
        Assert.assertTrue(helper.isElementPresent(ChartPageTitle));
        Assert.assertTrue(helper.isElementPresent(CreateTrade));
        Assert.assertTrue(helper.isElementPresent(NextMonth));
        Assert.assertTrue(helper.isElementPresent(PreviousMonth));
        Assert.assertTrue(helper.isElementPresent(NextYear));
        Assert.assertTrue(helper.isElementPresent(PreviousYearButton));
        Assert.assertTrue(helper.isElementPresent(SHows_HideDataBox));
        Assert.assertTrue(helper.isElementPresent(SHows_HideDrawings));
        Assert.assertTrue(helper.isElementPresent(Shows_HideDI));
        Assert.assertTrue(helper.isElementPresent(SHows_ShowMACD));
        Assert.assertTrue(helper.isElementPresent(Shows_HideStochRSI));
        Assert.assertTrue(helper.isElementPresent(SHows_HidePrice));
    }
    public void searchValue() throws IOException, ParseException, InterruptedException {
        helper.click(SymbolField);
//        helper.click(AAL_SymbolValue);
        helper.pause(5);
        List<WebElement> symbolDropdownValue = driver.findElements(By.xpath(ListOfSymbolValue));
        symbolDropdownValue.get(0).click();
        helper.waitForElement(ChartID);
        Assert.assertTrue(helper.isElementPresent(ChartID));
        helper.click(RecentSymbolsFIeld);
        List<WebElement> RecentSymbolValue = driver.findElements(By.xpath(ListofRecentSymbolValue));
        RecentSymbolValue.get(0).click();
        helper.waitForElement(ChartID);
        Assert.assertTrue(helper.isElementPresent(ChartID));

        helper.waitForElement(Timeframe_OneWeek);
        helper.click(Timeframe_OneWeek);
        helper.waitForElement(Timeframe_OneDay);
        helper.click(Timeframe_OneDay);
        helper.waitForElement(TimeFrame_ThirdOption);
        helper.click(TimeFrame_ThirdOption);
        helper.waitForElement(Shows_HideStochRSI);
        helper.click(Shows_HideStochRSI);
        helper.waitForElement(Shows_ShowStochRSI);
        Assert.assertTrue(helper.isElementPresent(Shows_ShowStochRSI));

        helper.waitForElement(Shows_HideDI);
        helper.click(Shows_HideDI);
        helper.waitForElement(Shows_showDI);
        Assert.assertTrue(helper.isElementPresent(Shows_showDI));

        helper.waitForElement(SHows_HideDataBox);
        helper.click(SHows_HideDataBox);
        helper.waitForElement(Shows_Box);
        Assert.assertTrue(helper.isElementPresent(Shows_Box));

        helper.waitForElement(SHows_HideDrawings);
        helper.click(SHows_HideDrawings);
        helper.waitForElement(Shows_SHowDrawings);
        Assert.assertTrue(helper.isElementPresent(Shows_SHowDrawings));

        helper.waitForElement(SHows_HidePrice);
        helper.click(SHows_HidePrice);
        helper.pause(2);

        helper.waitForElement(SHows_ShowMACD);
        helper.click(SHows_ShowMACD);
        helper.waitForElement(NextYear);
        helper.click(NextYear);
        helper.waitForElement(NextMonth);
        helper.click(NextMonth);
        helper.waitForElement(PreviousMonth);
        helper.click(PreviousMonth);
        helper.waitForElement(PreviousYearButton);
        helper.click(PreviousYearButton);
        helper.waitForElement(TextBoxONChart);
        helper.click(TextBoxONChart);
    }
    public void createTradebutton() throws IOException, ParseException, InterruptedException {
        helper.click(CreateTrade);
        helper.waitForElement(CreateTradeTitle);
        Assert.assertTrue(helper.isElementPresent(CreateTradeTitle));
    }
    public void chartPage() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ChartPageTitle);
        Assert.assertTrue(helper.isElementPresent(ChartPageTitle));
    }
    public void zoomtag() throws IOException, ParseException, InterruptedException {
        helper.click(ZoomChart_1m);
        helper.click(ZoomChart_1Y);
        helper.click(ZoomChart_3m);
        helper.click(ZoomChart_6m);
        helper.click(ZoomChart_All);
        helper.click(ZoomChart_YTD);
    }
    public void hambugerMenu() throws IOException, ParseException, InterruptedException {
        helper.pause(5);
        helper.waitForElement(HamburgerMenu);

        helper.click(HamburgerMenu);
        helper.waitForElement(PrintChartOPtion);
        Assert.assertTrue(helper.isElementPresent(PrintChartOPtion));

        helper.click(DownloadJPEGImage);
        helper.click(SendAnywayButton);
        helper.isFileDownloaded("chart.jpeg");

        //new testcase
        driver.navigate().back();
        helper.click(SymbolField);
        helper.pause(3);
        List<WebElement> symbolDropdownValue = driver.findElements(By.xpath(ListOfSymbolValue));
        symbolDropdownValue.get(0).click();

        helper.click(HamburgerMenu);
        helper.click(DownloadPDFDocument);
        helper.click(SendAnywayButton);
        helper.isFileDownloaded("chart.pdf");

        //New Testcases
        driver.navigate().back();
        helper.click(SymbolField);
        helper.pause(3);
        List<WebElement> symbolDropdownValue2 = driver.findElements(By.xpath(ListOfSymbolValue));
        symbolDropdownValue2.get(0).click();

        helper.click(HamburgerMenu);
        helper.click(DownloadPNGImage);
        helper.click(SendAnywayButton);
        helper.isFileDownloaded("chart.png");

        //New Testcases
        driver.navigate().back();
        helper.click(SymbolField);
        helper.pause(3);
        List<WebElement> symbolDropdownValue3 = driver.findElements(By.xpath(ListOfSymbolValue));
        symbolDropdownValue3.get(0).click();

        helper.click(HamburgerMenu);
        helper.click(DownloadSVGVectorImage);
        helper.click(SendAnywayButton);
        helper.isFileDownloaded("chart.svg");


    }

}
