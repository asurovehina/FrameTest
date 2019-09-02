package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;
//public class ClientUser extends ClientRole {
//    public void UserCreation() throws InterruptedException{
//        super.CompanyEntitlDev1(); //CHANGE TO COMPANYROLECREATION !!!
//        driver.findElement(By.xpath("(//span[@class='button-label'][contains(.,'View')])[10]")).click();//click in the Admin Client user
//        Thread.sleep(5000);
//        Set<String> handles = driver.getWindowHandles();
//        String currentHandle = driver.getWindowHandle();
//        for (String handle : handles) {
//
//            if (!handle .equals(currentHandle))
//            {
//                driver.switchTo().window(handle);
//            }
//        }
//
//        //fill your form in the other tab
//        driver.findElement(By.xpath("//button[@type='button'][contains(.,'Add New User')]")).click(); //click 'add new user'
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//b[contains(@role,'presentation')])[1]")).click();
//        Thread.sleep(3000);
//        WebElement element3 = driver.findElement(By.xpath("//input[contains(@class,'select2-input select2-focused')]"));
//        element3.click();
//        element3.sendKeys(company);
//        Thread.sleep(2000);
//        element3.sendKeys(Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]/button[1]")).click(); //click the button 'Continue'
//        Thread.sleep(3000);
//        //осталось заполнить юзера детали и роль ему прибацать, роль - это драг энд дроп
//       // String userName = getSaltString();
//
////        driver.findElement(By.xpath("//*[@id=\"roleName\"]")).sendKeys(userName);
////        String roleDesc = getSaltString();
////        driver.findElement(By.xpath("//*[@id=\"roleDesc\"]")).sendKeys(roleDesc);
////        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]/button[1]")).click();
////        Thread.sleep(5000);
//        //go back to first tab
//        //driver.switchTo().window(currentHandle);
//    }
//}
