package javaAll;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadWriteTextFromFile {
	
	//static String path= "C:\\MdFiles\\eclipse-workspace\\AllJavaPract\\user.txt";
	static String path= "./user.txt";

	public static void main(String[] args) {
		
		try {
			FileReader fr= new FileReader(path);
			
			BufferedReader br= new BufferedReader(fr);
			String str;
			
			while((str=br.readLine()) !=null) {
				
				System.out.println(str);
			}
			
			br.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Using Scanner ===================");
		
		try {
			File file= new File(path);
			Scanner sc= new Scanner(file);
			
			while(sc.hasNext()) {
				
				System.out.println(sc.nextLine());
			}
			
					
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Using Delimiter ===================");
		try {
			File file= new File(path);
			Scanner sc= new Scanner(file);
			
			sc.useDelimiter("\\Z");
			
			System.out.println(sc.next());
			
//			while(sc.hasNext()) {
//				
//				System.out.println(sc.nextLine());
//			}
			
					
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
//		Map<String, Integer> wordMap= new HashMap<>();
//		
//		BufferedReader reader= null;
//		
//		try {
//			
//			reader = new BufferedReader(new FileReader(path));
//			
//			String currentLine = reader.readLine();
//			
//			while(currentLine !=null) {
//				
//				 String words[]=currentLine.toLowerCase().split(" ");
//				 
//				 for(String word:words) {
//					 
//					 if(!word.isBlank()) {
//					 
//					 if(wordMap.containsKey(word)) {
//						 
//						 wordMap.put(word, wordMap.get(word)+1);
//						 
//						 
//					 }
//					 
//					 else {
//						 wordMap.put(word, 1);
//						 
//					 }
//					 
//					 }
//					 
//				 }
//				
//				 currentLine = reader.readLine();
//			}
//			
//			
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		finally {
//			
//			try {
//				reader.close();
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		}
//	 wordMap.forEach((k,v) -> System.out.println(k+" : "+v));
//	 
//	 Map<String, Integer> maxWord= new HashMap<>();
//	 wordMap.entrySet().stream().filter(entry -> entry.getValue()== Collections.max(wordMap.values()))
//	 .forEach(e -> maxWord.put(e.getKey(), e.getValue()));
//	 
//	 System.out.println("=============================================================");
//	 System.out.println(maxWord);
	 
	}

}
