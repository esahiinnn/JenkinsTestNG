package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.rmi.Remote;

public class Test2 {
    RemoteWebDriver driver;
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
        String expectedTitle = "Google";
        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }
}
