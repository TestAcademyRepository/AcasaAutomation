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
	
	
	@FindBy (xpath = "//a[contains(text(),'Learn More')]")
	private WebElement learnMore;
	
	@FindBy (xpath = "//label[contains(@for,'pro_1932')]//label[1]")
	private WebElement compareButton;
	
	
	
	public HomePageBody(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean cheakLearnMoreBTN() 
	{
		boolean result=false;
		try
		{
			BaseTest.explicitWaitMethod(driver, learnMore);
			isElementVisible(learnMore, "learnMore button is visible");
			result=true;
		}
		catch(Exception e)
		{
			TestUtils.log().error(e);
			ExtentManager.test.log(Status.FAIL, "Learn more btn is not visible");
			result=false;
		}
		return result;
		
	}
	public boolean clickLearnMore() 
	{
		boolean result=false;
		try 
		{
			clickElement(learnMore, "learnMore button is clickable");
			result=true;
		}
		catch(Exception e) 
		{
			TestUtils.log().error(e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on learnMore button");
			result=false;
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
