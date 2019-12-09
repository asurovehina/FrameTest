package admintest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import page.*;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Log;


public class TestCreateCompany extends BaseTest {
    AdminLogin adminLoginFactory;
    AdminMain adminMainFactory;
    MenuTab menuTabFactory;
    CompanyMain companyMainFactory;
    CreateCompany createCompanyFactory;
    private static final Logger log = LogManager.getLogger(TestCreateCompany.class.getName());
   @BeforeClass
   public void BeforeClass () throws InterruptedException {
       Log.startLog("Test is starting...");
       getWebDriver();
       driver.get(url);
       Thread.sleep(2000);
       driver.manage().window().maximize();
       adminLoginFactory = new AdminLogin(driver);
       adminMainFactory = new AdminMain(driver);
       menuTabFactory = new MenuTab(driver);
       companyMainFactory = new CompanyMain(driver);
       createCompanyFactory = new CreateCompany(driver);
   }
    @Test
    public void CreateCompany() throws InterruptedException {
        adminLoginFactory.LoginAs("admin1");
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
    @AfterClass
    public void AfterMethod () {
       Log.endLog("Test is ending...");
        driver.findElement(By.xpath("//*[@id=\"confirmation_messagesListNode\"]"));
        driver.quit();
        }
}
