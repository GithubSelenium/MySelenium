package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNg {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		System.out.println("BC");
	
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AC");
	}

	@BeforeMethod()
	public void beforeM() {
				driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("1");
	}

	@AfterMethod()
	public void afterM() {
		driver.close();
		System.out.println("2");
	}

	/*@Test(invocationCount = 5 ,priority = 2 )// IT WILL EXECUTE 5 TIMES DUE TO INVOCATION COUNT
	public void demoM() {

		driver.findElement(By.name("q")).sendKeys("alok", Keys.ENTER);
		System.out.println("hello");*/

	

	@Test(priority = 1)
	public void demoRace() {

		driver.findElement(By.name("q")).sendKeys("race", Keys.ENTER);

		System.out.println("hello");

	}


	@Test(invocationCount = 0 ,priority = 1)  // TEST CASE WILL NOT GET EXECUTED
	public void demoRace2() {

		driver.findElement(By.name("q")).sendKeys("race", Keys.ENTER);

		System.out.println("hello");

	}
	@Test()  // TEST CASE WILL NOT GET EXECUTED
	public void demoRace3() {

		driver.findElement(By.name("q")).sendKeys("race", Keys.ENTER);

		Reporter.log("he-man",true);
	}


}
