package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNg1 {
	@Test(dependsOnMethods = "devil1")
	public void demoRace2() { 
	Reporter.log("hello", true);
	}
	
	@Test(enabled = false)
	public void devil1() {
		Reporter.log("itwill not execute becoz enabled= false", true);
	}
	
	@Test(enabled = true)
	public void devil2() {
		Reporter.log("it will execute becoz enabled = true", true);
		
	}
	}


