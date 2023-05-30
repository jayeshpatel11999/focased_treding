package Page.Admin;

import Utils.BasePage;
import Utils.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class BrokerageAccountsPage extends BasePage {
    WebDriver driver;
    Helper helper;

    String Account_Holder_Name_Before_Edit;
    String Broker_Name_Before_Edit;
    String Account_Holder_Name_After_Cancel;
    String Broker_Name_After_Cancel;
    String Account_Holder_Name_After_Save;
    String Broker_Name_After_Save;
    String Account_Holder_Name_After_Edit;

    String RefreshIcon;
    String AdminTab;
    String BrokerageAccountsTab;
    String ShowTeamsButton;
    String CreateNewRegionButton;
    String SearchField;
    String ShowHideColumnButton;
    String FullScreenButton_On_SmallScreen;
    String FullScreenButton_On_FullScreen;
    String ListOfAccountTitle;
    String AccountListTitle;
    String Loading_Icon;
    String TeamTitle;
    String RegionTitle;
    String CreateRegionTitle;
    String FirstId;
    String AccountDetailTitle;
    String ShowRegionButton;
    String AddSubAccountTitle;
    String AddSubAccountButton;
    String ListOfSubAccount;
    String SubAccountOverviewTitle;
    String EnterHolderField;
    String EnterNameField;
    String ValidationMSGForHolder;
    String PleaseEnterHolderErrorMSG;
    String ValidationMSGForName;
    String PleaseEnterNameErrorMSG;
    String HolderLabel;
    String MakeSureYourHolderIsAtleast2CharactersErrorMSG;
    String MakeSureYourNameIsAtleast2CharactersErrorMSG;
    String SuccessToaster;
    String Edit_Button;
    String Balance_Section;
    String Transaction_Book_Section;
    String Add_Transaction_Section;
    String Order_Book_Section;
    String Portfolio_Section;
    String Sum_Field;
    String Description_Field;
    String TimeStamp_Field;
    String Add_Transaction_Button;
    String Error_Please_Enter_Sum;
    String Sum_Label;
    String Description_Must_Be_At_Least_3_Characters;
    String Error_TheDescriptionCannotIncludeLeadingAndTrailingSpaces;
    String Error_Please_Enter_Description;
    String Edit_Sub_Account_Title;
    String Holder_Field;
    String Broker_Name_Field;
    String Cancel_Button;
    String Save_Button;
    String Account_HolderName;
    String BrokerName;
    String Disabled_Save_Button;
    String Enabled_Save_Button;
    String ErrorToaster;



    public BrokerageAccountsPage(WebDriver d) throws IOException, ParseException {
        driver = d;
        helper = new Helper(d);
        PageFactory.initElements(this.driver, this);

        RefreshIcon = helper.data_repository("xpathlist", "BrokeragesAccount", "RefreshIcon");
        AdminTab = helper.data_repository("xpathlist", "BrokeragesAccount", "AdminTab");
        BrokerageAccountsTab = helper.data_repository("xpathlist", "BrokeragesAccount", "BrokerageAccountsTab");
        ShowTeamsButton = helper.data_repository("xpathlist", "BrokeragesAccount", "ShowTeamsButton");
        CreateNewRegionButton = helper.data_repository("xpathlist", "BrokeragesAccount", "CreateNewRegionButton");
        ShowHideColumnButton = helper.data_repository("xpathlist", "BrokeragesAccount", "ShowHideColumnButton");
        SearchField = helper.data_repository("xpathlist", "BrokeragesAccount", "SearchField");
        FullScreenButton_On_SmallScreen = helper.data_repository("xpathlist", "BrokeragesAccount", "FullScreenButton_On_SmallScreen");
        FullScreenButton_On_FullScreen = helper.data_repository("xpathlist", "BrokeragesAccount", "FullScreenButton_On_FullScreen");
        ListOfAccountTitle = helper.data_repository("xpathlist", "BrokeragesAccount", "ListOfAccountTitle");
        AccountListTitle = helper.data_repository("xpathlist", "BrokeragesAccount", "AccountListTitle");
        Loading_Icon = helper.data_repository("xpathlist", "LoginPage", "Loading_Icon");
        TeamTitle = helper.data_repository("xpathlist", "BrokeragesAccount", "TeamTitle");
        RegionTitle = helper.data_repository("xpathlist", "BrokeragesAccount", "RegionTitle");
        CreateRegionTitle = helper.data_repository("xpathlist", "BrokeragesAccount", "CreateRegionTitle");
        FirstId = helper.data_repository("xpathlist", "BrokeragesAccount", "FirstId");
        AccountDetailTitle = helper.data_repository("xpathlist", "BrokeragesAccount", "AccountDetailTitle");
        ShowRegionButton = helper.data_repository("xpathlist", "BrokeragesAccount", "ShowRegionButton");
        AddSubAccountTitle = helper.data_repository("xpathlist", "BrokeragesAccount", "AddSubAccountTitle");
        AddSubAccountButton = helper.data_repository("xpathlist", "BrokeragesAccount", "AddSubAccountButton");
        ListOfSubAccount = helper.data_repository("xpathlist", "BrokeragesAccount", "ListOfSubAccount");
        SubAccountOverviewTitle = helper.data_repository("xpathlist", "BrokeragesAccount", "SubAccountOverviewTitle");
        EnterHolderField = helper.data_repository("xpathlist", "BrokeragesAccount", "EnterHolderField");
        EnterNameField = helper.data_repository("xpathlist", "BrokeragesAccount", "EnterNameField");
        ValidationMSGForHolder = helper.data_repository("xpathlist", "BrokeragesAccount", "ValidationMSGForHolder");
        PleaseEnterHolderErrorMSG = helper.data_repository("xpathlist", "BrokeragesAccount", "PleaseEnterHolderErrorMSG");
        ValidationMSGForName = helper.data_repository("xpathlist", "BrokeragesAccount", "ValidationMSGForName");
        PleaseEnterNameErrorMSG = helper.data_repository("xpathlist", "BrokeragesAccount", "PleaseEnterNameErrorMSG");
        HolderLabel = helper.data_repository("xpathlist", "BrokeragesAccount", "HolderLabel");
        MakeSureYourHolderIsAtleast2CharactersErrorMSG = helper.data_repository("xpathlist", "BrokeragesAccount", "MakeSureYourHolderIsAtleast2CharactersErrorMSG");
        MakeSureYourNameIsAtleast2CharactersErrorMSG = helper.data_repository("xpathlist", "BrokeragesAccount", "MakeSureYourNameIsAtleast2CharactersErrorMSG");
        SuccessToaster = helper.data_repository("xpathlist", "BrokeragesAccount", "SuccessToaster");
        Edit_Button = helper.data_repository("xpathlist", "BrokeragesAccount", "Edit_Button");
        Balance_Section = helper.data_repository("xpathlist", "BrokeragesAccount", "Balance_Section");
        Transaction_Book_Section = helper.data_repository("xpathlist", "BrokeragesAccount", "Transaction_Book_Section");
        Add_Transaction_Section = helper.data_repository("xpathlist", "BrokeragesAccount", "Add_Transaction_Section");
        Order_Book_Section = helper.data_repository("xpathlist", "BrokeragesAccount", "Order_Book_Section");
        Portfolio_Section = helper.data_repository("xpathlist", "BrokeragesAccount", "Portfolio_Section");
        Sum_Field = helper.data_repository("xpathlist", "BrokeragesAccount", "Sum_Field");
        Description_Field = helper.data_repository("xpathlist", "BrokeragesAccount", "Description_Field");
        TimeStamp_Field = helper.data_repository("xpathlist", "BrokeragesAccount", "TimeStamp_Field");
        Add_Transaction_Button = helper.data_repository("xpathlist", "BrokeragesAccount", "Add_Transaction_Button");
        Error_Please_Enter_Sum = helper.data_repository("xpathlist", "BrokeragesAccount", "Error_Please_Enter_Sum");
        Sum_Label = helper.data_repository("xpathlist", "BrokeragesAccount", "Sum_Label");
        Description_Must_Be_At_Least_3_Characters = helper.data_repository("xpathlist", "BrokeragesAccount", "Description_Must_Be_At_Least_3_Characters");
        Error_TheDescriptionCannotIncludeLeadingAndTrailingSpaces = helper.data_repository("xpathlist", "BrokeragesAccount", "Error_TheDescriptionCannotIncludeLeadingAndTrailingSpaces");
        Error_Please_Enter_Description = helper.data_repository("xpathlist", "BrokeragesAccount", "Error_Please_Enter_Description");
        Edit_Sub_Account_Title = helper.data_repository("xpathlist", "BrokeragesAccount", "Edit_Sub_Account_Title");
        Holder_Field = helper.data_repository("xpathlist", "BrokeragesAccount", "Holder_Field");
        Broker_Name_Field = helper.data_repository("xpathlist", "BrokeragesAccount", "Broker_Name_Field");
        Cancel_Button = helper.data_repository("xpathlist", "BrokeragesAccount", "Cancel_Button");
        Save_Button = helper.data_repository("xpathlist", "BrokeragesAccount", "Save_Button");
        Account_HolderName = helper.data_repository("xpathlist", "BrokeragesAccount", "Account_HolderName");
        BrokerName = helper.data_repository("xpathlist", "BrokeragesAccount", "BrokerName");
        Disabled_Save_Button = helper.data_repository("xpathlist", "BrokeragesAccount", "Disabled_Save_Button");
        Enabled_Save_Button = helper.data_repository("xpathlist", "BrokeragesAccount", "Enabled_Save_Button");
        ErrorToaster = helper.data_repository("xpathlist", "BrokeragesAccount", "ErrorToaster");
    }
    public void openBrokerageAccountsPage() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(AdminTab);
        helper.click(AdminTab);
        helper.click(BrokerageAccountsTab);
    }
    public void brokerageAccountsPageUI() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(AccountListTitle);
        Assert.assertTrue(helper.isElementPresent(AccountListTitle));
        Assert.assertTrue(helper.isElementPresent(ListOfAccountTitle));
        Assert.assertTrue(helper.isElementPresent(RefreshIcon));
        Assert.assertTrue(helper.isElementPresent(SearchField));
        Assert.assertTrue(helper.isElementPresent(ShowTeamsButton));
        Assert.assertTrue(helper.isElementPresent(CreateNewRegionButton));
        Assert.assertTrue(helper.isElementPresent(ShowHideColumnButton));
        Assert.assertTrue(helper.isElementPresent(FullScreenButton_On_SmallScreen));
    }
    public void verifyRefreshIcon() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ListOfAccountTitle);
        helper.click(RefreshIcon);
        helper.waitForElement(RefreshIcon);
    }
    public void reDirectOnTeamScreen() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ListOfAccountTitle);
        helper.click(ShowTeamsButton);
        helper.waitForElement(TeamTitle);
        Assert.assertTrue(helper.isElementPresent(TeamTitle));
    }
    public void reDirectOnRegionScreen() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ListOfAccountTitle);
        helper.click(ShowRegionButton);
        helper.waitForElement(RegionTitle);
        Assert.assertTrue(helper.isElementPresent(RegionTitle));
    }
    public void reDirectOnCreateRegionScreen() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ListOfAccountTitle);
        helper.click(CreateNewRegionButton);
        helper.waitForElement(CreateRegionTitle);
        Assert.assertTrue(helper.isElementPresent(CreateRegionTitle));
    }
    public void reDirectOnAccountDetailsScreen() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(ListOfAccountTitle);
        helper.click(FirstId);
        helper.waitForElement(AccountDetailTitle);
        Assert.assertTrue(helper.isElementPresent(AccountDetailTitle));
    }
    public void accountDetailsPageUI() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(AccountDetailTitle);
        Assert.assertTrue(helper.isElementPresent(SearchField));
        Assert.assertTrue(helper.isElementPresent(ShowHideColumnButton));
        Assert.assertTrue(helper.isElementPresent(FullScreenButton_On_SmallScreen));
        Assert.assertTrue(helper.isElementPresent(AddSubAccountTitle));
        Assert.assertTrue(helper.isElementPresent(AddSubAccountButton));
        Assert.assertTrue(helper.isElementPresent(ListOfSubAccount));
    }
    public void verify_Error_Toaster_After_Entering_Duplicate_Data_In_Add_Sub_Account() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(AccountDetailTitle);
        helper.scrollToElement(AddSubAccountTitle);
        helper.enterDataInField(EnterHolderField, "subaccount");
        helper.enterDataInField(EnterNameField, "testing");
        helper.click(AddSubAccountButton);
        helper.waitForElementWithoutLoading(ErrorToaster);
        Assert.assertTrue(helper.isElementPresent(ErrorToaster));
    }
    public void reDirectOnSUB_ACCOUNT_OVERVIEWScreen() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(AccountDetailTitle);
        helper.click(FirstId);
        helper.waitForElement(SubAccountOverviewTitle);
        Assert.assertTrue(helper.isElementPresent(SubAccountOverviewTitle));
    }
    public void verifyAddSubAccountSection() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(AccountDetailTitle);
        Assert.assertTrue(helper.isElementPresent(EnterHolderField));
        Assert.assertTrue(helper.isElementPresent(EnterNameField));
        Assert.assertTrue(helper.isElementPresent(AddSubAccountButton));

    }
    public void verifyHolderSection() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(AccountDetailTitle);
        helper.scrollToElement(EnterHolderField);
        helper.enterDataInField(EnterHolderField , "123");
        helper.click(HolderLabel);
        helper.waitForElement(ValidationMSGForHolder);
        Assert.assertTrue(helper.isElementPresent(ValidationMSGForHolder));
        helper.click(EnterHolderField);
        helper.PressBackSpace_Key(3);
        helper.click(HolderLabel);
        helper.waitForElement(PleaseEnterHolderErrorMSG);
        Assert.assertTrue(helper.isElementPresent(PleaseEnterHolderErrorMSG));
        helper.enterDataInField(EnterHolderField , "#@#");
        helper.click(HolderLabel);
        helper.waitForElement(ValidationMSGForHolder);
        Assert.assertTrue(helper.isElementPresent(ValidationMSGForHolder));
        helper.click(EnterHolderField);
        helper.PressBackSpace_Key(3);
        helper.click(HolderLabel);
        helper.waitForElement(PleaseEnterHolderErrorMSG);
        Assert.assertTrue(helper.isElementPresent(PleaseEnterHolderErrorMSG));
        helper.enterDataInField(EnterHolderField , "A");
        helper.click(HolderLabel);
        helper.waitForElement(MakeSureYourHolderIsAtleast2CharactersErrorMSG);
        Assert.assertTrue(helper.isElementPresent(MakeSureYourHolderIsAtleast2CharactersErrorMSG));
        helper.click(EnterHolderField);
        helper.PressBackSpace_Key(1);
        helper.click(HolderLabel);
        helper.waitForElement(PleaseEnterHolderErrorMSG);
        Assert.assertTrue(helper.isElementPresent(PleaseEnterHolderErrorMSG));
    }

    public void verifyNameSection() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(AccountDetailTitle);
        helper.scrollToElement(EnterNameField);
        helper.enterDataInField(EnterNameField , "123");
        helper.click(HolderLabel);
        helper.waitForElement(ValidationMSGForName);
        Assert.assertTrue(helper.isElementPresent(ValidationMSGForName));
        helper.click(EnterNameField);
        helper.PressBackSpace_Key(3);
        helper.click(HolderLabel);
        helper.waitForElement(PleaseEnterNameErrorMSG);
        Assert.assertTrue(helper.isElementPresent(PleaseEnterNameErrorMSG));
        helper.enterDataInField(EnterNameField , "#@#");
        helper.click(HolderLabel);
        helper.waitForElement(ValidationMSGForName);
        Assert.assertTrue(helper.isElementPresent(ValidationMSGForName));
        helper.click(EnterNameField);
        helper.PressBackSpace_Key(3);
        helper.click(HolderLabel);
        helper.waitForElement(PleaseEnterNameErrorMSG);
        Assert.assertTrue(helper.isElementPresent(PleaseEnterNameErrorMSG));
        helper.enterDataInField(EnterNameField , "A");
        helper.click(HolderLabel);
        helper.waitForElement(MakeSureYourNameIsAtleast2CharactersErrorMSG);
        Assert.assertTrue(helper.isElementPresent(MakeSureYourNameIsAtleast2CharactersErrorMSG));
        helper.click(EnterNameField);
        helper.PressBackSpace_Key(1);
        helper.click(HolderLabel);
        helper.waitForElement(PleaseEnterNameErrorMSG);
        Assert.assertTrue(helper.isElementPresent(PleaseEnterNameErrorMSG));
//        helper.waitForElement(PleaseEnterHolderErrorMSG);
//        Assert.assertTrue(helper.isElementPresent(PleaseEnterHolderErrorMSG));
    }

    public void verifyAddSubAccount() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(AccountDetailTitle);
        helper.scrollToElement(AddSubAccountButton);
        helper.enterDataInField(EnterHolderField , helper.generateRandomChars(4));
        helper.enterDataInField(EnterNameField , helper.generateRandomChars(4));
        helper.click(AddSubAccountButton);
        helper.waitForElementWithoutLoading(SuccessToaster);
        Assert.assertTrue(helper.isElementPresent(SuccessToaster));
    }

    public void reDirectOnSubAccountOverviewScreen() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(AccountDetailTitle);
        helper.click(FirstId);
        helper.waitForElement(SubAccountOverviewTitle);
        Assert.assertTrue(helper.isElementPresent(SubAccountOverviewTitle));
    }
    public void subAccountOverviewPageUI() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(SubAccountOverviewTitle);
        Assert.assertTrue(helper.isElementPresent(RefreshIcon));
        Assert.assertTrue(helper.isElementPresent(Edit_Button));
        Assert.assertTrue(helper.isElementPresent(Balance_Section));
        Assert.assertTrue(helper.isElementPresent(Transaction_Book_Section));
        Assert.assertTrue(helper.isElementPresent(Add_Transaction_Section));
        Assert.assertTrue(helper.isElementPresent(Order_Book_Section));
        Assert.assertTrue(helper.isElementPresent(Portfolio_Section));
    }
    public void reFreshIconOnSubAccountOverviewPage() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(SubAccountOverviewTitle);
        helper.click(RefreshIcon);
        helper.waitForElement(RefreshIcon);
    }
    public void verifyAdd_Transaction_Section() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(SubAccountOverviewTitle);
        helper.scrollToElement(Add_Transaction_Section);
        Assert.assertTrue(helper.isElementPresent(Add_Transaction_Section));

    }
    public void verify_Sum_Field() throws IOException, ParseException, InterruptedException {
        helper.click(Add_Transaction_Section);
        helper.waitForElement(Sum_Field);
        helper.enterDataInField(Sum_Field , "TEST");
        helper.click(Sum_Field);
        helper.PressBackSpace_Key(1);
        helper.enterDataInField(Sum_Field , "#@#");
        helper.click(Sum_Field);
        helper.PressBackSpace_Key(2);
        helper.click(Sum_Label);
        Assert.assertTrue(helper.isElementPresent(Error_Please_Enter_Sum));
    }
    public void verify_Description_Field_WithInvalidData() throws IOException, ParseException, InterruptedException {
        helper.click(Add_Transaction_Section);
        helper.waitForElement(Description_Field);
        helper.enterDataInField(Description_Field , "@@");
        helper.click(Sum_Label);
        Assert.assertTrue(helper.isElementPresent(Description_Must_Be_At_Least_3_Characters));
        helper.click(Description_Field);
        helper.PressBackSpace_Key(2);
        Assert.assertTrue(helper.isElementPresent(Error_Please_Enter_Description));
        helper.enterDataInField(Description_Field , "@@ ");
        Assert.assertTrue(helper.isElementPresent(Error_TheDescriptionCannotIncludeLeadingAndTrailingSpaces));
    }
    public void reDirect_On_Edit_Sub_Account_Screen() throws IOException, ParseException, InterruptedException {
        Account_Holder_Name_Before_Edit = helper.getText(Account_HolderName);
        Broker_Name_Before_Edit = helper.getText(BrokerName);
        helper.click(Edit_Button);
        helper.waitForElement(Edit_Sub_Account_Title);
        Assert.assertTrue(helper.isElementPresent(Edit_Sub_Account_Title));
    }
    public void editSubAccountPageUI() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(Edit_Sub_Account_Title    );
        Assert.assertTrue(helper.isElementPresent(Holder_Field));
        Assert.assertTrue(helper.isElementPresent(Broker_Name_Field));
        Assert.assertTrue(helper.isElementPresent(Cancel_Button));
        Assert.assertTrue(helper.isElementPresent(Save_Button));
    }

    public void reDirectOnSubAccountOverviewScreenAfterClick_On_Cancel_Button() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(Edit_Sub_Account_Title);
        Assert.assertTrue(helper.isElementPresent(Cancel_Button));
        helper.click(Holder_Field);
        String Random_Char= helper.generateRandomChars(2);
        helper.enterDataInField(Holder_Field , Random_Char);
        helper.click(Broker_Name_Field);
        helper.enterDataInField(Broker_Name_Field , Random_Char);
        helper.click(Cancel_Button);
        helper.waitForElement(SubAccountOverviewTitle);
        Assert.assertTrue(helper.isElementPresent(SubAccountOverviewTitle));
        Account_Holder_Name_After_Cancel = helper.getText(Account_HolderName);
        Broker_Name_After_Cancel = helper.getText(BrokerName);
        Assert.assertEquals(Account_Holder_Name_Before_Edit, Account_Holder_Name_After_Cancel);
        Assert.assertEquals(Broker_Name_Before_Edit, Broker_Name_After_Cancel);
    }

    public void verify_After_Enter_Existing_Data() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(Edit_Sub_Account_Title);
        int i = Account_Holder_Name_Before_Edit.length();
        int j = Broker_Name_Before_Edit.length();
        helper.click(Holder_Field);
        helper.PressBackSpace_Key(i);
        helper.enterDataInField(Holder_Field , "RK");
        helper.click(Broker_Name_Field);
        helper.PressBackSpace_Key(j);
        helper.enterDataInField(Broker_Name_Field , "QA");
        helper.pause(4);
        helper.click(Save_Button);
        helper.waitForElement(SubAccountOverviewTitle);
        Assert.assertTrue(helper.isElementPresent(SubAccountOverviewTitle));
    }

    public void verify_Save_Button_Is_Disabled_After_Change_Only_Name_Field() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(Edit_Sub_Account_Title);
        Assert.assertTrue(helper.isElementPresent(Cancel_Button));
        String Random_Char= helper.generateRandomChars(2);
        helper.click(Broker_Name_Field);
        helper.enterDataInField(Broker_Name_Field , Random_Char);
        Assert.assertTrue(helper.isElementPresent(Disabled_Save_Button));
        Assert.assertFalse(helper.isEnabled(Save_Button));
    }

    public void verify_Save_Button_Is_Enabled_After_Change_Only_Name_Field() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(Edit_Sub_Account_Title);
        Assert.assertTrue(helper.isElementPresent(Cancel_Button));
        String Random_Char= helper.generateRandomChars(2);
        helper.click(Holder_Field);
        helper.enterDataInField(Holder_Field , Random_Char);
        helper.pause(2);
        helper.waitForElement(Enabled_Save_Button);
        Assert.assertTrue(helper.isElementPresent(Enabled_Save_Button));
        helper.click(Enabled_Save_Button);
        helper.waitForElementWithoutLoading(SuccessToaster);
        Assert.assertTrue(helper.isElementPresent(SuccessToaster));
        helper.waitForElement(SubAccountOverviewTitle);
        Assert.assertTrue(helper.isElementPresent(SubAccountOverviewTitle));
        helper.waitForElement(Account_HolderName);
        Account_Holder_Name_After_Save = helper.getText(Account_HolderName);
        Account_Holder_Name_After_Edit = Account_Holder_Name_Before_Edit + Random_Char;
        System.out.println(Account_Holder_Name_After_Edit);
        Broker_Name_After_Save = helper.getText(BrokerName);
        Assert.assertEquals(Account_Holder_Name_After_Edit, Account_Holder_Name_After_Save);
    }

    public void verify_Holder_and_Broker_Name_Is_Edited() throws IOException, ParseException, InterruptedException {
        helper.waitForElement(Edit_Sub_Account_Title);
        Assert.assertTrue(helper.isElementPresent(Cancel_Button));
        String Random_Char= helper.generateRandomChars(2);
        helper.click(Holder_Field);
        helper.enterDataInField(Holder_Field , Random_Char);
        helper.pause(2);
        helper.click(Broker_Name_Field);
        helper.enterDataInField(Broker_Name_Field , Random_Char);
        helper.pause(2);
        helper.waitForElement(Enabled_Save_Button);
        Assert.assertTrue(helper.isElementPresent(Enabled_Save_Button));
        helper.click(Enabled_Save_Button);
        helper.waitForElementWithoutLoading(SuccessToaster);
        Assert.assertTrue(helper.isElementPresent(SuccessToaster));
        helper.waitForElement(SubAccountOverviewTitle);
        Assert.assertTrue(helper.isElementPresent(SubAccountOverviewTitle));
        helper.waitForElement(Account_HolderName);
        Account_Holder_Name_After_Save = helper.getText(Account_HolderName);
        Account_Holder_Name_After_Edit = Account_Holder_Name_Before_Edit + Random_Char;
        Broker_Name_After_Save = helper.getText(BrokerName);
        String Broker_Name_Before_After_Edit = Broker_Name_Before_Edit + Random_Char;
        System.out.println(Account_Holder_Name_After_Edit);
        Assert.assertEquals(Account_Holder_Name_After_Edit, Account_Holder_Name_After_Save);
        Assert.assertEquals(Broker_Name_Before_After_Edit, Broker_Name_After_Save);
    }


}
