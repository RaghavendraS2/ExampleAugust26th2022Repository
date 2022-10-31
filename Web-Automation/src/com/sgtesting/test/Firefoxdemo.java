package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser = new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
