package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) {
        // set the path to the driver Executable
        // mac user don't need exe
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // calling a get method to get to a particular website
        driver.get("https://www.google.com");
        // returns current url loaded in the browser

        String url=driver.getCurrentUrl();
        System.out.println("The current URL loaded in browder is "+url);

        String title=driver.getTitle();
        System.out.println("The current title of the page is "+title);

        // close the browser
        driver.quit();





    }
}