package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ListenersClass extends ExtentManager implements ITestListener
{
	TakesScreenshot takesScreenshot;
	
	public void onTestStart(ITestResult result) 
	{
		test = extent.createTest(result.getMethod().getDescription()); 
	}

//	@Override
//	public void onTestSuccess(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestSuccess(result);
//	}

	
	public void onTestFailure(ITestResult result) 
	{
		takesScreenshot = (TakesScreenshot) BaseTest.driver;
		File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd.HH.mm.ss");
	LocalDateTime now = LocalDateTime.now();
	String currentDate = dtf.format(now);
	System.out.println("Current date: "+currentDate);
		
	String path="./screenshots/"+currentDate+"_"+result.getName()+" Failed"+".png";
		
	System.out.println("screenshot path:- "+path);
	String base64="";
	try {
		FileUtils.copyFile(screenshot, new File(path));
		FileInputStream is = new FileInputStream(path);
		byte[] ssByte = IOUtils.toByteArray(is);
		base64 = Base64.encodeBase64String(ssByte);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
//this code will add the screenshot to the ExtentReport	
	if (result.getStatus() == ITestResult.FAILURE) 
	{
		try {
			test.log(Status.FAIL,
						MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			test.log(Status.FAIL,
						MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));

			test.addScreenCaptureFromBase64String(base64);
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}

//	@Override
//	public void onTestSkipped(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
//	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
//	}
//
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
//	}
//
//	@Override
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onStart(context);
//	}
//
//	@Override
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context);
//	}
	
	
	
	
	
	
	
	
	
	
}
