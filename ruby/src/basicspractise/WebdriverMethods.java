package basicspractise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// enter the url
		driver.get("https://www.google.co.in");

		// maximize the browser window
		driver.manage().window().maximize();

		// captures url of current webpage
		String url = driver.getCurrentUrl();
		System.out.println(url);

		String srccode = driver.getPageSource();
		if (srccode.contains("Google")) {
			System.out.println("Google");
		} else {
			System.out.println("not there");
		}

		// capture tittle of webpage
		String tittle = driver.getTitle();
		if (tittle.equals("Google")) {
			System.out.println("Google page is displayed");
		} else {
			System.out.println("Google page is not displayed ");
		}
  /*
		// change the size of browser window
		Dimension dim = new Dimension(400, 100);
		driver.manage().window().setSize(dim);

		// change the position of browser window
		Point p = new Point(800, 300);
		driver.manage().window().setPosition(p);

		// pause execution for 3 seconds
		Thread.sleep(3000);

		// Alternate way to enter url
		driver.navigate().to("https://www.flipkart.com/");

		// Go to previous page
		driver.navigate().back();

		Thread.sleep(2000);

		// go to forward
		driver.navigate().forward();

		Thread.sleep(2000);

		// Refresh the page
		driver.navigate().refresh();
   */
	}

}
