package seleniumreview.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitsDemo1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumReviewBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.facebook.com/";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement creatNewAccountButton=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        creatNewAccountButton.click();
        WebElement inputFirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys("helllloooo");

    }
}
