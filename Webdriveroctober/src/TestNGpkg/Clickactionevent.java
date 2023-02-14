package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Clickactionevent {
	
	WebDriver driver;
	String url="https://demo.guru99.com/test/simple_context_menu.html";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void setup1()
	{
		driver.get(url);
		
	}
	@Test
	public void click()
	{
		//rightclick
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions click=new Actions(driver);
		//rightclick menu displayed
		click.contextClick(rightclick);
		click.perform();
		WebElement menu=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[2]/span"));
		  menu.click();
		  driver.switchTo().alert().accept();
		   System.out.println("Right click Alert Accepted");
		   
		   //doubleclick action
		   WebElement double_click=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		   click.doubleClick(double_click);
		   click.perform();
		   driver.switchTo().alert().accept();
		   System.out.println("Double click alert accepted");
		   
		}

}
