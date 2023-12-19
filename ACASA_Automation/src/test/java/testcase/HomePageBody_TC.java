package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePageBody;
import utility.BaseTest;


public class HomePageBody_TC extends BaseTest
{
    @Test(description = "HomePageBody_TC")
	public void hpb() 
	{
		HomePageBody hp = new HomePageBody(driver);
		
		boolean checkbtn = hp.clickLearnMore();
		Assert.assertEquals(checkbtn,true, "failed to click on btn");
	}

}
