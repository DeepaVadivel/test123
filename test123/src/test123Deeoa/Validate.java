package test123Deeoa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/deepa.vadivel/Downloads/chromedriver_win32/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.navigate().to("http://www.google.com");
	       String act=driver.getTitle();
	       String exp="google";
	       System.out.println(act);
	       if(act.contains(exp))
	       {
	    	   System.out.println("passed");
	       }
	       else
	       {
	    	   System.out.println("failed");
	       }
	       driver.close();

	}

}
