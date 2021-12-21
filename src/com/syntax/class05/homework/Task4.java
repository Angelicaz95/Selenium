package com.syntax.class05.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        WebElement categories = driver.findElement(By.xpath("//select[@id='gh-cat']"));

        Thread.sleep(2000);

        Select select = new Select(categories);

        List<WebElement> allOptions = select.getOptions();

        for(WebElement all : allOptions){
            String options = all.getText();
            System.out.println(options);
        }

        select.selectByVisibleText("Computers/Tablets & Networking");
        Thread.sleep(2000);

       WebElement search =  driver.findElement(By.xpath("//input[@value='Search']"));
       search.click();
        Thread.sleep(2000);

       driver.getTitle();

       driver.quit();






    }
}
