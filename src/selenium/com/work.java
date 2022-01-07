package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class work extends BaseClass {
	
	
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		driver = getDriver("chrome");
		getUrl("https://www.youtube.com/");
		getCurrentUrl();
	
		
		
		

	}

	
		
	}


