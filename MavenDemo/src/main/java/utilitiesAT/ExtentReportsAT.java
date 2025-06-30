package utilitiesAT;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsAT {
	 private static ExtentReports extent;

	    public static ExtentReports getReportInstance() {
	        if (extent == null) {
	            String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
	            ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
	            reporter.config().setReportName("Automation Test Report");
	            reporter.config().setDocumentTitle("Login Test Report");

	            extent = new ExtentReports();
	            extent.attachReporter(reporter);
	            extent.setSystemInfo("Tester", "Pooja");
	            extent.setSystemInfo("Environment", "QA");
	        }
	        return extent;
	    }
	}


