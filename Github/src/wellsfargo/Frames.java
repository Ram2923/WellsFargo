package wellsfargo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/ADMIN/Desktop/Iframe.html");
		
		

	}

}
