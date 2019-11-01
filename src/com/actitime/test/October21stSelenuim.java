package com.actitime.test;
import java.awt.List;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class October21stSelenuim {


	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
	}
	public static void screen(WebDriver driver, String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File ff = new File("./Screenshot/" + name + ".png");
		Files.copy(sc, ff);
	}
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver1 = new ChromeDriver();
		
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com/");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java",Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver1;
		java.util.List<WebElement> pages = driver1.findElements(By.xpath("//td[@class='cur']/following::td"));
		for(int i=0;i<=pages.size()+1;i++) {
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//span[@style='display:block;margin-left:53px']")).click();
			}
	}
	
}

