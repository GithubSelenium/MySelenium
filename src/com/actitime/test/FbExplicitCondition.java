package com.actitime.test;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class FbExplicitCondition {

		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://facebook.com");
			driver.findElement(By.id("email")).sendKeys("alia");
			WebDriverWait ww = new WebDriverWait(driver, 10);
			ww.until(ExpectedConditions.titleContains("alia"));
			driver.findElement(By.id("pass")).sendKeys("brewl");
			driver.findElement(By.id("u_0_b")).click();
		}
			

			

}
