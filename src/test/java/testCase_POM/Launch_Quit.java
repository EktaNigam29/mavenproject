package testCase_POM;

import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import utility_packages.Listen1;
//@Listeners(utility_packages.Listen1.class)
//import utility_packages.Listen_program;

public class Launch_Quit extends Listen1{
	
	
 //ChromeDriver driver;
@BeforeMethod
public void Launch_Browser()
{
	
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	
@AfterMethod 
public void quit_browser() throws InterruptedException
{
	Thread.sleep(2000);
//	driver.quit();
}
	
	
	
	

}
