package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompanyPage {
    public static WebElement element = null;

    public static WebElement ClientCompanyModify(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"modifyUserGroupDetail\"]/span"));
        return element;
    }
    public static WebElement ClientEntitlements(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"modifyUserGroupEntitlements\"]/span"));
        return element;
    }
}

