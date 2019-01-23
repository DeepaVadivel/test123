package test123Deeoa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IEbrowsers {

	//public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\deepa.vadivel\\Downloads\\IEDriverServer_Win32_2.47.0\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
	@Test
	public void cio() throws Throwable
	{
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\deepa.vadivel\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		/*driver.get("https://www.google.com");
		System.out.println("deepa");
		Thread.sleep(2000);
		WebElement dr=driver.findElement(By.name("q"));
		dr.sendKeys("flowers");
		dr.click();*/
		
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.findElement(By.linkText("Login & Signup"));
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("deepmanju1996@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("mayilsamy");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		WebDriverWait tr= new WebDriverWait(driver, 20);
		tr.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='_25Wjx4'][text()='Offer Zone']")));
		Thread.sleep(2000);
        driver.close();
	}
	}

//}
