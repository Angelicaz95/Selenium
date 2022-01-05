package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        WebElement checkBox = driver.findElement(By.xpath("//*[@value='Option-1']"));

        if(checkBox.isSelected()){
            System.out.println("this check box is already selected");
        }else{
            checkBox.click();
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
