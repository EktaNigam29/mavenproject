package testCase_POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon_POM.HOmepage_amazon;
import Amazon_POM.Login_Amazon;
import Amazon_POM.Registration;
import utility_packages.DataDrivenTesting;
@Listeners(utility_packages.Listen1.class)
public class TestCase3 extends Launch_Quit
{@Test(retryAnalyzer=utility_packages.RetryLogic.class)
	public void register() throws EncryptedDocumentException, IOException
	{
	HOmepage_amazon h1=new HOmepage_amazon(driver);
	h1.accountandlist(driver);
	Login_Amazon l1=new Login_Amazon(driver);
	//l1.start();
	//DataDrivenTesting d1=new DataDrivenTesting();
	//d1.credentials();
	Registration r1=new Registration(driver);
	//r1.start();
	r1.emaill();
	r1.cont1();
	r1.submit();
	r1.phonenumber();
	r1.firstname();
	r1.password();
	r1.verify();
	}	
	
	
	
	
	
	
}
