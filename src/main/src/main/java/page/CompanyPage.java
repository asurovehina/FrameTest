package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"modifyUserGroupDetail\"]/span")
    WebElement ClientCompanyModify;

    @FindBy(xpath = "//*[@id=\"modifyUserGroupEntitlements\"]/span")
    WebElement ClientEntitlements;
    public CompanyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
        public void ClickClientCompanyModify () {
        ClientCompanyModify.click();
    }
        public void ClickClientEntitlements () {
        ClientEntitlements.click();
    }
}
