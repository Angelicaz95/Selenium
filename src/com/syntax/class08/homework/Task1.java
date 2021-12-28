package com.syntax.class08.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement instagramButton = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));
        instagramButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while(iterator.hasNext()){
            String handle = iterator.next();
            driver.switchTo().window(handle);
            if(driver.getCurrentUrl().equals("https://www.instagram.com/Syntaxtechs/")){
                System.out.println(driver.getTitle());
                break;
            }
        }
        driver.quit();



    }




}
