package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	private static ThreadLocal<WebDriver> tlDriver;

	/**
	 * To Initiate and get the ThreadLocal Driver
	 * @return New WebDriver from the ThreadLocal class
	 */

	public WebDriver init_driver(String browser) {

		tlDriver = new ThreadLocal<>();

		switch (browser.toLowerCase()) {
		case "chrome": {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
			break;
		}

		case "firefox": {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
			break;
		}

		default: {
			System.out.println("Please give a valid browser in configuration.");
			break;
		}
		}

		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();

		return getDriver();

	}
	
	/**
	 * To get the instance of WebDriver from the current Thread, using Thread Local
	 * @return
	 */

	public static WebDriver getDriver() {

		return tlDriver.get();
	}

}
