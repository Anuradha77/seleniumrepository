package FileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException //Exception
	{
		Properties anu=new Properties();
		
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\src\\FileHandler\\Anu.properties");
		
		anu.load(file);
		
		System.out.println(anu.get("name"));
		
		System.out.println(System.getProperty("user.dir"));
	}
	

}
