package framework.generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenshotCaptured {
	public static void getScreenshot(WebDriver driver, String name) throws IOException
	{
		ScreenshotCaptured soc = (ScreenshotCaptured) driver;
		File imgFrom = soc.ScreenshotCapturedAs(OutputType.FILE);
		File imgTo = new File("./ScreenShots/"+name+".png");
		Files.copy(imgFrom, imgTo);
		
		
		
	}

}
