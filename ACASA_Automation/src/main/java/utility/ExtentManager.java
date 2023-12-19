package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager
{
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
//	String timeStamp;
	
	public static void setExtent() 
	{
		
		//htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/"+"MyReport_"+BaseClass.getCurrentTime()+".html");
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/AcasaAutomationReport.html");
		htmlReporter.config().setDocumentTitle("Automation Test Report");
		htmlReporter.config().setReportName("Acasa Test Automation Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Comapny Name", "Test Academy Software Testing Services Nagpur");
		extent.setSystemInfo("ProjectName", "ACASA");
		extent.setSystemInfo("Client", "Dubai UAE");
		extent.setSystemInfo("Product Manager", "Imran Ur Rahim");
		extent.setSystemInfo("SDET Engineer", "Mohammad Umair Aafaque");
		extent.setSystemInfo("SDET Engineer", "Mohammad Usman");
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Browser", "Chrome");
	}
		
	
	public static void endReport() 
	{
		extent.flush();
	}
		
		

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

