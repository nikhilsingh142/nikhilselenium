package com.Filpkart.Shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSingleton {
	
	//Single ton design: Taken code from http://makeseleniumeasy.com/2018/01/11/singleton-design-pattern-in-selenium-webdriver/
	
			
		private static WebdriverSingleton instanceOfSingletonBrowserClass=null;
		
		
	    private WebDriver driver;

	    // Constructor
	    private WebdriverSingleton(){
	    	System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
			driver= new ChromeDriver();
	    }

	    // TO create instance of class
	    public static WebdriverSingleton getInstanceOfSingletonBrowserClass(){
	        if(instanceOfSingletonBrowserClass==null){
	        	instanceOfSingletonBrowserClass = new WebdriverSingleton();
	        }
	        return instanceOfSingletonBrowserClass;
	    }
	    
	    // To get driver
	    public WebDriver getDriver()
	    {
	    	return driver;
	    }
    
}
	
