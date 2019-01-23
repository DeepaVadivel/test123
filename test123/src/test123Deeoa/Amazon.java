package test123Deeoa;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static String getDatas(String sheetName,int rowNum,int colNum) throws IOException {
		
		String filepath="C:\\Users\\deepa.vadivel\\eclipse-workspace\\test123\\src\\test123Deeoa\\Datas.xlsx";
		FileInputStream fs=new FileInputStream(filepath);
		Workbook wb= WorkbookFactory.create(fs);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();
		System.out.println(data);
		wb.close();
		return data; 
	}
	public static void main(String[] args) throws InterruptedException, Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa.vadivel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='nav-line-2'][text()='Your Orders']")).click();
		driver.manage().window().maximize();	
		Thread.sleep(2000);
		int i;
		int j=0;
		for (i=1;i<=2;i++)
		
		{
			Thread.sleep(3000);			
			driver.navigate().refresh();
			driver.findElement(By.name("email")).sendKeys(getDatas("Sheet2",i,j));
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input#continue")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input#ap_password")).sendKeys(getDatas("Sheet2",i,j+1));
			driver.findElement(By.cssSelector("input#signInSubmit")).click();
			Thread.sleep(2000);
			System.out.println("success");
			
			Actions as=new Actions(driver);
			WebElement ef=driver.findElement(By.xpath("//span[@class='nav-line-2'][text()='Your Orders']/span[@class='nav-icon nav-arrow']"));
			as.moveToElement(ef).build().perform();
			driver.findElement(By.xpath("//span[@class='nav-text'][text()='Sign Out']")).click();
			Thread.sleep(3000);
			
		}
		Thread.sleep(3000);
		driver.close();
	}

}
