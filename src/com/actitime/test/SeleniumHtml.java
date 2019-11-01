package com.actitime.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SeleniumHtml {


public static  void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
	org.openqa.selenium.WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/coold/Desktop/selenium.html");
	Thread.sleep(2000);
	WebElement w1 = driver.findElement(By.id("b"));
	Select s = new Select(w1);
	List<WebElement> num = s.getOptions();
	if (s.isMultiple()) {
		for (WebElement nums : num) {
			s.selectByValue(nums.getText());
		}
		System.out.println(s.getFirstSelectedOption().getText());
		s.deselectAll();
		}
	}}