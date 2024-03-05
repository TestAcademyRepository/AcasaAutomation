package pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utility.BaseTest;
import utility.ExtentManager;
import utility.TestUtils;

public class HomePageBody extends BaseTest
{
	
	
	@FindBy (xpath = "//a[contain(text(),'Learn More')]")
	private WebElement learnMore;
	
	@FindBy (xpath = "//label[contains(@for,'pro_1932')]//label[1]")
	private WebElement compareButton;
	
	
	
	public HomePageBody() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean cheakLearnMoreBTN() 
	{
		boolean result=false;
		try
		{
			BaseTest.explicitWaitMethod(driver, learnMore);
			result = isElementVisible(learnMore, "learnMore button is visible");
		}
		catch(Exception e)
		{
			TestUtils.log().error(e);
			ExtentManager.test.log(Status.FAIL, "Learn more btn is not visible");
		}
		return result;
	}
	
	public boolean clickLearnMore() 
	{
		boolean result=false;
		try 
		{
			result = clickElement(learnMore, "learnMore button is clickable");
		}
		catch(Exception e) 
		{
			TestUtils.log().error(e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on learnMore button");
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
