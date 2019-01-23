package test123Deeoa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa.vadivel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='sbqs_c']"));
		Thread.sleep(2000);
		System.out.println(list1.size());
		for(int i=1;i<list1.size();i++)
		{
			if(list1.get(i).getText().contains("java 8 features"))
			{
				list1.get(i).click();
				break;
			}
		}
		driver.close();
	}

}
