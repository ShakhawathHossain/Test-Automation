package com.OpenCart;

import com.config.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BrowserConfig {
    public static void main(String[] args) {
        firefoxLaunch();
        TC_001_Valid();
        TC_002_InValid();
        //firefoxClose();
    }
    public static void TC_001_Valid()
    {
        //Step-1: Login URL
        driver.get("https://demo.opencart.com/index.php?route=account/login");

        //Step-2: Find the web-element
        WebElement Email = driver.findElement(By.id("input-email"));
        //Step-3: Set the Input for Email
        Email.sendKeys("user101@gmail.com");

        //Step-4: Find the web-element
        WebElement Password = driver.findElement(By.id("input-password"));
        //Step-5: Set the Input for Password
        Password.sendKeys("123456");

        //Step-6: Login
        WebElement LoginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
        LoginBtn.click();

        //Logout
        WebElement Logout = driver.findElement(By.linkText("Logout"));
        Logout.click();


    }
    public static void TC_002_InValid()
    {
        //Step-1: Login URL
        driver.get("https://demo.opencart.com/index.php?route=account/login");

        //Step-2: Find the web-element
        WebElement Email = driver.findElement(By.id("input-email"));
        //Step-3: Set the Input for Email
        Email.sendKeys("user101@gmail");

        //Step-4: Find the web-element
        WebElement Password = driver.findElement(By.id("input-password"));
        //Step-5: Set the Input for Password
        Password.sendKeys("123456");

        //Step-6: Login
        WebElement LoginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
        LoginBtn.click();

    }
}
