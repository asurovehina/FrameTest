package com.company.client;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.NoInjection;
import org.testng.annotations.Test;

@Test
public class ClientBank extends ClientLogin {
    public String bankName;
    public void BankCreation () throws InterruptedException {
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
        bankName = getSaltString();
        driver.findElement(By.xpath("//*[@id=\"input-0\"]")).sendKeys(bankName);
        String aba = "011000015";
        driver.findElement(By.xpath("//*[@id=\"input-1\"]")).sendKeys(aba);
        driver.findElement(By.xpath("//*[@id=\"input-5\"]")).sendKeys(aba);
        driver.findElement(By.xpath("//*[@id=\"input-2\"]")).sendKeys(aba);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/form/div[2]/div/button[1]")).click();
        Thread.sleep(2000);
    }
    public void CreateAccount () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/ul/li[2]/a/span")).click(); //go to tab accounts
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[1]/button")).click(); //add new account
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[2]/div/div[2]/form/div/div/div/div/div/span/div[1]/div/ul[1]/li/span")).click(); //open the bank dropdown
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[2]/div/div[2]/form/div/div/div/div/div/div/input")).sendKeys(bankName);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[2]/div/div[2]/form/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[2]/div/div[3]/button[1]")).click();
        Thread.sleep(2000);
         int accountNumber = 010203040;
        driver.findElement(By.xpath("//*[@id=\"input-10\"]")).sendKeys(String.valueOf(accountNumber));
        String accName = getSaltString();
        driver.findElement(By.xpath("//*[@id=\"input-12\"]")).sendKeys(accName);
        driver.findElement(By.xpath("//*[@id=\"input-29\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"input-24\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/form/div[2]/div/button[1]")).click();
        Thread.sleep(2000);
    }
}
