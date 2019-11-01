package com.actitime.test;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.openssl.EncryptionException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Selenium21stOcctGetNameFromFb {
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		Workbook w = WorkbookFactory.create(new FileInputStream("‪C:\Users\coold\Downloads\testcasesel.xlsx"));
		Sheet sh = w.getSheet("Sheet1");
		Row firstrow = sh.getRow(0);
		int rowcount = sh.getPhysicalNumberOfRows();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String un = sh.getRow(3).getCell(0).toString();
		String pw = sh.getRow(3).getCell(1).toString();
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pw);
		
	}

}