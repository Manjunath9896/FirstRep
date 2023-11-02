import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class new_ss {
    public static WebDriver driver;
    public static void main (String[]args) throws IOException {

        driver.get("https://www.opencart.com/index.php?route=cms/feature");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        JavascriptExecutor js = (JavascriptExecutor) driver;
      WebDriver wt= (WebDriver) driver.findElement(By.className("//a[@class='navbar-brand']"));
      js.executeScript("arguments[0]scrollIntoView");
      WebDriver wt2 = (WebDriver) driver.findElement(By.id("//div[@id='copyright']"));
      js.executeScript("arugments[0]scrollIntoView");
        WebDriver wt3 = (WebDriver) driver.findElement(By.className("//a[@class='navbar-brand']"));
        js.executeScript("arguments[0]scrollIntoView");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destin= new File ("C:\\Users\\Lenovo\\IdeaProjects\\Java_ss\\src\\test\\new.ss\\cc.png");
        FileUtils.copyFile(source,destin);


    }

}
