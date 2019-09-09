package com.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyMainFactory {
    @FindBy(xpath = "//input[@id='quickSearchTextBox']")
    WebElement FilterCompany;

    @FindBy(xpath = "//span[@class='headerLinks'][contains(.,'Go')]")
    WebElement GoButton;

    @FindBy(xpath = "//button[contains(@id,'lv-cmenu-0')]")
    WebElement Actions;

    @FindBy(xpath = "//td[@class='dijitReset dijitMenuItemLabel'][contains(@id,'text')][contains(.,'VIEW')]")
    WebElement ActionsView;

    @FindBy(xpath = "//*[@id=\"btnAdd-act\"]/span")
    WebElement Add;

    public void fillFilterCompany  (String Company) {
        FilterCompany.sendKeys(Company);
    }
        public void ClickGoButton() {
        GoButton.click();
    }
        public void ClickActions() {
        Actions.click();
    }
        public void ClickActionsView () {
        ActionsView.click();
    }
        public void ClickAdd () {
        Add.click();
    }
}
