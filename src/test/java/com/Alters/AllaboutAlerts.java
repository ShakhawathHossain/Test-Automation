package com.Alters;

import com.config.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllaboutAlerts extends BrowserConfig {
    public static void main(String[] args) {
        firefoxLaunch();
        openTestURL("https://the-internet.herokuapp.com/javascript_alerts");
        normalAlert();
    }

    public static void normalAlert()
    {
        //WebElement normal_alert = driver.findElement(By.cssSelector(".example > ul:nth-child(3) > li:nth-child(1) > button:nth-child(1)"));
        /*WebElement normal_alert = elementByCSS(".example > ul:nth-child(3) > li:nth-child(1) > button:nth-child(1)");
        normal_alert.click();*/

        getelementByCSSandselect(".example > ul:nth-child(3) > li:nth-child(1) > button:nth-child(1)");

        driver.switchTo().alert().accept();


    }

    public static void confirmAlert()
    {

    }

    public static void prompAlert()
    {

    }
}
