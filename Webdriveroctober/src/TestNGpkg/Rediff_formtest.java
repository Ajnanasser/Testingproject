package TestNGpkg;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Rediff_formtest {

WebDriver driver;
String url="http://register.rediff.com/register/register.php?FormName=user_details";
@BeforeTest(alwaysRun = true)
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod(alwaysRun = true)
public void setup1()
{
	driver.get(url);
	
}

@Parameters("logo")
@Test(priority = 1)
public void logotest(String l)
{
	
	Boolean logo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	if(logo)
	{
		System.out.println("Logo is present");
	}
	else
	{
		System.out.println("Logo is not present");
	}
}
@Parameters("create")
@Test(priority = 2)
public void createaccounttag(String c)
{
	
	Boolean redifftitle=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[1]/td")).isDisplayed();
	if(redifftitle)
	{
		System.out.println("create rediff account title is visible");
	}
	else
	{
		System.out.println("create rediff account title is visible");
	}
}
@Parameters("value")
@Test(priority = 3)
public void valuepassing(String value)
{
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Ajnanasser");
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("ajna@rediffmail.com");
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
	String check=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
	if(check.equals("Check availability"))
	{
		System.out.println("Text is same");
	}
	else
	{
		System.out.println("Text is not same");
	}
	driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("ABC@1234");
	driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("ABC@1234");
	String pass=driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).getAttribute("name");
	String fail=driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).getAttribute("name");
	
	if(pass.equals(fail))
	{
		System.out.println("password is match");
	}
	else
	{
		System.out.println("password is not match");
	}
	driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("abc@rediffmail.com");
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
	Boolean checkbox=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
	if(checkbox)
	{
		System.out.println("Checkbox is on");
	}
	else
	{
		System.out.println("checkbox is off");
	}
	

	driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("9854217620");
	WebElement countrycode=driver.findElement(By.xpath("//*[@id=\"lbl_txt\"]"));
	Select country=new Select(countrycode);
	country.selectByVisibleText("+91");
	List<WebElement> l=country.getOptions();
	System.out.println("Total countrycode  "+l.size());

	if(l.size()==50)
	{
		System.out.println("The count of country code is 50");
	}
	else
	{
		System.out.println("The count of country code is not 50");
	}
	WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select s=new Select(day);
	s.selectByVisibleText("01");
	
	
	WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select s1=new Select(month);
	s1.selectByVisibleText("JAN");
	
	
	WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	Select s2=new Select(year);
	s2.selectByVisibleText("2020");
	
	WebElement male=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
	male.click();
	
	
	WebElement cname=driver.findElement(By.xpath("//*[@id=\"country\"]"));
	Select country_name=new Select(cname);
	country_name.selectByVisibleText("India");
	WebElement city=driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
	Select city_name=new Select(city);
	city_name.selectByVisibleText("Cochin");
	
	
}
}
