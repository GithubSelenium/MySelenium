package com.actitime.test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Oct222nd2019Selenium {
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
	}
public static void storeValue(String sheet, int row, int col, String data) {
	try { FileInputStream fis = new FileInputStream("C:\\Users\\coold\\Downloads\\testcasesel.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheet).createRow(row).createCell(col).setCellValue(data);
	FileOutputStream fio = new FileOutputStream("‪C:\\Users\\coold\\Downloads\\testcasesel.xlsx");
	wb.write(fio);
	wb.close();
	}
	catch (Exception e)
	{
		System.out.println("File not found");
		e.printStackTrace();
	}
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
	}
	
}
	

}
