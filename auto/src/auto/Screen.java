package auto;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {

	public Screen() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
	//	driver.get("https://www.google.com");
		//TakesScreenshot srcShot= ((TakesScreenshot)driver);
		
		//File SrcFile=srcShot.getScreenshotAs(OutputType.FILE);}
	
	//	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

			//driver.get("https://www.facebook.com/");
			//driver.navigate().to("https://accounts.google.com/b/0/AddMailService");
			//driver.navigate().back();
			//driver.navigate().forward();
			
			

			//Date stamptime = new Date();
			//System.out.println(stamptime);
			
			//File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(screen,new File(".//sreenshots//"+"pic.png"));
			
			// convert web driver object to TakeScreenshot
			//TakesScreenshot scrShot =((TakesScreenshot)webdriver);
			//Call getScreenshotAs method to create image file
		//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//	Move image file to new destination
		//	File DestFile=new File(fileWithPath);
			//Copy file at destination
		//	FileUtils.copyFile(SrcFile, DestFile);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
