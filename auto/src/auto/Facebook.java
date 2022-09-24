package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public Facebook() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12455jjjj");
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("button.-61th")).click();
		

	}

}
