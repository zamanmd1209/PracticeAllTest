package javaAll;

import java.util.HashSet;
import java.util.Set;

//import java.util.HashSet;
//import java.util.Set;

public class duplicateStringArray {
	
	static String arr[]= {"javA","python","ruby", "Java", "java","python"};
	public static void main(String[] args) {
		
		int[] intArr= {1,2,3,2,4,2,5,6,5};
	
		Set<String> arrSet= new HashSet<String>();
		
		Set<Integer> intSet= new HashSet<>();
		
		for(String ar:arr) {
			
			ar=ar.toLowerCase();
			
			if(arrSet.add(ar)==false) {
				System.out.println("Duplicate String is: "+ar);
				
				
			}
				
			}
		
		for(Integer i:intArr) {
			if(intSet.add(i)==false) {
				
				System.out.println("Duplicate Integer is: "+i);
				
				
			}
			
			
		}
			
			
	}
}