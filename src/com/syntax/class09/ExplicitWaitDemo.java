package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

      driver.get("https://chercher.tech/practice/explicit-wait");
      WebElement enableButton = driver.findElement(By.xpath("//*[@id='enable-button']"));
      enableButton.click();

      // print the state of the button after it is enabled

        WebDriverWait wait = new WebDriverWait(driver, 20);
        // condition

       // wait.until(ExpectedConditions.elementToBeClickable(enableButton));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='disable']")));
        // print whether button is enabled or not

        WebElement btn = driver.findElement(By.cssSelector("button#disable"));
        System.out.println(btn.isEnabled());

        driver.quit();





    }

}
