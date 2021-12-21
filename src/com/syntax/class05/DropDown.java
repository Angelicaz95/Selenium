package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        // find the drop down
        WebElement days =  driver.findElement(By.xpath("//select[@id='select-demo']"));

        // use the select class to select from drop down
        Select select = new Select(days);
        // selecting value from drop down by index

      //  select.selectByIndex(1);
      //  Thread.sleep(2000);
      //  select.selectByIndex(2);
      //  Thread.sleep(2000);
       // select.selectByIndex(7);



// select by visible text
       //  select.selectByVisibleText("Thursday");

        //  select by value

       // select.selectByValue("Friday");

        List<WebElement> allOptions = select.getOptions();
        int size = allOptions.size();
        System.out.println(size);


        // for(WebElement all : allOptions){
          //  String options = all.getText();
         //   System.out.println(options);
       // }

        for(int i = 0; i<size; i++){
         String optionText =  allOptions.get(i).getText();
            System.out.println(optionText);


        }


















    }
}
