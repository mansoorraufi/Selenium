package Test;

import Pages.LoginPageWithPageFactory;
import Utils.CommonMethods;

public class LoginPapgeTestWithPageFactory {
    public static void main(String[] args) {

        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPageWithPageFactory login = new LoginPageWithPageFactory();
        login.usernamefield.sendKeys("Admin");
        login.passwordfield.sendKeys("Hum@nhrm123");
        login.loginbtn.click();




    }
}
