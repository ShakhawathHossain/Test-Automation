package com.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfig {

    public static WebDriver driver;
    // Browser Launch
    public static void main(String[] args)
    {
        chromeLaunch();
        //chromeClose();
        //firefoxLaunch();
        //firefoxClose();
    }

    public static void chromeLaunch()
    {
        // Set Chrome Driver Path
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com"); //For online project
        //driver.get("file:///J:/Software Testing/Your Store.html"); //For Offline Project
        //driver.get("http://localhost:8080/websitename"); //For Local Host
    }

    public static void firefoxLaunch()
    {
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://google.com");
    }

    public static void chromeClose()
    {
        driver.close(); //close the active Tab
        //driver.quit(); //close the browser
    }

    public static void firefoxClose()
    {
        driver.close(); //close the active Tab
        //driver.quit(); //close the browser
    }

    public static void openTestURL(String URL){
        driver.get(URL);
    }

    public static WebElement elementByCSS(String locator)
    {
        return driver.findElement(By.cssSelector(locator));

    }

    public static void getelementByCSSandselect(String locator)
    {
        driver.findElement(By.cssSelector(locator)).click();

    }

    public static void getElementByIDandType(String locator, String text)
    {
        driver.findElement(By.id(locator)).sendKeys(text);
    }
}
