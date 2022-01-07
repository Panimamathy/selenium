package selenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshort {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		

		
		
		
		
		
}
}
