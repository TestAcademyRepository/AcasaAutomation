package testcase;

import org.testng.annotations.Test;

import pageObject.Header;
import utility.BaseTest;

public class Header_TC extends BaseTest
{
	@Test(description = "Header_TC")
	public void head() 
	{
		Header hdr = new Header();
	}
}
