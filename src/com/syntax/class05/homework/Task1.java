package com.syntax.class05.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of all links is "+links.size());
        int numberOfLinksWithText=0;

        for(WebElement link : links){
            String linkText = link.getText();
            if(!linkText.isEmpty()){
                numberOfLinksWithText++;

                System.out.println(linkText);
                String linkAddress= link.getAttribute("href");
                System.out.println(linkAddress);

            }
            System.out.println("Number of links with text is "+numberOfLinksWithText);


        }
        driver.quit();



    }
}
