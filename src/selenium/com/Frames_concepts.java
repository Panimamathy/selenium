package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_concepts {
 
 public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\hp\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement single = driver.findElement(By.id("singleframe"));
    driver.switchTo().frame(single);
    System.out.println("singleframe");
    
    
    WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
    text.sendKeys("selenium");
    Thread.sleep(2000);
    
    driver.switchTo().defaultContent();
    System.out.println("defaultcontent");
    
    WebElement iframe = driver.findElement(By.linkText("Iframe with in an Iframe"));
    iframe.click();
    
    WebElement outer = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width: 600px']"));
    driver.switchTo().frame(outer);
    System.out.println("outer frame");
   
    
    WebElement inner = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
    driver.switchTo().frame(inner);
    System.out.println("inner frame");
    
    WebElement textlink = driver.findElement(By.xpath("//input[@type='text']"));
    textlink.sendKeys("testing");
    
    driver.switchTo().parentFrame();
    driver.switchTo().parentFrame();
    System.out.println("hai");
    
    
    
    
    
 }
 
	
	
}
