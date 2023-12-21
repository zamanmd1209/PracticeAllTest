package javaAll;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {

		Integer[] ab={2,1,3,4,5,-10};
		
		// sum of an array
		int sum=0;
		for(int a:ab) {
			
			sum=sum+a;
			
			
		}
	
		System.out.println("sum of the array is :"+ sum);
		
		//=======================================================
		
		// sort ascending
		
//		Arrays.sort(ab);
//		
//		System.out.println("Sorted Ascending : "+Arrays.toString(ab));
		
		//================================================================
		
		// sort descending
		
//		Arrays.sort(ab,Collections.reverseOrder());
//		
//		System.out.println("Sorted Descending : "+Arrays.toString(ab));
		
		// ===============================================================
		
//		public static void dupChar() {
			String gWord="appleapples";
			
			String[] sWord=gWord.split("");
			
			Set<String> spSet= new LinkedHashSet<String>();
			
			for (String item: sWord) {
				
				if(spSet.add(item)==false) {
					
					System.out.println("not duplicate leter is: "+ item);
					
					
				}
			}
			
		}

	}
	
	
	
	


