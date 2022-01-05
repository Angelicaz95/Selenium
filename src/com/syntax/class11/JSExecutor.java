package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSExecutor {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        // scroll down
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(2000);

        // scroll up
        js.executeScript("window.scrollBy(0,-4000)");

        // scroll till the element is in view
       WebElement element = driver.findElement(By.cssSelector("span.navFooterBackToTopText"));
        js.executeScript("arguments[0].scrollIntoView(true)",element);



    }
}
