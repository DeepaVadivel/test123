package test123Deeoa;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class DragandDrops {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa.vadivel\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://compressimage.toolur.com/");
driver.manage().window().maximize();
WebElement s=driver.findElement(By.id("browse"));
s.click();
Thread.sleep(2000);
Runtime.getRuntime().exec("C:\\Users\\deepa.vadivel\\Documents\\file1.exe");
Thread.sleep(4000);
driver.close();
	}

}
