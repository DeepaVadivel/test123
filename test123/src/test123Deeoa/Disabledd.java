package test123Deeoa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabledd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa.vadivel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.seleniumeasy.com/test/input-form-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement s=driver.findElement(By.xpath("//input[@name='first_name']"));
		Thread.sleep(3000);
		if(s.isEnabled())
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("disabled");
		}
        driver.close();
	}

}
