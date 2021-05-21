package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumreview.TestBase.BaseClass;

public class menuWithPageFactory extends BaseClass {

@FindBy(id="react-burger-menu-btn")
    public WebElement menuBtn;

@FindBy(id = "logout_sidebar_link")
public WebElement logOut;

public menuWithPageFactory(){
    PageFactory.initElements(driver,this);
}
}
