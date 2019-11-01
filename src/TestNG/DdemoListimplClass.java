package TestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(ITextListners.class)
public class DdemoListimplClass {
@Test
public void test1() {
	System.out.println("alok kumar1");
}
@Test
public void test2() {
	System.out.println("alok kumar2");
	Assert.fail();
}
}
