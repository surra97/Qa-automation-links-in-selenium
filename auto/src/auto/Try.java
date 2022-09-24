package auto;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try {

	public Try() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://github.com/signup?user_email=suraakhras%40gmail.com&source=form-home-signup");
		
		Thread.sleep(3000);
		driver.findElement(By.id("email")).getText();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Continue")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("hghgk");
		driver.findElement(By.id("login")).getText();
		driver.findElement(By.id("opt_in")).getText();
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File ("./ScreenShot_Folder/img.jpg"));
		
	}

}
