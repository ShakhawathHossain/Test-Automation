package com.Navigation;

import com.OpenCart.Registration;
import com.config.BrowserConfig;

public class Navigationtest extends BrowserConfig {
    public static void main(String[] args) {
        firefoxLaunch();
        openTestURL("https://demo.opencart.com/");
        navigateTO();
        Registration.TC_001_Valid();
        navigateBack();
        navigateForward();
        //navigateRefresh();

    }

    public static void navigateTO()
    {
        driver.navigate().to("https://demo.opencart.com/index.php?route=account/register");
        System.out.println("Navigate TO: "+driver.getTitle());
    }

    public static void navigateBack()
    {
        driver.navigate().back();
        System.out.println("Navigate Back TO: "+driver.getTitle());
    }

    public static void navigateForward()
    {
        driver.navigate().forward();
        System.out.println("Navigate Forward TO: "+driver.getTitle());
    }

    public static void navigateRefresh()
    {
        driver.navigate().refresh();
    }
}
