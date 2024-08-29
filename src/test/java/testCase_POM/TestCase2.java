package testCase_POM;

//import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon_POM.HOmepage_amazon;
import Amazon_POM.Login_Amazon;
import Amazon_POM.Search_amazon;
import utility_packages.DataDrivenTesting;
@Listeners(utility_packages.Listen1.class)
public class TestCase2 extends Launch_Quit


{
@Test
//(retryAnalyzer=utility_packages.RetryLogic.class)
public void search_product() throws InterruptedException, EncryptedDocumentException, IOException
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
	Search_amazon a4=new Search_amazon(driver);
	a4.book(driver);
	a4.children();
	//a4.range();
	//a4.hit();
	a4.cb(driver);
	//a4.button_arrow();
	//a4.pd();
	a4.addto_cart();
	a4.oneitem();
	//a4.remove1();
//String d=	a4.empty_cart().getText();
//Assert.assertEquals(d, "0"," failed");
	
	a4.buyy();
	/*a4.buyy1();
	boolean b=driver.getCurrentUrl().contains("addressselect");
	Assert.assertEquals(b, true, "failed");*/
	

}
}
