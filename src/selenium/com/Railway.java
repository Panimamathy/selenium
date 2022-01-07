package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Railway {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.google.co.in/");
	 
	
	driver.findElement(By.name("q")).sendKeys("Railway ticket booking");
	driver.findElement(By.xpath("//input[@type='text']")).click();
	
}
}

