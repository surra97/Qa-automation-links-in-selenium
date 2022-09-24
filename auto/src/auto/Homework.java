package auto;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	public Homework() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.nasa.gov/");
		driver.findElement(By.id("nasa-main-menu")).click();
		Thread.sleep(3000);
		nasa-main-menu.remove(1);

//		


		
		
		
		
		
		
		
		
		
		
		
		
		
//		//driver.get("http://127.0.0.1:5500/Qa-automation-7thmar/index.html");
//		     
//		 Set<String> set = new HashSet<String>();
//		  
//	       
//	        set.add("hello");
//	        set.add("from");
//	        set.add("sura");
//	       
//	        System.out.println("Set: " + set);
//	        set.remove("sura");
//	        System.out.println("Set after removing elements: "   + set);
//		
//		
		
		
		
		
		
		
		
		
		
	}

}
