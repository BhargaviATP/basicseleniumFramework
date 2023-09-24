package generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
	public String readingDatafromPropertyFile(String Key) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("./src/test/resources/data.properties");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties property=new Properties();
		try {
			property.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
		}
		return property.getProperty(Key);
	}
}
