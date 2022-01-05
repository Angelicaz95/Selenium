package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // switch to the iframe
        driver.switchTo().frame(0);

        // locate the draggable
       WebElement draggable = driver.findElement(By.cssSelector("div#draggable"));

       // locate the drop off location

       WebElement dropOff =  driver.findElement(By.cssSelector("div#droppable"));

       Actions action = new Actions(driver);
       // drag the source to drop off
     //  action.dragAndDrop(draggable, dropOff).perform();

        // whenever we are chaining the methods, it is recommended to use build()
        action.clickAndHold(draggable).moveToElement(dropOff).release().build().perform();



    }
}
