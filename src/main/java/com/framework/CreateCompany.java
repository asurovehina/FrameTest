package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class CreateCompany {
    public static WebElement element = null;

    public static WebElement Company(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"UserGroup\"]"));
        return element;
    }
    public static void FillCompany (WebDriver driver, String Company) {
        element = Company(driver);
        element.click();
    }
    public static WebElement CompanyName(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"GroupName\"]"));
        return element;
    }
    public static void FillCompanyName (WebDriver driver, String CompanyName) {
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
    public static WebElement AllowSelfAdmin (WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"allowSelfAdministration\"]"));
        return element;
    }
    public static void ClickAllowSelfAdmin (WebDriver driver) {
        element = AllowSelfAdmin(driver);
        element.click();
    }
}
