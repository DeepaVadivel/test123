package test123Deeoa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionCla {

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/deepa.vadivel/Downloads/chromedriver_win32/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
//		   driver.navigate().to("http://www.google.com");
//		   driver.manage().window().maximize();
//		   WebElement tq=driver.findElement(By.linkText("Images"));
//		   //driver.navigate().to("http://www.seleniumeasy.com/test/input-form-demo.html");
//		   //WebElement link=driver.findElement(By.xpath("//a[@class='dropdown-toggle'][1][contains(text(),'Input Forms')]"));
//		   Actions ac=new Actions(driver);
//		   ac.moveToElement(tq);
//		   ac.contextClick(tq).build().perform();
//		   String t=driver.getWindowHandle();
//		   driver.switchTo().alert();
//		   WebElement f=driver.findElement(By.linkText("Open link in new tab"));
//		   f.click();
		  driver.navigate().to("http://www.simpleimageresizer.com/online-image-converter#.W6stDdMzY2y");
		  driver.manage().window().maximize();
		  WebElement tq= driver.findElement(By.cssSelector("input.button.blue.large"));
		  tq.click();
		  Runtime.getRuntime().exec("C:\\Users\\deepa.vadivel\\Documents\\fileTest.exe");
		  
		  
		 // tq.sendKeys("C:\\Users\\deepa.vadivel\\Desktop\\smoke test\\Create Account 1.png");
//		  Actions ac=new Actions(driver);
//		  ac.contextClick(t).click().build().perform();
//		  WebElement tq=driver.findElement(By.xpath(xpathExpression))
		  
		  
		   
		   
		   //link.sendKeys(Keys.CONTROL+"t");
		   Thread.sleep(3000);
		   //driver.close();
	}

}
