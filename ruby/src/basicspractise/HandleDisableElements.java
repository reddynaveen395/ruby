package basicspractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableElements {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\kcda30\\AutomationProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///D:/Html%20Files/DisableElement.html");
		driver.manage().window().maximize();

		// disable element.. inspect and click on console write JAVASCRIPT
		// "document.getElementById('i2').value="vinay" and press ENTER..
		Thread.sleep(2000);
		driver.findElement(By.id("i1")).sendKeys("admin");
		WebElement pwdtb = driver.findElement(By.id("i2"));
		if (pwdtb.isEnabled()) {
			System.out.println("password textbox is enabled, Handle normally");
			pwdtb.sendKeys("manager");
		} else {
			System.out.println("password textbox is disabled, Handle with JAVASCRIPT");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('i2').value=\"vinay\"");
		}

		
		
		
	}

}
