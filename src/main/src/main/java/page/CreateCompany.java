package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CreateCompany {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"UserGroup\"]")
    WebElement Company;

    @FindBy(xpath = "//*[@id=\"GroupName\"]")
    WebElement CompanyName;

    @FindBy(xpath = "//*[@id=\"allowSelfAdministration\"]")
    WebElement AllowSelfAdmin;

    @FindBy(xpath = "//*[@id=\"PaymentImportMethod\"]")
    WebElement PaymentImportMethod;

    @FindBy(xpath = "//*[@id=\"PAYDAYSAVAIL\"]")
    WebElement DataRetentionPS;

    @FindBy(xpath = "//*[@id=\"PAYMAXDAYS\"]")
    WebElement MaxNumberPS;

    @FindBy(xpath = "//*[@id=\"DAYSAVAIL\"]")
    WebElement DataRetentionIR;

    @FindBy(xpath = "//*[@id=\"MAXDAYS\"]")
    WebElement MaxNumberIR;

    @FindBy(xpath = "//*[@id=\"BTNADD-act\"]")
    WebElement Save;
    public CreateCompany(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

        public void FillCompany () {
            String company = randomString10values();
            System.out.println(company);
            Company.sendKeys(company);
            Company.getText();
    }

        public void FillCompanyName() {
           String companyName = randomString10values();
           System.out.println(companyName);
            CompanyName.sendKeys(companyName);
            Company.getText();
    }

        public  String randomString10values() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string
            int index = (int) (rnd.nextFloat() * chars.length());
            salt.append(chars.charAt(index));
        }
        String any = salt.toString();//generating a random string
        return any;
    }

        public void ClickAllowSelfAdmin() {
        AllowSelfAdmin.click();
    }

    public void FillPaymentImportMethod(String value) {
        PaymentImportMethod.clear();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        PaymentImportMethod.sendKeys(value); //usually the best option to fill in 'Any Workflow'
    }
        public void FillDataRetentionPS(String dataRetention) {
        DataRetentionPS.sendKeys(dataRetention);
    }

        public void FillMaxNumberPS(String maxNumDays) {
        MaxNumberPS.clear();
        MaxNumberPS.sendKeys(maxNumDays);
    }
        public void FillDataRetentionIR (String dataRetention) {
        DataRetentionIR.sendKeys(dataRetention);
    }
        public void FillMaxNumberIR (String maxNumDays) {
        MaxNumberIR.clear();
        MaxNumberIR.sendKeys(maxNumDays);
    }
        public void ClickSave () {
        Save.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
