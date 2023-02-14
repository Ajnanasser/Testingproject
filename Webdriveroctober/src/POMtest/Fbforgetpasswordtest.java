package POMtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMpages.Fbforgetpasswordpage;

public class Fbforgetpasswordtest {
	WebDriver driver;
	String url="https://www.facebook.com";
	@BeforeTest
	public void befrtest() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void befrmethd()
	{
		driver.get(url);
	}
	@Test
	public void passwordtest()
	{
		Fbforgetpasswordpage ob=new Fbforgetpasswordpage(driver);
		
		ob.forgtpwd();
		ob.setvalues("abc@gmail.com");
	}
}
