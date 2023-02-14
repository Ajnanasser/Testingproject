package POMtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
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
}
