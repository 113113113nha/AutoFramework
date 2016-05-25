import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestCase {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.navigate().to("http://tuoitre.vn");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @org.testng.annotations.Test
    public void test() {
        System.out.println("Config success");
        System.out.println(driver.getTitle());

        WebElement body = driver.findElement(By.tagName("body"));
        System.out.println( body.getAttribute("innerHTML"));
        Assert.assertTrue(driver.getTitle().contains("tin nóng"));
    }

    @AfterTest
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
        }
    }

}
