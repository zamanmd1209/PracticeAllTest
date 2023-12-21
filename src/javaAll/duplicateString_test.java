package javaAll;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


//Given word= java is java java is best python and Csharp also popluler and good;
public class duplicateString_test {
	
	 int[] setNum= {4,6,9,5,8,1,2};
	
	public static void main(String args[]) {
		
		
	 String gWord="java is java java is best python and Csharp also populer and good";
	String[] sWord= gWord.split(" ");
	
	Map<String,Integer> wordCount= new HashMap<String,Integer>();
	
	for(String word:sWord) {
		
		if(wordCount.containsKey(word)) {
			
			wordCount.put(word, wordCount.get(word)+1);
			
		} else {
								
				wordCount.put(word, 1);
			}
	}
	
	System.out.println("key set: "+wordCount.keySet().toString());
	System.out.println("entry set: "+wordCount.entrySet().toString());
			
			Set<String> wIgWord= wordCount.keySet();
			
//			for(String wor:wIgWord) {
//				
//				if(wordCount.get(wor)>0){
//					
//					System.out.println(wor+": "+wordCount.get(wor)+" Times");
//					
//				}
//				
//				
//				
//			}
			
			
			
	
		
		 String givenWord="java is java java is best python is good but python is not as java";
		 String[] splitWord= givenWord.split(" ");
		 
		 Map<String,Integer> wordCount1= new HashMap<String,Integer>();
		 
		 for(String word:splitWord) {
			 
			 if(wordCount1.containsKey(word)) {
				 		 
				 wordCount1.put(word,wordCount1.get(word)+1);
			 }
			 
			 else {
				 
				 wordCount1.put(word, 1);
			 }
			 
		 }
	
				System.out.println("new..."+wordCount1.entrySet());	 
				
				Set<String> setOfWord=wordCount1.keySet();
				
				for(String wor:setOfWord) {
					
					if(wordCount1.get(wor)>0) {
						
						System.out.println(wor+" : "+"is Present "+wordCount1.get(wor)+" Times");
						
						
					}
					
					
				}
					 
					 
				 }
				 
				 
}

		
//		String sWord[]= gWord.split(" "); 
		
//		Map<String,Integer> wCount= new HashMap<String,Integer>();
//		
//		for(String wor:sWord) {
//			
//			if(wCount.containsKey(wor)) {
//				wCount.put(wor, wCount.get(wor)+1);
//				
//			}else {
//				
//				wCount.put(wor, 1);
//			}
//		}
//		
//		Set<String> wIstring=wCount.keySet();
//		for(String word:wIstring) {
//			
//			if(wCount.get(word)==2) {
//				
//				System.out.println(word+ " :"+wCount.get(word)+" Times");
//				
//				
//			}
//		}
	

	


