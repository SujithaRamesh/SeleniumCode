package week5.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReports {

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("TC001_CreateLead", "Create a new Lead");
		test.assignAuthor("Aarthi & Sujitha");
		test.assignCategory("Smoke");
		//test.pass("Data DemoSalesManager created successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png")).build();
		test.pass("Data DemoSalesManager entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img3.png").build());
		test.pass("Data crmsfa entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img5.png").build());
		test.pass("Login button is clicked", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img7.png").build());
		
		extent.flush();
	}

}
