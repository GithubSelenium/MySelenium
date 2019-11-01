package com.actitime.test;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	

public class GuruAlertPopUps {
	static{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
       
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		driver.get("http://demo.guru99.com/v1/index.php");
		driver.findElement(By.name("btnLogin")).click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
     }

}
