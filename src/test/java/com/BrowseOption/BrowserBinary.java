package com.BrowseOption;

import com.config.BrowserConfig;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;

public class BrowserBinary extends BrowserConfig {
    public static void main(String[] args)
    {
        setBinary();
    }

    public static void setBinary()
    {
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        FirefoxOptions firefoxobj = new FirefoxOptions();
        firefoxobj.setBinary(new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe")));
        driver = new FirefoxDriver();
        driver.get("https://google.com");
    }
}
