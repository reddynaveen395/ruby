package basicspractise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowPopups {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Handling Browser Notifications...
//		System.setProperty("webdriver.chrome.driver", "D:\\kcda30\\AutomationProject\\drivers\\chromedriver.exe");
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--disable-notifications");
//		co.addArguments("start-maximized");
//		
//		
//		//Open the chrome browser with the settings..
//		WebDriver driver = new ChromeDriver(co);
//		
//		driver.get("https://www.yatra.com/");

//		System.setProperty("webdriver.chrome.driver", "D:\\kcda30\\AutomationProject\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.yatra.com/");
//		driver.manage().window().maximize();
//		
		// driver.findElement(By.id("BE_flight_origin_date")).click();
//////////////////////////////////////////////////////////////////////////////////

		// HAndling Window Popups...

		System.setProperty("webdriver.chrome.driver", "D:\\kcda30\\AutomationProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Upload Resume\"]")).click();
		Thread.sleep(4000);

		driver.findElement(By.id("file-upload")).click(); // click on upload button..
		
		Runtime.getRuntime().exec("D:\\fileuploadscript.exe");

	}

}
