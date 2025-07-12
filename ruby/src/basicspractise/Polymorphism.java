package basicspractise;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Polymorphism {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.out.println("Enter Browser Name ???");
	
		  Scanner sc = new Scanner(System.in);
		  String browserName = sc.next();
	
		  if(browserName.equals("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			  driver = new ChromeDriver();
		  }
		  else if(browserName.equals("firefox")) 
		  {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			  
		  }
		  else
		  {
			  System.out.println("hello mister... give proper browsername");
		  }
		 // driver.close();
		  
	}

}
