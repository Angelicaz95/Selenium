package com.syntax.class05.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Angelica");

        driver.findElement(By.name("lastname")).sendKeys("Andriyenko");
        driver.findElement(By.name("reg_email__")).sendKeys("angelica@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("angelica@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Qwerty09876");

        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(2);
        Thread.sleep(2000);


        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select selectDay = new Select(day);
        selectDay.selectByValue("11");
        Thread.sleep(2000);



        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select selectYear = new Select(year);
        selectYear.selectByVisibleText("1995");
        Thread.sleep(2000);

        WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
        gender.click();


        driver.findElement(By.xpath("//button[@name='websubmit']")).click();

        Thread.sleep(2000);

        driver.quit();









    }
}