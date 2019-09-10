package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuTabFactory {
    WebDriver driver;
    @FindBy(xpath ="//a[contains(@data-bt-itemrequestparams,'filterID=15151')]")
    WebElement CompanyEl;
    public MenuTabFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickCompanyEl() throws InterruptedException {
        CompanyEl.click();
        Thread.sleep(3000);
    }
}
