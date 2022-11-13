package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlingAdvance {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

//      open gmail singup page
        driver.get("https://accounts.google.com/signup");
//        click on help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
//      click on privacy button
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

// the title of my desired page is Google Account Help
// get all the window handles
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle:allHandles){
// switching the focus to the current handle from list
        driver.switchTo().window(handle);
//  get the title of the window to which the driver has switched
    String title = driver.getTitle();

        }



    }
}
