package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        // switch to the desired frame
        driver.switchTo().frame("frame1");

        // getting the webelement
       WebElement text1 =  driver.findElement(By.cssSelector("h1#sampleHeading"));
      System.out.println("The text is :"+text1.getText());

      // we have to switch out focus back to default web page before switching to new iframe
        driver.switchTo().defaultContent();

      // switch to frame 2
        driver.switchTo().frame("frame2");
        // locate the webelement
        WebElement text2 = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("The text is :"+text2.getText());
        // in order to click on web element "form"
        // switch the focus back to the default
        driver.switchTo().defaultContent();



        driver.quit();

    }
}
