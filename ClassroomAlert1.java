package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomAlert1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		alert.dismiss();
		Thread.sleep(2000);
		String text =driver.findElement(By.xpath("//p[@id='result']")).getText();
		if(text.contains("You Pressed Cnacel"))
		{
			System.out.println("Cancel is clicked");
		}
		else
		{
			System.out.println("ok is Pressed");
		}
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		alert.sendKeys("Edu");
		Thread.sleep(2000);
		alert.accept();
		String text1 =driver.findElement(By.id("result1")).getText();
		if(text1.contains("You should not have enjoyed learning at Edu as compared to"))
		{
			System.out.println("Prommpt pressed as ok");
		}
		else
		{
			System.out.println("Prompt Pressed as cancel");
		}
				
		
		
		
		}
	}


