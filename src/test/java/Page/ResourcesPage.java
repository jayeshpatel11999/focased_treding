package Page;

import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.print.Doc;
import javax.swing.text.Element;
import java.io.IOException;
import java.util.List;

public class ResourcesPage {
    WebDriver driver;
    Helper helper;
    String VideoSection;
    String AudioSection;
    String DocumentSection;
    String ResourceTitle;
    String ResourceTab;
    String SearchfieldDocumentSection;
    String ColumnIconVideoSection;
    String ColumnIconDocumentSection;
    String ColumnIconAudioSection;
    String SearchFieldAudioSection;
    String SearchFieldVideoSection;
    String FullScreenIconVideo;
    String FullScreenIconAudio;
    String FullScreenIconDocument;
    String DownloadIcon_Document;
    String SuccessMessage;
    String DownloadIcon_Audio;
    String DownloadIcon_Video;
    String DownloadingMessage;

    public ResourcesPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver,this);

        VideoSection = helper.data_repository("xpathlist", "Resource", "VideoSection");
        AudioSection = helper.data_repository("xpathlist", "Resource", "AudioSection");
        DocumentSection = helper.data_repository("xpathlist", "Resource", "DocumentSection");
        ResourceTitle = helper.data_repository("xpathlist", "Resource", "ResourceTitle");
        ResourceTab = helper.data_repository("xpathlist", "Resource", "ResourceTab");
        SearchfieldDocumentSection = helper.data_repository("xpathlist", "Resource", "SearchfieldDocumentSection");
        SearchFieldVideoSection = helper.data_repository("xpathlist", "Resource", "SearchFieldVideoSection");
        SearchFieldAudioSection = helper.data_repository("xpathlist", "Resource", "SearchFieldAudioSection");
        ColumnIconAudioSection = helper.data_repository("xpathlist", "Resource", "ColumnIconAudioSection");
        ColumnIconDocumentSection = helper.data_repository("xpathlist", "Resource", "ColumnIconDocumentSection");
        ColumnIconVideoSection = helper.data_repository("xpathlist", "Resource", "ColumnIconVideoSection");
        FullScreenIconVideo = helper.data_repository("xpathlist", "Resource", "FullScreenIconVideo");
        FullScreenIconAudio = helper.data_repository("xpathlist", "Resource", "FullScreenIconAudio");
        FullScreenIconDocument = helper.data_repository("xpathlist", "Resource", "FullScreenIconDocument");
        DownloadIcon_Document = helper.data_repository("xpathlist", "Resource", "DownloadIcon_Document");
        SuccessMessage = helper.data_repository("xpathlist", "Resource", "SuccessMessage");
        DownloadIcon_Audio = helper.data_repository("xpathlist", "Resource", "DownloadIcon_Audio");
        DownloadIcon_Video = helper.data_repository("xpathlist", "Resource", "DownloadIcon_Video");
        DownloadingMessage = helper.data_repository("xpathlist", "Resource", "DownloadingMessage");

    }
    public void opensourcePage() throws IOException, ParseException, InterruptedException {
        helper.click(ResourceTab);
    }
    public void resorcePageUI() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ResourceTitle);

        Assert.assertTrue(helper.isElementPresent(ResourceTitle));
        Assert.assertTrue(helper.isElementPresent(DocumentSection));
        helper.waitForElement(SearchfieldDocumentSection);
        helper.pause(5);
        Assert.assertTrue(helper.isElementPresent(SearchfieldDocumentSection));
        Assert.assertTrue(helper.isElementPresent(ColumnIconDocumentSection));
        Assert.assertTrue(helper.isElementPresent(FullScreenIconDocument));
        helper.click(DocumentSection);
        helper.waitForElement(AudioSection);
        Assert.assertTrue(helper.isElementPresent(AudioSection));
        helper.click(AudioSection);
        Assert.assertTrue(helper.isElementPresent(SearchFieldAudioSection));
        Assert.assertTrue(helper.isElementPresent(ColumnIconAudioSection));
        Assert.assertTrue(helper.isElementPresent(FullScreenIconAudio));
        helper.waitForElement(VideoSection);
        Assert.assertTrue(helper.isElementPresent(VideoSection));
        helper.scrollandclick(VideoSection);
        Assert.assertTrue(helper.isElementPresent(SearchFieldVideoSection));
        Assert.assertTrue(helper.isElementPresent(ColumnIconVideoSection));
        Assert.assertTrue(helper.isElementPresent(FullScreenIconVideo));
    }
    public void downloadFromDocumentSection() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(DownloadIcon_Document);
        List<WebElement> downlodDOc = driver.findElements(By.xpath(DownloadIcon_Document));
        downlodDOc.get(0).click();
        helper.waitForElement(SuccessMessage);
        helper.pause(2);
        helper.isFileDownloaded("Wall Street 101 Class - Pt 1.pdf");
    }
    public void downloadFromAudioSection() throws IOException, ParseException, InterruptedException {
        helper.scrollandclick(AudioSection);
        helper.scrollDown(DownloadIcon_Audio);
        helper.waitForElement(DownloadIcon_Audio);
        List<WebElement> downlodDOc = driver.findElements(By.xpath(DownloadIcon_Audio));
        downlodDOc.get(0).click();
        helper.pause(10);
        helper.waitForElement(SuccessMessage);
        helper.pause(2);
        helper.isFileDownloaded("Stock_Market_101_Class.mp3");
    }
    public void downloadFromVideoSection() throws IOException, ParseException, InterruptedException {
        helper.scrollandclick(VideoSection);
        helper.scrollDown(DownloadIcon_Video);
        helper.waitForElement(DownloadIcon_Video);
        List<WebElement> downlodDOc = driver.findElements(By.xpath(DownloadIcon_Video));
        downlodDOc.get(0).click();
        for(int i=0;i<6;i++) {
            helper.waitForElement(DownloadingMessage);
            helper.pause(1);
            if(helper.isElementPresent(SuccessMessage)){
                break;
            }
        }
        helper.waitForElement(SuccessMessage);
        helper.pause(2);
        helper.isFileDownloaded("Stock_Market_101_Class4.mp4");
    }
}
