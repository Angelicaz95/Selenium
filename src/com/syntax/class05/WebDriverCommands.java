package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        // navigate to the website
        // fill the user name with "AON"
        // delete the user name
        // fill the new user name "Tester"

        WebElement userName = driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        userName.sendKeys("AON");

        // delete the userName entered
        Thread.sleep(2000);
        userName.clear();
        // enter new user name
        Thread.sleep(2000);
        userName.sendKeys("Tester");

    }
}
