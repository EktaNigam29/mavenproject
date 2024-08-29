package testCase_POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon_POM.HOmepage_amazon;
import Amazon_POM.Login_Amazon;
import utility_packages.DataDrivenTesting;
import utility_packages.Listen1;
@Listeners(utility_packages.Listen1.class)
public class TestCase1 extends Launch_Quit 


{
@Test
//(retryAnalyzer=utility_packages.RetryLogic.class)
public void login_amazon() throws EncryptedDocumentException, IOException
{
	

	HOmepage_amazon h1=new HOmepage_amazon(driver);
	h1.accountandlist(driver);
	h1.sigin();
	
	DataDrivenTesting d1=new DataDrivenTesting();
	d1.credentials();
	Login_Amazon l1=new Login_Amazon(driver);
	l1.un();
	l1.cont1();
	l1.pwd();
	l1.signin();
//	boolean a= l1.price_tag().isDisplayed();
//	Assert.assertEquals(a, true, "Failed");
	
	
}
}