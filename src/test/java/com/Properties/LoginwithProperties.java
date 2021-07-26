package com.Properties;

import com.config.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginwithProperties extends BrowserConfig {
    public static void main(String[] args) throws IOException {
        firefoxLaunch();
        TC_001_Valid();
        TC_002_InValid();
        //firefoxClose();
    }
    public static void TC_001_Valid() throws IOException {
        //Read Properties file
        FileInputStream fis = new FileInputStream("./src/test/resources/OR.properties");
        Properties po = new Properties();
        po.load(fis);

        //Step-1: Login URL
        driver.get("https://demo.opencart.com/index.php?route=account/login");

        //Step-2: Find the web-element
        WebElement Email = driver.findElement(By.id("input-email"));
        //Step-3: Set the Input for Email
        Email.sendKeys("user101@gmail.com");

        //getElementByIDandType("input-email","user101@gmail.com");

        //Step-4: Find the web-element
        WebElement Password = driver.findElement(By.id("input-password"));
        //Step-5: Set the Input for Password
        //Password.sendKeys("123456");
        Password.sendKeys(po.getProperty("Pass"));

        //Step-6: Login
        WebElement LoginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
        LoginBtn.click();

        //Logout
        /*WebElement Logout = driver.findElement(By.linkText("Logout"));
        Logout.click();*/

        String Expected_Title = "My Account";
        String Actual_Title = driver.getTitle();

        if(Expected_Title.equals(Actual_Title))
        {
            System.out.println("Test Passed for Valid Data");
            WebElement Logout = driver.findElement(By.linkText("Logout"));
            Logout.click();
        }
        else
        {
            System.out.println("Test Failed for Valid Data");
        }


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

        String Expected_Title = "My Account";
        String Actual_Title = driver.getTitle();

        if(!Expected_Title.equals(Actual_Title))
        {
            System.out.println("Test Passed for Invalid Data");
        }
        else
        {
            System.out.println("Test Failed for Invalid Data");
            WebElement Logout = driver.findElement(By.linkText("Logout"));
            Logout.click();
        }


    }
}
