package com.syntax.class04;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("John");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Snow");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='E-Mail Address']")).sendKeys("johnsnow@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("3129379992");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='address']")).sendKeys("Westeros");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Winterfell");
        Thread.sleep(1000);
        WebElement state = driver.findElement(By.cssSelector("select[name='state']"));
        state.sendKeys("Alaska");
        state.click();
        driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("60640");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='website']")).sendKeys("https://westeros.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("textarea[placeholder*='Project']")).sendKeys("Project Description");
        Thread.sleep(1000);

        driver.quit();

    }



    }


