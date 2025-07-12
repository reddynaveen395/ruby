package basicspractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectionsMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///D:/Html%20Files/myfirstwebpage.html");
		WebElement Linkaddress = driver.findElement(By.tagName("a"));
		Linkaddress.click();

	}

}
