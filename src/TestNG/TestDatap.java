package TestNG;

import org.testng.annotations.Test;

public class TestDatap {
	@Test(dataProviderClass = ReadDataXmlDatap.class,dataProvider= "CreateUser")
	public void test (String user, String pass) {
		System.out.println(user);
		System.out.println(pass);
	}
	

}
