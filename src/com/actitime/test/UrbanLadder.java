package com.actitime.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class UrbanLadder {
	static {
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		 }

	public static void screen(WebDriver driver, String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File ff = new File("./Screenshot/" + name + ".png");
		Files.copy(sc, ff);

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		UrbanLadder ts = new UrbanLadder();
		driver.manage().window().maximize();
		driver.get("http://urbanladder.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li")); // findelements is
																										// used to store
																										// all
																										// the module
																										// names
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		for (WebElement name : menu) {
			String menuName = name.getText();
			System.err.println(menuName);
			Thread.sleep(1000);
			a.moveToElement(name).build().perform();
			Thread.sleep(3000);
			ts.screen(driver, menuName);
			/*
			 * List<WebElement> submenu = driver.findElements(By
			 * .xpath("//span[contains(.,'" + menuName +
			 * "')]/parent::li/descendant::ul[@class=\"QPOmNK\"]")); for (WebElement item :
			 * submenu) { System.out.println(item.getText()); }
			 */ }

	}
}
