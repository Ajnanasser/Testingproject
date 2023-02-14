package TestNGpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestNGdemo {
	WebDriver driver;
	String url="http://www.google.com";
	@BeforeTest
	public void setup()
	{
	  driver=new ChromeDriver();
	 
	}
	@BeforeMethod
	public void urlmethod()
	{
		 driver.get(url);
	}
	@Test(priority=1,invocationCount = 3)
	public void test()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	@Test(priority = 2,dependsOnMethods = {"test"} )
	public void test1()
	{
		System.out.println("hello");
	}
	
	@AfterMethod
	public void methodafter()
	{
		
	}
	@AfterTest
	public void testafter()
	{
		
	}

}
