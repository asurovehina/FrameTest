package factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginFactory {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"corpID\"]")
    WebElement userGroup;

    @FindBy(xpath = "//input[@id='userID']")
    WebElement userID;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"loginFormWrapper\"]/div[2]/div/div[3]/div/div/div/div[1]/a/span")
    WebElement signIn;
    public AdminLoginFactory(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
    }

    public void LoginAs (String user) throws InterruptedException {

        userGroup.sendKeys("cbao");
        userID.sendKeys(user);
        password.sendKeys("Password1");
        signIn.click();
        Thread.sleep(2000);
    }
}
