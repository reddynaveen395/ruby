package basicspractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingdynamicDropdow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		
		WebElement dd = driver.findElement(By.name("q"));
		Thread.sleep(2000);
		dd.sendKeys("laptops");
		
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class=\"col-12-12 _1MRYA1\"]"));
		alloptions.size();
		for(WebElement al:alloptions)
		{
			System.out.println(al.getText());
		}
		System.out.println(alloptions.size());
		
		
	
	}

}
