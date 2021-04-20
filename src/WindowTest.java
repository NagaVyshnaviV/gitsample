import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    driver.manage().window().maximize();
	    driver.get("https://www.stqatools.com/demo/Windows.php");
	    String parent=driver.getWindowHandle();
	    System.out.println("Parent Window: "+parent);
	    driver.findElement(By.xpath("//button[contains(text(),'open new Tab')]")).click();
	    Set<String> windows=driver.getWindowHandles();
	    System.out.println("No of Tabs: "+windows.size());
	   
	    for(String tab:windows)
	    {
	    	System.out.println(tab);
	    	if(!tab.equalsIgnoreCase(parent))
	    	{
	    		
	    		driver.switchTo().window(tab);
	    		System.out.println("Child window :"+tab);
	    		driver.findElement(By.xpath("//span[contains(text(),'Java')][1]")).click();
	    	}
	    }
	     String child=driver.getWindowHandle();
	     driver.switchTo().window(parent);
	     driver.findElement(By.xpath("//button[contains(text(),'open new Window')]")).click();
	     Set<String> tabs=driver.getWindowHandles();	
	     for(String str:tabs)
	     {
	    	if(!str.equalsIgnoreCase(parent) && !str.equalsIgnoreCase(child))
	    	{
	    		driver.switchTo().window(str);
	    		driver.findElement(By.xpath("//button[contains(text(),'New Message')]")).click();
	    	}
	    	 
	     }

	}

}
