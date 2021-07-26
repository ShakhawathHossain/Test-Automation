package com.Screenshot;

import com.config.BrowserConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class SpecificScreenshot extends BrowserConfig {
    public static void main(String[] args) throws IOException {
        firefoxLaunch();
        //openTestURL("https://demo.opencart.com/index.php?route=account/login");
        openTestURL("https://www.bbc.com/");
        //captureElement();
        fullscreenshot();
        firefoxClose();

    }
     public static void captureElement() throws IOException {
         WebElement ce = driver.findElement(By.cssSelector("div.col-sm-6:nth-child(2) > div:nth-child(1)"));
         File srcfile = ((TakesScreenshot)ce).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(srcfile,new File("./src/test/Screenshot/Element.png"),true);

     }

    public static void fullscreenshot() throws IOException {
        Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(s.getImage(),"PNG",new File("./src/test/Screenshot/fullImage.png"));
    }
}
