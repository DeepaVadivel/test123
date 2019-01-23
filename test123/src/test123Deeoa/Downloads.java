package test123Deeoa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Downloads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa.vadivel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
			String xp1 = "//h1[.='Block 1']";
			WebElement block1 = driver.findElement(By.xpath(xp1));
			String xp2 = "//h1[.='Block 3']";
			WebElement block3 = driver.findElement(By.xpath(xp2));
			Actions actions = new Actions(driver);
			// drag block 1 element and drop it on block 2 element 
			actions.dragAndDrop(block1, block3).perform();
		Thread.sleep(2000);


	}

}
