package admintest;

import factory.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestCreateCompany extends BaseTest {
    AdminLoginFactory adminLoginFactory;
    AdminMainFactory adminMainFactory;
    MenuTabFactory menuTabFactory;
    CompanyMainFactory companyMainFactory;
    CreateCompanyFactory createCompanyFactory;
   @BeforeClass
   public void BeforeClass () {
       getWebDriver();
       driver.get(url);
       adminLoginFactory = new AdminLoginFactory(driver);
       adminMainFactory = new AdminMainFactory(driver);
       menuTabFactory = new MenuTabFactory(driver);
       companyMainFactory = new CompanyMainFactory(driver);
       createCompanyFactory = new CreateCompanyFactory(driver);
   }
    @Test
    public void CreateCompany() throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().window().maximize();
        adminLoginFactory.fillUserGroup("cbao");
        adminLoginFactory.fillUserID("sysadmin1");
        adminLoginFactory.fillPassword("Password1");
        adminLoginFactory.clickSignIn();
        adminMainFactory.ClickMenu();
        menuTabFactory.ClickCompanyEl();
        companyMainFactory.ClickAdd();
        createCompanyFactory.FillCompany();
        createCompanyFactory.FillCompanyName();
        createCompanyFactory.ClickAllowSelfAdmin();
        createCompanyFactory.FillPaymentImportMethod("Any Workflow");
        createCompanyFactory.FillDataRetentionPS("30");
        createCompanyFactory.FillMaxNumberPS("30");
        createCompanyFactory.FillDataRetentionIR("30");
        createCompanyFactory.FillMaxNumberIR("30");
        createCompanyFactory.ClickSave();
    }
    @AfterClass
    public void AfterMethod () {
        driver.quit();
    }
}
