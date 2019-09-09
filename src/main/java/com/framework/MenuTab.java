package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuTab {
    public static WebElement element = null;

    public static WebElement CompanyEl (WebDriver driver) {
        element = driver.findElement(By.xpath("//a[contains(@data-bt-itemrequestparams,'filterID=15151')]"));
        return element;
    }
//    public static void ClickCompanyEl(WebDriver driver) {
//        element = driver.findElement(By.xpath("//a[contains(@data-bt-itemrequestparams,'filterID=15151')]"));
//        element.click();
//    }
    // *Could be another options e.g. Client Role, Client User etc.*
}
