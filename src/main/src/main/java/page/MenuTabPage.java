package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuTabPage {
    WebDriver driver;
    @FindBy(xpath ="//a[contains(@data-bt-itemrequestparams,'filterID=15151')]")
    WebElement CompanyEl;
    public MenuTabPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickCompanyEl() throws InterruptedException {
        CompanyEl.click();
        Thread.sleep(3000);
    }
}
