package com.actitime.test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
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
import java.awt.Robot;

public class Guru99Demo {

	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");}

	public static void main(String[] args) throws InterruptedException,AWTException, IOException {
		
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
driver.get("http://demo.guru99.com/test/upload/");//load the url which is to be fetched
		
		Thread.sleep(2000);
		driver.findElement(By.id("file_wraper0")).click();
		Thread.sleep(4000);
		Runtime r = Runtime.getRuntime();
		r.exec("C:\\Users\\coold\\Desktop\\AutoIt1.exe");
	}
}
		


	


