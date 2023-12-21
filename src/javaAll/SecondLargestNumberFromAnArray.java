package javaAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class SecondLargestNumberFromAnArray {
	
	
	
	
	public static void main(String[] args) {
		
		//int[] numbs = {1, 1, 4, 5, 7, 1, 2, 6, 2, 3}  // given
		
		Integer[] arr= {1, 1,-4, 4, 5,-5, 7, 1, -2,-1,99, 6, -2, 3};
		
		
		System.out.println("after sort : "+Arrays.asList(arr)+" 9th Number in array is : "+arr[8]);
		
		SortedSet<Integer> treeSet= new TreeSet<>();
		
		Set<Integer> linkedHashSetset= new LinkedHashSet<Integer>(Arrays.asList(arr));
		List<Integer> list= new ArrayList<>();


		
		for(Integer i:arr) {
			
			treeSet.add(i);
			linkedHashSetset.add(i);
			list.add(i);
			
		
		}
		
		System.out.println("treeSet is      : "+treeSet);
		System.out.println("LinkedHashSet is: "+linkedHashSetset);
		System.out.println("List          is: "+list);
		
		Arrays.sort(arr);
		
		int len= arr.length-4;
	
		linkedHashSetset.remove(linkedHashSetset.toArray()[0]);
		
		treeSet.remove(treeSet.first());
		//set.remove(set.first()); // removed first number to get the second number
		
		System.err.println("from TreeSet Second largest in array list is : "+treeSet.first());
		System.err.println("from LinkedHashSet Second largest in array list is : "+linkedHashSetset.toArray()[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
	
	
	
	
	
	public static void duplicateNum() {
		
		
		
		
		int num1[]= {1,5,9,34,99,-2};
		
		int max=num1[0];
		
		for(Integer val1:num1) {
			
			if(val1>num1[0]) {
				
				max=val1;
				
			}
			
		}
		
		System.out.println("My Max is: "+max);
		
		int num[]= {99,12,-2, 4, 98, 67, 25 ,5,999, 4, 5 };
		//int max= num[0];
		//int min= num[0];
		//int i=0;
		//int j=0;
		
		for(int i=0;i<num.length; i++) {
			
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]==num[j]) 
					
					//System.out.println("duplicate nimber is: "+num[j]);
					
					//System.out.println("non duplicate nimber is: "+num[i]);
				
				
				System.out.println("duplicate number is: "+num[j]);
				
			}
			
		
		}
		}
		
		
	
	
	public static void main2(String[] args) {
		
		int[] arr= {201,20,10,60,5,0};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int ar:arr) {
			
			if(ar>max) {
				
				max=ar;
				
				
			} else if(ar<min) {
				
				min=ar;
			}
			
			else if(ar==max) {
				
				
				
			}
			
			
		}
		
		//duplicateNum();
		
		System.out.println("Max number on list is: "+max);
		System.out.println("Min number on list is: "+min);
	}
	
	

	public static void main1(String[] args) {
		
		
	int num1[]= {1,5,9,34,99,-2,101};
		
		int max1=num1[0];
		
		for(Integer val1:num1) {
			
			if(val1>max1) {
				
				max1=val1;
				
			}
			
		}
		
		System.out.println("My Max is max1 = : "+max1);
		
		
		
		
		
		
	int arr[]= {4,6,2,9,97,-2};
	
	
	int max= arr[0];
	int min=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]>max) {
			max=arr[i];
			
		}
		
		
	}
	System.out.println("Max is: "+max);
	
	
	for(Integer ar:arr) {
		if(ar>max) {
			max=ar;
			
			
		}
		
	}
	System.out.println("New max is max2: "+max);
	}
}
		 
//		
//		//LargestAndSmallestNumber dup= new LargestAndSmallestNumber();
//		
//		
//		
//		int num[]= {99,12,-22, 4, 98, 67, 25 ,5,99 };
//		int max= num[0];
//		int min= num[0];
//		
////		for(Integer val:num) {
////		
////		//for(int i=0;i<num.length; i++) {
////			
////			//for(int j=i+1;j<num.length;j++) {
////				
////				
////				//if(num[i]==num[j]) {
////					
////					//System.out.println("duplicate nimber is: "+num[j]);
////				//}
////			if(val<min) {
////				
////				min=val;
////			}
////		
////		if(val>max) {
////			max=val;}
////
////	}
////		for(Integer val: num) {
////			if(val>max) {
////			
//////			if(val>max) {
//////				max=val;
////			}
////				if(val<min) {
////					
////					min=val;
////				}
//				
//				
//			}
//			
//		
//System.out.println("max number is ="+"\n"+max +" \nmin is="+"\n"+min);
//
////dup.duplicateNum();
//}
//	
	
