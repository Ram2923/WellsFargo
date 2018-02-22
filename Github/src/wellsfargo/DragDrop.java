package wellsfargo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement source = driver.findElement(By.xpath(".//*[@id='draggable']"));
		
		WebElement dest = driver.findElement(By.xpath(".//*[@id='droppable']"));
		
		Actions action = new Actions (driver);
		action.dragAndDrop(source, dest).perform();
				
	}

}
