package wellsfargo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("http://naukri.com");
		Set<String> wh = driver.getWindowHandles();
		System.out.println(wh.size());
		
		for ( String whs : wh)
		{
			String ret = driver.switchTo().window(whs).getTitle();
			System.out.println(ret);
		}
		
		driver.quit();

	}

}
