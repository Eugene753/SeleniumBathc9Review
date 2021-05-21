package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumreview.TestBase.BaseClass;

public class loginWithPageFactory extends BaseClass {

    @FindBy(xpath = "//input[@id='user-name']" )
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement loginBtn;

    public loginWithPageFactory(){
        PageFactory.initElements(driver,this);
    }

}
