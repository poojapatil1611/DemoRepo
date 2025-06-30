package test2.com;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Base.com.BaseclassNew;
import login.com.HomePageATclass;
import login.com.LoginPageATclass;
@Listeners(listners.com.MyListners.class)
public class TestATclass extends BaseclassNew {
	LoginPageATclass loginpage;
	HomePageATclass  homepage;
	

	    @BeforeClass
	    public void startBrowser() {
	        setup();
	        ExtentReports extent;
	        ExtentTest test;
	      //  extent = ExtentReportManager.getReportInstance();
	    }
	    @Test(dataProvider = "loginData")
	    public void verifyLogin(String username, String password, boolean shouldPass) {
	        driver.get("https://practicetestautomation.com/practice-test-login/");
	        loginpage = new LoginPageATclass(driver);
            homepage = new HomePageATclass(driver);
            
	        loginpage.LoginPageATclass(username, password);
//
//	        if (shouldPass) {
//	            Assert.assertTrue(homepage.isLoginsucces(), "Expected login to succeed but failed");
//	        } else {
//	            Assert.assertFalse(isLoginSuccessSafe(), "Expected login to fail but passed");
//	        }
	    }

	    // To prevent NoSuchElementException
	    public boolean isLoginSuccessSafe() {
	        try {
	            return driver.findElement(By.xpath("//h1[text()='Logged In Successfully']")).isDisplayed();
	        } catch (Exception e) {
	            return false;
	        }
    }

	    @DataProvider(name = "loginData")	   
	    public Object[][] loginCredentials() {
	        return new Object[][] {
	            {"student", "Password123", true},      // valid
	           {"student", "wrongpass", false},       // invalid
            {"wronguser", "Password123", false},   // invalid
            {"", "", false}                        // empty fields
	        };
	    }

	    @AfterClass
	    public void closeBrowser() {
	        teardown();
	    }
	}


