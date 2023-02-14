package POMtest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POMpages.Orangehrmloginpage;

public class Orangehrmlogintest {
	WebDriver driver;
@Test
public void login()
{
	
	Orangehrmloginpage ob=new Orangehrmloginpage(driver);
	ob.setvalues("Admin","admin123");
    ob.login1();
}
}
