package admintest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import page.*;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestCreateCompany extends BaseTest {
    AdminLoginPage adminLoginFactory;
    AdminMainPage adminMainFactory;
    MenuTabPage menuTabFactory;
    CompanyMainPage companyMainFactory;
    CreateCompanyPage createCompanyFactory;
    private static final Logger log = LogManager.getLogger(TestCreateCompany.class.getName());
   @BeforeClass
   public void BeforeClass () throws InterruptedException {
       getWebDriver();
       driver.get(url);
       Thread.sleep(2000);
       driver.manage().window().maximize();
       adminLoginFactory = new AdminLoginPage(driver);
       adminMainFactory = new AdminMainPage(driver);
       menuTabFactory = new MenuTabPage(driver);
       companyMainFactory = new CompanyMainPage(driver);
       createCompanyFactory = new CreateCompanyPage(driver);
   }
    @Test
    public void CreateCompany() throws InterruptedException {
        adminLoginFactory.LoginAs("sysadmin1");
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
        driver.findElement(By.xpath("//*[@id=\"confirmation_messagesListNode\"]"));
        driver.quit();
        }
}
