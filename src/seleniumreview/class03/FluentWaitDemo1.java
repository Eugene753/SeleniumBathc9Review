package seleniumreview.class03;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FluentWaitDemo1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumReviewBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,20);
        String url="http://the-internet.herokuapp.com/dynamic_loading/1";
        driver.get(url);

        Wait<WebDriver>wait1=new FluentWait<WebDriver>(driver)
                .pollingEvery(Duration.ofSeconds(20))
                .ignoring(NoSuchFrameException.class)
                .withTimeout(Duration.ofSeconds(20));

    }
}
