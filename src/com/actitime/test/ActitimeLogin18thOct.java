package com.actitime.test;


	import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class ActitimeLogin18thOct {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	       
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		driver.findElement(By.id("Layer_1")).click();
		driver.findElement(By.xpath("//li[@class=\"popup_menu_item\"]/a[(contains(.,'About your actiTIME'))]")).click();
		String a = driver.findElement(By.xpath("//td[@class=\"aboutCopyright\"]")).getText();
		System.out.println(a);
	}}