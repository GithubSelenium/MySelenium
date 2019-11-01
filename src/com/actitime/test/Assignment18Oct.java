package com.actitime.test;

	

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	
	
	public class Assignment18Oct {


		static {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		}
		
		
		public static void main(String[] args) throws Throwable {
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.bluestone.com/");
			
			List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li")); 
	         Actions a = new Actions(driver);
	        WebElement ab = driver.findElement(By.xpath("//li[@class='menuparent repb']/a[contains(.,'Rings')]"));
	         a.moveToElement(ab).build().perform();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//a[contains(.,'Diamond Rings')]")).click();
	         Thread.sleep(2000);
	         
	         
	         
	         
		}
		}
	}