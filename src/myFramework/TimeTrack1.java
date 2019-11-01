package myFramework;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import framework.generic.ConstantE;
import junit.framework.Assert;

public class TimeTrack1  implements ConstantE{
	public TimeTrack1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void verifyHomePageIsDisplayed(WebDriver driver, long ETO, String title) throws EncryptedDocumentException
	{
		try
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("THE HOMEPAGE IS NOW GETTING DISPLAYED ON SCREEN", true);
		}
		catch(Exception e)
		{
			Reporter.log("THE HOMEPAGE IS NOW NOT GETTING DISPLAYED ON SCREEN", true);
			Assert.fail();
		}
	}

}
