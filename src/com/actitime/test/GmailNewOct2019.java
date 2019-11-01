package com.actitime.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class GmailNewOct2019 {
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(4000);
		Action a = new Action(driver);
		WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement obja = driver.findElement(By.id("draggable"));
		Thread.sleep(4000);
		WebElement objb = driver.findElement(By.id("droppable"));
		Thread.sleep(4000);
		a.dragandDrop(obja,objb).build().perform();}		