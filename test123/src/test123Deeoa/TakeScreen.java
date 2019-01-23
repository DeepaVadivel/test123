package test123Deeoa;

import java.util.Date;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;


public class TakeScreen {

	//private static final Capabilities ieCapabilities = null;

	public static void main(String[] args)throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\deepa.vadivel\\Downloads\\IEDriverServer_Win32_2.47.0\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users/deepa.vadivel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	Date d=new Date();
	
		String date1=d.toString();
		System.out.println(date1);
	
	String date2=date1.replaceAll(":", "_");
		System.out.println(date2);
		Thread.sleep(2000);
	driver.get("https://www.google.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:/Users/deepa.vadivel/pictures/screnshot/"+date2+"__actiTIMELoginPage.png");
		
		FileUtils.copyFile(src, destFile);
		driver.close();

	}

}
