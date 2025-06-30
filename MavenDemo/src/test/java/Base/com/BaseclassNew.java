package Base.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseclassNew {

    public static WebDriver driver;

    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
	

