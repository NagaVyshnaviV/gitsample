import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    driver.get("https://www.stqatools.com/demo/DoubleClick.php");
	    Actions action= new Actions(driver);
	    WebElement btn=driver.findElement(By.xpath("//button[contains(text(),'Click Me / Double Click Me!')]"));
	    action.doubleClick(btn).perform();
	    //To take screenshot
	    //1.download commons-io-2.8.0-bin from Binaries in https://commons.apache.org/proper/commons-io/download_io.cgi
	    //2.Add those jars
	    TakesScreenshot screen=(TakesScreenshot)driver;
	    File scr=screen.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scr,new File("D:\\Selenium\\Screenshots\\file1.png"));
	}

}
