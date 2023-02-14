package Junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Verify;

public class Linkvalidation {

	WebDriver driver;
	String baseurl="http://www.facebook.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test()
	{
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links "+l.size());
		for(WebElement li:l)
		{
			String linkdetails=li.getAttribute("href");
			Verify(linkdetails);
		}
	}
	private void Verify(String linkdetails) {
		try
		{
		URL u=new URL(linkdetails);
		//to change the url to httpurlconnection by using typecasting
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("Status is 200----"+linkdetails);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("Status is 404---"+linkdetails);
		}
		else
		{
			System.out.println("Other response");
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
