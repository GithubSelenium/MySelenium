package com.actitime.test;
import java.time.DayOfWeek;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FcaebookDob {
 
	public static  void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		org.openqa.selenium.WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement Day = driver.findElement(By.id("day"));
		Select s = new Select(Day);
		s.selectByIndex(30);
		WebElement Month = driver.findElement(By.id("month"));
		Select m = new Select(Month);
		m.selectByValue("6");
		
		WebElement Year = driver.findElement(By.id("year"));
		Select y = new Select(Year);
		y.selectByValue("1990");
	 List<WebElement> days = s.getOptions();
	 for(WebElement dy : days)
	 {
		 System.out.println(dy.getText());
	 }
		
	}
}