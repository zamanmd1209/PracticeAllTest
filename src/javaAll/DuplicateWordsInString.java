package javaAll;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		String longWord="Hey java is java is ola the best language is java ola ola ola ola ola ola";
		String[] words= longWord.split(" ");
		
		Map<String, Integer> wordCount= new HashMap<>();
		findDuplicateWords("Hey/ola/ola/ab /ab/ ab/,/,/,/, /,/,/,/,  /,/,  /,/,/,/,/,,,,,");
		findDuplicateWords("Hey java is java is ola the best language is java ola ola ola ola ola ola");

	}

	
	public static void findDuplicateWords(String inputString) {
		//split:
	String[] words=inputString.split(" ");
	
	//create one hashmap:
	Map<String, Integer> wordCount= new HashMap<String, Integer>();
	
	//to check each word in given array:
	for(String word:words) {
		
		//if word present:
		if(wordCount.containsKey(word)) {
			wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
						
		}else {
			
			wordCount.put(word, 1);
		}
	}
	Set<String> wordsInString=wordCount.keySet();
	
	for(String word:wordsInString) {
		if(wordCount.get(word)>0) {
			System.out.println(word+ " : "+wordCount.get(word)+" Times");
			
			}
		
		} 
	
	}
	
}
