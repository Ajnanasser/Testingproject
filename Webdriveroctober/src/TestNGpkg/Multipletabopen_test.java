package TestNGpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Multipletabopen_test {

	WebDriver driver;
	String url="https://demo.guru99.com/popup.php";
	@BeforeTest
	public void setup()   
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void setup1()
	{
		driver.get(url);
		
	}
	@Test
	public void browseropen()
	{
		
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			System.out.println(handle);
			//display parent window
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com",Keys.ENTER);
				driver.close();
			}
			driver.switchTo().window(parentwindow);
			
		}
		
		
		
	}
}
