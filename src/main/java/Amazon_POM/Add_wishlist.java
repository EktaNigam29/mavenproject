package Amazon_POM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_packages.DataDrivenTesting;

public class Add_wishlist extends DataDrivenTesting{
	
	ChromeDriver driver;
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement shoe;
	
	@FindBy(xpath="//a[.=' Add to Wish List ']")
	WebElement wishlist;
	
	
	public void shoe_shop(ChromeDriver driver) 
	
	{
		shoe.click();
	Set<String>	s1=driver.getWindowHandles();
	Iterator<String> s2=s1.iterator();
	String parentid=s2.next();
	String child=s2.next();
	driver.switchTo().window(child);
	
	
	
	}
	public void wish()
	{
		wishlist.click();
	}
	public Add_wishlist(ChromeDriver driver)
	
	{
		
		PageFactory.initElements(driver, this);
	}
	
	

}
