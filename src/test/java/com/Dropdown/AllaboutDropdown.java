package com.Dropdown;

import com.config.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AllaboutDropdown extends BrowserConfig {
    public static void main(String[] args) {
        firefoxLaunch();
        openTestURL("https://the-internet.herokuapp.com/javascript_alerts");

    }
    public static void selectOptionbyIndex()
    {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select obj = new Select(dropdown);
        obj.selectByIndex(1);
    }

    public static void selectOptionbyValue()
    {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select obj = new Select(dropdown);
        obj.selectByValue("1");
    }

    public static void selectOptionbyVisibleText()
    {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select obj = new Select(dropdown);
        obj.selectByVisibleText("Option 1");
    }
}
