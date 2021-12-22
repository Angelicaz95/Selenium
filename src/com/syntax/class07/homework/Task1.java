package com.syntax.class07.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver. get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();

        WebElement instagram = driver.findElement(By.xpath("//a[text()=' Follow On Instagram ']"));

       WebElement facebook =  driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Facebook']"));
       instagram.click();
       Thread.sleep(2000);

       facebook.click();
       Thread.sleep(2000);

       Set<String> allHandles= driver.getWindowHandles();

        Iterator<String> iterator = allHandles.iterator();
        String mainPageHandle = iterator.next();
        String instagramHandle = iterator.next();
        String facebookHandle = iterator.next();
        System.out.println("The handle for the main page is: "+mainPageHandle);
        System.out.println("The handle for Instagram page is: "+instagramHandle);
        System.out.println("The handle for Facebook page is: "+facebookHandle);

        Thread.sleep(2000);
        driver.quit();





    }

}
