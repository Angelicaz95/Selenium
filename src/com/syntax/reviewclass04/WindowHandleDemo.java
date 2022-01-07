package com.syntax.reviewclass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandleDemo {
    public static String url = "https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

       WebElement terms =  driver.findElement(By.xpath("//a[text()='Terms']"));
       terms.click();

       String mainPageHandle = driver.getWindowHandle();
        System.out.println(mainPageHandle);

        Set<String> allHandles = driver.getWindowHandles();
        Iterator<String> iterator = allHandles.iterator();
        while(iterator.hasNext()){
            String handle = iterator.next();

            driver.switchTo().window(handle);

            if(driver.getCurrentUrl().equalsIgnoreCase("https://policies.google.com/terms")){
                System.out.println(driver.getTitle());
                break;
            }
            driver.findElement(By.xpath("//a[text()='Overview']")).click();
            driver.switchTo().defaultContent();
        }







    }


}
