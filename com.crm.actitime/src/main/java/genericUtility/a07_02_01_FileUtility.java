package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class a07_02_01_FileUtility {
	public String fetchDataFromPropertyFile(String key) throws IOException{
		FileInputStream fis= new FileInputStream("./testdata/propertyData.properties");
		Properties property=new Properties();
		property.load(fis);
		
		return property.getProperty(key);
	}

}
