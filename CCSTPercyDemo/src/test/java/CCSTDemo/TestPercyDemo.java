package CCSTDemo;

import io.percy.selenium.Percy;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPercyDemo {
    static WebDriver driver;
    static Percy percy;

    @BeforeAll
    public static void setup()
    {
        driver = new ChromeDriver();
        percy = new Percy(driver);
    }
    @Test
    public void homePage() {
        driver.get("https://www.saucedemo.com/");
        percy.snapshot("SauceLabs Page");
    }
    @AfterAll
    public static void teardown()
    {
        driver.quit();
    }

}
