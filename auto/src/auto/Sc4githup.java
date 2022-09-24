package auto;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc4githup {

	public Sc4githup() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	     
		 
		 //get Time & replace name of Time 
		   Date timestamp = new Date(); 
		   String newtimestamp = timestamp.toString().replace(  ":" , "- ");
		 
		 
		 WebDriver driver = new ChromeDriver();
	     
	     
	     
			driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Suraakh@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@data-optimizely-event='click.signup_continue.email']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("aaaSSSddd123@@");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@data-optimizely-event='click.signup_continue.password']")).click();
			Thread.sleep(3000);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='login']")).sendKeys("Sultansuhail123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@data-continue-to='opt-in-container']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='opt_in']")).sendKeys("n");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@data-continue-to='captcha-and-submit-container']")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("home_children_button")).click();
			
		  	  //get Screenshot 
			   TakesScreenshot ts =((TakesScreenshot) driver );
			   File file = ts.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(file,new File ("./ScreenShot_Folder/ "+ newtimestamp + ".png"));
			
		    
			
//	}
	}
	
}
