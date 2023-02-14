package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import POMtest.Orangehrmbaseclass;

public class Orangehrmloginpage extends Orangehrmbaseclass {

	WebDriver driver;
	By username=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By password=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By login=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	
	
	public  Orangehrmloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String uname,String pwd)
	{
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
	}
	public void login1() {
		driver.findElement(login).click();
	}
}

