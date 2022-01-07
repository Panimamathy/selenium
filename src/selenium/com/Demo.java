package selenium.com;

import org.openqa.selenium.By;

public class Demo extends BaseClass {
	public static void main(String[] args) {
		browser("chrome");
		getUrl("https://www.instagram.com/");
		sendkeys(driver.findElement(By.name("username")), "panimamathy");
		currentUrl(null);	
		
	}

	


	

}