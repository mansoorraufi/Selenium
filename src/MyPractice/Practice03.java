package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice03 {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//div[@class='_6ltj']")).click();
    }
}