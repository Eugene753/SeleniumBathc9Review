package seleniumreview.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPractise {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="http://syntaxtechs.com/selenium-practice/basic-first-form-demo.php";
        driver.get(url);
        Thread.sleep(2000);
        WebElement sendMessage=driver.findElement(By.cssSelector("input[id='user-message']"));
        sendMessage.sendKeys("moazzam");
        Thread.sleep(2000);
        WebElement showMessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessage.click();
        Thread.sleep(2000);
        WebElement text=driver.findElement(By.cssSelector("span#display"));
        String name;
        name=text.getText();
        if(name.equalsIgnoreCase("moazzam")){
            System.out.println("you sucessfull");
        }else{
            System.out.println("your are not sucessfull");
        }
        Thread.sleep(2000);
        WebElement enterValue=driver.findElement(By.cssSelector("input[id*='m1']"));
        enterValue.sendKeys("100");
        WebElement enterValue2=driver.findElement(By.cssSelector("input[id$='m2']"));
        enterValue2.sendKeys("500");
        WebElement getTotal=driver.findElement(By.cssSelector("button[onclick*='total']"));
        getTotal.click();
        WebElement value=driver.findElement(By.cssSelector("span[id*='value']"));
        if(value.getText().equalsIgnoreCase("600")){
            System.out.println("you sucessfull");
        }else{
            System.out.println("your are not sucessfull");
        }


    }
}
