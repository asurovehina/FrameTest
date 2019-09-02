package com.company;

import org.openqa.selenium.By;

public class AdminLoginPage extends BrowserConfig {
    private String adminUserGroup = "cbao";
    private String adminUser = "sysadmin1";
    private String adminUser2 = "sysadmin2";
    private String adminPassw = "Password1";

    public void ChromeLoginDev1() {
        super.ChromeConfig();
       driver.get(AdminDev1);
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//input[@id='corpID']")).sendKeys(adminUserGroup);
       driver.findElement(By.xpath("//input[@id='userID']")).sendKeys(adminUser);
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys(adminPassw);
       driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[3]/div/div/div/div[1]/a/span")).click();
       driver.findElement(By.xpath("//*[@id='homeLink']"));
       //driver.quit();
    }
    public void ChromeLoginDev1User2() {
        super.ChromeConfig();
        driver.get(AdminDev1);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='corpID']")).sendKeys(adminUserGroup);
        driver.findElement(By.xpath("//input[@id='userID']")).sendKeys(adminUser2);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(adminPassw);
        driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[3]/div/div/div/div[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@id='homeLink']"));
        //driver.quit();
    }
//    public void FFLoginDev1() {
//        super.FirefoxConfig();
//        driver.get(AdminDev1);
//        driver.findElement(By.xpath("//input[@id='corpID']")).sendKeys(adminUserGroup);
//        driver.findElement(By.xpath("//input[@id='userID']")).sendKeys(adminUser);
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(adminPassw);
//        driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[3]/div/div/div/div[1]/a/span")).click();
//        driver.findElement(By.xpath("//*[@id='homeLink']"));
//        driver.quit();
//    }
//    public void ChromeLoginQA1() {
//        super.ChromeConfig();
//        driver.get(AdminQa1);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //waiting some time
//        driver.findElement(By.xpath("//input[@id='corpID']")).sendKeys(adminUserGroup);
//        driver.findElement(By.xpath("//input[@id='userID']")).sendKeys(adminUser);
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(adminPassw);
//        driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[3]/div/div/div/div[1]/a/span")).click();
//        driver.findElement(By.xpath("//*[@id='homeLink']"));
//        driver.quit();
//    }
//    public void FFLoginQa1() {
//        super.FirefoxConfig();
//        driver.get(AdminQa1);
//
//        driver.findElement(By.xpath("//input[@id='corpID']")).sendKeys(adminUserGroup);
//        driver.findElement(By.xpath("//input[@id='userID']")).sendKeys(adminUser);
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(adminPassw);
//        driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[3]/div/div/div/div[1]/a/span")).click();
//        driver.findElement(By.xpath("//*[@id='homeLink']"));
//        driver.quit();
//    }
   }

