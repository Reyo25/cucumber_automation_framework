package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop;
	private static String propPath= "./src/test/resources/com/config/config.properties";
	
	public Properties init_prop() {
	
	prop= new Properties();
	
	try {
		FileInputStream fs= new FileInputStream(propPath);
		prop.load(fs);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return prop;
	}
	
}
