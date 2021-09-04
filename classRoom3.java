package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.NEWARRAY;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classRoom3 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in/");
	driver.manage().window().maximize();

	// implicit wait - wait for defined element for the given time
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//button[text()='OK']")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElementByPartialLinkText("FLIGHTS").click();
	Set<String> windowHandles=driver.getWindowHandles();
	List<String> windowHandleslist=new ArrayList<String>(windowHandles);
	driver.switchTo().window(windowHandleslist.get(1));
	System.out.println(driver.getTitle());
	String attribute=driver.findElement(By.xpath("//a[@class='d-block font-weight-bold']")).getAttribute("href");
	System.out.println(attribute);
	driver.switchTo().window(windowHandleslist.get(0));
	driver.close();
	
}
}
