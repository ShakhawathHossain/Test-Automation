package com.BrowseOption;

import com.OpenCart.Login;
import com.config.BrowserConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessTest extends BrowserConfig {

    public static void main(String[] args)
    {
        Firefoxbrowserheadless();
    }

    public static void Firefoxbrowserheadless()
    {
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        FirefoxOptions firefoxobj = new FirefoxOptions();
        firefoxobj.setHeadless(true);
        driver = new FirefoxDriver(firefoxobj);
        Login.TC_001_Valid();

    }
}
