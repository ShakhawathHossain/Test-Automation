package com.OpenCart;

import com.config.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Registration extends BrowserConfig {
    public static void main(String[] args) {
        firefoxLaunch();
        //TC_001_Valid();
        TC_002_InValid();
    }

    public static void TC_001_Valid()
    {
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.sendKeys("Mr.");

        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.sendKeys("E");

        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("user404@gmail.com");

        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("01369852470");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("abc123");

        WebElement Confirm = driver.findElement(By.id("input-confirm"));
        Confirm.sendKeys("abc123");

        WebElement Privacy = driver.findElement(By.name("agree"));
        Privacy.click();

        WebElement Continue = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
        Continue.click();

        WebElement Logout = driver.findElement(By.linkText("Logout"));
        Logout.click();

    }

    public static void TC_002_InValid()
    {
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.sendKeys("&%");

        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.sendKeys("#$");

        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("user100@");

        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("01369852478");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("123abc");

        WebElement Confirm = driver.findElement(By.id("input-confirm"));
        Confirm.sendKeys("123abc");

        WebElement Privacy = driver.findElement(By.name("agree"));
        Privacy.click();

        WebElement Continue = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
        Continue.click();

        WebElement Logout = driver.findElement(By.linkText("Logout"));
        Logout.click();

    }

}
