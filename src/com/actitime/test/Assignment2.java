package com.actitime.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		driver.manage().window().maximize();
		driver.get("https://www.Google.com");
	    driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("thanos", Keys.ENTER);
		Thread.sleep(2000);

	    
	    driver.findElement(By.xpath("//canvas[@class=\"c3yYr\"]")).click();
	}
}