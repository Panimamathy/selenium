package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginscript {

	
	public void loginTopplication(){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.name("username")).sendKeys("Panimamathy");
		driver.findElement(By.name("password")).sendKeys("VaVa98");
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		driver.quit();
		
		
	}
}
