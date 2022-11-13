package MyPractice;

import com.sun.security.jgss.GSSUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        WebElement text = driver.findElement(By.xpath("//h4[@style='padding: 10%;']"));
        String message = text.getText();
        System.out.println("The text is :"+message); // The Message was not printed bcause at the time of run the msg on
                                                    //  web page was still being loading.

}}
