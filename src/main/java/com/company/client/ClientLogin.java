package com.company.client;

import com.company.BrowserConfig;
import com.company.ClientUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ClientLogin extends ClientUser {

    public void ClientUserLogin() throws InterruptedException {
        UserCreation();
        driver.quit();
        ChromeConfig();
        driver.get(ClientDev1);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"a11y-realm\"]")).sendKeys(company);
        driver.findElement(By.xpath("//*[@id=\"a11y-username\"]")).sendKeys(userId);
        driver.findElement(By.xpath("//*[@id=\"a11y-password\"]")).sendKeys("Password0");
        driver.findElement(By.xpath("//*[@id=\"login-action-submit\"]/span")).click();
        Thread.sleep(2000);//login first time`
        driver.findElement(By.xpath("//*[@id=\"a11y-old-password\"]")).sendKeys("Password0");
        driver.findElement(By.xpath("//*[@id=\"a11y-new-password\"]")).sendKeys("Password1");
        driver.findElement(By.xpath("//*[@id=\"a11y-confirm-password\"]")).sendKeys("Password1");
        driver.findElement(By.xpath("//*[@id=\"complete\"]/button[1]")).click();
        Thread.sleep(3000);
    }
}
