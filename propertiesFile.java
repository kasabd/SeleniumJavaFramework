package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class propertiesFile {
	static Properties prop= new Properties();
	static String projectpath= System.getProperty("user.dir");
	public static void main(String[] args) {
		getproperties();
		setProperties();
	}
	public static void getproperties()
	{
		try {
			prop= new Properties();
		
			InputStream input = new FileInputStream(projectpath + "/src/test/java/config/config.properties");
			prop.load(input);
			String browser= prop.getProperty("browser");
			System.out.print("Hello  " + browser);
		} catch(Exception exp) {
			System.out.print(exp.getMessage());
			System.out.println(	exp.getCause());
			exp.printStackTrace();
		}
		
		
	}

	public static void setProperties()
	{
		try {
		OutputStream output = new FileOutputStream(projectpath + "/src/test/java/config/config.properties");
		prop.setProperty("browser", "firefox");
		prop.store( output, "writing to the prop file");
	}catch(Exception exp) {
		System.out.print(exp.getMessage());
		System.out.println(	exp.getCause());
		exp.printStackTrace();
}
}
}