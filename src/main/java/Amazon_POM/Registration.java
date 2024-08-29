package Amazon_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_packages.DataDrivenTesting;

public class Registration extends DataDrivenTesting{

	ChromeDriver driver;
	//step1
		/*@FindBy(id="nav-link-accountList")
		WebElement accountlist;
		@FindBy(xpath="(//a[.='Start here.'])[1]")
		WebElement start_here*/
		
		@FindBy(name="email")
		WebElement emaill;
		
		@FindBy(xpath="//input[@class='a-button-input']")
		WebElement cont;
		@FindBy(xpath="//input[@class='a-button-input']")
		WebElement proceed;
		@FindBy(id="ap_phone_number")
		WebElement phone_number;
		@FindBy(id="ap_customer_name")
		WebElement name;
		@FindBy(id="ap_password")
		WebElement pwd;
		@FindBy(xpath="//input[@class='a-button-input']")
		WebElement phone;
		
		
		
		
		//step2
		/*public void accountandlist(ChromeDriver driver)
		{
			Actions a1=new Actions(driver);
			a1.moveToElement(accountlist).perform();
			a1.click();
		}
		
		
	
		public void start()
		{
			
			start_here.click();
		}*/
		public void emaill()
		{
			emaill.sendKeys("ekta.nigam29@gmail.com" + Keys.ENTER);
		}
		public void cont1()
		{
			cont.click();
		}
		public void submit()
		{
			proceed.click();
		}
		public void phonenumber()
		{
			phone_number.sendKeys("8448328519"+Keys.ENTER);
		}
		public void firstname()
		{
			name.sendKeys("Ekta Nigam"+Keys.ENTER);
		}
	
			public void password()
		{
			pwd.sendKeys("Nissan@2024"+Keys.ENTER);
		}
			
			public void verify()
			{
				phone.click();
			}
		//step3
		
		public Registration(ChromeDriver driver)
		
		{
			
			PageFactory.initElements(driver, this);
		}
	}


	
	
	
	

