package com.Screenshot;

import com.config.BrowserConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Screenshot extends BrowserConfig {
    public static void main(String[] args) throws IOException {
        firefoxLaunch();
        openTestURL("https://demo.opencart.com/index.php?route=common/home");
        generatescreenshot();
        firefoxClose();

    }

    public static void generatescreenshot() throws IOException {
       File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

       //save image
        FileUtils.copyFile(srcfile,new File("./src/test/Screenshot/pageImage.png"),true);
    }


}
