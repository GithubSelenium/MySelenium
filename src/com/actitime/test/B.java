package com.actitime.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	WebElement send = driver.findElement(By.className(""));
	List<WebElement> gun = driver.findElements(By.className(""));
	
}

}
