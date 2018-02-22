package wellsfargo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://lab.csschopper.com/placeholder/");
		
		driver.findElement(By.xpath("(//input[@value='Browse'])[1]")).sendKeys("C:\\Users\\ADMIN\\Desktop\\padukas_of_sri_narasimha_saraswati_at_narasobachi_wadi_temple.gif");

	}

}
