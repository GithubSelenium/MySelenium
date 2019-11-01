package com.actitime.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class Class1{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		Thread.sleep(15000);
		java.util.List<WebElement> menu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li"));
		Actions a= new Actions(driver);
		for (WebElement name : menu) {
			String menuName = name.getText();
			System.err.println(menuName);
			a.moveToElement(name).build().perform();
			Thread.sleep(1000);
			java.util.List<WebElement> submenu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li"));
			
		 for (WebElement item : submenu) {
			 System.out.println(item.getText());
		 }
		 
		}
	}
		}
		
		