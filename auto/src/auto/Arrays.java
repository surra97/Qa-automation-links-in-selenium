package auto;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arrays {

	public Arrays() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.get("http://127.0.0.1:5500/Qa-automation-7thmar/index.html");
		
		//static array
		
		int[] numbers = new int[10];
		numbers[0]= 9;
		numbers[1]= 9;
		numbers[2]= 9;
		numbers[3]= 9;
		numbers[4]= 9;
		numbers[5]= 9;
		numbers[6]= 9;
		numbers[7]= 6;
		numbers[8]= 9;
		numbers[9]= 5;
		
		System.out.println(numbers[0]);
		
		 //dynamic
		
		//String[]nameOfstudents = ("sura","ehab","sultan","haneen");
		//System.out.println(nameOfstudents[3]);
		//System.out.println(nameOfstudents.lenghth);

		//array list
		
		ArrayList <String> std = new ArrayList();
		
		std.add("ahneen");
		std.add("aya");
		std.add("batool");
		std.add("hussam");

		
		System.out.println(std.get(3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
