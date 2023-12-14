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
		driver.get("https://www.acasa.ae/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public static void explicitWaitMethod(WebDriver driver,WebElement element) 
	{
		wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		driver.quit();
	}
	
}
