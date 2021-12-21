package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        WebElement femaleRadioButton =  driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));
        femaleRadioButton.click();

        // check if the radio button is displayed

        boolean isDisplayed = femaleRadioButton.isDisplayed();
        System.out.println("Female  radio button is displayed on the webpage: "+isDisplayed);


        // check if the button is enabled
        boolean isEnabled = femaleRadioButton.isEnabled();
        System.out.println("Female radio button is enabled on the webpage: "+ isEnabled);


        // check if the female radio button is selected
       boolean  isSelected = femaleRadioButton.isSelected();
        System.out.println("Female radio button is delected on the webpage: "+isSelected);

        // select the female radio button only if its Enabled

        if(isEnabled){
            femaleRadioButton.click();
        }

        // after clicking the butoon, print if its selected or not
        isSelected=femaleRadioButton.isSelected();
        System.out.println("Female radio button is selected on the webpage: "+isSelected);








    }
}
