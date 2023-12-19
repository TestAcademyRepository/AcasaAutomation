package utility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

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
		driver = new ChromeDriver();
		System.out.println("Test on Chrome");
		//driver.get("https://www.acasa.ae/");
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
			wait = new WebDriverWait (driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(element));

			if(element.isDisplayed())
			{
				TestUtils.log().info(msg);
				result = true;
			}
			else 
			{
				TestUtils.log().error("Faild:"+msg);
				result = false;
			}
		}
		catch(Exception e)
		{
			TestUtils.log().error("Exception generated:"+ e);
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
			result = true;
		}
		catch(Exception e)
		{
			TestUtils.log().error("Failed:"+msg+" | "+ e);
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
