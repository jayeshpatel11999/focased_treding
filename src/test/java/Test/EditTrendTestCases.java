package Test;

import Utils.BasePage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class EditTrendTestCases extends BasePage {
    // ETRD_01
    @Test
    public void verifyThe_Market_Daily_Direction_Field() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        editTrendPage.openEditTrendPage();
        editTrendPage.verifyMarketDailyDirectionField();
    }
    // ETRD_02
    @Test
    public void verifyThe_Market_233_Direction_Field() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        editTrendPage.openEditTrendPage();
        editTrendPage.verifyMarket233DirectionField();
    }
    // ETRD_03  === Pending Due To Bug
    @Test
    public void verifyTheInvalidDataEnterIn_The_Market_Daily_Previous_Comment_Field() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        editTrendPage.openEditTrendPage();
        editTrendPage.enterInvalidDataInMarket_Daily_Previous_Comment();
    }
    // ETRD_04
    @Test
    public void verifyTheValidDataEnterInThe_Market_Daily_Previous_Comment_Field() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        editTrendPage.openEditTrendPage();
        editTrendPage.enterValidDataInMarket_Daily_Previous_Comment();
    }
    // ETRD_05
    @Test
    public void VerifyTheInvalidDataEnterInThe_Market_233_Previous_Comment_Field() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        editTrendPage.openEditTrendPage();
        editTrendPage.enterInvalidDataInMarket_233_Previous_Comment();
    }
    // ETRD_06
    @Test
    public void verifyTheValidDataEnterIn_The_Market_233_Previous_Comment_Field() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        editTrendPage.openEditTrendPage();
        editTrendPage.enterValidDataInMarket_233_Previous_Comment();
    }
    // ETRD_07
    @Test
    public void verifyTheSelectMenuOption_On_Nasdaq_55m_Futures_Direction_Field() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        editTrendPage.openEditTrendPage();
        editTrendPage.verifyNasdaq_55m_FuturesDirectionField();
    }

    // ETRD_08
    @Test
    public void verityTheSelectMenuOptionOn_ES_55m_Futures_DirectionField() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        editTrendPage.openEditTrendPage();
        editTrendPage.verifyES_55m_Futures_DirectionFField();
    }

    // ETRD_09
    @Test
    public void verifyTheInvalidDataInThe_Nasdaq_55m_Futures_Previous_CommentField () throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        editTrendPage.openEditTrendPage();
        editTrendPage.enterInvalidDataIn_Nasdaq_55m_Futures_Previous_Comment();
    }

    // ETRD_10
    @Test
    public void verifyTheValidDataInThe_Nasdaq_55m_Futures_Previous_Comment_Field () throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        editTrendPage.openEditTrendPage();
        editTrendPage.enterValidDataIn_Nasdaq_55m_Futures_Previous_Comment();
    }

    // ETRD_11
    @Test
    public void verifyTheInvalidDataInThe_ES_55m_Futures_Previous_Comment_Field() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        editTrendPage.openEditTrendPage();
        editTrendPage.enterInvalidDataIn_ES_55m_Futures_Previous_Comment();
    }
    // ETRD_12
    @Test
    public void verify_The_Valid_Data_In_The_ES_55m_Futures_Previous_Comment_Field() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        editTrendPage.openEditTrendPage();
        editTrendPage.enterValidDataIn_ES_55m_Futures_Previous_Comment();
    }
    // ETRD_13
    @Test
    public void verify_The_Select_Menu_Option_On_IWM_34_Direction_Field() throws IOException, ParseException, InterruptedException {
        loginPage.gotoURL();
        loginPage.login_with_Valid_data();
        editTrendPage.openEditTrendPage();
        editTrendPage.verify_IWM_34_DirectionFField();
    }



}
