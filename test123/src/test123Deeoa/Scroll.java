package test123Deeoa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/deepa.vadivel/Downloads/chromedriver_win32/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.navigate().to("https://www.seleniumhq.org/");
	       JavascriptExecutor js=(JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,1000)");
	       Thread.sleep(3000);
	       js.executeScript("window.scrollBy(0,-1000)");
	       Thread.sleep(3000);
	       driver.close();
	}

}
