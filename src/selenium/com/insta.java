package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("panimamathy");
		driver.findElement(By.name("password")).sendKeys("VaVa98");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
				}
}
