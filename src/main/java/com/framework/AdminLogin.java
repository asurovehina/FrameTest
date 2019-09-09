package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLogin {
    public static WebElement element = null;

    public static WebElement userGroup(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='corpID']"));
        return element; //usergroup field
    }
    public static void fillUserGroup (WebDriver driver, String userGroup) {
        element = userGroup(driver);
        element.sendKeys(userGroup);
    }

    public static WebElement userID(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='userID']"));
        return element; //userID field
    }

    public static void fillUserID (WebDriver driver, String userID) {
        element = userID(driver);
        element.sendKeys(userID);
    }

    public static WebElement password(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='password']"));
        return element; //password field
    }

    public static void fillPassword (WebDriver driver, String passwordValue) {
        element = password(driver);
        element.sendKeys(passwordValue);
    }

}
