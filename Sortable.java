package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		
		//Importing the driver files
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Load the URL
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		//Locating the web elements
		List<WebElement> itemsList = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		
		//Storing from and to web elements 
		WebElement item1=itemsList.get(0);
		WebElement item7=itemsList.get(6);
		
		//Moving item1 to Item7 position
		Actions builder = new Actions(driver);
		builder.clickAndHold(item1).moveToElement(item7).release().perform();
		
		

	}

}