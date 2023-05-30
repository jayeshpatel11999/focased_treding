package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class BrokerageAccountsTestCases extends BasePage {
    // BTC_01
    @Test
    public void traderAccountsUI() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
    }
    // BTC_02
    @Test
    public void verifyTheRefreshIcon() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.verifyRefreshIcon();
    }
    // BTC_03
    @Test
    public void verifyTheShowTeamsButton() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnTeamScreen();
    }
    // BTC_04
    @Test
    public void verifyTheShowRegionButton() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnRegionScreen();
    }
    // BTC_05
    @Test
    public void verifyTheCreateNewRegionButton() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnCreateRegionScreen();
    }
    // BTC_06
    @Test
    public void verifyTheIDLinkFromTheDataGrid() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
    }
    // BTC_07
    @Test
    public void verifyTheFieldsDisplayOnTheAccountDetailScreen() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.accountDetailsPageUI();
    }
    // BTC_08
    @Test
    public void VerifyTheIDLinkFromTheDataGridOfAccountDetailsScreen() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.reDirectOnSUB_ACCOUNT_OVERVIEWScreen();
    }
    // BTC_09
    @Test
    public void verifyTheAddSubAccountSection() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.verifyAddSubAccountSection();
    }
    // BTC_10
    @Test
    public void verifyTheHolderSection() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.verifyAddSubAccountSection();
        brokerageAccountsPage.verifyHolderSection();
    }
    // BTC_11
    @Test
    public void verifyTheNameSection() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.verifyAddSubAccountSection();
        brokerageAccountsPage.verifyNameSection();
    }
    // BTC_12
    @Test
    public void verifyThe_Add_Sub_Account_ButtonAfterEnteringDuplicateDataIn_Holder_And_Name_Field() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.verify_Error_Toaster_After_Entering_Duplicate_Data_In_Add_Sub_Account();

    }
    // BTC_13
    @Test
    public void verifyTheAddSubAccountButton() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.verifyAddSubAccount();
    }
    // BTC_14
    @Test
    public void verifyTheIDLinkFromTheDataGridOf_AccountDetailScreen() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.reDirectOnSubAccountOverviewScreen();
    }
    // BTC_15
    @Test
    public void verifyTheFieldsDisplayOnTheSubAccountOverviewScreen() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.reDirectOnSubAccountOverviewScreen();
        brokerageAccountsPage.subAccountOverviewPageUI();
    }
    // BTC_16
    @Test
    public void verifyTheRefreshIconOfSubAccountOverviewScreen() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.reDirectOnSubAccountOverviewScreen();
        brokerageAccountsPage.subAccountOverviewPageUI();
        brokerageAccountsPage.reFreshIconOnSubAccountOverviewPage();

    }
    // BTC_17
    @Test
    public void verifyTheAddTransactionSection() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.reDirectOnSubAccountOverviewScreen();
        brokerageAccountsPage.verifyAdd_Transaction_Section();
    }
    // BTC_18
    @Test
    public void verifyThe_Sum_Field() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.reDirectOnSubAccountOverviewScreen();
        brokerageAccountsPage.verifyAdd_Transaction_Section();
        brokerageAccountsPage.verify_Sum_Field();
    }
    // BTC_19
    @Test
    public void verifyTheDescriptionFieldWithInvalidData() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.reDirectOnSubAccountOverviewScreen();
        brokerageAccountsPage.verifyAdd_Transaction_Section();
        brokerageAccountsPage.verify_Description_Field_WithInvalidData();
    }
    // BTC_20
    @Test
    public void verifyTheAddTransactionButton() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.verifyAddSubAccount();
    }

    // BTC_21
    @Test
    public void verifyThe_Edit_Button() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.reDirectOnSubAccountOverviewScreen();
        brokerageAccountsPage.reDirect_On_Edit_Sub_Account_Screen();
    }

    // BTC_22
    @Test
    public void verifyTheFieldsDisplayOnThe_Edit_Sub_Account_Screen() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.reDirectOnSubAccountOverviewScreen();
        brokerageAccountsPage.reDirect_On_Edit_Sub_Account_Screen();
        brokerageAccountsPage.editSubAccountPageUI();
    }

    // BTC_23
    @Test
    public void verifyThe_Cancel_Button() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.reDirectOnSubAccountOverviewScreen();
        brokerageAccountsPage.reDirect_On_Edit_Sub_Account_Screen();
        brokerageAccountsPage.reDirectOnSubAccountOverviewScreenAfterClick_On_Cancel_Button();
    }
    // BTC_24 === Pending due to Bug Into Validation MSG
    @Test
    public void verifyTheFunctionalityOfUpdatingDataByEnteringAlreadyExistingData() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.reDirectOnSubAccountOverviewScreen();
        brokerageAccountsPage.reDirect_On_Edit_Sub_Account_Screen();
        brokerageAccountsPage.verify_After_Enter_Existing_Data();
    }
    // BTC_25
    @Test
    public void verifyThe_Save_Button_AfterUpdatingTheDataOf_Name_Field() throws IOException, ParseException, InterruptedException {        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.reDirectOnSubAccountOverviewScreen();
        brokerageAccountsPage.reDirect_On_Edit_Sub_Account_Screen();
        brokerageAccountsPage.verify_Save_Button_Is_Disabled_After_Change_Only_Name_Field();
    }
    // BTC_26
    @Test
    public void verifyThe_Save_Button_AfterUpdatingTheDataOf_Holder_Field() throws IOException, ParseException, InterruptedException {        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.reDirectOnSubAccountOverviewScreen();
        brokerageAccountsPage.reDirect_On_Edit_Sub_Account_Screen();
        brokerageAccountsPage.verify_Save_Button_Is_Enabled_After_Change_Only_Name_Field();
    }

    // BTC_27
    @Test
    public void verify_Data_Is_Updated_Or_Not_After_Edit_Holder_and_Broker_Name() throws IOException, ParseException, InterruptedException {        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        brokerageAccountsPage.openBrokerageAccountsPage();
        brokerageAccountsPage.brokerageAccountsPageUI();
        brokerageAccountsPage.reDirectOnAccountDetailsScreen();
        brokerageAccountsPage.reDirectOnSubAccountOverviewScreen();
        brokerageAccountsPage.reDirect_On_Edit_Sub_Account_Screen();
        brokerageAccountsPage.verify_Holder_and_Broker_Name_Is_Edited();
    }
}
