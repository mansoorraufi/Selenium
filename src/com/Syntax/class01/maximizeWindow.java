package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    public static void main(String[] args) throws InterruptedException {
        // go to google.com
        // maximize  the window

      //  step 1 set property
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        // create instance of WebDriver
        WebDriver driver=new ChromeDriver();

        //goto google.com
        driver.get("https://www.google.com/");

        // maximize
        driver.manage().window().maximize();
        //fullscreen
        // driver.manage().window().maximize();

        //quit
        driver.quit();






    }

}
