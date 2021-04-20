

import java.util.List;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class First {  
  
    public static void main(String[] args) throws InterruptedException {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("http://www.google.com");  
     driver.manage().window().maximize();    
    // Click on the search text box and send value  
   WebElement search = driver.findElement(By.name("q")); 
   search.sendKeys("Selenium");
   Thread.sleep(1000);
    // search.submit();
 //  driver.navigate().back();
 //  System.out.println("TITLE: "+driver.getTitle());
 //  driver.navigate().forward();
 //  System.out.println("TITLE: "+driver.getTitle());
    // Click on the search button  
   // driver.findElement(By.name("btnK")).click();  
   System.out.println("LIST OF OPTIONS");
   List<WebElement> ele = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbtc']"));
   for(WebElement e:ele)
   {
	   System.out.println(e.getText());
   }
   
   
    }  
    
  }  