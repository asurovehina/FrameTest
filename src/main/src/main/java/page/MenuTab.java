package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MenuTab {
    WebDriver driver;
    @FindBy(xpath ="//a[contains(@data-bt-itemrequestparams,'filterID=15151')]")
    WebElement CompanyEl;
    public MenuTab(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickCompanyEl() {
        CompanyEl.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
