package test123Deeoa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabless {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/deepa.vadivel/Downloads/chromedriver_win32/chromedriver.exe");
	       
		WebDriver driver=new ChromeDriver();
		//driver.get("https://money.rediff.com/gainers/bsc/dailygroupa?");
		driver.get("http://toolsqa.com/automation-practice-table/");
		Thread.sleep(2000);
		List<WebElement> ts=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		//List<WebElement> ts=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println(ts.size());
		for(WebElement wb: ts)
		{
			System.out.println(wb.getText());
		}
		Thread.sleep(2000);
		//WebElement ft=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1454]"))
		driver.close();
		
	}

}

