package login.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageATclass {
	
	WebDriver driver;
	public LoginPageATclass(WebDriver driver) {
		this.driver = driver;
	}
	By usernameID = By.id("username");
	By passwordID = By.xpath("//input[@id='password']");
	By submitBTN = By.xpath("//button[@id='submit']");
	
	public void LoginPageATclass(String username,String password) {
		driver.findElement(usernameID).clear();
		driver.findElement(usernameID).sendKeys(username);
		driver.findElement(passwordID).clear();
		driver.findElement(passwordID).sendKeys(password);
		driver.findElement(submitBTN).click();
		
	}
}
				