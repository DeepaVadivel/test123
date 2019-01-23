package test123Deeoa;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleScreen {
	
	
	public static void takeScreenshot(WebDriver driver, String name)
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:/Users/deepa.vadivel/pictures/screnshot/"+name+".png");
		try
		{
		FileUtils.copyFile(src, destFile);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/deepa.vadivel/Downloads/chromedriver_win32/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       
		
		driver.navigate().to("http://www.seleniumeasy.com/test/input-form-demo.html");
		takeScreenshot(driver, "screenshot1");
		driver.manage().window().maximize();
		WebElement tg=driver.findElement(By.name("first_name"));
		
		tg.sendKeys("deepa");
		takeScreenshot(driver, "screenshot2");
		driver.close();
	}

}
