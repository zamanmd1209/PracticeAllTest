package javaAll;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//import java.util.HashSet;
//import java.util.Set;

public class duplicateNum {

	static Integer[] arr = { 1, 4, 6, 4, 6, 8, 4 };

	public static void main(String[] args) {

		addedNumSum();

		Set<Integer> arrSet = new HashSet<Integer>();

		for (Integer ar : arr) {

			if (arrSet.add(ar) == false) {

				System.out.println("Duplicate Number is: " + ar);

			}

		}

	}

	public static boolean addedNumSum() {
		// int firstNum=arr[0];

		for (Integer ar : arr) {

			if (ar + arr[0] == 9) {

				System.out.println(" Found True and Number is: " + ar);

			}
			return true;

		}
		return false;

	}

}

// private static int arr[]= {2,3,4,5,6,3,4};
//	
//	public static void main(String[] args) {
//		
//		
//		
//		
//		Set<Integer> arrNum= new HashSet<Integer>();
//		
//		for(Integer ar:arr) {
//			
//			if(arrNum.add(ar)==false) {
//				
//				System.out.println("Duplicate Number is: "+ ar);
//			}
//				
//		}
//		dup();		
//	} 
//	
//	public static void dup() {
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			for(int j=i+1;j<arr.length;j++) {
//				
//				if(arr[i]==arr[j]) {
//					
//					System.out.println(arr[j]);
//					
//					
//					
//				}
//				
//				
//			}
//		}
//	}

//	public void main(String[] args) {
// public static void main(String[] args) {
//			
//			
//			int arr[]= {2,4,5,8,6,4,5,9};
//			Set arrSet= new HashSet();
//			//Set<Integer> arrSet= new HashSet<Integer>();
//			
//			for(Integer val:arr) {
//				
//				if(arrSet.add(val)==false) {
//					
//					
//					System.out.println(val);
//				}
//				
//			}
//		duplicateNumber();
//			
//		}
//		
//		
//		public static void duplicateNumber() {
//			
//			
//			int numbs[]= {2,4,6,7,4,3,2};
//			
//			Set numbers= new HashSet();
//			
//			for(Integer num:numbs ) {
//				//if(numbers.add(num)==false) {
//					if(numbers.add(num)==false) {
//					System.out.println("Duplicate number is:  "+num);
//				}
//				
//			}
//			
//			
//			
//		}
// public static void duplicateNunber() {
//			int arr[] = {1,3,5,6,7,5,6};
//			int num[]= {99,12,-2, 4, 98, 67, 25 ,5,999, 4, 5 };
// int max= num[0];
// int min= num[0];
// int i=0;
// int j=0;

//			for(int i=0;i<num.length; i++) {
//				
//				for(int j=i+1;j<num.length;j++) {
//					
//					if(num[i]==num[j]) {
//						
//						System.out.println("duplicate nimber is: "+num[j]);
//						
//						System.out.println("non duplicate nimber is: "+num[i]);
//					
//					}
//					
//				}
//				
//			
//			}

//			int arr[]={1,3,4,6,8,6,4};
// Set<Integer> arrset= new HashSet<Integer>();

//         for (Integer ar: arr){

// if(arrSet.add(ar)==false){

//  System.out,println("Duplicate number is: "+ar)
//}

//}
//			
//			for(Integer val: arr) {
//				if(arrSet.add(val)==false) {
//					
//					System.out.println(val);

//			Set<Integer> arrSet= new HashSet<Integer>();
//			
//			//for(Integer val:arr) {
//				
//				for(Integer val: arr) { 
//					
//					if(arrSet.add(val)==false) {
//				
//				//if(arrSet.add(val)==false) {
//					
//					System.out.println("Duplicate Number is: "+val);
//				}
//			}
//			
//			
//			
// }
