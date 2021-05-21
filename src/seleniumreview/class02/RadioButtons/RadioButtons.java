package seleniumreview.class02.RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumReviewBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://material-ui.com/components/radio-buttons/";
        driver.get(url);
        List<WebElement> radiobths=driver.findElements(By.xpath("//input[@name='gender1']"));

        for(WebElement radiobth:radiobths){
            String Value=radiobth.getAttribute("value");
            if(Value.equalsIgnoreCase("female")){
                Thread.sleep(2000);
                radiobth.click();
            }
            if(radiobth.isEnabled()){
                System.out.println("There is a disabled radio button");
            }
        }

    }
}
