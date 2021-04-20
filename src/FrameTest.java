import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    driver.manage().window().maximize();
	    //IMPLICIT WAIT- used only once in program. Applicable only for findElement and findElements
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.get("https://chercher.tech/practice/frames");
	    String label=driver.findElement(By.xpath("//label/span")).getText();
	    System.out.println("Label value: "+label);
	   // driver.switchTo().frame(0);
	    driver.switchTo().frame("frame1");
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
	    driver.switchTo().frame("frame3");
	    WebElement chkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	    if(!chkbox.isSelected())
	    {
	    	chkbox.click();
	    }
	    driver.switchTo().parentFrame();
	   // Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='text']")).clear();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bonjour");
	    driver.switchTo().defaultContent();
	    label=driver.findElement(By.xpath("//label/span")).getText();
	    System.out.println("Label value: "+label);
	    
	}

}
