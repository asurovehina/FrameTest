package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyMain {
    WebDriver driver;
    @FindBy(xpath = "//input[@id='quickSearchTextBox']")
    WebElement FilterCompany;

    @FindBy(xpath = "//span[@class='headerLinks'][contains(.,'Go')]")
    WebElement GoButton;

    @FindBy(xpath = "//button[contains(@id,'lv-cmenu-0')]")
    WebElement Actions;

    @FindBy(xpath = "//td[@class='dijitReset dijitMenuItemLabel'][contains(@id,'text')][contains(.,'VIEW')]")
    WebElement ActionsView;

    @FindBy(xpath = "//*[@id=\"btnAdd-act\"]/span")
    WebElement Add;
    public CompanyMain(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillFilterCompany  (String Company) {
        FilterCompany.sendKeys(Company);
    }
        public void ClickGoButton() throws InterruptedException {
        GoButton.click(); Thread.sleep(2000);
    }
        public void ClickActions() {
        Actions.click();
    }
        public void ClickActionsView () throws InterruptedException {
        ActionsView.click(); Thread.sleep(2000);
    }
        public void ClickAdd () throws InterruptedException {
        Add.click(); Thread.sleep(2000);
    }
}
