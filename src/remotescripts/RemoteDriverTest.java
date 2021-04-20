package remotescripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteDriverTest {

	public static void main(String[] args) throws MalformedURLException {
		//Grid Example
		//First run D:\Selenium>java -jar selenium-server-standalone-3.141.59.jar -role hub in cmd
		//Secondly run  //java –Dwebdriver.chrome.driver=”chromedriver.exe” –jar selenium-server-standalone-3.141.59.jar –role node –hub http://192.168.1.5:4444/grid/register in seperate cmd
		//Run the code as Java Appln
		ChromeOptions options=new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		String strHub="http://192.168.1.10:4444/wd/hub";
		WebDriver driver=new RemoteWebDriver(new URL(strHub),options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com"); 
		 WebElement search = driver.findElement(By.name("q")); 
		 search.sendKeys("Cucumber Tutorial");
		 search.submit();
		 System.out.println("TITLE: "+driver.getTitle());
		  
		

	}

}
