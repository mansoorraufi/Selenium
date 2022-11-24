package Class12;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jsExecutoryHighlight {
    public static void main(String[] args) {

        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        // find the webelement username
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        // using js Executer

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='blue'",username);


    }
}
