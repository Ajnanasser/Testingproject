package POMtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmbaseclass {

	WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public void base()
	{
		driver=new ChromeDriver();
		driver.get(url);
		
	}
}
