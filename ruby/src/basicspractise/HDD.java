package basicspractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDD {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\kcda30\\AutomationProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement abc = driver.findElement(By.name("q"));
		abc.sendKeys("qspiders");

		List<WebElement> alloptions = driver
				.findElements(By.xpath("//ul[@class=\"G43f7e\"]/descendant::li[@class=\"sbct\"]"));
		Thread.sleep(3000);
		System.out.println(alloptions.size());

//		driver.get("https://www.cleartrip.com/");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
