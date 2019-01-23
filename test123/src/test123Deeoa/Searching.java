package test123Deeoa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searching {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa.vadivel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List <WebElement> es=driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a"));
		
		for(int i=0;i<es.size();i++)
		{
		Thread.sleep(4000);		
	    JavascriptExecutor js = (JavascriptExecutor) driver; 
	    WebElement g=es.get(i);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", g);
		Thread.sleep(4000);	
		js.executeScript("arguments[0].setAttribute('style', 'all: none;');", g);
		}
		
		System.out.println("success");
		driver.close();

	}

}
