package week4.day2;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//double click
		WebElement findElementsByXPath = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		Actions builder = new Actions(driver);
		builder.doubleClick(findElementsByXPath).perform();
		Thread.sleep(5000);
		//drag and drop
		WebElement source = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement target = driver.findElement(By.xpath("//li[text()='Item 5']"));
		builder.dragAndDrop(source,target).perform();
		Thread.sleep(5000);
		//mouse hover
	    WebElement source1 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		builder.moveToElement(source1).perform();
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		builder.dragAndDropBy(findElement, 100, 100).perform();
		
		
		
		
		
		
		
	}

}
