package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablesWithPagination {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/table-pagination-demo.php");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // print the row that contains student name "Archy J"

        // 1. locate the web table using xpath
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        //1.2 locate the next button on the table
        WebElement nextButton = driver.findElement(By.xpath("//a[@class='next_link']"));
        // 2. Iterate over the List to see if desired element is there
       boolean notFound = true;
        while(notFound) {

            for (WebElement tableRow : tableRows) {

                String text = tableRow.getText();
                if (text.contains("Archy J")) {

                    System.out.println(text);
                    notFound = false;
                    break;
                }
            }
            if (notFound) {


                nextButton.click();

            }
        }




            }
        }




