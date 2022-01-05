package com.syntax.class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WorkingWithKeys {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //locate the user name
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        // locate the password
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));

        // username
        userName.sendKeys("Testers", Keys.BACK_SPACE);
        userName.sendKeys(Keys.TAB);

        // password
        password.sendKeys("test", Keys.ENTER);


        // TAKING A SCREEN SHOT

        TakesScreenshot ts = (TakesScreenshot) driver;
        // to take the screen shot, this step takes the screen shot
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);

        // save the screenshot on out computer

       try{
            FileUtils.copyFile(sourceFile, new File("Screenshot/smartBear/adminlogin.png"));

        } catch(IOException e){
            e.printStackTrace();
        }






    }
}
