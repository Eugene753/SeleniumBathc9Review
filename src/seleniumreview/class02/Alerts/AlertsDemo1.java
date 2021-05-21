package seleniumreview.class02.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumReviewBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
        driver.get(url);
        //SwitchTo()
        //it simple switches to that particular alert and allows us to perform operations in it

        //type of JS allerts
        //Simple
        //Comformation
        //Prompt

        //simpleAlerts

        WebElement alert=driver.findElement(By.xpath("//input[@value='Alert']"));
        alert.click();
        Thread.sleep(2000);
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();

        //comformationAlert

        WebElement confirmAlert=driver.findElement(By.xpath("//input[@name='confirmation']"));
        Thread.sleep(2000);
        Alert confirmationAlert=driver.switchTo().alert();
        String alertText=confirmationAlert.getText();
        System.out.println("The text of the alert is: "+alertText);
        Thread.sleep(2000);
        confirmationAlert.dismiss();

        //promptAlerts

        WebElement promt=driver.findElement(By.xpath("//input[@value='Prompt']"));
        promt.click();
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("jkfdgjkdfjg");
        Thread.sleep(2000);
        promptAlert.accept();


    }
}
