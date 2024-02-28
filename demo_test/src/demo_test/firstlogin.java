package demo_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class firstlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("hi");
		 
		  WebDriverManager.chromedriver().setup();
	      WebDriver driver = new ChromeDriver();

	}

}
