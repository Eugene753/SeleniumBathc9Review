package seleniumreview.class02.Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesDemo1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumReviewBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";
        driver.get(url);

        //Switch to the iframe under consideration
        driver.switchTo().frame(0);
        WebElement startPractisingButton=driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        startPractisingButton.click();
        driver.switchTo().defaultContent();
        WebElement alertAndPractise=driver.findElement(By.xpath("//a[text()='Alerts & Modals']"));
        alertAndPractise.click();


        //switch using webelement
        WebElement iframe=driver.findElement(By.xpath("//iframe[@name='FrameOne']"));

        driver.switchTo().frame(iframe);

        WebElement startPractisingButton2=driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        startPractisingButton2.click();



    }
}
