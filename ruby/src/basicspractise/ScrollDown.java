package basicspractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();

		// in dev tool we have to inspect and go to console and write
		// window.scrollby(x-axis, y-axis) and enter...

		/////// Through TypeCasting..
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,200)");

		// thru DownCasting...
//		RemoteWebDriver rw = (RemoteWebDriver) driver;
//		rw.executeScript("window.scrollBy(0,5000)");

		// scroll down to a perticular element..
		WebElement selsponsers = driver.findElement(By.xpath("//h2[text()=\"Selenium Level Sponsors\"]"));
		org.openqa.selenium.Point loc = selsponsers.getLocation();
		System.out.println(loc);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy" + loc);

	}

}
