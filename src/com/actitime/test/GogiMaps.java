package com.actitime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GogiMaps {
	@Test
	 public void appleGhadi()
	 {
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("google maps", Keys.ENTER);
			driver.findElement(By.xpath("//h3[@class=\"LC20lb\"]")).click();
			driver.findElement(By.xpath("//input[@autofocus=\"autofocus\"]")).sendKeys("btm", Keys.ENTER);
			driver.findElement(By.xpath("//img[@alt=\"Directions\"]")).click();

}
}

