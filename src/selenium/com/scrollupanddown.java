package selenium.com;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupanddown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    
    
    WebElement scroll_down = driver.findElement(By.xpath("//a[text()='Australia']"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", scroll_down);

    Thread.sleep(3000);
    WebElement scroll_up = driver.findElement(By.xpath("//span[text()='Daily essentials']"));
    js.executeScript("arguments[0].scrollIntoView();", scroll_up);
    
    System.out.println("========using pixel=========");
    Thread.sleep(5000);
    js.executeScript("window.scrollBy(0,8000");
    Thread.sleep(5000);
    js.executeScript("window.scrollBy(0,-4000");
    
    
   
    
    
}}
