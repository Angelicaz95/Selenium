package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class MultipleSelect {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // navigate
         driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        WebElement statesDD =  driver.findElement(By.cssSelector("select#multi-select"));

        // creating an object of select class
        Select select = new Select(statesDD);

        // check if the drop down is multiple
        boolean isMultiple = select.isMultiple();
        System.out.println(isMultiple);

        select.selectByIndex(0); // will print California

        Thread.sleep(2000);

        select.selectByVisibleText("Texas");

        Thread.sleep(2000);

        select.selectByValue("Ohio");

        Thread.sleep(2000);

        select.deselectByIndex(2);

        Thread.sleep(2000);

        select.deselectByVisibleText("Texas");


        // to use iterator to get all the options text and print in console
        // get all the options

        List<WebElement> options = select.getOptions();



        Iterator<WebElement> iterator = options.iterator();

        while(iterator.hasNext()){

            System.out.println(iterator.next().getText());
        }



















    }
}
