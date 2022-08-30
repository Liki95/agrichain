package gen_lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	public String getProperty(String key) throws FileNotFoundException, IOException {
		String propertyfilepath="./config.properties";
		Properties p=new Properties();
		p.load(new FileInputStream(propertyfilepath));
		return p.getProperty(key);
	}
}
