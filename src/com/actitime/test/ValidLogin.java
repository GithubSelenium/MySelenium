package com.actitime.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//WebElement un = driver.findElement(By.id("username")).sendKeys("admin");
	 driver.findElement(By.id("username")).sendKeys("admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 driver.findElement(By.xpath("//div[text()='Login']")).click();
	 Thread.sleep(4000);
	 String ExpectedTitle = "Enter Time -Track";
	 System.out.println(ExpectedTitle);
	 String ActualTitle= driver.getTitle();
	 System.out.println(ActualTitle);
	 if(ActualTitle.contentEquals(ExpectedTitle))
	 {
		 driver.findElement(By.id("logout link")).click();
	 System.out.println("Title is printed and logged out");
	 }
	 else
	 {
		 System.out.println("Title is not displayed and not logged out");
		 
	 }
}
}
