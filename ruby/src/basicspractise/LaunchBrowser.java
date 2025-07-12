package basicspractise;

  //import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Eclipse\\\\demo\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("intl.accept_languages","jp");
//		//WebDriver driver1 = new FirefoxDriver(); 
	driver.get("https://www.google.com");
		// will open google in Japanese Lang

//		String s = (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;");
	//	System.out.println("Browser name : " + s);

		
	}

}
