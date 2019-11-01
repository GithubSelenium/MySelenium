package com.actitime.test;
import java.io.File;
	import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	import com.google.common.io.Files;

	public class SeleniumAmazon {
		static {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		}
		public static void screen(WebDriver driver, String name) throws IOException {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File sc = ts.getScreenshotAs(OutputType.FILE);
			File ff = new File("./Screenshot/" + name + ".png");
			Files.copy(sc, ff);

		
		
			WebDriver driver1 = new ChromeDriver();
			 
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver1.manage().window().maximize();
			driver1.get("https://www.amazon.com/");
			JavascriptExecutor js=(JavascriptExecutor)driver1;
			WebElement ele= driver1.findElement(By.xpath("//div[@class=\"navFooterBackToTop\"]"));
			js.executeScript("arguments[0].scrollIntoView()",ele);
			     ele.click();


}
	}



