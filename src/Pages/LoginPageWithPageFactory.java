package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement usernamefield;

    @FindBy (xpath = "//input[@id = 'txtPassword']")
    public WebElement passwordfield;

    @FindBy (css="input#btnLogin")
    public  WebElement loginbtn;

    //    call the constructor to intialize all elements
    public LoginPageWithPageFactory(){
        PageFactory.initElements(driver,this);
    }
}
