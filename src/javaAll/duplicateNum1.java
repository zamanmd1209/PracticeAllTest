package javaAll;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class duplicateNum1 {
	
	static int[] arr= {1,4,6,4,6,8,4,6,4,6};
	public static void main(String[] args) {
		
		
		int[] arr1= {6,4,3,4,5,6,4,6,5,5};
		
		Arrays.sort(arr1);
		
		System.out.println("after sort Array is: "+Arrays.toString(arr1));
		
		Set<Integer> setInt= new HashSet<>();
		
		for(int a:arr1) {
			
			if(setInt.add(a)==false) {
				
				System.out.println("Duplicate Number is: "+a);
				
			}
			
			
			
		}
		
//	int[] allInt= {2,3,4,5,6,7,8,9,4,6,3,9};
//	
//	Set<Integer> setInt= new HashSet<Integer>();
//	
//	for(Integer val:arr) {
//		
//		if(setInt.add(val)==false) {
//			
//			System.out.println("Duplicate NUmber is :" +val);
//			
//		}
//		
//		
//	}
//	
	
	}
}