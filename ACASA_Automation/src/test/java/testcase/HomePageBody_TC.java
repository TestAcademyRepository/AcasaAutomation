package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePageBody;
import utility.BaseTest;


public class HomePageBody_TC extends BaseTest
{
    @Test(description = "HomePage_TC")
	public void hpb() 
	{
		HomePageBody hp = new HomePageBody();
		
		boolean cheackbtn = hp.cheakLearnMoreBTN();
		Assert.assertEquals(cheackbtn,true, "learnMore button is not visible");
		
		boolean clickbtn = hp.clickLearnMore();
		Assert.assertEquals(clickbtn,true, "failed to click on btn");
	}

}
