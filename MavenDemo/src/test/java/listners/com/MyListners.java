package listners.com;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import test2.com.TestATclass;

public class MyListners extends TestATclass implements ITestListener{

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart method started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish method started");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		  System.out.println("Test Failed But Within Success Percentage Test Method");

	}

	// When Test case get failed, this method is called.
	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println("The name of the testcase failed is :" + Result.getName());
	}

	// When Test case get Skipped, this method is called.
	@Override
	public void onTestSkipped(ITestResult Result) {
		System.out.println("The name of the testcase Skipped is :" + Result.getName());
	
	
	}

	// When Test case get Started, this method is called.
	@Override
	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName() + " test case started");
	}

	// When Test case get passed, this method is called.
	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println("The name of the testcase passed is :" + Result.getName());
	}

}
