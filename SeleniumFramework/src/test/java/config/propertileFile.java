package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import TestngTest.honeycombLogin;

public class propertileFile {

	static Properties prop = new Properties();
	static InputStream input;
	static String projectPath= System.getProperty("user.dir");
	

	public static void getProperty() {

		try {

			input = new FileInputStream(projectPath+"/src/test/java/config/config.properties");
			prop.load(input);
			String url=prop.getProperty("url");
			honeycombLogin.url = url;

		} catch (IOException e) {

			e.printStackTrace();
		}
		

	}


}
