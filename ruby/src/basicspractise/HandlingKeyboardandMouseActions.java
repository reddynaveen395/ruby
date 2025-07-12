package basicspractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.awt.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyboardandMouseActions {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "D:\\kcda30\\AutomationProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.flipkart.com/");
		// driver.get("https://www.amazon.in/");
		// driver.get("https://demo.actitime.com/login.do");
//		driver.get("file:///D:/Html%20Files/myfirstwebpage.html");
//		driver.manage().window().maximize();

		// driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
//		MOUSE HOVER ACTIONS....
		/////////////////////////////////////
//		Actions ac = new Actions(driver);
//		//WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
//		WebElement more = driver.findElement(By.xpath("//span[text()=\"Prime\"]"));
//		Thread.sleep(2000);
//		ac.moveToElement(more).perform();

//		WebElement untb = driver.findElement(By.xpath("//input[@name=\"username\"]"));
//		untb.sendKeys("admin");
//		
//		Actions ac = new Actions(driver);
//		ac.doubleClick(untb).perform();
//		
		//////////////////////////////////////////////////////
		// RIGHT CLICK AND KEYBOARD ACTIONS....

//		Actions ac = new Actions(driver);
//		WebElement linktext = driver.findElement(By.linkText("GOOGLY"));
//		ac.contextClick(linktext).perform();
//		
//		Robot r = new Robot();
	
		
		

		/////////////////// DRAG AND DROP/////////////////////

//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		Actions ac = new Actions(driver);
//		WebElement src = driver.findElement(By.id("box7"));
//		WebElement dest = driver.findElement(By.id("box107"));
//		ac.dragAndDrop(src, dest).perform();

///////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////// TASK    //////////////////////////
		driver.get("https://demo.actitime.com/");
		 WebElement untb = driver.findElement(By.id("username"));
		untb.sendKeys("admin");
		untb.sendKeys(Keys.CONTROL,"a");
		untb.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(2000);
		//untb.sendKeys(Keys.CONTROL,"ac"); shortcut way to write.. select and copy.. the text..
		driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL,"v");
		
		
		
		
	}

}
