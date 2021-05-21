package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import seleniumreview.TestBase.BaseClass;

public class LoginPage extends BaseClass {

    public WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));

    public WebElement password=driver.findElement(By.xpath("//input[@id='password']"));

    public WebElement loginBtn=driver.findElement(By.xpath("//input[@id='login-button']"));
}
