package test123Deeoa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\deepa.vadivel\\Downloads\\IEDriverServer_Win32_2.47.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa.vadivel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Login & Signup"));
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("deepmanju1996@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("mayilsamy");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input.LM6RPg ")).sendKeys("washing machines top load");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.vh79eN")).click();
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		WebElement td=driver.findElement(By.cssSelector("#container > div > header > div._1tz-RS > div > div._1Wr4v5 > div:nth-child(1) > div > div > svg>path[class='_2GxHSA']"));
		
		ac.moveToElement(td).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("ul._3Ji-EC li._2sYLhZ:nth-child(9)")).click();
		
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
