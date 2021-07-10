package com.BrowseOption;

import com.config.BrowserConfig;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSL extends BrowserConfig {
    public static void main(String[] args) {
        inSecureTest();

    }

    public static void  inSecureTest()
    {
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        FirefoxOptions firefoxobj = new FirefoxOptions();
        firefoxobj.setAcceptInsecureCerts(true);
        driver = new FirefoxDriver();
        driver.get("https://cacert.org/");
        String Title_After_Accept = driver.getTitle();
        System.out.println(Title_After_Accept);
    }
}
