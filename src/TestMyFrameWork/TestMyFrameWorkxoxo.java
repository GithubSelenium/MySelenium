package TestMyFrameWork;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

public class TestMyFrameWorkxoxo extends TheBaseTest{
	@Test
	public static void validLogin() throws EncryptedDocumentException, InvalidFormatException
	{
		String un = XL.getData( XLPATH, SHEET, 1,0);
		String pwd = XL.getData( XLPATH, SHEET, 1,1);
		String title= XL.getData( XLPATH, SHEET, 1,2);
		XL.storeValue( XLPATH, SHEET,0,3,"status");
		
		LoginPage 1 = new LoginPage(driver);
		1.inputUN(un+"retretr");
		1.inputPWD(pwd);
		1.loginClick();
		
		
		EnterTimeTrack Mack =	new EnterTimeTrack(driver);
		Mack.verifyHomePageIsDisplayed(driver,s,title);
		
		
	}
	
}

