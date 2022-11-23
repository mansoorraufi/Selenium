package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableBasic {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

// Task:    go to the website
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        // print the whole table on th console.

        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));

        String  textAllTable = allTable.getText();
 //       System.out.println(textAllTable);

 //     print all the rows of table

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row:rows){
            String rowText = row.getText();
          /*  System.out.println("rowText = " + rowText);
            System.out.println("---------------");*/

            if (rowText.contains("Google")) {
                System.out.println("rowText = " + rowText);
                
            }

        }

// print all the individual columns of the table.

        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]"));
        for (WebElement column:columns) {
            String columnText = column.getText();
            System.out.println("columnText = " + columnText);
            System.out.println("---------------");

        }




}

}
