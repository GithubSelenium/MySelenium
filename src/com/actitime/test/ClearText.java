/* write a script- to clear the value present in the text box,
 * toget the text of a link,
 * to check wether button A is enabled or not,
 * TO check wethe rthej login button is displayed or not
 * and to check wether checkbox C1 is selected or not
 * 
 */
package com.actitime.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearText {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
    public static void main(String[] args) throws Exception {

    	//open the Browser
    	WebDriver driver=new ChromeDriver();
    	
    	//enter the url
    	driver.get("file:///c:/users/sandeep/Desktop/sample.html");;
    	
    	//clear the text or value present in the box
    	driver.findElement(By.xpath("//[input[@type='text' and @value='A']")).clear();
    	
    	//get the text of a link
    	System.out.println("Text of a link="+value);
    	
    	//check whether button A is enabled or not
    	if(driver.findElement(By.xpath("//input[@ type='button' andvalue='A']")).isEnabled();
    	{
    		System.out.println("button A is enabled");
    	}
    	
    	//check whether button login is displayed or not
    	if(driver.findElement(By.xpath("//input@value='Login']")).isDisplayed());
    	{
    		System.out.println("title is displayed and logout");
    	
    	}
    	//check whether C1 checkbox is selected or not
    	if(driver.findElement(By.xpath("//input[@ checked]")).isSelected());
    	{
    		System.out.println("checkbox is selected");
    	}

        
	}
}