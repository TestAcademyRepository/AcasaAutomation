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
	
	
	@FindBy (xpath = "//a[contains(text(),'Learn More')]")
	private WebElement learnMore;
	
	@FindBy (xpath = "//label[contains(@for,'pro_1932')]//label[1]")
	private WebElement compareButton;
	
	@FindBy (xpath = "//textarea[contains(@aria-describedby,'select2-keyword-container')]")
	private WebElement searchField;	
	
	@FindBy (xpath="//div[contains(@class,'togg box type_togg')]")
	private WebElement inputType;
	
	@FindBy (xpath = "//div[@class='togg box bed_togg drop_active']")
	private WebElement inputBedrooms;
	
	@FindBy (xpath = "//div[@class='box p_togg']")
	private WebElement inputSelectprice;
	
	
			
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public HomePageBody() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean checkSearchfield()
	{
		boolean result = false;
		try 
		{
//			BaseTest.explicitWaitMethodForVisiblity(driver, searchField);
			isElementVisible(searchField, "SearchField is visible");
			result = true;
		}
		
		catch(Exception e) 
		{
			TestUtils.log().error(e);
		    ExtentManager.test.log(Status.FAIL, "Learn more btn is not visible");
			result=false;
		}
		return result;

		
		
	}
	
//	public boolean cheakLearnMoreBTN() 
//	{
//		boolean result=false;
//		try
//		{
//			BaseTest.explicitWaitMethod(driver, learnMore);
//			isElementVisible(learnMore, "learnMore button is visible");
//			result=true;
//		}
//		catch(Exception e)
//		{
//			TestUtils.log().error(e);
//			ExtentManager.test.log(Status.FAIL, "Learn more btn is not visible");
//			result=false;
//		}
//		return result;
//	}
//	
//	public boolean clickLearnMore() 
//	{
//		boolean result=false;
//		try 
//		{
//			clickElement(learnMore, "learnMore button is clickable");
//			result=true;
//		}
//		catch(Exception e) 
//		{
//			TestUtils.log().error(e);
//			ExtentManager.test.log(Status.FAIL, "Failed to click on learnMore button");
//			result=false;
//		}
//		return result;
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
