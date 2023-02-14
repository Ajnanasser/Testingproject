package TestNGpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
WebDriver driver;

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void setup1()
{
	driver.get("http://www.google.com");
}
@Parameters("searchvalue")                  
@Test 
public void test(String s)
{
	driver.findElement(By.name("q")).sendKeys(s,Keys.ENTER);
}
}
