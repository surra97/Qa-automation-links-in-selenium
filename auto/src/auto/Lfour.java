//package auto;
//
//import java.io.File;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Lfour {
//
//	public Lfour() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver ();	
//		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		
//		driver.get(null);
//		FileUtils.copyFile(file,new File ("./ScreenShot_Folder/Test1_Login.png"));
//		
//		File file = ts.getScreenshotAs(OutputType.FILE);
//		
//		
//		
//		//TakesScreenshot scrShot =((TakesScreenshot)driver);
//		
//		//File file = scrShot.getScreenshotAs(OutputType.FILE);
//		
//			//FileUtils.copyFile(file, new File (\".//sreenshots//\"+\"pic.png\");
//
//		
//		//String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
//		
//	}
//
//}
