package basicspractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSynchronization {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();

		driver.findElement(By.xpath("//span[text()=\"Cart\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();

	}

}
