package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	
	WebElement findmail = driver.findElement(By.id("ap_email"));
	findmail.sendKeys("9629394908");
	
	driver.findElement(By.id("continue")).click();
	
	driver.findElement(By.id("ap_password")).sendKeys("Panima@01");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("samsung");
}
	
}
