package TestNG;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class GoogleTestLogin {		
		WebDriver driver;
	
		
		@BeforeClass
		public void beforeClass() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
			System.out.println("Before the class");
		
			
		}
		
		@AfterClass
		public void afterClass() {
			System.out.println("After the class");
		}

		@BeforeMethod()
		public void beforeM() {
					driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
			
			System.out.println("1");
		}
		@Test
		public void testName() throws Exception {
			driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("GrudgesThroughhell2", Keys.ENTER);
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("LONGAGO23", Keys.ENTER);

			
			
		}
	
	@Test
	public void testName1() throws Exception {
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("allGrudgesThroughhell2", Keys.ENTER);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("LONGAG72783", Keys.ENTER);

		
		
	}

@Test
public void testName2() throws Exception {
	driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("GrudgesThroughheAVEN2", Keys.ENTER);
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("LONGAGO343", Keys.ENTER);

	
	
}

@Test
public void testName3() throws Exception {
	driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("GrudgesThrougHMEell2", Keys.ENTER);
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("LONGAGO465", Keys.ENTER);

	
	
}

			
	


}
