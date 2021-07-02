package com.config;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSize extends BrowserConfig{

    public static void main(String[] args) {
        firefoxLaunch();
        Screen_PC();
        getScreenSize();
        firefoxClose();

    }

    public static void getScreenSize()
    {
        //get Screen Size
        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();
        System.out.println("Screen Height: "+height+" and width: "+width);
    }

    public static void Screen_PC() {
        driver.manage().window().setSize(new Dimension(769,400));

    }

    public static void Screen_TAB() {
        driver.manage().window().setSize(new Dimension(768,400));

    }

}
