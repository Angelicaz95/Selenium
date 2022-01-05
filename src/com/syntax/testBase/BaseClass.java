package com.syntax.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    /*
    this method will navigate to a website given the URL
    parameter - URL
     */
    public static WebDriver driver;
   public static void openWithSpecificUrl (String url){
       System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
       driver = new ChromeDriver();
      driver.get(url);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

   }

   /*
   this method will quit the opened browser
    */
   public static void tearDown(){
       if(driver!=null){
           driver.quit();



       }



   }

}
