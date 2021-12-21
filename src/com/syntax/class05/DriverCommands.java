package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DriverCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        // get all the links that there on ebay.com
        // as we have multiple elements with tag name, we will have to use findElements() method
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // print the size of list
        System.out.println(links.size());

        // print all the text of each link
        for(WebElement link: links){
            String linkText=link.getText();

            // only print the links that have some text and ignore the rest
            if(!linkText.isEmpty()){
                System.out.println(linkText);

                //  print all the text along with the link
                // use the method .getAttribute() to have the value of a particular attribute in the tag
               String linkAddress =  link.getAttribute("href");
               // print the attribute "href" value
                System.out.println(linkAddress);
                System.out.println("--------------------------------");



            }

        }


    }
}
