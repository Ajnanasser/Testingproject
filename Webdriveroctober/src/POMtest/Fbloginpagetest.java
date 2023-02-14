package POMtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMpages.Fbloginpage;

public class Fbloginpagetest {

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
	public void Fblogintest()
	{
		Fbloginpage ob1=new Fbloginpage(driver);
		ob1.setvalues("abc@gmail.com", "abc123");
		ob1.login();
	}
}
