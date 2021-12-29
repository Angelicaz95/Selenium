package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StaticWebTable {
    public static String url = "https://syntaxprojects.com/table-search-filter-demo.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);


        // find the rows in the table
       List<WebElement> tableRows =  driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
       // print number of rows
        System.out.println("The number of rows in the web table is "+tableRows.size());

        // iterate through each web element and get the text out of it

        for(WebElement row : tableRows){
            String text = row.getText();
            System.out.println(text);
        }

        // print all the headers
        List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@class='table table-hover']/thead/tr/th"));
        System.out.println(allHeaders.size());

        for(WebElement header: allHeaders){
            String text1 = header.getText();
            System.out.print(text1+" ");
        }
        // print column number 2. locate the column using xpath
      List<WebElement> column2 =  driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));
        // iterate through each element
        for(WebElement column: column2){
            System.out.println(column.getText());

        }




    }
}
