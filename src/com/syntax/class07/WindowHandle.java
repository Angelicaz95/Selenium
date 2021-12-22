package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();
        // get the address/handle of the page/window
        String signUpPage  = driver.getWindowHandle();
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
        // print the size of allWindows
        System.out.println(allWindows.size());
        // in order to print all window handles, we need to iterate over the set

        Iterator<String> it = allWindows.iterator();
       signUpPage=it.next();
       String helpPageHandle=it.next();
       String termPageHandle=it.next();
       String privacyPageHandle=it.next();


        System.out.println("The handle for the sign up page is : "+signUpPage);
        System.out.println("The handle for the terms page  page is : "+termPageHandle);
        System.out.println("The handle for the help page page is : "+helpPageHandle);
        System.out.println("The handle for the privacy  page is : "+privacyPageHandle);

        // switch to help page
        driver.switchTo().window(helpPageHandle);
        System.out.println(driver.getTitle());




        }





    }

