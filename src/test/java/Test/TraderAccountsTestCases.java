package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class TraderAccountsTestCases extends BasePage {

    @Test
    public void traderAccountsUI() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        traderAccountsPage.openTraderAccountsPage();
        traderAccountsPage.traderAccountsPageUI();
    }
    @Test
    public void refreshIcon() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        traderAccountsPage.openTraderAccountsPage();
        traderAccountsPage.verifyRefreshIcon();

    }
    @Test
    public void redirectOnCreateAccountTraderDetailsPage() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        traderAccountsPage.openTraderAccountsPage();
        traderAccountsPage.clickOnCreateTraderAccountButtonAndRedirectOnTraderDetailsPage();
    }
    @Test
    public void verifyTheFunctionalityOfSearchbar() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        traderAccountsPage.openTraderAccountsPage();
        traderAccountsPage.searched_result_functionality();
    }

    @Test
    public void VerifyTheDropdownListForSelectingTheTraderName() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        traderAccountsPage.openTraderAccountsPage();
        traderAccountsPage.selectTrader();
    }
    @Test
    public void verifyTheToggleButtonWhenItIsTurnOff() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        traderAccountsPage.openTraderAccountsPage();
        traderAccountsPage.WhenToggleButtonIsOffThenItIsFalse();
    }

    @Test
    public void verifyTheToggleButtonWhenItIsTurnOn() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        traderAccountsPage.openTraderAccountsPage();
        traderAccountsPage.WhenToggleButtonIsOnThenItIsTrue();
    }
    @Test
    public void VerifyTheStrategyLinkFromTheDataGrid() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        traderAccountsPage.openTraderAccountsPage();
        traderAccountsPage.select_System_Adm_and_click_on_strategy_link();
    }
    @Test
    public void selectSystemAdmAnd_ClickOnPerformanceLink() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        traderAccountsPage.openTraderAccountsPage();
        traderAccountsPage.select_System_Adm_and_click_on_performance_link();
    }
    @Test
    public void VerifyTheEquityCurveIconLinkFromTheDataGrid() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        traderAccountsPage.openTraderAccountsPage();
        traderAccountsPage.select_System_Adm_and_click_on_Equity_Curve_icon();
    }
}
