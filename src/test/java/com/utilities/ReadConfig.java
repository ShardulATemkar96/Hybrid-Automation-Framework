package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadConfig {

	void readConfig() throws Exception {
		String path = System.getProperty("user.dir") + "//src/main/resources//Config.properties";
		FileInputStream file = new FileInputStream(path);
				
	}
}
