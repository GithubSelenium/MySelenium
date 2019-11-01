package com.actitime.test;


	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Action;

	public class Selenium0022ndOct {
		static {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		}
		public static void main(String[] args) throws Throwable {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com/");
			Thread.sleep(4000);
			driver.findElement(By.id("identifierId")).sendKeys("seleniumunderthehood",Keys.ENTER);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("javaselenium",Keys.ENTER);
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//div[@class=\"T-I J-J5-Ji T-I-KE L3\"]")).click();
			Thread.sleep(4000);
			driver.findElement(By.id(":ka")).sendKeys("alok.smoke@gmail.com");
			Thread.sleep(4000);

			driver.findElement(By.xpath("//body[@jsmodel=\"utMpr\"]")).sendKeys("bro");
			Thread.sleep(4000);
			driver.findElement(By.id(":8l"));
			
		
			
	
	}
			
			

}
