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
	
	@FindBy(xpath="//a[@class='menu-item item_212']")
	private WebElement ready_to_move_in_property_link; 
	
	
	
	
	
	public Header() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean cheakACASALogo() 
	{
		boolean result=false;
		try
		{
			explicitWaitMethod(driver, acasaLogoBTN);
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
	
	public boolean cheakRTMP_Link() 
	{
		boolean result=false;
		try
		{
			explicitWaitMethod(driver, ready_to_move_in_property_link);
			isElementVisible(ready_to_move_in_property_link,"ready_to_move_in_property_link is present");
			result=true;
		}
		catch(Exception e)
		{
			TestUtils.log().error(e);
			ExtentManager.test.log(Status.FAIL, "ready_to_move_in_property_link is not present");
			result=false;
		}
	return result;
	}
	
	public boolean clickRTMP_Link() 
	{
		boolean result=false;
		try 
		{
			clickElement(ready_to_move_in_property_link, "ready_to_move_in_property_link is clickable");
			result=true;
		}
		catch(Exception e) 
		{
			TestUtils.log().error(e);
			ExtentManager.test.log(Status.FAIL, "ready_to_move_in_property_link is not clickable");
			result=false;
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
