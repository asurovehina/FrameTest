package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateCompany {
    public static WebElement element = null;

    public static WebElement Company(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"UserGroup\"]"));
        return element;
    }

    public static WebElement CompanyName(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"GroupName\"]"));
        return element;
    }

    public static WebElement AllowSelfAdmin(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"allowSelfAdministration\"]"));
        return element;
    }

    public static WebElement PaymentImportMethod(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"PaymentImportMethod\"]"));
        return element;
    }

    public static WebElement DataRetentionPS(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"PAYDAYSAVAIL\"]")); //DataRetention in Payment Settings section
        return element;
    }

    public static WebElement MaxNumberPS(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"PAYDAYSAVAIL\"]")); //Max number of Days in Payment Settings section
        return element;
    }

    public static WebElement DataRetentionIR(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"DAYSAVAIL\"]")); //DataRetention in Inform Reporting section
        return element;
    }

    public static WebElement MaxNumberIR (WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"MAXDAYS\"]")); //Max number of Days in Inform Reporting section
        return element;
    }

    public static WebElement Save (WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[1]/ul/li[1]/button/span\""));
        return element;
    }
}
