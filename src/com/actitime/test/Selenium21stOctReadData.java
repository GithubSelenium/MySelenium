package com.actitime.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.openssl.EncryptionException;



public class Selenium21stOctReadData {
	public static void main(String[] args) throws EncryptionException,InvalidFormatException,IOException {
		FileInputStream fis = new FileInputStream("‪C:\\Users\\coold\\Downloads\\testcasesel.xlsx");
		Workbook  w = WorkbookFactory.create(fis);
		Sheet sh = w.getSheet("Sheet1");
		Row firstRow = sh.getRow(0);
		int rowcount = sh.getPhysicalNumberOfRows();
		for (int i = 0; i< rowcount; i++)
		{
			for(int j = 0; j< firstRow.getLastCellNum();j++) {
			
			Cell cl = sh.getRow(i).getCell(j);
			System.out.println(cl+" ");
		}
		System.out.println();
	}
	System.out.println("------------------");
	sh.getRow(0).getLastCellNum();
	System.out.println(sh.getRow(1).getCell(0).toString());
	System.out.println.getProperty("user.dir");
	}
}
	
