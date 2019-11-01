package framework.generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TheBaseTest implements ConstantE 
{
	public static Properties con;
	public static FileInputStream fis;
	public static WebDriver driver;
	static String browser_name = "";
	static int r =1, c=0;
	static {
		 try {
			 Excel.createExcel(REPORT_PATH, SHEET);
			 fis= new FileInputStream(CONFIGPATH);
			 con=new Properties();
			 con.load(fis);
			 browser_name=con.getProperty("browser");
			 if (browser_name.contains("chrome"))
			 {
				 System.setProperty(CHROME_KEY, CHROME_VALUE);
			 }
			 else
			 {
				 System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 
		 }
		 @BeforeMethod()
		 public static void BeforeM()
		 {
			 if(browser_name.contains("chrome"))
			 {
				 driver = new ChromeDriver();
			 }
			 else
			 {
				 catch(Exception e)
				 {
					 System.out.println("file not found");
				 }
				 driver.close();
			 }
		 }
		  driver = new FirefoxDriver();
	}
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	 driver.get(URL);
}
 @AfterMethod()
       public static void afterM(ITestResult result)
       {
	 String sstatus;
	 int status= result.getStatus();
	 String testcase = result.getName();
	 try
	 {
		 if(status==1)
		 {
			 sstatus ="pass";
			 Reporter.log(testCase+"is pass");
			 Excel.storeValue(XLPATH,SHEET,1,3,sstatus);
		 }
		 else
		 {
			 ScreenshotCaptured.getScreenshot(driver, testcase);
			 Reporter.log(testCase+"is fail");
			 sstatus="fail";
			 Excel.storeValue(XLPATH,SHEET,1,3,sstatus);
		 }
	 }
	 catch(Exception e)
	 {
		 System.out.println("THE FILE IS NOT FOUND");
			 
				 }
		 
			 }
		 }
	}
	


