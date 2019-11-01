package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumqSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/");
		SeleniumHome sh =  new SeleniumHome(driver);
		Thread.sleep(1000);
		sh.sendText("java");
		sh.goClick();
		driver.navigate().back();
		sh.clearText();
		sh.sendText("testNG");
		sh.goClick();
		
		
	}

	

}
