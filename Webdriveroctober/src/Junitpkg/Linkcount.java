package Junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
}
@Test
public void linktest()
{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("Total no of links= "+li.size());
	//to display the links
	System.out.println("Links are:= ");
	for(WebElement link:li){
		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
		 }
}
}
