package com.vselenium;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class PropertyReader extends BasicTest {
	public Properties propp = new Properties();

	public PropertyReader() {
		try {
			InputStream file = getClass().getResourceAsStream("/testdata/"+config.getValue("env")+".properties");
			propp.load(file);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
