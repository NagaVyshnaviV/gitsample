import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	   /* driver.get("https://demo.opencart.com/");
	    driver.findElement(By.xpath("//a[contains(text(),'Software')]")).click();
	    js.executeScript("history.go(-1)");
	    System.out.println(driver.getCurrentUrl());
	    js.executeScript("history.go(1)");
	    System.out.println(driver.getCurrentUrl());*/
	    driver.get("http://demo.automationtesting.in/Datepicker.html");
	    js.executeScript("document.querySelector('#datepicker1').value='30/03/2021'");

	}

}
