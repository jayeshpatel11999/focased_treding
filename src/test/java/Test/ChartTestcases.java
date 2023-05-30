package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class ChartTestcases extends BasePage {
    @Test
    public void chartUI() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        chartPage.chartpageUI();
    }
    @Test
    public void selectValue() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        chartPage.chartpageUI();
        chartPage.searchValue();
    }
    @Test
    public void createTradeFun() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        chartPage.chartpageUI();
        chartPage.createTradebutton();
        openTradesPage.validData();
        chartPage.chartPage();
    }
    @Test
    public void zoomTest() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        chartPage.chartpageUI();
        chartPage.searchValue();
        chartPage.zoomtag();
    }
    @Test
    public void downloadChart() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        chartPage.chartpageUI();
        chartPage.searchValue();
        chartPage.hambugerMenu();
    }
}
