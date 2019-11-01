package com.actitime.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://spaceship/login.do");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[id='LoginButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[text()='Settings']")).click();
		
		
	}
	}


