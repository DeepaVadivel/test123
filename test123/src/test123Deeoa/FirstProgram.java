package test123Deeoa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstProgram {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Users/deepa.vadivel/Downloads/chromedriver_win32/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   //System.setProperty("webdriver.gecko.driver", "C:\\Users\\deepa.vadivel\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
	  // driver.navigate().to("http://www.seleniumeasy.com/test/input-form-demo.html");
		driver.get("http://www.seleniumeasy.com/test/input-form-demo.html");
	   String st=driver.getCurrentUrl();
	   System.out.println(st);
	   driver.manage().window().maximize();
	   String st1=driver.findElement(By.name("first_name")).getCssValue("color");
	   String st2=driver.findElement(By.name("first_name")).getCssValue("font-size");
	   String st3=driver.findElement(By.name("first_name")).getCssValue("font-weight");
	   String hex=Color.fromString(st1).asHex();
	System.out.println(st1);
	System.out.println(st2);
	String tex=Color.fromString(hex).asRgb();
	System.out.println(st3);
	   Thread.sleep(5000);
	   
       driver.close();	   
	}

}
