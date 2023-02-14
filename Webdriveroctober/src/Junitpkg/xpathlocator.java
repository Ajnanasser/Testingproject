package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocator {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
    @Test
    public void test()
    {
    	String title=driver.getTitle();
    	System.out.println(title);
    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
    	driver.findElement(By.id("pass")).sendKeys("123");
    	driver.findElement(By.name("login")).click();
    }
}
