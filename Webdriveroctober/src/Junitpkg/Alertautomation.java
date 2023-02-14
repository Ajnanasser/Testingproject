package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertautomation {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("file:///E:/software%20testing/JAVA/alert.html");
}
@Test
public void test()
{
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	Alert a=driver.switchTo().alert();
	String alerttext=a.getText();
	if(alerttext.equals("Hello!!I am an alert box"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	a.accept();
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("ajna");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("nasser");
}
}
