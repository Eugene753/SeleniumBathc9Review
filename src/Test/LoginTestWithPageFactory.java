package Test;

import pages.loginWithPageFactory;
import pages.menuWithPageFactory;
import seleniumreview.TestBase.BaseClass;

public class LoginTestWithPageFactory {

    public static void main(String[] args) {

        BaseClass.setUpWithSpecificUrl("https://www.saucedemo.com/");
        loginWithPageFactory login=new loginWithPageFactory();
        login.userName.sendKeys("standard_user");
        login.password.sendKeys("secret_sauce");
        login.loginBtn.click();

        menuWithPageFactory menu=new menuWithPageFactory();
        menu.menuBtn.click();
        menu.logOut.click();



    }
}
