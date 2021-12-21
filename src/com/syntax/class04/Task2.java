package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.getCurrentUrl();
        driver.getTitle();

        driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input")).sendKeys("Admin");
       Thread.sleep(2000);

       driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("Admin123");
       Thread.sleep(2000);

       WebElement login = driver.findElement(By.xpath("//div[@id='divLoginButton']/child::input"));
       login.click();

       WebElement error = driver.findElement(By.xpath("//input[@name='Submit']/following-sibling::span"));
       System.out.println(error.getText());
       driver.quit();





    }
}
