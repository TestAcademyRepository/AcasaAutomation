package pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseTest;

public class Header extends BaseTest
{
	@FindBy(xpath="//img[@src='https://www.acasa.ae/public/assets/logo.png.webp']")
	private WebElement acasaLogoBTN;
	
	
	
	
	
	
	public Header() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
