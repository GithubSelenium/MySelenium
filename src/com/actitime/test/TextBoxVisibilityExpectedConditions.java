package com.actitime.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxVisibilityExpectedConditions {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://file:///C:/Users/coold/Desktop/18octselenium.html");
		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("iamtextbox")))).sendKeys("trdt");
	}
}
