package test123Deeoa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/deepa.vadivel/Downloads/chromedriver_win32/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   Thread.sleep(2000);
		   driver.get("https://www.google.com");
		   Thread.sleep(2000);
		   Robot r=new Robot();
		  //r.keyPress(KeyEvent.);
		  Thread.sleep(2000);
		  //driver.close();
	}

}
