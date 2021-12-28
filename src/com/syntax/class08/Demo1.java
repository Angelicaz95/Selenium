package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();
        // get the address/handle of the page/window
        String signUpPage = driver.getWindowHandle();
        System.out.println(signUpPage);
        // find the buttons help, terms, privacy
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement termBtn = driver.findElement(By.xpath("//a[text()='Terms']"));
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));

        // click on the buttons to open up new windows
        helpBtn.click();
        termBtn.click();
        privacyBtn.click();

        // we haven't switched the focus, so we are still on the main/ home/ sign up page
        // to get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // in order to print all window handles, we need to iterate over the set

        Iterator<String> it = allWindows.iterator();
        while(it.hasNext()){
            // switch to terms page
            String handle = it.next();
            // now switch to this particular handle/window
            driver.switchTo().window(handle);
            // checking if its the right title
            String title = driver.getTitle();
            // if condition
            if(title.equalsIgnoreCase("Google Terms of Service – Privacy & Terms – Google")){
                System.out.println(title);
                break;
            }

        }
    }
}
