package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.getCurrentUrl();
        driver.getTitle();

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");

        WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        login.click();

       WebElement error = driver.findElement(By.xpath("//span[contains(text(), 'Password cannot')]"));
       System.out.println(error.getText());

       driver.quit();





    }
}
