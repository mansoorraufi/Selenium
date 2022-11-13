package Class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();


// Task:    goto gmail signup and get the window handle
//          goto gmail signup page
        driver.get("https://accounts.google.com/SignUp");

// get the window handle for the current page.
        String gmailHandle = driver.getWindowHandle();

        // print
        System.out.println("the handle of the current page is :"+gmailHandle);


    }
}
