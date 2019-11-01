package com.actitime.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Democ {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\coold\\Videos\\Automation tyss\\drivers\\chromedriver.exe");
		org.openqa.selenium.WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		driver.findElement(By.xpath("//input@type='search']")).sendKeys("sofa", Keys.ENTER);
	}

}
