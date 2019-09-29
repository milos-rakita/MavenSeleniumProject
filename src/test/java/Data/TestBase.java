package Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends URL {
    WebDriver driver;

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
}
