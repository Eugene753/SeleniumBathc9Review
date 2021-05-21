package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import seleniumreview.TestBase.BaseClass;

public class menuPage extends BaseClass {

    public WebElement addbag=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
}
