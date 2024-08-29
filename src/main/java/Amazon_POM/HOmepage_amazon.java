package Amazon_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_packages.DataDrivenTesting;

public class HOmepage_amazon  {

	ChromeDriver driver;
	//step1
		@FindBy(id="nav-link-accountList")
		WebElement accountlist;
		
		@FindBy(xpath="(//span[.='Sign in'])[1]")
		WebElement siginbutton;
		
		@FindBy(id="twotabsearchtextbox")
		WebElement search_product;
		
		
		
		//step2
		public void accountandlist(ChromeDriver driver)
		{
			Actions a1=new Actions(driver);
			a1.moveToElement(accountlist).perform();
		}
		
		
		public void sigin()
		{
			
			siginbutton.click();
		}
		
		public void serach()
		{
			
			search_product.sendKeys("shoes"+Keys.ENTER);
		}
		
		//step3
		
		public HOmepage_amazon(ChromeDriver driver)
		
		{
			
			PageFactory.initElements(driver, this);
		}
	}

