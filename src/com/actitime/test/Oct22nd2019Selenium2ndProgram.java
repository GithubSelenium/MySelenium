package com.actitime.test;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Oct22nd2019Selenium2ndProgram {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.seleniumhq.org/");
	Thread.sleep(15000);
	driver.findElement(By.id("q")).click();
    driver.navigate().back();
    search.sendKeys("java",)
