package com.applicationhooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.utilities.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {
	
	Properties prop;
	private DriverFactory driverFactory;
	private WebDriver driver;
	
	@Before(order = 0)
	public void getProperty() {
		ConfigReader config = new ConfigReader();
		prop= config.init_prop();
	}
	
	@Before(order = 1)
	public void launchDriver() {
		
		String browser=prop.getProperty("browser");
		driver=driverFactory.init_driver(browser);
		
	}
	
	@After(order = 1)
	public void takeScreenshot(Scenario sc) {
		
		if(sc.isFailed()) {
			String screenshotName= sc.getName().replaceAll(" ","_");
			byte[] sourceFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourceFile,"image/png",screenshotName);
		}
	}
		
	@After(order = 0)
	public void tearDown() {
		driver.quit();
	}
	
}
