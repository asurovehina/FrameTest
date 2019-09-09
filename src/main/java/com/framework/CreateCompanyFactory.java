package com.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class CreateCompanyFactory {
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

    @FindBy(xpath = "//*[@id=\"PAYDAYSAVAIL\"]")
    WebElement MaxNumberPS;

    @FindBy(xpath = "//*[@id=\"DAYSAVAIL\"]")
    WebElement DataRetentionIR;

    @FindBy(xpath = "//*[@id=\"MAXDAYS\"]")
    WebElement MaxNumberIR;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/div[1]/ul/li[1]/button/span\"")
    WebElement Save;

        public void FillCompany (String company) {
        Company.sendKeys(company);
    }

        public void FillCompanyName(String companyName) {
        Company.sendKeys(companyName);
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
        public void FillPaymentImportMethod(String value) throws InterruptedException {
        PaymentImportMethod.clear();
        PaymentImportMethod.wait(2000);
        PaymentImportMethod.sendKeys(value); //usually the best option to fill in 'Any Workflow'
    }
        public void FillDataRetentionPS(String dataRetention) {
        DataRetentionIR.sendKeys(dataRetention);
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
    }
}
