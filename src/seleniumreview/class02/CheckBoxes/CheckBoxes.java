package seleniumreview.class02.CheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumReviewBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.ironspider.ca/forms/checkradio.htm";
        driver.get(url);

        WebElement redCheckBox=driver.findElement(By.xpath("//input[@type='checkbox'][@value='red']"));
        boolean redCheckBoxIsEnabled=redCheckBox.isEnabled();
        System.out.println("The check box is Enabled: "+redCheckBoxIsEnabled);
        boolean redCheckBoxIsSelected=redCheckBox.isSelected();
        System.out.println("The check box is Selected: "+redCheckBoxIsSelected);

        Thread.sleep(2000);
        redCheckBox.click();
        Thread.sleep(2000);
        redCheckBoxIsSelected=redCheckBox.isSelected();
        System.out.println("The check box is Selected: "+redCheckBoxIsSelected);

        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("number of check boxes: "+checkBoxes);

        for(WebElement checkBox:checkBoxes){
            String checkBoxValue=checkBox.getAttribute("value");
            System.out.println(checkBoxValue);
            if(checkBoxValue.equalsIgnoreCase("yellow")){
                checkBox.click();
                break;
            }

            }
        }
    }


