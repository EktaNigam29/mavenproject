package testCase_POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon_POM.Add_wishlist;
import Amazon_POM.HOmepage_amazon;
import utility_packages.DataDrivenTesting;
@Listeners(utility_packages.Listen1.class)

public class TestCase4 extends Launch_Quit
{
	@Test(retryAnalyzer=utility_packages.RetryLogic.class)
	public void purchase() throws EncryptedDocumentException, IOException
	{
		HOmepage_amazon h1=new HOmepage_amazon(driver);
		h1.accountandlist(driver);
		h1.serach();
		
		//DataDrivenTesting d1=new DataDrivenTesting();
		//d1.credentials();
	
	Add_wishlist a1=new Add_wishlist(driver);
	a1.shoe_shop(driver);
	a1.wish();

}

}
