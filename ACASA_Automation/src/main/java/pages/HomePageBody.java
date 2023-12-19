package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageBody 
{
	public WebDriver driver = null;
	
	@FindBy (xpath = "//a[contains(text(),'Learn More')]")
	private WebElement learnMore;
	
	@FindBy (xpath = "//label[contains(@for,'pro_1932')]//label[1]")
	private WebElement compareButton;
	
	
	
	public HomePageBody(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	public boolean clickLearnMore() 
	{
		try {
			learnMore.click();
			return true;
			
		}catch(Exception e) 
		{
			System.out.println(e);
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
