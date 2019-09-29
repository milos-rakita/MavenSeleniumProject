package NewSWtestacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrviTestNG {

    WebDriver driver ;

    @BeforeClass
    void SetUp(){
        System.setProperty("webdriver.gecko.driver","/home/rakita/Documents/SeleniumDatoteke/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    void getTitleFromPage(){
        String title =  driver.getTitle();
        System.out.println("title> "+ driver.getTitle());
        Assert.assertEquals("Software Test Academy",title);
    }

    @AfterClass
    void tearDown(){
        driver.close();
    }
}
