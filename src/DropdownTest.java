import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    driver.manage().window().maximize();
	    driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	   // driver.findElement(By.xpath("//select[@id='select-demo']")).click();
	   // driver.findElement(By.xpath("//option[@value='Tuesday']")).click();
	    Select singleSel=new Select(driver.findElement(By.id("select-demo")));
	    singleSel.selectByVisibleText("Tuesday");
	    singleSel.selectByValue("Saturday");
	    
	    Select multiSel=new Select(driver.findElement(By.id("multi-select")));
	    if(multiSel.isMultiple())
	    {
	    	multiSel.selectByValue("New York");
	    	multiSel.selectByIndex(2);
	    	multiSel.selectByVisibleText("Texas");
	    	List<WebElement> list1=multiSel.getAllSelectedOptions();
	    	System.out.println("No of cities: "+list1.size());
	    	multiSel.deselectByValue("New York");
	    }

	}

}
