package com.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyPageFactory {
    @FindBy(xpath = "//*[@id=\"modifyUserGroupDetail\"]/span")
    WebElement ClientCompanyModify;

    @FindBy(xpath = "//*[@id=\"modifyUserGroupEntitlements\"]/span")
    WebElement ClientEntitlements;
        public void ClickClientCompanyModify () {
        ClientCompanyModify.click();
    }
        public void ClickClientEntitlements () {
        ClientEntitlements.click();
    }
}
