package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class ResourcesTestCases extends BasePage {
    @Test
    public void resourceUI() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        resourcesPage.opensourcePage();
        resourcesPage.resorcePageUI();
    }
    @Test
    public void downloadDocument() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        resourcesPage.opensourcePage();
        resourcesPage.downloadFromDocumentSection();
    }
    @Test
    public void downloadAudio() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        resourcesPage.opensourcePage();
        resourcesPage.downloadFromAudioSection();
    }
    @Test
    public void downloadVideo() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        resourcesPage.opensourcePage();
        resourcesPage.downloadFromVideoSection();
    }
}
