package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        // navigate to website and check the first checkbox
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        driver.manage().window().maximize();

        // locate the web element check box

       WebElement singleCheckBox = driver.findElement(By.cssSelector("input#isAgeSelected"));
       singleCheckBox.click();

       Thread.sleep(2000);
       // uncheck the checkbox

        singleCheckBox.click(); // this will uncheck it


        // Task 2 : check all the text boxes
        // will have to find attribute value that is common for all the elements

       List<WebElement> checkBoxes  =  driver.findElements(By.xpath("//input[@class='cb1-element']"));

       // print the number of the checkboxes
        int size = checkBoxes.size();

        System.out.println("Total number of check boxes is "+size);

        // iterate through each WebElement
        for(WebElement checkBox: checkBoxes){
           // checkBox.click();

            // select the check box with the text Option 3
            // get the attribute value of all check boxes

         String  valueOfAttribute =  checkBox.getAttribute("value");
            System.out.println(valueOfAttribute);

            if(valueOfAttribute.equalsIgnoreCase("Option-3")){
                // click on the check box whose attribute is option 3
                checkBox.click();
            }
// also can use contains method





        }






    }
}
