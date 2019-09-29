package MavenFirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstMavenTest {

    @Test
    void OpenGoogle() {
        System.setProperty("webdriver.gecko.driver","/home/rakita/Documents/SeleniumDatoteke/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https:\\google.com");
        Assert.assertEquals("Google",driver.getTitle());
        driver.quit();
    }

}