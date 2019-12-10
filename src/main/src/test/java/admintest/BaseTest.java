package admintest;


import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigProperties;
import org.apache.log4j.PropertyConfigurator;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    //String log4jConfPath ="path to/log4j.properties";
//PropertyConfigurator.configure(log4jConfPath);
    private static final Logger log = LogManager.getLogger(BaseTest.class.getName());
    protected static WebDriver driver;
    protected static String url = "https://pcm-dev1-fi9001-web01.saas-n.com/admin/pcm/logon.jsp";

    protected WebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Olesia.Surovehina\\Desktop\\selenium\\chromedriver2.exe");
        driver = new ChromeDriver();
        return driver;
    }
}
