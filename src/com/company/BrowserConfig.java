package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserConfig {
    public String AdminDev1 = "https://pcm-dev1-fi9001-web01.saas-n.com/admin/pcm/";
    public String AdminQa1 = "https://pcm-qa1-fi9001-web01.saas-n.com/admin/pcm/";
    public String ClientQa1 = "https://pcm-qa1-fi9001-web01.saas-n.com/ui/";
    public String ClientDev1 = "https://pcm-dev1-fi9001-web01.saas-n.com/ui/";
    WebDriver driver;
    public void ChromeConfig() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Olesia.Surovehina\\Desktop\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    public void FirefoxConfig() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Olesia.Surovehina\\Desktop\\selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
    }
}
