package com.actitime.test;




import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class RedBusPopNotificationSelenium {
		static{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
	       
		driver.manage().window().maximize();
	
		driver.get("https://www.redbus.in/");
	}}