package javaAll;

import java.util.Arrays;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Add_A_Number_To_Arrays_and_sort {
	
	
	public static void main(String[] args) {
		
		Integer[] arr = {66,7,8,2,-3,10,3,5,4,5,9,10,8};
		
		Set<Integer> sets = new HashSet<Integer>(Arrays.asList(arr));
		
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		
		SortedSet<Integer> sortArr = new TreeSet<>(Arrays.asList(arr));
		
		Set<Integer> sIntArr = new TreeSet<>(Arrays.asList(arr));
		
		System.out.println("Sorted set: "+sortArr.toString());
		System.out.println("Set Using TreeSet: "+sIntArr.toString());
		
		
			sortArr.add(12);
			System.out.println("Sorted set added 12 : "+sortArr.toString());
//		Set<Integer> sets= new HashSet<Integer>(Arrays.asList(arr));
		list.add(11);
		list.add(11);
		list.add(11);
		sets.add(6);
		sets.add(6);
		System.out.println("after added 6, 2 times in set : "+Arrays.asList(sets));
		System.out.println("after added 11, 3 times  in list: "+Arrays.asList(list));
		
		
		//arr=sets.toArray(arr);
		
		Arrays.sort(arr);
		
		@SuppressWarnings("unused")
		int size = arr.length;
		
		System.out.println("after sort: "+Arrays.toString(arr));
		
		
		
		//System.out.println("after remove 2nd element : "+Arrays.toString(arr));
		
		//System.out.println("??: "+(arr[size-10]));
		
		sortArr.remove(sortArr.first());
		sortArr.remove(sortArr.first());
		System.out.println("3rd smallest number in an Array is : "+sortArr.first());
		
			sum(arr);
			int total=0;
			for(int a:arr) {
				 total=total+a;
				
			}
			System.out.println("New sum of the array is: "+total);
			
		}
		
		
	//public static void sum(int[] ab) {
		
		public static void sum(Integer[] abc) {
		
		//int[] abc= {9,3,2,100,6,7};
		
		int total=0;
		
		for (int a:abc) {
			
			total=total+a;
			
		}
		
		System.out.println("total of arrays is:"+total);
		
	

		
		
		Integer[] arr1= {1,666,33,78,-3,99,4,99,0,-6};
		
		int min1= Collections.min(Arrays.asList(arr1));
		int max1= Collections.max(Arrays.asList(arr1));
		
		int max2=Collections.max(Arrays.asList(arr1));
		
		
		
		int max = arr1[0];
		int min = arr1[0];
		
		
		for(Integer ar1:arr1) {
			
			if(ar1>max) {
				
				max=ar1;
				
			}
			else if(ar1<min) {
				
				min=ar1;
			}
		}
		
		System.out.println("max is :" +max);
		
		System.out.println("min is: "+min);
		
		System.out.println("From Collections max is :" +max1);
		
		System.out.println("From Collections min is: "+min1);
		
		
		System.out.println("From Collections max2 is: "+max2);
		//main2();


	
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
		
		
	
	
	public static void main2() {
		int[] arr= {201,20,10,60,5,0};
		
		int max=arr[0];
		int min=arr[0];
		
		for(Integer ar:arr) {
			
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
	
