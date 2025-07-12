package basicspractise;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//driver.get("file:///D:/Html%20Files/singleDropdown.html");
		driver.get("file:///D:/Html%20Files/MultipleDropdown.html");
		WebElement ddadrs = driver.findElement(By.id("novotel"));
		Select sel = new Select(ddadrs); //dropdown address
		
		//sel.selectByVisibleText("Dosa");
//		sel.selectByValue("e");
//		sel.deselectByValue("panipoori");
		
		// sel.selectByIndex(5);
		
//		ddadrs.click();
//
//		if (sel.isMultiple()) {
//			System.out.println("It is multiple select dropdown");
//		} else {
//			System.out.println("It is not a multiple select drop down");
//		}
		
			List<WebElement> alloptions = sel.getOptions();
//		for(int i=0; i<=alloptions.size()-1;i++)
//		{
//			System.out.println(alloptions.get(i).getText());
//		}
		
		
//		for(int i=0; i<=10;i++)
//		{
//			sel.selectByIndex(i);
//			Thread.sleep(1000);
//		}
//		Thread.sleep(3000);
//		//sel.selectByVisibleText("Dosa");
//		
//		//sel.deselectByVisibleText("Dosa");
//		//sel.deselectByIndex(1);
//		sel.deselectAll();
		
//		for(int i=1;i<=4;i++)
//		{
//			sel.selectByIndex(i);
//		}
//		System.out.println(sel.getFirstSelectedOption().getText());
//		
//		System.out.println(sel.getAllSelectedOptions().size());
		
		System.out.println(sel.getWrappedElement().getText());
		
	}

}
