package property;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import webDriverTest.WebDriverManagerDemo;

public class propertiesClass {
	 static Properties  prop = new Properties();;
	public static void main(String[] args) {
		readPropertyfile();
		writeproperty();
		readPropertyfile();
	}
	public static void readPropertyfile()
	{
		
		try {
			InputStream input = new FileInputStream("C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\src\\property\\config.properties");
			prop.load(input);
			//System.out.println(prop.getProperty("browser"));
			WebDriverManagerDemo.browser=prop.getProperty("browser");
			System.out.println(prop.getProperty(WebDriverManagerDemo.browser));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			}
		public static void writeproperty()
		{
			try {
				OutputStream output = new FileOutputStream("C:\\Users\\Kasahun.Abdisa\\eclipse-workspace\\Java Projects\\src\\property\\config.properties");
				prop.setProperty("browser", "chrome");
				//prop.setProperty("result", "pass"); /to add new file to the property file.
				prop.store(output, null);
				
					// TODO Auto-generated catch block	
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
				
		}
	
	

