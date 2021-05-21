package seleniumreview.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandelWindowDemo1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumReviewBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://swagger.io/tools/swaggerhub/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String homePage=driver.getWindowHandle();
        System.out.println(homePage);

        WebElement Link1=driver.findElement(By.xpath("//a[@href='https://bitbar.com/?utm_medium=referral&utm_source=swagger.io&utm_campaign=footer']"));
        Link1.click();
        //click on some icon on the new tab
        Set<String> allhandels = driver.getWindowHandles();

        Iterator<String> iterator=allhandels.iterator();
        homePage=iterator.next();

        String link1Handle=iterator.next();
        System.out.println("The handle for link1 "+link1Handle);
        driver.switchTo().window(link1Handle);
        WebElement link2=driver.findElement(By.xpath("//a[@href='https://www.youtube.com/user/BitbarChannel/']"));
        link2.click();

        //get the link2 window handle
        allhandels=driver.getWindowHandles();
        iterator=allhandels.iterator();

        int handle_no=2;
        String value=null;
        String link2handle="";

        for(int i=0;iterator.hasNext();i++){
            value=iterator.next();
            if(i==handle_no){
                link2handle=value;
                System.out.println("This is a link 2 handle "+link2handle);
                break;
            }
        }

        driver.switchTo().window(homePage);
        driver.switchTo().window(link2handle);
        driver.switchTo().window(link1Handle);

        driver.close();


    }
}
