package selenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlanch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.co.in/");
	    Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    String title = driver.getTitle();
	    System.out.println(title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    driver.close();
	    driver.quit();
	    
	}
	
}