package Test;

import Pages.loginPage;
import Utils.CommonMethods;

public class LoginPageTest {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        loginPage loging = new loginPage();
        loging.userNameField.sendKeys("Admin");
        loging.passwordField.sendKeys("Hum@nhrm123");
        loging.loginButton.click();

    }
}
