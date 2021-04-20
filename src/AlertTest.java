import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    driver.manage().window().maximize();
	    driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	    //normal alert
	    driver.findElement(By.xpath("//button[contains(text(),'Click me!')][1]")).click();
	    Alert alert = driver.switchTo().alert();
	    System.out.println("Alert Message: "+alert.getText());
	    Thread.sleep(1000);
	    alert.accept();
	    
	    WebDriverWait wait=new WebDriverWait(driver,15);
	    
        //confirm alert
	    driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg' and contains(text(),'Click me!')]")).click();
	    wait.until(ExpectedConditions.alertIsPresent()); //EXPLICIT WAIT
	    Alert confirm = driver.switchTo().alert();
	    System.out.println("Confirm Message: "+confirm.getText());
	    //Thread.sleep(1000);
	    confirm.dismiss();
	    //prompt alert
	    driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
	    Alert prompt = driver.switchTo().alert();
	    System.out.println("Prompt Message: "+prompt.getText());
	    prompt.sendKeys("Hello Baby");
	    Thread.sleep(1000);
	    prompt.accept();
	    
	    
	    
	}

}
