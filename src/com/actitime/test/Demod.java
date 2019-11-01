package com.actitime.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Demod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		org.openqa.selenium.WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("java", Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@href=\"https://www.java.com/\"]/h3[@class=\"LC20lb\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"jvl0\"]")).click();

	}
}