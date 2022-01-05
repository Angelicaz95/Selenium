package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarWithPagination {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sastaticket.pk/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // locate the calendar and click on it
       WebElement calendar = driver.findElement(By.xpath("(//span[@class='dt_label'])[1]"));
       calendar.click();

       // locate the current month and year
      WebElement currentMonth =  driver.findElement(By.xpath("(//div[@class='react-datepicker__current-month'])[1]"));
      // print the current month
        System.out.println(currentMonth.getText());

        // locate next button
        WebElement nextButton = driver.findElement(By.xpath("//button[text()='Next Month']"));

        // loop through the months till we find desired month
        boolean notFound = true;
        while(notFound){
            if(currentMonth.getText().equalsIgnoreCase("July 2022")) {
                System.out.println(currentMonth.getText());
            notFound=false;
            // select the date
            List<WebElement> dates =    driver.findElements(By.xpath("(//div[@class='react-datepicker__month'])[1]/div/div"));
            // loop through the dates
                for(WebElement date : dates){
                  String dateText =   date.getText();
                  if(dateText.equalsIgnoreCase("15")){
                      date.click();
                      break;
                  }
                }
            }else{
                nextButton.click();

            }
        }

    }
}
