package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonGroups 
{


	@Test(groups = "smoke", dependsOnMethods = "demo3")          
	public void demo1()
    {                                     


     Reporter.log("hii", true);         //for smoke test cases if we test for valid username
                                        // and password like valid and invalid we will use
	}
	

	@Test(dependsOnGroups = "smoke")           
	public void demo2()
	{


		System.out.println("Hello");

	}
	@Test(groups = "smoke")           
	public void demo3()
	{


		System.out.println("bye");

	}

}