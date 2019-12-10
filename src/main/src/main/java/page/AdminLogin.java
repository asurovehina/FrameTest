package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigProperties;

import java.util.concurrent.TimeUnit;

public class AdminLogin {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"corpID\"]")
    WebElement userGroup;

    @FindBy(xpath = "//input[@id='userID']")
    WebElement userID;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"loginFormWrapper\"]/div[2]/div/div[3]/div/div/div/div[1]/a/span")
    WebElement signIn;
    public AdminLogin(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
    }

    public void LoginAs () {
        userGroup.sendKeys(ConfigProperties.getProperty("company"));
        userID.sendKeys(ConfigProperties.getProperty("user"));
        password.sendKeys(ConfigProperties.getProperty("password"));
        signIn.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
