package auto;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public New() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		

      Date timestamp = new Date();
      String newtimpstamp= timestamp.toString().replace(":", "-");
      	  
		WebDriver driver = new ChromeDriver ();	
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File ("./ScreenShot_Folder/"+newtimpstamp+".jpg"));
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
