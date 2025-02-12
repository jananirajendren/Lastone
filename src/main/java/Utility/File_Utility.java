package Utility;

import java.io.FileInputStream;
import java.util.Properties;
public class File_Utility {
	
	public String getKeyAndValuePair(String key) throws Throwable {
		//FileInputStream fin = new FileInputStream("D:\WORKSPACE\SELENIUM\demo_123\src\test\resources\prop.properties");
		FileInputStream fin = new FileInputStream(IpathConstant.filepath);
		Properties pro = new Properties();
		pro.load(fin);
		String value = pro.getProperty(key);
		return value;
	}
	
}

	