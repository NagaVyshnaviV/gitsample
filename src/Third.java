import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    driver.get("file:///D:/Selenium/WebTable.html");
	    WebElement ele=driver.findElement(By.xpath("//td[contains(text(),'HardDisk')]//preceding-sibling::td//input[@type='checkbox']"));
	    driver.findElement(By.xpath("//td[contains(text(),'HardDisk')]//preceding-sibling::td//input[@type='checkbox']")).click();
        //following-sibling can also be used
	    Actions action= new Actions(driver);
	    action.contextClick(ele).perform();//context click is right click
	}

}
