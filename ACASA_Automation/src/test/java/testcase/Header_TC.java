package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Header;
import utility.BaseTest;

public class Header_TC extends BaseTest
{
	@Test(description = "Header_TC")
	public void head() 
	{
		Header hdr = new Header();
		
		boolean cheaklogo = hdr.cheakACASALogo();
		Assert.assertEquals(cheaklogo, true,"ACASA Logo is not present");
		
		boolean clickLogo = hdr.clickACASAlogo();
		Assert.assertEquals(clickLogo, true,"Failed to click on ACASA Logo");
		
		boolean cheakLink = hdr.cheakRTMP_Link();
		Assert.assertEquals(cheakLink, true,"Link is not present");
		
		boolean clickLink =hdr.clickRTMP_Link();
		Assert.assertEquals(clickLink, true,"Failed to click on RTMP Link");
		
		
	}
}
