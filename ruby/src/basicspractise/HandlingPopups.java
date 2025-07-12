package basicspractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		driver.get("file:///D:/Html%20Files/Alert.html");
//		driver.manage().window().maximize();

		// Handling Alert popup..
//		driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
//		Thread.sleep(1000);
//		Alert al = driver.switchTo().alert();
//		Thread.sleep(1000);
//		System.out.println(al.getText());
//		al.accept();

		// Handling confirmation popup..
//		driver.get("file:///D:/Html%20Files/confirmationpopup.html");
//		driver.manage().window().maximize();
//
//		driver.findElement(By.xpath("//button[text()=\"I Love You\"]")).click();
//		Thread.sleep(1000);
//		Alert alp = driver.switchTo().alert();
//		System.out.println(alp.getText());
//
//		// alp.accept();
//		Thread.sleep(3000);
//		alp.dismiss();

		// Hidden division popup....

		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//button[contains(@class,'flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900')]"))
				.click();
		Thread.sleep(2000);
		
		//scroll down page.
		RemoteWebDriver rw = (RemoteWebDriver) driver;
		rw.executeScript("window.scrollBy(320, 313)");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@aria-label,'Mon Mar 31 2022')]/descendant::div[text()='31']"))
				.click();

	}

}
