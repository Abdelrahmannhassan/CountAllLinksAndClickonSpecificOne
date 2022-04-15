package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.URL;

public class GoogleSearchPage extends PageBase{

    By SearchBox = By.name("q");


    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }


    public void SearchViatext (){

        driver.findElement(SearchBox).sendKeys("Cars for london");
        driver.findElement(SearchBox).sendKeys(Keys.ENTER);

    }

}

