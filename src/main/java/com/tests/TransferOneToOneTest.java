package com.tests;

import com.company.client.ClientBank;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TransferOneToOneTest extends ClientBank {
    //@BeforeMethod
    public void setupData () throws InterruptedException {
        BankCreation();
        CreateAccount(123456789);
        CreateAccount(122345678);
        CreateAccount(113456789);
        CreateAccount(123356789);
    }
    //@Test
    public void TransferCreation () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"gmp-PAYMENTS\"]")).click(); //click the payment & transfers
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div/header/div/div[2]/div/nav/ul/li[3]/ul/li[3]/a")).click(); //go to transfer management
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"TRANSFERS\"]/div")).click();
        String urlOneToOne = "https://pcm-dev1-fi9001-web01.saas-n.com/ui/PAYMENTS/addTransfer/ONE2ONE";
        driver.get(urlOneToOne);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#select2-chosen-1")).click(); //'from account' drop-down
        driver.findElement(By.cssSelector("#s2id_autogen1_search")).sendKeys("123456789");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#s2id_autogen1_search")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("#select2-chosen-2")).click(); //'to account' drop-down
        driver.findElement(By.cssSelector("#s2id_autogen2_search")).sendKeys("122345678");
        Thread.sleep(2000);//
        driver.findElement(By.cssSelector("#s2id_autogen2_search")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@class,'form-control text-right')]")).sendKeys("100");
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/section/div/div[5]/div/button")).click();
        Thread.sleep(2000);
        //adding the second one transfer
        driver.findElement(By.cssSelector("#select2-chosen-6")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#s2id_autogen6_search")).sendKeys("113456789");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#s2id_autogen6_search")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("#select2-chosen-5")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#s2id_autogen5_search")).sendKeys("123356789");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#s2id_autogen5_search")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(//input[contains(@class,'form-control text-right')])[2]")).sendKeys("110");
        driver.findElement(By.xpath("//button[@type='button'][contains(.,'Submit')]")).click();
    }
    //@AfterMethod
    public void after () {
        driver.quit();
    }
}
