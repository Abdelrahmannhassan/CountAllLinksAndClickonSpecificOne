package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ResultPage extends PageBase{

    public String actualTitle = "";
    By countAllLinks = By.xpath("//div[@class='yuRUbf']");
    List<WebElement> allLinks = driver.findElements(countAllLinks);


    public ResultPage (WebDriver driver) {
        super(driver);
    }

    public void count (){
        WebElement q ;
        System.out.println("Total Count of links = "+ allLinks.size());

         int webElementIndex =0;

        for (int i = 0; i < allLinks.size(); i++) {
            if (allLinks.get(i).getText().contains("Gumtree")){
                System.out.println("TageName : " + allLinks.get(i).getTagName());
                System.out.println("Location : " + allLinks.get(i).getLocation());
                webElementIndex = i;

            }
        }
        q = allLinks.get(webElementIndex);
        q.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        actualTitle = driver.getTitle();


    }
}
