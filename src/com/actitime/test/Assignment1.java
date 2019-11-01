package com.actitime.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		driver.manage().window().maximize();
		


		driver.get("https://www.urbanladder.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("sofa",Keys.ENTER);

		driver.findElement(By.xpath("//img[@title=\"Vicenza Sofa (Cream Italian Leather)\"]")).click();

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button\"]")).click();
		
		driver.findElement(By.xpath("//div[@class=\"large-4 columns btn_wrap\"]/button[@id=\"checkout-link\"]")).click();

}
}