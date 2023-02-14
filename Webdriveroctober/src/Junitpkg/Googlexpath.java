package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlexpath {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("http://www.google.com");
}
@Test
public void test()
{
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("wikipedia");
	driver.findElement(By.xpath("//input[@name='btnK']")).click();
}
}
