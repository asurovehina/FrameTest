package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.function.Function;

@Test
public class ClientRole extends CompanyEntitlements {
//    private static Function<WebDriver,WebElement> presenceOfElementLocated(final By locator) {
//        return new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(locator);
//            }
//        };
//    }
//
//public void ClickAllCheckBoxes () {
//    List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//    //WebDriverWait wait = new WebDriverWait(driver, 5);
//
//// while the following loop runs, the DOM changes -
//// page is refreshed, or element is removed and re-added
//   // wait.until(presenceOfElementLocated(By.xpath("//input[@type='checkbox']")));
//    for (WebElement el : checkboxes) {
//        if (!el.isSelected()) {
//            el.click();
//            //wait.until(presenceOfElementLocated(By.xpath("//input[@type='checkbox']")));
//        }
//    }
//
//
//}

    public void CreateClientRole() throws InterruptedException {
        super.CompanyEntitlDev1();

        driver.findElement(By.xpath("(//span[@class='button-label'][contains(.,'View')])[9]")).click(); //clicking the Role View button
        Thread.sleep(5000);
        Set<String> handles = driver.getWindowHandles();
        String currentHandle = driver.getWindowHandle();
        for (String handle : handles) {

            if (!handle.equals(currentHandle)) {
                driver.switchTo().window(handle);
            }
        }

        //fill your form in the other tab
        driver.findElement(By.xpath("//button[@type='button'][contains(.,'Add New Role')]")).click();
        Thread.sleep(3000);
        String roleName = getSaltString();
        driver.findElement(By.xpath("//*[@id=\"roleName\"]")).sendKeys(roleName);
        String roleDesc = getSaltString();
        driver.findElement(By.xpath("//*[@id=\"roleDesc\"]")).sendKeys(roleDesc);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]/button[1]")).click();
        Thread.sleep(7000);
        //giving entitl to the created role
       ClickAllCheckBoxes();
//        driver.findElement(By.xpath("//*[@id=\"selectAllTypes-c722\"]")).click(); //click all ACH entitl
//        driver.findElement(By.xpath("//*[@id=\"selectAllTypes-c1041\"]")).click(); //click all Bill Pay entitl
//        driver.findElement(By.xpath("//*[@id=\"selectAllTypes-c1088\"]")).click(); //click all Check entitl
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,600)");
//        driver.findElement(By.xpath("//*[@id=\"selectAllTypes-c1148\"]")).click();//click all EFT entitl
//        js.executeScript("window.scrollBy(0,1800)");
//        driver.findElement(By.xpath("//input[contains(@id,'selectAllTypes-c1323')]")).click(); //click all real time entitl
//        driver.findElement(By.xpath("//input[contains(@id,'selectAllTypes-c1370')]")).click();//click all Transfers entitl
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"selectAllTypes-c1425\"]")).click(); //click all wire entitl
        driver.findElement(By.xpath("//button[@type='button'][contains(.,'Continue')]")).click(); //click the button continue
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@type='button'][contains(.,'Transfer')]")).click(); // go to Transfers Tab
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[contains(@class,'select-all-payments')]")).click(); //assign all payment permission
        driver.findElement(By.xpath("//input[contains(@class,'select-all-templates')]")).click(); //assign all template permission
        js.executeScript("window.scrollBy(0,1500)");
        driver.findElement(By.xpath("//input[@id='assignAllChkAccts-c1405BankAccount']")).click(); //transfers from bank accounts
        driver.findElement(By.xpath("//input[contains(@id,'assignAllChkAccts-c1405BankAccountCR')]")).click(); //transfers to Bank accounts
        js.executeScript("window.scrollBy(0,1800)");
        driver.findElement(By.xpath("//input[contains(@id,'assignAllChkTemplates')]")).click(); //restricted templates
        js.executeScript("window.scrollBy(0,-1800)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/section/div[2]/ul/li[2]/a")).click(); //go to the tab Reporting
        Thread.sleep(3000);
        ClickAllCheckBoxes();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//a[@class='NavTabs-link btn btn-tertiary'][contains(.,'Risk Management')]")).click(); //go to the tab risk management
        //Thread.sleep(200);
        //ClickAllCheckBoxes();
        driver.findElement(By.xpath("//a[@class='NavTabs-link btn btn-tertiary'][contains(.,'Administration')]")).click(); //go to the tab administration
        ClickAllCheckBoxes();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[@class='NavTabs-link btn btn-tertiary'][contains(.,'Alerts')]")).click(); //go to the tab Alerts
//        ClickAllCheckBoxes();
        js.executeScript("window.scrollBy(0,-1800)");
        driver.findElement(By.xpath("//button[@type='button'][contains(.,'Add Role')]")).click();
        Thread.sleep(3000);
        driver.switchTo().window(currentHandle);
    }
}
        //go back to first tab





