package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/account/login?ret=%2Fwishlist");
Thread.sleep(2000);
WebElement search = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
search.sendKeys("9629394908");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("amuthi08panima");
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("women maxi");
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(2000);
WebElement dress = driver.findElement(By.xpath("(//img[@class='_2r_T1I'])[1]"));
dress.click();
Thread.sleep(1000);

driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL' and @type='button']")).click();
}
}

