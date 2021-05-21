package seleniumreview.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumreview {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.saucedemo.com/";

        driver.get(url);
        WebElement userName=driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement loginButton=driver.findElement(By.id("login-button"));
        loginButton.click();
        WebElement nameBackpack=driver.findElement(By.className("inventory_item_name"));
        nameBackpack.click();
        WebElement clickButtonAddToCart= driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        clickButtonAddToCart.click();
        Thread.sleep(2000);
        driver.navigate().back();
        WebElement clickMenuButton=driver.findElement(By.id("react-burger-menu-btn"));
        clickMenuButton.click();
        WebElement clickAbout=driver.findElement(By.xpath("//a[contains(@id,'about')]"));
        Thread.sleep(2000);
        clickAbout.click();
        String title=driver.getTitle();
        if(title.equalsIgnoreCase("Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs")) {
            System.out.println("Boom it is the correct one");
        }else{
            System.out.println("you have failed this city");
        }
        Thread.sleep(2000);
        driver.navigate().back();
        WebElement clickOnShoppingCart=driver.findElement(By.className("shopping_cart_link"));
        clickOnShoppingCart.click();
        WebElement clickOnCheckOut=driver.findElement(By.id("checkout"));
        Thread.sleep(2000);
        clickOnCheckOut.click();
        Thread.sleep(2000);
        WebElement clickMenuButton1=driver.findElement(By.id("react-burger-menu-btn"));
        clickMenuButton.click();
        Thread.sleep(2000);
        WebElement clickOnLogOut=driver.findElement(By.id("logout_sidebar_link"));
        clickOnLogOut.click();



    }
}
