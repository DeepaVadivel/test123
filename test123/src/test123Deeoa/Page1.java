package test123Deeoa;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.Document;

public class Page1 {
	
	
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		try
		{
		System.setProperty("webdriver.chrome.driver", "C:/Users/deepa.vadivel/Downloads/chromedriver_win32/chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.navigate().to("http://www.seleniumeasy.com/test/input-form-demo.html");
		   
		    
			   File f=new File("C:\\Users\\deepa.vadivel\\eclipse-workspace\\test123\\src\\test123Deeoa\\Data.xml");
			  
			  DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
			  DocumentBuilder db=dbf.newDocumentBuilder();
			  Document docu=db.parse(f);
			  
		   String gh=docu.getElementsByTagName("First").item(0).getTextContent();
		   
			Page2 a=new Page2(driver);
			a.first.sendKeys(gh);
			Thread.sleep(2000);

	     }
	catch(Exception e)
		{
        e.printStackTrace();
        }
}


}
