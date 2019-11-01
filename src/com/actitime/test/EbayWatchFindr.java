package com.actitime.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EbayWatchFindr {
	 @Test
	 public void appleGhadi()
	 {
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.ebay.com");
			driver.findElement(By.xpath("//input[@ type=\"text\"]")).sendKeys("apple watch", Keys.ENTER);
		 List<WebElement> watches = driver.findElements(By.xpath("//h3[@class='s-item__title']"));
		 int count =0;
		 String to;
		 for (WebElement watch: watches)
		 {
			 System.out.println(watch.getText());
			 count++;
			 if (count==4) 
			 {
				 to = watch.getAttribute("value");
			 }
		 
		 }
	 }
}


