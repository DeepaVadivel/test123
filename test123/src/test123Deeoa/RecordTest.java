package test123Deeoa;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;

public class RecordTest {
	public static void main(String args[]) throws Exception
	{
		
		
		ATUTestRecorder recorder=new ATUTestRecorder("C:\\Users\\deepa.vadivel\\Documents\\record","TestVideo1",false);
		File sp1= new File("C:\\Users\\deepa.vadivel\\Documents\\record\\TestVideo1.mov");
		modify(sp1);
		recorder.start();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa.vadivel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(3000);
		driver.close();
		recorder.stop();
		
	}
	public static void modify( File file)
	{
		int index=file.getName().indexOf(".");
		String fileName=file.getName().substring(0,index);
		file.renameTo(new File(fileName+".mp3"));		
	}
}
