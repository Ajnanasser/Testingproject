package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {

	WebDriver driver;
	//to create repositories
	By fbmail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	
	//constructor
public Fbloginpage(WebDriver driver)
{
	this.driver=driver;
}
	public void setvalues(String email,String password)
	{
		driver.findElement(fbmail).sendKeys(email);
		driver.findElement(fbpassword).sendKeys(password);
	}
	public void login() {
		driver.findElement(fblogin).click();
	}
}
