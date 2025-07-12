package basicspractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Html%20Files/Multiplelinks.html");

//			// To get all links..
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
//			
//			//Count no of elements on webpage..
		System.out.println("No of all links = " + alllinks.size());
//			
//			// printing all the text links..
//			for(int i=0; i<alllinks.size();i++) 
//			{
//				WebElement onelink = alllinks.get(i);
//				String text = onelink.getText();
//				System.out.println(text);
//			}

		// clicking on last link
		// alllinks.get(alllinks.size() - 1).click();

		// Handling single element
		WebElement glink = driver.findElement(By.linkText("Google"));
		System.out.println("Tagname is : " + glink.getTagName());
		System.out.println("Text of link is : "+ glink.getText());
		System.out.println("Attribute of link is : "+ glink.getAttribute("href"));

	}

}
