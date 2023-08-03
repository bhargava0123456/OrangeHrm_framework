package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public static Properties initiazeproperties() throws IOException  {
		
		Properties prop= new Properties();		
		FileInputStream fis = new FileInputStream("./src/test/resources/configfiles/config.properties");
		prop.load(fis);
		return prop;
	      
	}

}
