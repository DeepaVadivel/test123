package test123Deeoa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Datadrivens {
public static void main(String args[]) throws InterruptedException
{
	

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa.vadivel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='nav-line-2'][text()='Your Orders']")).click();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.name("email")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#ap_password")).sendKeys("");
		driver.findElement(By.cssSelector("input#signInSubmit")).click();
		Thread.sleep(2000);
	}
}

