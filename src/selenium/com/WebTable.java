package selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
 		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
 		for (WebElement data : alldata) {
			System.out.println(data.getText());
		
		}
 		System.out.println("Particular row");
 		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td"));
 		for (WebElement row : rows) {
			System.out.println(row.getText());
		}
System.out.println("Particular column");
 		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
 		for (WebElement column : columns) {
 			System.out.println(column.getText());
			}
 		System.out.println("data");
 		List<WebElement> data = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
 		for (WebElement datas : data) {
			System.out.println(datas.getText());
		}
 		
 		

 		System.out.println("size");
 		List<WebElement> col_size = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
 		System.out.println(col_size.size());
 		for (WebElement size : col_size) {
 			System.out.println(size.getText());
			
		}
 		
	}
}
