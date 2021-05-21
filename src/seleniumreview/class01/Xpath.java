package seleniumreview.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.bbc.com/";
        driver.get(url);
        Thread.sleep(2000);
        WebElement signInButton=driver.findElement(By.xpath("//a[@id = 'idcta-link']"));
        signInButton.click();
        Thread.sleep(2000);
        WebElement registerButtonNow=driver.findElement(By.xpath("//span[text()='Register now']"));
        registerButtonNow.click();
        Thread.sleep(2000);
        WebElement checkAge=driver.findElement(By.xpath("//a[contains (@href, 'age?')]"));
        checkAge.click();
        Thread.sleep(2000);
        WebElement day=driver.findElement(By.xpath("//input[starts-with(@id,'day')]"));
        day.sendKeys("20");
        WebElement month=driver.findElement(By.xpath("//input[starts-with(@id,'month')]"));
        month.sendKeys("02");
        WebElement year=driver.findElement(By.xpath("//input[starts-with(@id,'year')]"));
        year.sendKeys("1995");
        WebElement buttonContinue=driver.findElement(By.xpath("//button[starts-with(@id,'submit')]"));
        buttonContinue.click();


    }
}
