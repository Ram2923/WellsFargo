package wellsfargo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://actimind.com");
		
		WebElement hover = driver.findElement(By.xpath("(//a[@class='c-link dropdown-toggle'])[1]"));
		
		Actions actions = new Actions (driver);
		actions.moveToElement(hover).perform();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Web Crawling']"))).click();
		
		

	}

}
