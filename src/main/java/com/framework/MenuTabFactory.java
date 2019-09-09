package com.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuTabFactory {
    @FindBy(xpath ="//a[contains(@data-bt-itemrequestparams,'filterID=15151')]")
    WebElement CompanyEl;

    public void ClickCompanyEl() {
        CompanyEl.click();
    }
}
