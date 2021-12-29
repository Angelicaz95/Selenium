package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicWebTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"
        )).sendKeys("Tester");

        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("test");

        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']")).click();

        // get all the rows

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        for(int i=1; i< rows.size(); i++){
            // get the text
            String rowText = rows.get(i).getText();
            System.out.println(rowText);
            // check the checkbox if the row has product screensaver
            if(rowText.contains("ScreenSaver")){
              List<WebElement>checkBoxes = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
              checkBoxes.get(i-1).click();

            }
        }
        driver.quit();


    }
}
