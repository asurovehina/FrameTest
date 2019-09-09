package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CreateCompany {
    public static WebElement element = null;

    public static WebElement Company(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"UserGroup\"]"));
        return element;
    }

    public static void FillCompany(WebDriver driver, String Company) {
        element = Company(driver);
        element.click();
    }

    public static WebElement CompanyName(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"GroupName\"]"));
        return element;
    }

    public static void FillCompanyName(WebDriver driver, String CompanyName) {
        element = CompanyName(driver);
        element.click();
    }

    public static String randomString10values() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string
            int index = (int) (rnd.nextFloat() * chars.length());
            salt.append(chars.charAt(index));
        }
        String saltStr = salt.toString();//generating a random string
        return saltStr;
    }

    public static WebElement AllowSelfAdmin(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"allowSelfAdministration\"]"));
        return element;
    }

    public static void ClickAllowSelfAdmin(WebDriver driver) {
        element = AllowSelfAdmin(driver);
        element.click();
    }

    public static WebElement PaymentImportMethod(WebDriver driver) {
        element = driver.findElement(By.xpath("driver.findElement(By.xpath(\"//*[@id=\\\"PaymentImportMethod\\\"]\"));"));
        return element;
    }

    public static void FillPaymentImportMethod(WebDriver driver, String value) {
        element = PaymentImportMethod(driver);
        element.clear();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        ;
        element.sendKeys(value); //usually the best option to fill in 'Any Workflow'
    }

    public static WebElement DataRetentionPS(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"PAYDAYSAVAIL\"]")); //DataRetention in Payment Settings section
        return element;
    }

    public static void FillDataRetentionPS(WebDriver driver, String dataRetention) {
        element = DataRetentionPS(driver);
        element.sendKeys(dataRetention);
    }

    public static WebElement MaxNumberPS(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"PAYDAYSAVAIL\"]")); //Max number of Days in Payment Settings section
        return element;
    }

    public static void FillMaxNumberPS(WebDriver driver, String maxNumDays) {
        element = DataRetentionPS(driver);
        element.clear();
        element.sendKeys(maxNumDays);
    }

    public static WebElement DataRetentionIR(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"DAYSAVAIL\"]")); //DataRetention in Inform Reporting section
        return element;
    }

    public static void FillDataRetentionIR (WebDriver driver, String dataRetention) {
        element = DataRetentionPS(driver);
        element.sendKeys(dataRetention);
    }

    public static WebElement MaxNumberIR (WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"MAXDAYS\"]")); //Max number of Days in Inform Reporting section
        return element;
    }

    public static void FillMaxNumberIR (WebDriver driver, String maxNumDays) {
        element = DataRetentionPS(driver);
        element.clear();
        element.sendKeys(maxNumDays);
    }

    public static WebElement Save (WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[1]/ul/li[1]/button/span\""));
        return element;
    }
    public static void ClickSave (WebDriver driver) {
        element = Save(driver);
        element.click();
    }
}
