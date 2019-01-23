package test123Deeoa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\deepa.vadivel\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Select dropdowns=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		dropdowns.selectByIndex(10);
		Thread.sleep(3000);
		String s=driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).getText();
		System.out.println(s);
		driver.close();
	}

}
