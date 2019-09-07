package com.company.client;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

@Test
public class ClientBank extends ClientLogin {
    public void BankCreation () throws InterruptedException {
        //ClientUserLogin();
        ChromeConfig();
        driver.get(ClientDev1);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"a11y-realm\"]")).sendKeys("alesiacheck");
        driver.findElement(By.xpath("//*[@id=\"a11y-username\"]")).sendKeys("autouse");
        driver.findElement(By.xpath("//*[@id=\"a11y-password\"]")).sendKeys("Password1");
        driver.findElement(By.xpath("//*[@id=\"login-action-submit\"]/span")).click();
        Thread.sleep(2000);//login first time
        driver.findElement(By.xpath("//*[@id=\"gmp-ADMINSTRATION\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div/header/div/div[2]/div/nav/ul/li[5]/ul/li[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[1]/button")).click(); //add a new bank
        Thread.sleep(2000);
        String bankName = getSaltString();
        driver.findElement(By.xpath("//*[@id=\"input-0\"]")).sendKeys(bankName);
        String aba = "011000015";
        driver.findElement(By.xpath("//*[@id=\"input-1\"]")).sendKeys(aba);
        driver.findElement(By.xpath("document.querySelector(\"#input-5\")")).sendKeys(aba);
        driver.findElement(By.xpath("//*[@id=\"input-2\"]")).sendKeys(aba);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/form/div[2]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/ul/li[2]/a/span")).click(); //go to tab accounts
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[1]/button")).click(); //add new account
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[2]/div/div[2]/form/div/div/div/div/div/span")).click(); //open the bank dropdown
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[2]/div/div[2]/form/div/div/div/div/div/div/input")).sendKeys(bankName);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[2]/div/div[2]/form/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[2]/div/div[3]/button[1]")).click();
        Thread.sleep(2000);
        int account = 010203040;
        driver.findElement(By.xpath("//*[@id=\"input-10\"]")).sendKeys(String.valueOf(account));
        String accName = getSaltString();
        driver.findElement(By.xpath("//*[@id=\"input-12\"]")).sendKeys(accName);
        driver.findElement(By.xpath("//*[@id=\"input-52\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"input-57\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/form/div[3]/div/button[1]")).click();
        Thread.sleep(2000);



    }
}
