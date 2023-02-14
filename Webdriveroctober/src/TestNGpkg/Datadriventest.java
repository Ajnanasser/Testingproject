package TestNGpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test() throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\software testing\\Datadriven\\Book1.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);//workbook
		XSSFSheet sh=w.getSheet("sheet1");//sheet
		int rowcount=sh.getLastRowNum();//rowcount
		for(int i=1;i<=rowcount;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username= "+username);
			String pwd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password= "+pwd);
			driver.get("https://www.facebook.com");
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(pwd);
			driver.findElement(By.name("login")).click();
			
		}
		
		
		
	}
	}

