package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonpgm {

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
		Boolean radio_select=driver.findElement(By.xpath("//table[2]/tbody[1]/tr[24]/td[3]/input[1]")).isSelected();
		if(radio_select)
		{
			System.out.println("radio button is selected");
		}
		else
		{
			System.out.println("Radio button is not selected");
		}
	}
}
