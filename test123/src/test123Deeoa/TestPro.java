package test123Deeoa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPro {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
File fs=new File("C:\\Users\\deepa.vadivel\\eclipse-workspace\\test123\\src\\test123Deeoa\\data.properties");
FileInputStream fileInput=null;
try
{
	fileInput=new FileInputStream(fs);
}
catch(FileNotFoundException e){
	e.printStackTrace();
}
Properties ps=new Properties();
try {
	ps.load(fileInput);
}
catch(IOException s)
{
	s.printStackTrace();
}
System.setProperty("webdriver.chrome.driver", "C:/Users/deepa.vadivel/Downloads/chromedriver_win32/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.navigate().to(ps.getProperty("url"));
driver.manage().window().maximize();
Thread.sleep(3000);

//WebElement ed=driver.findElement(By.linkText("Login & Signup"));
//ed.click();


driver.findElement(By.cssSelector("input._2zrpKA[type='text']")).sendKeys(ps.getProperty("username"));
driver.findElement(By.cssSelector("input._2zrpKA[type='password']")).sendKeys(ps.getProperty("password"));
WebElement eh=driver.findElement(By.cssSelector("button._2AkmmA._1LctnI._7UHT_c"));
eh.click();
Thread.sleep(3000);
driver.close();
	}
	

}
