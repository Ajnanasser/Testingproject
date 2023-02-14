package TestNGpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouptest {

	WebDriver driver;
	String url="http://www.google.com";
	@BeforeTest(alwaysRun = true)
	public void setup()
	{
	  driver=new ChromeDriver();
	 
	}
	@BeforeMethod(alwaysRun = true)
	public void urlmethod()
	{
		 driver.get(url);
	}
	@Test(groups = {"smoke","sanity"})
	public void test()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	@Test(groups = {"smoke"} )
	public void test1()
	{
		System.out.println("hello");
	}
	@Test(groups = {"smoke"} )
	public void tes2()
	{
		System.out.println("hi");
	}
	
	@Test(groups = {"regression"} )
	public void test3()
	{
		System.out.println("how r u?");
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
