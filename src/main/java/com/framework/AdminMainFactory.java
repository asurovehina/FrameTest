package com.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminMainFactory {
    @FindBy(xpath = "//*[@id=\"main-menu-link\"]")
    WebElement menu;

    public void ClickMenu () {
        menu.click();
    }
}
