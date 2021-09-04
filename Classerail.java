package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classerail {
	/*https://erail.in/
		1. Enetr the from station as ms
		2. Enetr the To stationa as mdu
		3. Uncheck the Sort By date
		4. Count the number of trains available
		5. Get the names of all the train and store it in a list
		6. Sort the train names 
		   use Collections.sort()*/
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
