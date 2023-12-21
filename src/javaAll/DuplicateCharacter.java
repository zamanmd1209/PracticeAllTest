package javaAll;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class DuplicateCharacter {

	public static void main(String[] args) {
		
		
//		findDuplicateString();
		
		findDuplicateCharacter();
	}
	
	
	public static void findDuplicateCharacter() {
		
		String word= "javaisjavapython";
		
		String[] splitString= word.split("");
		
		Set<String> LString= new LinkedHashSet<>(); 
		
		
		
		for(String w:splitString) {
			
			if(LString.add(w)!=true) {
				
		
				System.out.println("duplicate character is:"+w);
				
			}
			
			
			
		}
		
		
		
	}
	
	
	public static void findDuplicateString() {
		
		String name="Howmanyduplicatesarethere";
		
		String[] splitString=name.split("");
		System.out.println(Arrays.toString(splitString));
		char[] nameChar=name.toCharArray();
		
		Object dup="";
		
		for(int i=0; i<name.length(); i++) {
			for(int j=i+1;j<name.length();j++) {
				
				if(name.charAt(i)==name.charAt(j)) {
					
				/*Object*/ dup=name.charAt(j);
				
					
					System.out.println("Duplicale letter is: ="+ dup);
					break;
					
				}
				 
//				System.out.println("Duplicale letter is:  = "+ name.charAt(j));
			}
			
//			System.out.println(name.charAt(i));
			
		}
		
		List<String> listString=new LinkedList<String>();
		
		for(String str:splitString) {

			listString.add(str);
			
		}
		
		
		
		System.out.println("length of string1 name :"+name.length());
		
		String text= "who is this yes?";
		
		String[] splitText=text.split(" ");
		
		System.out.println("lenth of string :"+splitText.length);
		System.out.println("lenth of string2 :"+text.length());
		
		System.out.println(" t in lenth of string text:"+(text.indexOf("t")+1));
		System.out.println(" h in lenth of string name :"+(name.indexOf("h")+1));
		
		

	}
	
}
