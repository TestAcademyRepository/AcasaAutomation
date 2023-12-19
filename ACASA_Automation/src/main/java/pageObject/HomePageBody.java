package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utility.BaseTest;
import utility.ExtentManager;
import utility.TestUtils;

public class HomePageBody extends BaseTest
{
	BaseTest bt = new BaseTest();
	
	@FindBy (xpath = "//a[contains(text(),'Learn More')]")
	private WebElement learnMore;
	
	@FindBy (xpath = "//label[contains(@for,'pro_1932')]//label[1]")
	private WebElement compareButton;
	
	
	
	public HomePageBody(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean clickLearnMore() 
	{
		boolean result=false;
		try 
		{
			BaseTest.explicitWaitMethod(driver, learnMore);
			bt.isElementVisible(learnMore, "learnMore button is visible");
			bt.clickElement(learnMore, "learnMore button is clickable");
			TestUtils.log().info("click on learnMore button");
			ExtentManager.test.log(Status.PASS, "click on learnMore button");
			return result=true;
			
		}
		catch(Exception e) 
		{
			TestUtils.log().error(e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on learnMore button");
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
