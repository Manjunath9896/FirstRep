package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Main {
    public static WebDriver  driver;

    public static void main(String[] args) throws IOException {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        JavascriptExecutor js = (JavascriptExecutor) driver;

       WebElement wt = driver.findElement(By.className("(//img[@class='product-image'])[1]"));
        js.executeScript("arguments[0].srcollIntoView",wt);
       WebElement wt2 = driver.findElement(By.xpath("//img[@alt='Big Savings, More Happiness']"));
        js.executeScript("arguments[0].srcollIntoView",wt2);
        TakesScreenshot ss= (TakesScreenshot) driver;
        File source = ss.getScreenshotAs(OutputType.FILE);
        File destin = new File ("C:\\Users\\Lenovo\\IdeaProjects\\Java_ss\\imge\\ss.png");
        FileUtils.copyFile(source,destin);


    }

















}