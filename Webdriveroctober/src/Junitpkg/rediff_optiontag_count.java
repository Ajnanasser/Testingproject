package Junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediff_optiontag_count {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//p[@id='signin_info']/a[2]")).sendKeys("create",Keys.ENTER);
		WebElement day=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select s=new Select(day);
		s.selectByVisibleText("01");
		List<WebElement> l=s.getOptions();
		System.out.println("Count of day "+l.size());
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select s1=new Select(month);
		s1.selectByVisibleText("JAN");
		List<WebElement> li=s1.getOptions();
		System.out.println("Count of month "+li.size());
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2020");
		List<WebElement> list=s.getOptions();
		System.out.println("Count of year "+list.size());
	
		
	}
	
}
