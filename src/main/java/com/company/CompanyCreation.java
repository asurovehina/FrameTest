package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.Random;

public class CompanyCreation extends AdminLoginPage{
public String  company;
public String companyName;


   protected String getSaltString() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string
            int index = (int) (rnd.nextFloat() * chars.length());
            salt.append(chars.charAt(index));
        }
        String saltStr = salt.toString();//generating a random string
        return saltStr;
    }

    public void CreateCompanyDev1 () throws InterruptedException {
        super.ChromeLoginDev1();
        driver.findElement(By.xpath("//*[@id=\"main-menu-link\"]")).click(); //clicking the menu button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@data-bt-itemrequestparams,'filterID=15151')]")).click();//opening a company page
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"btnAdd-act\"]/span")).click(); //clicking the button 'add'
        Thread.sleep(5000);
        company = getSaltString();
        System.out.println(company);
        driver.findElement(By.xpath("//*[@id=\"UserGroup\"]")).sendKeys(company); //fill in the company by a random string
        Thread.sleep(3000);
       companyName = getSaltString();
        System.out.println(companyName);
       driver.findElement(By.xpath("//*[@id=\"GroupName\"]")).sendKeys(companyName); //fill in the company name
        driver.findElement(By.xpath("//*[@id=\"allowSelfAdministration\"]")).click(); // enable self-administration
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1600)"); //scroll to the end of the page
        //driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/div/div[2]/form/div[1]/div[38]/div[2]/div/div[1]/div[1]/div/div/div[1]/input")).clear();
        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"PaymentImportMethod\"]"));
        //Thread.sleep(3000);
        inputField.clear();
        //Thread.sleep(3000);
        inputField.sendKeys("Any Workflow");
        inputField.sendKeys(Keys.ENTER);
       // Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"PAYDAYSAVAIL\"]")).sendKeys("30"); //payment settings: fill in data retention option
        driver.findElement(By.xpath("//*[@id=\"PAYMAXDAYS\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"PAYMAXDAYS\"]")).sendKeys("30");// payment settings: fill in 'Maximum number of days'
        driver.findElement(By.xpath("//*[@id=\"DAYSAVAIL\"]")).sendKeys("30"); // information reporting settings: fill in data retention option
        driver.findElement(By.xpath("//*[@id=\"MAXDAYS\"]")).sendKeys("30"); //  information reporting settings: fill in 'Maximum number of days'
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[1]/ul/li[1]/button/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"confirmation_closeButton\"]")).click(); //close the successful message
        Thread.sleep(3000);
    }

    }
