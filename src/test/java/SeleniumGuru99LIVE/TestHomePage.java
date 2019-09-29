package SeleniumGuru99LIVE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage {

    WebDriver driver;
    String url = "http://live.guru99.com/index.php/";

    @BeforeMethod
    void SetUP(){
        System.setProperty("webdriver.gecko.driver","/home/rakita/Documents/SeleniumDatoteke/geckodriver");
        driver = new FirefoxDriver();
        driver.get(url);
    }

    @AfterMethod
    void tearDown(){
        driver.close();
    }

    @Test
    void VerifiHomeTitle(){
        String title = driver.getTitle();
        System.out.println("Title - "+title);
        Assert.assertEquals("Home page",title);
    }

    @Test
    void VerifiTitleSortMobileItem(){
        WebElement btnMenuMobile = driver.findElement(By.xpath("//a[contains(text(),'Mobile')]"));
        btnMenuMobile.click();
        String titleMob = driver.getTitle();
        System.out.println("title Home - "+titleMob);
        Assert.assertEquals("Mobile",titleMob);
        WebElement ddlSortBy = driver.findElement(By.xpath("//div[@class='category-products']/div[1]//select[@title='Sort By']"));
        ddlSortBy.click();
        WebElement ddlItemList = driver.findElement(By.xpath("//div[2]//div[3]/div[1]/div[1]//option[2]"));
        ddlItemList.click();
        WebElement prviEl = driver.findElement(By.xpath("//li[1]//div[1]//h2[1]/a"));
        System.out.println("prvi element - "+prviEl.getText());
        Assert.assertEquals("IPHONE",prviEl.getText());

    }

}
