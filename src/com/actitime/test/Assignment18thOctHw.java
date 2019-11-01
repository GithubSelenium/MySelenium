package com.actitime.test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment18thOctHw {

	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException,AWTException {
		int j=0;
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");//load the url which is to be fetched
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("src")).sendKeys("Bangalore");
		
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//section[@id='search']/descendant::ul[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("dest")).sendKeys("IXR");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[@id='search']/div/descendant::ul[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='rb-calendar']/table/descendant::tr[5]/td[5]")).click();
		Thread.sleep(3000);
	}
}