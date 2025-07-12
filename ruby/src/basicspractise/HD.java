package basicspractise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HD {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Html%20Files/MultipleDropdown.html");

		WebElement ddadrs = driver.findElement(By.id("novotel"));
		Select sel = new Select(ddadrs);
		
		////// Handling duplicates/////
		///////////////////////////////
		//////set(Interface)////////////
		
		///// HASHSET CONCEPT... Remove duplicates, insertion order not maintained..

//		List<WebElement> alloptions = sel.getOptions();
//			
//			HashSet<String> allText = new HashSet<String>();
//		for (int i = 0; i<= alloptions.size()-1; i++) 
//		{
//			String text = alloptions.get(i).getText();
//			allText.add(text);
//			//System.out.println(text);
//		}
//		
//		for( String oneText:allText)
//		{
//		System.out.println(oneText);	
//		}
		
		///////// LINKEDHASHSET CONCEPT..... Remove duplicate, order is maintained..

//		List<WebElement> alloptions = sel.getOptions();
//
//		LinkedHashSet<String> allText = new LinkedHashSet<String>();
//		for (int i = 0; i <= alloptions.size()-1; i++) {
//			String text = alloptions.get(i).getText();
//			allText.add(text);
//			// System.out.println(text);
//		}
//
//		for (String oneText : allText) {
//			System.out.println(oneText);
//		}

			////// TREESET CONCEPT...... Remove duplicate, sorted order..
		
		List<WebElement> alloptions = sel.getOptions();

		TreeSet<String> allText = new TreeSet<String>();
		for (int i = 0; i <= alloptions.size()-1; i++) {
			String text = alloptions.get(i).getText();
			allText.add(text);
			// System.out.println(text);
		}

		for (String oneText : allText) {
			System.out.println(oneText);
		}

	}

}
