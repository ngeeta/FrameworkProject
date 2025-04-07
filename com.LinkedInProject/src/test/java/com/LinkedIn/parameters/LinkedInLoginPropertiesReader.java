package com.LinkedIn.parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LinkedInLoginPropertiesReader {
Properties property;

//method to take credential from config
public LinkedInLoginPropertiesReader() throws IOException {
	FileInputStream file=new FileInputStream("src/test/resources/PropertyFiles/config.properties");
	property=new Properties();
	property.load(file);
}

//this method retrieves the value associated with given key from property file
public String getProp(String key) {
	return property.getProperty(key);
}

}
