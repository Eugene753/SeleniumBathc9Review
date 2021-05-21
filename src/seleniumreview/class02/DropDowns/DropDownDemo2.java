package seleniumreview.class02.DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumReviewBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";
        driver.get(url);

        WebElement MultipleDD=driver.findElement(By.xpath("//select[@name='States']"));
        Select select=new Select(MultipleDD);

        boolean isMultiple=select.isMultiple();
        System.out.println("is the dropdown is "+isMultiple);

        //select California and ohio
        select.selectByValue("California");

        select.selectByVisibleText("Ohio");

        Thread.sleep(2000);
        select.deselectByVisibleText("Ohio");
        select.deselectAll();
    }
}
