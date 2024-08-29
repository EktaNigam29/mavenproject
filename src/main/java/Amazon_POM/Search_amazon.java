package Amazon_POM;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Search_amazon {
	
	ChromeDriver driver;
	//step1
		@FindBy(id="searchDropdownBox")
		WebElement search;
		
		@FindBy(id="twotabsearchtextbox")
		WebElement books;
		@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
		WebElement children_book;
		@FindBy(xpath="(//i[@class='a-icon a-icon-next'])[2]")
		WebElement button;
		@FindBy(xpath="(//a[@class='a-link-normal celwidget'])[1]")
		WebElement product_details;
		@FindBy(xpath="(//span[@class='nav-line-2'])[3]")
		WebElement cart1;
		//@FindBy(xpath="(//input[@class='a-color-link'])[1]")
		//WebElement delete;
		@FindBy(xpath="(//input[@type='submit'])[2]")
		WebElement buy;
		
		/*@FindBy(className="s-range-input")
		WebElement price;
		@FindBy(className="a-button-input")
		WebElement go;*/
		@FindBy(id="add-to-cart-button")
		WebElement cart;		
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement empty;
		//step2
		public void book(ChromeDriver driver)
		{
			Select s1=new Select(search);
			s1.selectByVisibleText("Books");
		}
		
		
		public void children() throws InterruptedException
		{
			
			books.sendKeys("children"+Keys.ENTER);
			Thread.sleep(2000);
		}
		
		/*public void range()
		{
			price.sendKeys("₹0\r\n"
					+ "–\r\n"
					+ "₹680");
		}
		public void hit()
		{
			go.click();
		}*/
		
		public void cb(ChromeDriver driver)
		{
			children_book.click();
			Set<String>	s1=driver.getWindowHandles();
			Iterator<String> s2=s1.iterator();
			String parentid=s2.next();
			String child=s2.next();
			driver.switchTo().window(child);
			
		}
		public void button_arrow()
		{
			button.click();
		}
		public void pd() {
			
			product_details.click();
		}
		public void addto_cart()
		{
			cart.click();
		}
		public void oneitem()
		{
			cart1.click();
		}
		/*public void remove1()
		{
			delete.click();
			
			
		}
		public WebElement empty_cart()
		{
			return empty;
		}*/
		public void buyy()
		{
			buy.click();
		}
		public WebElement buyy1()
		{
			return buy;
		}
		//step3
		
		public Search_amazon(ChromeDriver driver)
		
		{
			
			PageFactory.initElements(driver, this);
		}
	}


	



