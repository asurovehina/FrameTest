package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminMain {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"main-menu-link\"]")
    WebElement menu;
    public AdminMain(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void ClickMenu () {
        menu.click();
    }
}
