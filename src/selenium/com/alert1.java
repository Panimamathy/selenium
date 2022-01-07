package selenium.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	Thread.sleep(2000);
	Alert al = driver.switchTo().alert();
	al.sendKeys("PANIMA");
	al.accept();

	}
}
