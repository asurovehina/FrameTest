package com.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginFactory {
    @FindBy(xpath = "//input[@id='corpID']")
    WebElement userGroup;

    @FindBy(xpath = "//input[@id='userID']")
    WebElement userID;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    public void fillUserGroup (String userGr) {
       userGroup.sendKeys(userGr);
    }
    public void fillUserID (String user) {
        userID.sendKeys(user);
    }
    public void fillPassword (String passwordValue) {
        password.sendKeys(passwordValue);
    }
}
