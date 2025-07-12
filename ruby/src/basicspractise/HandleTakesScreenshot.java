package basicspractise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class HandleTakesScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);

//		// through TYPECASTING...
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		// Take screenshot and store in heap area
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		// but we want in our location..
//		// path + filename + extension
//		File dest = new File("D:\\kcda30\\AutomationProject\\screenshots\\googleImage.jpg");
//		// copy from src and paste it in dest
//		Files.copy(src, dest);

//			// thru Downcasting..
//				RemoteWebDriver rwd = (RemoteWebDriver)driver;
//		File src = rwd.getScreenshotAs(OutputType.FILE);
//		File dest = new File("D:\\kcda30\\AutomationProject\\screenshots\\google.png");
//		
//		Files.copy(src, dest);

		// thru Eventfiringwebdriver class
//		EventFiringWebDriver ef = new EventFiringWebDriver(driver);
//
//		File src = ef.getScreenshotAs(OutputType.FILE);
//		File dest = new File("D:\\kcda30\\AutomationProject\\screenshots\\google.png");
//		Files.copy(src, dest);

		// Taking screenshot of particular webelement..
		 WebElement googlelogo = driver.findElement(By.xpath("//img[@alt=\"Google\"]"));
	File src = googlelogo.getScreenshotAs(OutputType.FILE);
	File dest = new File("D:\\kcda30\\AutomationProject\\screenshots\\googlelogo.png");
	Files.copy(src, dest);
	}

}
