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
	@FindBy(xpath="//img[@src='https://www.acasa.ae/public/assets/logo.svg']")
	private WebElement acasaLogoBTN;
	
	@FindBy(xpath="//a[@class='nav-link  dropdown  m-hide']")
	private WebElement buyBTn;
	
	@FindBy(xpath="//a[@class='menu-item item_212']")
	private WebElement ready_to_move_in_property_link; 
	
	
	
	
	
	public Header() 
	{
		PageFactory.initElements(driver, this);
	}
	


	
	public boolean checkACASALogo() 
	{
		boolean result=false;
		try
		{
//			explicitWaitMethod(driver, acasaLogoBTN);
			result = isElementVisible(acasaLogoBTN,"ACASA Logo is present");
			
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
			result = clickElement(acasaLogoBTN, "ACASA Logo is clickable");
		
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
//			explicitWaitMethodForVisiblity(driver, ready_to_move_in_property_link);
			result = isElementVisible(ready_to_move_in_property_link,"ready_to_move_in_property_link is present");
			
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
			result = clickElement(ready_to_move_in_property_link, "ready_to_move_in_property_link is clickable");
			
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
