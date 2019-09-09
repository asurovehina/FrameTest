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

    public static WebElement userID(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='userID']"));
        return element; //userID field
    }

    public static WebElement password(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='password']"));
        return element; //password field
    }

}
