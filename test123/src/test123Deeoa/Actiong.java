package test123Deeoa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiong {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:/Users/deepa.vadivel/Downloads/chromedriver_win32/chromedriver.exe");
				   WebDriver driver= new ChromeDriver();
				   driver.navigate().to("http://www.google.com");
			   driver.manage().window().maximize();
			   Thread.sleep(2000);
			   WebElement tq=driver.findElement(By.linkText("Images"));
			   tq.click();
			   tq.sendKeys(Keys.F5);
			   Thread.sleep(2000);
			   Actions ac=new Actions(driver);
			   ac.contextClick(tq).perform();
		int x=tq.getLocation().getX();
		Thread.sleep(2000);
		driver.close();

	}

}
