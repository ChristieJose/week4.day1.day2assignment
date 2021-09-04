package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class ClassroomLearnFrames {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement frame1=(WebElement) driver.findElements(By.xpath("//iframe[contains(@id='iframeResult')]"));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(),'TRY')]")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		String text=driver.findElement(By.id("demo")).getText();
		if
		
		(text.equalsIgnoreCase("press ok"))
		{
			System.out.println("press ok");
			
		}
		else
		{
			System.out.println("Press cancel");
		}
	}

	
}
