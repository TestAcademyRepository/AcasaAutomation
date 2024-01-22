package utility;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.Status;

public class BaseTest 
{
	public static WebDriver driver = null;
	public static WebDriverWait wait;
	
	@BeforeSuite
	public void display1() 
	{
		ExtentManager.setExtent();
	}
	
	@AfterSuite
	public void display2() 
	{
		ExtentManager.endReport();
	}
	
	@BeforeClass
	public void openBrowser() throws InterruptedException 
	{
		DesiredCapabilities cap = new DesiredCapabilities();

		ChromeOptions options = new ChromeOptions();

//		options.addArguments("--headless");
		options.addArguments("enable-automation");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notifications");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-extensions");
		options.addArguments("--test-type");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");
		options.addArguments("--window-size=1920,1080");
		options.addArguments("--disable-gpu");
		options.addArguments("--dns-prefetch-disable");
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		options.setExperimentalOption("w3c", true);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

		driver = new ChromeDriver(options);
//		driver = new ChromeDriver();
	
		System.out.println("Test on Chrome");
//		driver.get("https://www.acasa.ae/");
		driver.get(TestUtils.getPropertiesData("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public static void explicitWaitMethod(WebDriver driver,WebElement element) 
	{
		wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public boolean isElementVisible(WebElement element,String msg)
	{
		boolean result = false;
		try
		{
			if(element.isDisplayed())
			{
				TestUtils.log().info(msg);
				ExtentManager.test.log(Status.PASS,msg);
				result = true;
			}
			else 
			{
				TestUtils.log().error("Faild:"+msg);
				ExtentManager.test.log(Status.FAIL,msg);
				result = false;
			}
		}
		catch(Exception e)
		{
			TestUtils.log().error("Exception generated:"+ e);
			ExtentManager.test.log(Status.FAIL,msg);
			result = false;
		}
		return result;
	}

	public boolean clickElement(WebElement element,String msg)
	{
		boolean result = false;
		try 
		{
			element.click();
			TestUtils.log().info(msg);
			ExtentManager.test.log(Status.PASS,msg);
			result = true;
		}
		catch(Exception e)
		{
			TestUtils.log().error("Failed:"+msg+" | "+ e);
			ExtentManager.test.log(Status.FAIL,msg);
			result = false;
		}
		return result;

	}


//	public boolean enterData(WebElement element, String data)
//	{
//		element.sendKeys(data);
//	}

	
	@AfterClass
	public void closeBrowser() 
	{
		driver.quit();
	}
	
}
