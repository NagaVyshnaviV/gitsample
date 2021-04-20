package script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// First dwnld Apache POI from https://poi.apache.org/download.html  Binary/zip file
//Add lib,ooxml and other jars
//Add excel sheet to the project
//XSSF for .xlsx file
//HSSF for .xls file
public class ExcelDataTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys(readData("username"));
		driver.findElement(By.id("password")).sendKeys(readData("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	public static String readData(String colName) throws IOException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir")+"//src/testData//excelData.xlsx";
		FileInputStream fin = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet loginsheet = workbook.getSheet("loginData");
		int numofrows=loginsheet.getLastRowNum();
		System.out.println("Total no of rows: "+numofrows);
		String colValue="";
		for(int i=0;i<=numofrows;i++)
		{
			XSSFRow row= loginsheet.getRow(i);
			if(row.getCell(0).getStringCellValue().equalsIgnoreCase(colName))
			{
				colValue = row.getCell(1).getStringCellValue();
			}
		}
		workbook.close();
		return colValue;
		
	}

}
