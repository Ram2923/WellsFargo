package wellsfargo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.findElements(By.xpath(""));

	}

}
