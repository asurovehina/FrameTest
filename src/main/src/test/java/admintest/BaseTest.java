package admintest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigProperties;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;
    protected static String url = "https://pcm-dev1-fi9001-web01.saas-n.com/admin/pcm/logon.jsp";

    protected WebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Olesia.Surovehina\\Desktop\\selenium\\chromedriver2.exe");
        driver = new ChromeDriver();
        return driver;
    }
}
