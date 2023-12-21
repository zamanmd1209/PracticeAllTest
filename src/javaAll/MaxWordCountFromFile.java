package javaAll;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxWordCountFromFile {
	
	//static String path= "C:\\MdFiles\\eclipse-workspace\\AllJavaPract\\user.txt";
	static String path= "./user.txt";

	public static void main(String[] args) {
		
		Map<String, Integer> wordMap= new HashMap<>();
		
		BufferedReader reader= null;
		
		try {
			
			reader = new BufferedReader(new FileReader(path));
			
			String currentLine = reader.readLine();
			
			while(currentLine !=null) {
				
				 String words[]=currentLine.toLowerCase().split(" ");
				 
				 for(String word:words) {
					 
					 if(!word.isBlank()) {
					 
					 if(wordMap.containsKey(word)) {
						 
						 wordMap.put(word, wordMap.get(word)+1);
						 
						 
					 }
					 
					 else {
						 wordMap.put(word, 1);
						 
					 }
					 
					 }
					 
				 }
				
				 currentLine = reader.readLine();
			}
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			
			try {
				reader.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	 wordMap.forEach((k,v) -> System.out.println(k+" : "+v));
	 
	 Map<String, Integer> maxWord= new HashMap<>();
	 wordMap.entrySet().stream().filter(entry -> entry.getValue()== Collections.max(wordMap.values()))
	 .forEach(e -> maxWord.put(e.getKey(), e.getValue()));
	 
	 System.out.println("=============================================================");
	 System.out.println(maxWord);
	 
	}

}
