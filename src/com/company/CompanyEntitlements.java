package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.function.Function;

public class CompanyEntitlements extends CompanyCreation {
    public static Function<WebDriver, WebElement> presenceOfElementLocated(final By locator) {
        return new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        };
    }

    public void ClickAllCheckBoxes () {
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        WebDriverWait wait = new WebDriverWait(driver, 5);

// while the following loop runs, the DOM changes -
// page is refreshed, or element is removed and re-added
        for (WebElement el : checkboxes) {
            if (!el.isSelected()) {
                el.click();
            }
            wait.until(presenceOfElementLocated(By.xpath("//input[@type='checkbox']")));
        }


    }
    public void CompanyEntitlDev1() throws InterruptedException {
        super.CreateCompanyDev1();
        driver.findElement(By.xpath("(//span[@class='button-label'][contains(.,'Modify')])[2]")).click();//clicking the option 'Client Entitlements'
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[contains(@id,'tabContainer_tablist_DivPAY_CheckBox')]")).click(); //click the check-box All 'Payments and Transfers'
        driver.findElement(By.xpath("//input[contains(@id,'tabContainer_tablist_DivBOS_CheckBox')]")).click(); //click the check-box All 'Business Operating System'
        driver.findElement(By.xpath("//input[contains(@id,'tabContainer_tablist_DivGIR_CheckBox')]")).click(); //click the check-box All 'Information Reporting'
        driver.findElement(By.xpath("//input[contains(@id,'tabContainer_tablist_DivCM_CheckBox')]")).click(); //click the check-box All 'Positive Pay'
        driver.findElement(By.xpath("//input[contains(@id,'tabContainer_tablist_DivACCTINT_CheckBox')]")).click(); //click the check-box All 'Accounting Package Integration'
        driver.findElement(By.xpath("//input[contains(@id,'tabContainer_tablist_Div_ADMIN_CheckBox')]")).click(); //click the check-box All'Administration'
        driver.findElement(By.xpath("//input[contains(@id,'tabContainer_tablist_Div_UTIL_CheckBox')]")).click(); //click the check-box All 'Utilities'
        driver.findElement(By.xpath("//input[contains(@id,'tabContainer_tablist_DivRISK_CheckBox')]")).click(); //click the check-box All 'Electronic Payment Positive Pay'
        driver.findElement(By.xpath("//input[contains(@id,'tabContainer_tablist_DivSSOOUT_CheckBox')]")).click(); //click the button check-box All 'Outbound SSO'
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[1]/ul/li[1]/button/span")).click();//save
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@tabindex,'0')]")).click(); //close the successful message
        Thread.sleep(3000);


    }
}
