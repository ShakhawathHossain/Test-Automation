package com.Frame;

import com.config.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrameTest extends BrowserConfig {
    public static void main(String[] args) {
        firefoxLaunch();

        /*
        openTestURL("https://the-internet.herokuapp.com/iframe");
        singleFrame();
         */

        openTestURL("https://www.w3schools.com/html/html_iframe.asp");
        iFrameTask();

    }

    public static void singleFrame()
    {
        //WebElement frame = findByCSS("#main > div:nth-child(7) > iframe");
//      //driver.switchTo().frame(frame);
        driver.switchTo().frame("mce_0_ifr");
        WebElement iframebody = driver.findElement(By.id("tinymce"));
        iframebody.clear();
        iframebody.sendKeys("Testing");
    }

    public static void iFrameTask()
    {
        WebElement frame = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[3]/iframe"));
        driver.switchTo().frame(frame);
        WebElement css = driver.findElement(By.xpath("/html/body/div[4]/div/div/a[4]"));
        css.click();
    }
}
