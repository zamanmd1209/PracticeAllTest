package javaAll;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile_ap {

	public static void main(String[] args) throws IOException {

String path="C:\\MdFiles\\eclipse-workspace\\AllJavaPract\\testData.properties";

getPropertyValue(path,"browser");

	}

	
public static String getPropertyValue(String path, String key) {
try {
	File f= new File(path);
	//
	FileInputStream fi= new FileInputStream(f);
	//
	Properties prop= new Properties();
	prop.load(fi);
	System.out.println(prop.getProperty("browser"));
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return key;


	}

}
