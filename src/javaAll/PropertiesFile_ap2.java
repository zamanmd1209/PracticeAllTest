package javaAll;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile_ap2 {

	public static void main(String[] args) throws IOException {

String path="C:\\MdFiles\\eclipse-workspace\\AllJavaPract\\testData.properties";

getPropertyValue(path,"browser");

//readTextFile(path);

	}
public static void readTextFile(String path) {
	try {
		File f= new File(path);
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		
		String line= null;
		try {
			while ((line=br.readLine()) !=null) {
				System.out.println(line);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
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
