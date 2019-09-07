package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Set;

@Test
public class ClientUser extends Role {
    public String userId;
    public String userName;
    public String UserCreation() throws InterruptedException{
        CreateClientRole();
        driver.findElement(By.xpath("(//span[@class='button-label'][contains(.,'View')])[10]")).click();//click in the Admin Client user
        Thread.sleep(5000);
        Set<String> handles = driver.getWindowHandles();
        String currentHandle = driver.getWindowHandle();
        for (String handle : handles) {

            if (!handle .equals(currentHandle))
            {
                driver.switchTo().window(handle);
            }
        }
        //fill your form in the other tab
        driver.findElement(By.xpath("//button[@type='button'][contains(.,'Add New User')]")).click(); //click 'add new user'
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//b[contains(@role,'presentation')])[1]")).click();
        Thread.sleep(3000);
        WebElement element3 = driver.findElement(By.xpath("//input[contains(@class,'select2-input select2-focused')]"));
        element3.click();
        element3.sendKeys(company);
        Thread.sleep(2000);
        element3.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]/button[1]")).click(); //click the button 'Continue'
        Thread.sleep(3000);
        //осталось заполнить юзера детали и роль ему прибацать
        userId = getSaltString();
        driver.findElement(By.xpath("//*[@id=\"USERID\"]")).sendKeys(userId);
        userName = getSaltString();
        driver.findElement(By.xpath("//*[@id=\"USERNAME\"]")).sendKeys(userName);
        String firstName = getSaltString();
        driver.findElement(By.xpath("//*[@id=\"FIRSTNAME\"]")).sendKeys(firstName);
        String lastName = getSaltString();
        driver.findElement(By.xpath("//*[@id=\"LASTNAME\"]")).sendKeys(lastName);
        String email =  getSaltString() + "@gmail.com";
        driver.findElement(By.xpath("//*[@id=\"EMAILADDRESS\"]")).sendKeys(email);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).sendKeys("Password0");
        driver.findElement(By.xpath("//*[@id=\"CONFIRMPASSWORD\"]")).sendKeys("Password0");
        driver.findElement(By.xpath("//*[@id=\"LEGALADMIN\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/section/div[1]/ul/li[2]/a")).click(); //go to tab assign role
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/section/div[2]/div[2]/div/div[2]/div/section[1]/div/button[2]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/section/div[2]/div[4]/button[1]")).click();
        //click the button add user
        Thread.sleep(2000);
        //user is in approved status, needs to be approved
        driver.quit();
        ChromeLoginDev1();
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
        driver.findElement(By.xpath("//*[@id=\"viewUserGroupUser\"]/span")).click(); //clicking the User View button
        Thread.sleep(5000);
        Set<String> handles3 = driver.getWindowHandles();
        String currentHandle3 = driver.getWindowHandle();
        for (String handle : handles3) {
            if (!handle.equals(currentHandle3)) {
                driver.switchTo().window(handle);
            }
        }
        driver.findElement(By.xpath("//*[@id=\"select-all-checkbox-view609\"]")).click(); //select the user
        driver.findElement(By.xpath("//*[@id=\"complete\"]/button[1]")).click(); //click Approve
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]/button[1]")).click(); //click Yes
        Thread.sleep(2000);
        return userId;
        //driver.quit();
    }
}
