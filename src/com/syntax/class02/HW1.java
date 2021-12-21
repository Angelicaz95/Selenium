package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Emma");
        driver.findElement(By.id("customer.lastName")).sendKeys("Watson");
        driver.findElement(By.id("customer.address.street")).sendKeys("12 Grimmauld Place ");
        driver.findElement(By.id("customer.address.city")).sendKeys("NYC");
        driver.findElement(By.id("customer.address.state")).sendKeys("New York");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("60640");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("8907653421");
        driver.findElement(By.id("customer.ssn")).sendKeys("678-56-9673");

        driver.findElement(By.name("customer.username")).sendKeys("emmawatson@gmail.com");
        driver.findElement(By.name("customer.password")).sendKeys("emmawatson123");
        driver.findElement(By.name("repeatedPassword")).sendKeys("emmawatson123");
        driver.findElement(By.name("button")).click();

        driver.quit();




    }
}
