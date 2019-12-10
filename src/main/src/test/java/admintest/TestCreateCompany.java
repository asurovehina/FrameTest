package admintest;

import org.testng.annotations.Test;
import utils.Log;


public class TestCreateCompany extends BaseTest {
    @Test
    public void CreateCompany() throws InterruptedException {
        adminLoginFactory.LoginAs();
        Log.info("Login to the application...");
        adminMainFactory.ClickMenu();
        Log.info("Click the button Menu");
        menuTabFactory.ClickCompanyEl();
        Log.info("Click the button company");
        companyMainFactory.ClickAdd();
        Log.info("Click add");
        createCompanyFactory.FillCompany();
        Log.info("Fill in company");
        createCompanyFactory.FillCompanyName();
        Log.info("Fill in company name");
        createCompanyFactory.ClickAllowSelfAdmin();
        Log.info("Click Allow Self Admin");
        createCompanyFactory.FillPaymentImportMethod("Any Workflow");
        Log.info("Fill in Payment Import Method");
        createCompanyFactory.FillDataRetentionPS("30");
        Log.info("Fill in Data Retention PS");
        createCompanyFactory.FillMaxNumberPS("30");
        Log.info("Fill in Max numbers PS");
        createCompanyFactory.FillDataRetentionIR("30");
        Log.info("Fill in Data Retention IR");
        createCompanyFactory.FillMaxNumberIR("30");
        Log.info("Fill Max Numbers IR");
        createCompanyFactory.ClickSave();
        Log.info("Click save");
    }
}
