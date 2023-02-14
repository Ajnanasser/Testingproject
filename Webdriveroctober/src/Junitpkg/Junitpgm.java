package Junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://ww.google.com");
	}
    @Test
    public void test()
    {
    	String title=driver.getTitle();
    	System.out.println(title);
    }
    @After
    public void close()
    {
    	driver.quit();
    }
    
}
