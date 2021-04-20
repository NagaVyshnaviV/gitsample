import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();  
		    driver.get("file:///D:/Selenium/Login.html");
		    driver.findElement(By.cssSelector("input[name=username]")).sendKeys("Taehyung");
		   // driver.findElement(By.cssSelector("input[name=password]")).sendKeys("Jungkook");
		   // driver.findElement(By.cssSelector("#pwd")).sendKeys("Jungkook");
		    driver.findElement(By.cssSelector("input#pwd")).sendKeys("Jungkook");
		   // driver.findElement(By.cssSelector(".password")).sendKeys("Jungkook");
		  //  driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Jungkook");
		    driver.findElement(By.cssSelector("input[type=submit]")).click();
	}

}
