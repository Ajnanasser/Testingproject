package TestNGpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload_au3test {

	WebDriver driver;
	String url="https://www.ilovepdf.com/word_to_pdf";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	
	}
	@Test
	public void test() throws IOException
	{
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Runtime.getRuntime().exec("E:\\software testing\\selenium\\fileupload.exe");
	}
}
