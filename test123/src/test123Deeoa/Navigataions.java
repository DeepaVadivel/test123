package test123Deeoa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigataions  {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:/Users/deepa.vadivel/Downloads/chromedriver_win32/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.navigate().to("http://www.google.com");
    	   Thread.sleep(5000);
       driver.navigate().to("http://www.gmail.com");
       Thread.sleep(3000);
       driver.navigate().back();
       Thread.sleep(3000);

       driver.navigate().forward();
       Thread.sleep(3000);

       driver.navigate().refresh();
       Thread.sleep(3000);

       		driver.close();
	}

}
