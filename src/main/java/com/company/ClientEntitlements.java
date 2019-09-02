package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


public class ClientEntitlements extends CompanyCreation {

    public void ClickAllCheckBoxes () {
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement el : checkboxes) {
                if (!el.isSelected()) {
                    el.click();
                }
        }
    }

    public void ClickSelectAll () {
        List<WebElement> checkboxesSelectAll = driver.findElements(By.xpath("//input[contains(@id,'selectAll')]"));
        for (WebElement el1 : checkboxesSelectAll) {
            if (!el1.isSelected()) {
                el1.click();
            }
        }
    }
    public void ClickAssignAll () {
        List<WebElement> checkboxesAssignAll = driver.findElements(By.xpath("//input[contains(@id,'assignAll')]")); //because of difference between  id names
        for (WebElement el2 : checkboxesAssignAll) {
            if (!el2.isSelected()) {
                el2.click();
            }
        }
    }

    public void CompanyEntitlDev1() throws InterruptedException {
        super.CreateCompanyDev1();
        driver.findElement(By.xpath("(//span[@class='button-label'][contains(.,'Modify')])[2]")).click();//clicking the option 'Client Entitlements'
        Thread.sleep(3000);
        ClickAllCheckBoxes();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[1]/ul/li[1]/button/span")).click();//save
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@tabindex,'0')]")).click(); //close the successful message
        Thread.sleep(3000);
    }
}
