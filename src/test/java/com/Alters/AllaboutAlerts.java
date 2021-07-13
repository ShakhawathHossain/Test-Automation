package com.Alters;

import com.config.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllaboutAlerts extends BrowserConfig {
    public static void main(String[] args) {
        firefoxLaunch();
        openTestURL("https://the-internet.herokuapp.com/javascript_alerts");
        normalAlert();
        confirmAlert();
        prompAlert();
    }

    public static void normalAlert()
    {
        //WebElement normal_alert = driver.findElement(By.cssSelector(".example > ul:nth-child(3) > li:nth-child(1) > button:nth-child(1)"));
        /*WebElement normal_alert = elementByCSS(".example > ul:nth-child(3) > li:nth-child(1) > button:nth-child(1)");
        normal_alert.click();*/

        getelementByCSSandselect(".example > ul:nth-child(3) > li:nth-child(1) > button:nth-child(1)");

        //driver.switchTo().alert().accept();
        alertAccept();

    }

    public static void confirmAlert()
    {
        getelementByCSSandselect(".example > ul:nth-child(3) > li:nth-child(2) > button:nth-child(1)");
        alertCancel();

    }

    public static void prompAlert()
    {
        getelementByCSSandselect(".example > ul:nth-child(3) > li:nth-child(3) > button:nth-child(1)");
        driver.switchTo().alert().sendKeys("Testing");
        alertAccept();
    }
}
