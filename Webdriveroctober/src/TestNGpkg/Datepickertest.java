package TestNGpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickertest {

	WebDriver driver;
	String url="https://www.expedia.com/";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("	//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		//month selection
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
			String month1=month.getText();
			if(month1.equalsIgnoreCase("March 2023"))
			{
				System.out.println(month1);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
			}
		}
		
		List<WebElement> day= driver.findElements(By.xpath("//*[@id=\"app-layer-datepicker-flights-departure-arrival-start\"]/div[2]/div/div/div[2]/div/div[2]/table/tbody/tr/td/button"));
		for(WebElement dayelement:day)
		{
			String date=dayelement.getAttribute("data-day");
			if(date.equalsIgnoreCase("18"))
			{
				System.out.println(date);
				break;
			}
			else
			{
				dayelement.click();
			}
		}
		
	
		
		
	}
}
