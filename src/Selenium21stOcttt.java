package com.actitime.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Selenium21stOcttt {
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
		driver1.get("https://secondlife.com/");
		JavascriptExecutor js =(JavascriptExecutor)driver1;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // for scrolling till end
Selenium21stOcttt ts=new Selenium21stOcttt();
		ts.screen(driver1, "Down");
		Thread.sleep(4000);
		
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)"); // for scrolling till end
		ts.screen(driver1, "up");


}
}
