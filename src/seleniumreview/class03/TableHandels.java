package seleniumreview.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableHandels {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumReviewBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String url="https://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";
        driver.get(url);

        List<WebElement>row=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(row.size());

        for(WebElement x:row){
            System.out.println(x.getText());
        }

        System.out.println("-------------------------------------------");

        List<WebElement> headerRow=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));

        for(WebElement x:headerRow){
            System.out.println(x.getText());
        }

    }
}
