package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompanyMain {
    public static WebElement element = null;

    public static WebElement FilterCompany(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='quickSearchTextBox']"));
        return element; //filter field
    }
    public static WebElement GoButton (WebDriver driver) {
        element = driver.findElement(By.xpath("//span[@class='headerLinks'][contains(.,'Go')]"));
        return element; //filter field
    }
    public static WebElement Actions  (WebDriver driver) {
        element = driver.findElement(By.xpath("//button[contains(@id,'lv-cmenu-0')]"));
        return element;
    }

    public static WebElement ActionsView  (WebDriver driver) {
        element = driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel'][contains(@id,'text')][contains(.,'VIEW')]"));
        return element;
    }
    public static WebElement Add  (WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"btnAdd-act\"]/span"));
        return element;
    }
}

