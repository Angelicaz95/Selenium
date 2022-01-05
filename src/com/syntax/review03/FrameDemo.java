package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

       // WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));

        driver.switchTo().frame("frame1");

        WebElement text = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text.getText());


    }
}
