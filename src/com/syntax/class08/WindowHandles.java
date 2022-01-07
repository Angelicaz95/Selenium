package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        WebElement newTab = driver.findElement(By.cssSelector("button#tabButton"));
        WebElement newWindow =  driver.findElement(By.cssSelector("button#windowButton"));

        // click on the new tab and window button

        newWindow.click();
        newTab.click();

        // print the handle of the main page/ parent page / home page
        String mainPageHandle = driver.getWindowHandle();
        System.out.println(mainPageHandle);

        // switch to new tab and get the text.
        // 1. we have to get all the handles, so we can switch to the desired one

        Set<String> allHandles = driver.getWindowHandles();

        // 2. find the desired handle by iterating through the set
        Iterator<String> it = allHandles.iterator();
        // 3. we have to iterate through each handle to see if it is the desired one
        while(it.hasNext()){
            // 4. getting the first handle
            String handle = it.next();
            // 5. switch the focus of selenium to this particular title
            driver.switchTo().window(handle);
            // 6. we need to make sure it's the correct tab by checking the title / url
            if( driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")){
                System.out.println(driver.getCurrentUrl());
                break;

            }

        }

        // getting the text
        WebElement text = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text.getText());

        // click on new window message btn
        // need to switch the focus of selenium first
        driver.switchTo().defaultContent();
       //  driver.switchTo().window(mainPageHandle); can also be used

        driver.findElement(By.cssSelector("button#messageWindowButton")).click();
        driver.quit();















    }
}
