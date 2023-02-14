package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbforgetpasswordpage {

	WebDriver driver;
	By forgetpassword=By.xpath("//*[contains(text(),'Forgotten password')]");
	By fbemail=By.id("identify_email");
	
	
	public Fbforgetpasswordpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void forgtpwd()
	{
		driver.findElement(forgetpassword).click();
	}
	public void setvalues(String email)
	{
		driver.findElement(fbemail).sendKeys(email);
	}
	
	
}
