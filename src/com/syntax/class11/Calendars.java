package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendars {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement leaveButton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();

        // open the calendar
        driver.findElement(By.cssSelector("input#calFromDate")).click();
        // select month

        WebElement month = driver.findElement(By.cssSelector("select.ui-datepicker-month"));

        Select select = new Select(month);
        select.selectByVisibleText("Sep");

        // select the year

        WebElement year = driver.findElement(By.cssSelector("select.ui-datepicker-year"));

        Select s = new Select(year);
        s.selectByValue("2012");

        // selecting a particular date of calendar
       List<WebElement> dates =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

       for(WebElement date : dates ){
         String dateText=   date.getText();
         if(dateText.equals("22")){
             date.click();
         }

       }







    }
}
