package com.actitime.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
		
	}

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("file:///c:/users/alokkumar/Desktop/Demo1.html");
	//using tag name locator
     WebElement link = driver.findElement(By.tagName("a"));
     //click on the link
     link.click();
     driver.navigate().back();
     driver.findElement(By.id("d1")).click();
     driver.navigate().back();
     driver.findElement(By.name("n1")).click();
     driver.navigate().back();
     driver.findElement(By.className("c1")).click();
     //driver.close();
     driver.findElement(By.linkText("Google")).click();
     //driver.close();
     driver.findElement(By.partialLinkText("ogle")).click();
     driver.close();
     
     
     
	}

}
