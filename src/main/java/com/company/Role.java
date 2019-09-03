package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.util.Set;

@Test
public class Role extends ClientEntitlements {

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
        //fill form in the other tab
        driver.findElement(By.xpath("//button[@type='button'][contains(.,'Add New Role')]")).click();
        Thread.sleep(3000);
        String roleName = getSaltString();
        driver.findElement(By.xpath("//*[@id=\"roleName\"]")).sendKeys(roleName);
        String roleDesc = getSaltString();
        driver.findElement(By.xpath("//*[@id=\"roleDesc\"]")).sendKeys(roleDesc);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]/button[1]")).click();
        Thread.sleep(7000);
        //giving entitl to the created role
        ClickSelectAll();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath("//button[@type='button'][contains(.,'Continue')]")).click(); //click the button continue
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@type='button'][contains(.,'Transfer')]")).click(); // go to Transfers Tab
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,1600)");
        ClickSelectAll();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/section/div[2]/ul/li[2]/a")).click(); //go to the tab Reporting
        Thread.sleep(3000);
        ClickSelectAll();
        Thread.sleep(3000);
        ClickSelectAll();
        driver.findElement(By.xpath("//a[@class='NavTabs-link btn btn-tertiary'][contains(.,'Administration')]")).click();//go to the tab administration
        Thread.sleep(2000);
        ClickSelectAll();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='button'][contains(.,'Add Role')]")).click(); //role created but in entered status, it needs to be approved
        Thread.sleep(3000);
        driver.quit();
        //login by another user
        ChromeLoginDev1User2();
        driver.findElement(By.xpath("//*[@id=\"main-menu-link\"]")).click(); //clicking the menu button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@data-bt-itemrequestparams,'filterID=15151')]")).click(); //opening a company page
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='quickSearchTextBox']")).sendKeys(company);
        driver.findElement(By.xpath("//span[@class='headerLinks'][contains(.,'Go')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@id,'lv-cmenu-0')]")).click();
        driver.findElement(By.xpath("//td[@class='dijitReset dijitMenuItemLabel'][contains(@id,'text')][contains(.,'VIEW')]")).click(); //found created company
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[@class='button-label'][contains(.,'View')])[9]")).click(); //clicking the Role View button
        Thread.sleep(5000);
        Set<String> handles2 = driver.getWindowHandles();
        String currentHandle2 = driver.getWindowHandle();
        for (String handle : handles2) {
            if (!handle.equals(currentHandle2)) {
                driver.switchTo().window(handle);
            }
        }
        driver.findElement(By.xpath("//*[@id=\"select-all-checkbox-view566\"]")).click(); //select the role
        driver.findElement(By.xpath("//*[@id=\"complete\"]/button[1]")).click(); //click Update
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]/button[1]")).click(); //click Yes
        Thread.sleep(2000);
        driver.switchTo().window(currentHandle2);
    }
}





