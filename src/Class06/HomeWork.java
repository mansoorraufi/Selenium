package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.*;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");



//  Task 01
    driver.switchTo().frame(0);
    driver.switchTo().frame("frame3");
    WebElement checkbox = driver.findElement(By.xpath("//input[@id='a']"));
    checkbox.click();

//   Task 02
    driver.switchTo().defaultContent();
    driver.switchTo().frame("frame2");
    WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
    Select select = new Select(dropDown);
    select.selectByValue("babycat");

//   Task 03
    driver.switchTo().defaultContent();
    driver.switchTo().frame("frame1");
    WebElement addText = driver.findElement(By.xpath("//input"));
    addText.sendKeys("DONE");





    }
}
