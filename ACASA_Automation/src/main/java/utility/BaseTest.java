package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest 
{
	public static WebDriver driver = null;
	public static WebDriverWait wait;
	
	@BeforeClass
	public void openBrowser() 
	{	
		driver = new ChromeDriver();
		driver.get("https://www.acasa.ae/");
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		driver.quit();
	}
	
}
