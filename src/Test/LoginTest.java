package Test;

import pages.LoginPage;
import pages.menuPage;
import seleniumreview.TestBase.BaseClass;

public class LoginTest {

    public static void main(String[] args) {

        BaseClass.setUpWithSpecificUrl("https://www.saucedemo.com/");
        LoginPage login=new LoginPage();
        login.userName.sendKeys("standard_user");
        login.password.sendKeys("secret_sauce");
        login.loginBtn.click();
        menuPage menu=new menuPage();
        menu.addbag.click();
    }
}
