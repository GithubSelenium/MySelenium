package tyss;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo
 {
	static {
		//set the path for chrome driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	}

	public static void main(String[] args) 
	{
	
		System.out.println("welcome to tyss"); // to check java is working or not we write this statement
		// open the browser
		FirefoxDriver driver= new FirefoxDriver();
		//ChromeDriver driver= new ChromeDriver();
		RemoteWebDriver r= new RemoteWebDriver();
	   
		//enter the url
		driver.get("http://localhost/login.do");//copy url from browser to paste it in the string
		//getting the title and printing on the console
		
		
		System.out.println();
         //close the browser
	}

}
