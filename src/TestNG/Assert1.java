package TestNG;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;

public class Assert1 {
	
	public void devil1() {
	String Et="alok.fb.com";
	String At="alok.fb.com";
	Assert.assertEquals(At,Et);
	System.out.println("actual is matching with the expected title");
	
	boolean Ex=true;
	boolean Ax=true;
	Assert.assertEquals(Ax,Ex);
	System.out.println("acatual is matching with the expected title");
	
	Set<String> s =new HashSet<>();
	s.add("abc");
	
	Set<String> s2 =new HashSet<>();
	s.add("abd");
	
	Assert.assertNotEquals(s, s2, "Working");
	
	
	
	
	
	
	
	
	
	
	

}}
