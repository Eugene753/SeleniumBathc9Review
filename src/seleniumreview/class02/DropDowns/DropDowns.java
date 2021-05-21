package seleniumreview.class02.DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDowns {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumReviewBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.surveymonkey.com/r/?sm=uQNn3rYKMcVS0Dyy6GTjSw%3D%3D";
        driver.get(url);

        WebElement menuDD=driver.findElement(By.xpath("//select[@id='211154525']"));

        Select select=new Select(menuDD);
        //by index
        select.selectByIndex(2);
        //value
        select.selectByValue("2657263885");
        //by visibletext
        select.selectByVisibleText("Answer Choice A");

        //loop through all the options that are visible
        List<WebElement> all_options=select.getOptions();
        int size=all_options.size();
        System.out.println("The size of the list is: "+size);

        for(WebElement option:all_options){
            System.out.println("The text of all options is: "+option.getText());
        }


    }
}
