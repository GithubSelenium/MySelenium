package framework.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel{
	 public static int getRow(String path , String sheet) {
		 FileInputStream fis;
		 int like = -1;
		 try 
		 {
			 fis = new FileInputStream(path);
			 Workbook w =WorkbookFactory.create(fis);
			 like = w.getSheet(sheet).getLastRowNum();
		 }
		 catch (Exception e)
		 {
			 e.printStackTrace();
		 }
		 return like;
	 }
	 
	 public static int getColumn(String path, String sheet) {
		 {
			 FileInputStream fis ;
			 int dlike =-1;
			 try
			 {
				 fis = new FileInputStream(path);
				 Workbook w = WorkbookFactory.create(fis);
				 dlike = w.getSheet(sheet).getRow(0).getLastCellNum();
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 return dlike;
		 }
	 }
		 public static String getData(String path , String sheet , int row, int col)
		 {
			 String value = "";
			 Workbook w;
			 FileInputStream fis;
			  try
			  {
				  fis = new FileInputStream(path);
				  w = WorkbookFactory.create(fis);
				  value = w.getSheet(sheet).getRow(row).getCell(col).toString();
			  }
			  catch(Exception e)
			  {
				  e.printStackTrace();
			  }
			  return value ;
		 }
		 public static void CreateExcel(String FileName, String sheetName) throws Exception {
		 Workbook w = new XSSFWorkbook();
		 Sheet sh = w.createSheet(sheetName);
		 sh.createRow(0).createCell(0).setCellValue("Name");
		 sh.getRow(0).createCell(1).setCellValue("status");
		 FileOutputStream fileout = new FileOutputStream(FileName+".xlsx");
		 w.write(fileout);
		 fileout.close();
		 w.close();
		 }
		 
		 public static void setData(String Name, String status, int row, int cel, String sh) throws Throwable
		 {
			 FileOutputStream fis = new FileOutputStream(path);
			 Workbook wb = WorkbookFactory.create(fis);
			 Sheet sh = wb.getSheet(sheet);
			 sh.createRow(row).createCell(cel).setCellValue(Name);
			 cel++;
			 sh.getRow(row).createCell(cel).setCellValue(status);
			 FileOutputStream fio = new FileOutputStream(path);
			 wb.write(fio);
			 wb.close();

		 
		 
	 }}
 