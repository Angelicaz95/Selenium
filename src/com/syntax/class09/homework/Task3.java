package com.syntax.class09.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"
        )).sendKeys("Tester");

        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("test");

        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']")).click();


        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        for(int i=1; i<rows.size(); i++){
            String text = rows.get(i).getText();
            if(text.contains("MyMoney")&&text.contains("US")){
               List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
               checkBoxes.get(i-1).click();

            }

        }

        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$btnDelete']")).click();

        driver.quit();








    }
}
