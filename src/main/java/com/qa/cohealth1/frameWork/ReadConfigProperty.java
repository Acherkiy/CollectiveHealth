package com.qa.cohealth1.frameWork;

import java.io.InputStream;
import java.util.Properties;

public class ReadConfigProperty {

	protected InputStream input = null;
	protected Properties prop = null;

	public ReadConfigProperty() {

		try {

			input = ReadConfigProperty.class.getClassLoader().getResourceAsStream("Resource/Config.properties");
			prop = new Properties();
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getUrl() {
		if (prop.getProperty("url") == null)
			return "";
		return prop.getProperty("url");

	}

	public String getBrowser() {
		if (prop.getProperty("browser") == null)
			return "";
		return prop.getProperty("browser");
	}

}
