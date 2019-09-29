package SeleniumGuru99BANK;
/*
http://www.demo.guru99.com/V4/
http://demo.guru99.com/V4/
User ID :	mngr225937
Password :	vAtArEn
*/
import Data.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValideteGuruSite  {

    WebDriver driver;
    String url = "http://www.demo.guru99.com/V4/";

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
    void VerifyLoginSuccesfull(){
        String userId= "mngr225937";
        String pass = "vAtArEn";
        WebElement userid = driver.findElement(By.xpath("//input[@name='uid']"));
        userid.sendKeys(userId);
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(pass);
        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        btnLogin.click();
        Assert.assertEquals("Guru99 Bank Manager HomePage",driver.getTitle());
    }

    //Proveriti kad se klikne na login na praynu formu dali iskoci popup sa obavetsenjem

    //proveriri sa nevalidnim podacima kakav popup se dobije



}
