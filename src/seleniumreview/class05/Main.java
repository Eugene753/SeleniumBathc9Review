package seleniumreview.class05;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static String url="http://demo.guru99.com/test/simple_context_menu.html";


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumReviewBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action=new Actions(driver);
        action.contextClick(rightclick).perform();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        TakesScreenshot ts=(TakesScreenshot)driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile,new File("screenshots/HRMS/dashboard.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
