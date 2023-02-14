package TestNGpkg;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreport {

	WebDriver driver;
	String url="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void befortest()
	{
		//to create look
		reporter=new ExtentHtmlReporter("./reports/myreport.html");
		reporter.config().setDocumentTitle("Automation report");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		//to create report
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows 8.1");
		extent.setSystemInfo("testername", "abc");
		extent.setSystemInfo("browser", "Google chrome");
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void befrmethod()
	{
		driver.get(url);
	}
	@Test
	public void testtitle()
	{
		test=extent.createTest("Fbtitleverification");
		String exp="Facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(exp,actual);
		
	}
	@Test
	public void logotest()
	{
		test=extent.createTest("FbLogotest");
		boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div[1]/img")).isDisplayed();
		
	}
	@AfterTest
	public void aftrtest()
	{
		extent.flush();
	}
	@AfterMethod
	public void aftrmthd(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,"test case failed is"+result.getName());
			test.log(Status.FAIL,"test case failed is"+result.getThrowable());
			String screenshotpath=Extentreport.screenshotMethod(driver,result.getName());
	       test.addScreenCaptureFromPath(screenshotpath);
			
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case is passed is"+result.getName());
		}
	}
	public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination="./screenshot"+screenshotname+".jpeg";
		FileHandler.copy(src,new File(destination));
		return destination;
		
	}
	}
