package basicspractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\ruby\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// maximize the browser..
		driver.manage().window().maximize();
		
		//Get the login page..
		driver.get("https://demo.actitime.com/login.do");
		
		// verify actual tittle with expected tittle
		String logintittle = driver.getTitle();
		
		if(logintittle.equals("actiTIME - Login"))
		{
			System.out.println("Login page is displayed, Test is PASSED");
		}
		else 
		{
			System.out.println("LOgin page is not displayed, Test is FAILED");
		}
		
		// enter valid USERNAME in username textfield..
		driver.findElement(By.name("username")).sendKeys("admin");
		
		// enter valid PASSWORD in password textfield..
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		// click on login button..
		driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();
	
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		// get home page tittle
		String hometittle = driver.getTitle();
		System.out.println(hometittle);
		
		// verify actual title is equals to expected title
		if(hometittle.equals("actiTIME - Enter Time-Track"))
		{
		System.out.println("Home page is displayed.. : PASSED");	
		}
		else 
		{
			System.out.println("Home page is not displayed.. : FAILED");
		}
		
	}

}
