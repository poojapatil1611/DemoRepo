package login.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageATclass {
 WebDriver driver;
 
 
 public HomePageATclass( WebDriver driver) {
	 this.driver=driver;
	 
 }
  By SuccessMessage = By.xpath("//h1[@class='post-title']");
   public boolean isLoginsucces() {
	   return driver.findElement(SuccessMessage).isDisplayed();
   }
}
