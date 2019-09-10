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

    public void fillUserGroup (String userGr) {
            userGroup.sendKeys(userGr);
        }

    public void fillUserID (String user) {
        userID.sendKeys(user);
    }
    public void fillPassword (String passwordValue) {
        password.sendKeys(passwordValue);
    }
    public void clickSignIn () throws InterruptedException { signIn.click(); Thread.sleep(3000);}
}
