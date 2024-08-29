package Amazon_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility_packages.DataDrivenTesting;

public class Login_Amazon extends DataDrivenTesting  {

	
	ChromeDriver driver;
	//step1
	
	@FindBy(xpath="(//a[.='Start here.'])[1]")
	WebElement start_here;
	
		@FindBy(name="email")
		WebElement username;
		
		@FindBy(id="continue")
		WebElement cont;
		
		@FindBy(name ="password")
		WebElement password;
		
		@FindBy(id="signInSubmit")
		WebElement sigin_button;
		
		
		//step2
	
		
	
		/*public void start()
		{
			
			start_here.click();
		}*/
		public void un()
		{
		//username.sendKeys("ektamurarka81@gmail.com" +Keys.ENTER);
		//username.sendKeys("9560044390" +Keys.ENTER);//step4-passed
			username.sendKeys(un1);
			//username.sendKeys(Keys.ENTER);
		}
/*		public WebElement price_tag()
		{
			return start_here;
			
			
		} */
		
		public void cont1()
		{
			
			cont.click();
			
			
		}
		public void pwd()
		{
			//password.sendKeys("" + Keys.ENTER);
			password.sendKeys(pwdd);
			//password.sendKeys(Keys.ENTER);
			//cont.click();
		
		}
		public void signin()
		{
			
			sigin_button.click();
		}
		
		
		//step3
		
		public Login_Amazon(ChromeDriver driver)
		
		{
			
			PageFactory.initElements(driver, this);
		}
	}


	
