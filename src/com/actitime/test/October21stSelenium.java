package com.actitime.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class October21stSelenium {
	
		static {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		}

		

		public static void main(String[] args) throws InterruptedException, IOException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.seleniumhq.org/");
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)"); // for some index to go down in y axis
			Thread.sleep(4000);
			js.executeScript("window.scrollBy(0,-500)"); // for some index to go up in y axis
			Thread.sleep(4000);
			js.executeScript("window.scrollBy(500,0)"); // for some index to go across pannel
            Thread.sleep(4000);
			js.executeScript("window.scrollBy(-500,0)"); // for some index to go across pannel
			Thread.sleep(4000);
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // for scrolling till end
			Thread.sleep(4000);
			js.executeScript("window.scrollTo(0,-document.body.scrollHeight)"); // for scrolling till end
			WebElement ele = driver.findElement(By.xpath("//h2[text()='Selenium Sponsers']"));
			js.executeScript("arguments[0].scrollIntoView()" ele);




}
		}
