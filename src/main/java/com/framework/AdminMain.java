package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminMain {
    public static WebElement element = null;

    public static WebElement menu (WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"main-menu-link\"]"));
        return element; //menu button
    }
//    public static void clickMenu(WebDriver driver) {
//        element = menu(driver);
//        element.click();
//    }
}
