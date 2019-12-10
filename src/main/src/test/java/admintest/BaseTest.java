package admintest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page.*;
import utils.ConfigProperties;
import utils.Log;

public class BaseTest {
    private static final Logger log = LogManager.getLogger(BaseTest.class.getName());
    protected static WebDriver driver;
    AdminLogin adminLoginFactory;
    AdminMain adminMainFactory;
    MenuTab menuTabFactory;
    CompanyMain companyMainFactory;
    CreateCompany createCompanyFactory;
    @BeforeClass
    public void BeforeClass () throws InterruptedException {
        Log.startLog("Test is starting...");
        getWebDriver();
        driver.get(ConfigProperties.getProperty("url"));
        Thread.sleep(2000);
        driver.manage().window().maximize();
        adminLoginFactory = new AdminLogin(driver);
        adminMainFactory = new AdminMain(driver);
        menuTabFactory = new MenuTab(driver);
        companyMainFactory = new CompanyMain(driver);
        createCompanyFactory = new CreateCompany(driver);
    }

    protected WebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Olesia.Surovehina\\Desktop\\selenium\\chromedriver2.exe");
        driver = new ChromeDriver();
        return driver;
    }

    @AfterClass
    public void AfterMethod () {
        Log.endLog("Test is ending...");
        driver.findElement(By.xpath("//*[@id=\"confirmation_messagesListNode\"]"));
        driver.quit();
    }
}
