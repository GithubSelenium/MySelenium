package com.actitime.test;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo31stOct {
	@Test
	public void testA() throws Exception {
		URL node = new URL("http://192.168.43.6:4445/wd/hub");
		DesiredCapabilities browser = new DesiredCapabilities();
		browser.setBrowserName("chrome");
		WebDriver driver = new RemoteWebDriver(node, browser);
		driver.get("https://www.swiggy.com/");
		
				
	}
}
	