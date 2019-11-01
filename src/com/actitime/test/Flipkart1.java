package com.actitime.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(15000);
	driver.findElement(By.xpath("//button@[class=\"_2AkmmA_29YDH8\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class=\"o8ZS_U\"]")).sendKeys("Iphone", Keys.ENTER);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@class=\"col col-7-12\"](.,'Apple iPhone 7 (Black,32 GB)')]")).click();
    Set<String> sabtab = driver.getWindowHandles();
    for(String tab: sabtab)
    {
    	driver.switchTo().window(tab);
    }
    }}