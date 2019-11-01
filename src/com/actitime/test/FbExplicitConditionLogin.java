package com.actitime.test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbExplicitConditionLogin {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			@Override
			public java.lang.Boolean apply(WebDriver driver){
				return driver.findElement(By.id("u_0_4")).isEnabled();
			}
		});
		driver.findElement(By.id("email")).sendKeys("alok");
		driver.findElement(By.id("pass")).sendKeys("2309q390");
		
		
		
						
		}}