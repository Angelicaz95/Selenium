package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        WebElement radioButton = driver.findElement(By.xpath("(//*[@value='Male'])[2]"));
        System.out.println(radioButton.isDisplayed());
        System.out.println(radioButton.isEnabled());

        if(radioButton.isEnabled()){
            radioButton.click();
        }

        driver.quit();

    }
}
