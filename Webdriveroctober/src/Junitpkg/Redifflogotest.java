package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflogotest {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("http://www.rediff.com");
}
@Test
public void test()
{
	driver.findElement(By.xpath("//p[@id='signin_info']/a[2]")).sendKeys("create",Keys.ENTER);
	Boolean logo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	if(logo)
	{
		System.out.println("Logo is presnet");
	}
	else
	{
		System.out.println("Logo is not present");
	}
}
}
