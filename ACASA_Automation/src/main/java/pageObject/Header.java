package pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utility.BaseTest;
import utility.ExtentManager;
import utility.TestUtils;

public class Header extends BaseTest
{
	@FindBy(xpath="//img[@src='https://www.acasa.ae/public/assets/logo.png.webp']")
	private WebElement acasaLogoBTN;
	
	
	
	
	
	
	public Header() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean cheakACASALogo() 
	{
		boolean result=false;
		try
		{
			BaseTest.explicitWaitMethod(driver, acasaLogoBTN);
			isElementVisible(acasaLogoBTN,"ACASA Logo is present");
			result=true;
		}
		catch(Exception e)
		{
			TestUtils.log().error(e);
			ExtentManager.test.log(Status.FAIL, "ACASA Logo is not present");
			result=false;
		}
	return result;
	}
	
	public boolean clickACASAlogo() 
	{
		boolean result=false;
		try 
		{
			clickElement(acasaLogoBTN, "ACASA Logo is clickable");
			result=true;
		}
		catch(Exception e) 
		{
			TestUtils.log().error(e);
			ExtentManager.test.log(Status.FAIL, "ACASA Logo is not clickable");
			result=false;
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
