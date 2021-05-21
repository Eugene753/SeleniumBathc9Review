package seleniumreview.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    /**
     *
     * this method to open browser
     * @param url
     */
    public static void setUpWithSpecificUrl(String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumReviewBatch9\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    /**
     * this method to close browser
     *
     */

    public static void tearDown(){
        driver.close();
    }
}
