package javaAll;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordsInStringArrayTest {
	
	public static void main1(String[] args) {
		
		String gWord="java is java java is best python and c also ok I like python and c too";
		String[] sWord= gWord.split(" ");
		
		
		Map<String, Integer> mWord= new HashMap<>();
		
		for(String word:sWord) {
			
			if(mWord.containsKey(word)) {
				
				mWord.put(word, mWord.get(word)+1);
							
			}
			else {
				
				
				mWord.put(word, 1);
			}
			
				
		}
		
		Set<String> stWord=mWord.keySet();
		
		for(String wor:stWord) {
			
			if(mWord.get(wor)>1) {
				
				System.out.println(wor+" : "+ mWord.get(wor) + " Times");
				
				
			}
			
		
		
			
		}
		
	}
	
	
	
	
	
	public static void main(String args[]) {
		
		String inputString="java is java Java is best Python and c also ok I like python and c too";
		String inputString1="java is  best Python and c also ok I like too";
		
		inputString=inputString.toLowerCase();
		
		String[] splitString=inputString.split(" ");
		
		Map<String, Integer> wordTotal= new HashMap<>();
		
		for(String word:splitString) {
			
			if(wordTotal.containsKey(word)) {
				
				wordTotal.put(word, wordTotal.get(word)+1);
								
			}else {
				
				wordTotal.put(word, 1);
				
			}
					
			
		}
		
		System.out.println("Lenth of Input stream is : "+inputString.length());
		System.out.println("Size of the total word is: "+wordTotal.size());
		System.out.println("Lenth of splitString is : "+splitString.length);
		
		
		Set<Entry<String, Integer>> abc= wordTotal.entrySet();
		
		for(Entry<String, Integer> entryWord:wordTotal.entrySet()) {
		System.out.println("Using Entry Set : "+entryWord+" Times");
		//Set<String> wordInString=wordTotal.keySet();
		}
		
//		for(String word1:wordInString) {
		for(String word1:wordTotal.keySet()) {
			
			
		if(wordTotal.get(word1)>0) {
			System.out.println(word1+" : "+wordTotal.get(word1)+" Times");
		//System.out.println("==============================================================================");
		
//			if(wordTotal.get(word1)>2) {
//				
//							System.out.println("======================\n"+word1+" : "+wordTotal.get(word1)+" Times");
//			}
			
		}
			
			
			
		}}
		
		
}
		
	
	
	


//	public static void main(String[] args) {
//		
//		String inputString="java is java java is best python and c also ok I like python and c too";
//		
//		String splitString[]=inputString.split(" ");
//		
//		Map<String,Integer> wordCount= new HashMap<>();
//		
//		for(String word:splitString) {
//			if(wordCount.containsKey(word)) {
//				
//				wordCount.put(word, wordCount.get(word)+1);
//				
//			}else {
//				wordCount.put(word, 1);
//				
//				
//			}
//		}
//		
//		Set<String> stringInWords= wordCount.keySet();
//		
//		for(String word:stringInWords) {
//			if(wordCount.get(word)>2) {
//				
//				System.out.println(word+" : "+wordCount.get(word)+"   Times");
//				
//				
//			}
//			
//			
//		}
//		}
//	}
//		
//		
//		
//		//findDuplicateWords("Hey java is java                  is ola the best language is java ola ola ola ola ola ola");
//		DuplicateWordsInStringArrayTest dup= new DuplicateWordsInStringArrayTest();
//		dup.findDuplicateWords();
////		findDuplicateWords("Hey/ola/ola/ab/ab/ab/,/,/,/,/,/,/,/,/,/,/,/,/,/,/,,,,,");
//
//	}
//	public void findDuplicateWords() {
//
//		//	public static void findDuplicateWords(String inputString) {
//		//split:
//		String inputString="Java is java , java is best , python and c also ok is like python and C too";
//	String words[]=inputString.toLowerCase().split(" ");
//	
//	//create one hashmap:
//	Map<String, Integer> wordCount= new HashMap<String, Integer>();
//	
//	//to check each word in given array:
//	for(String word:words) {
//		
//		//if word present:
//		if(wordCount.containsKey(word)) {
//			wordCount.put(word, wordCount.get(word)+1);
//			
//						
//		}else {
//			
//			wordCount.put(word, 1);
//		}
//	}
//	Set<String> wordsInString=wordCount.keySet();
//	
//	for(String word:wordsInString) {
//		if(wordCount.get(word)>1) {
//			System.out.println(word+ " : "+wordCount.get(word)+" Times");
//			
//			}
//		
//		} 
//	
//	}
//	
//}
