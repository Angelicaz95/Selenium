package com.syntax.class07.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.switchTo().frame("frame1");
        Thread.sleep(1000);

        WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(childFrame);
        WebElement text = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        System.out.println(text.getText());

        driver.quit();





    }
}
