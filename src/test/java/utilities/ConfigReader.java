package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {



	private static Properties prop;

	static {
		prop = new Properties();
		FileInputStream fi;
		try {
			fi = new FileInputStream("config.properties");
			prop.load(fi);
			fi.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getProperty(String key) {

		return prop.getProperty(key);

	}

}
