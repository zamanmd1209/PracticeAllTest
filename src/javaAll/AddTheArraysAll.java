package javaAll;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Arrays;import java.util.SortedSet;import java.util.TreeSet;
import java.util.Collections;

public class AddTheArraysAll {
	
	
	
	
	public static void main(String[] args) {
		
		Integer[] arr1= {99,0,-6,-6};
		
		Integer[] arr= {3,4,4,5,6,8,1,10};
		
		SortedSet<Integer> sortedArr= new TreeSet<>(Arrays.asList(arr));
		SortedSet<Integer> sortedArr1= new TreeSet<>(Arrays.asList(arr));
		
		System.out.println("Sorted Tree"+sortedArr);
		
		sortedArr.remove(sortedArr.first());
		
		System.out.println("Second smallest from an array: "+sortedArr.first());
		
		//int i=0,j=0;
		
		int total1=0;
		
		int sum=0;
		
		int max= Collections.max(Arrays.asList(arr));
		
		int min= Collections.min(Arrays.asList(arr));
		
		Arrays.sort(arr);
		
		for(int a: arr) {
			
			total1=total1+a;
			
		}
		
		int max1=0;
		int min1=0;
		
		for(int i=0;i<arr.length;i++) {
			
			
			sum=sum+arr[i];
			
			for(int j=i+1;j<arr.length;j++) {
				
				int mySum=arr[i]+arr[j];
				
				if(mySum==11) {
					
					System.out.println("Found sum==11 "+mySum+" where i= "+arr[i]+" and j is "+arr[j]);
				}
				
			
			}
			
			
		}
		
		
//		for(i=0;i<arr.length;i++) {
//			
//			sum=sum+arr[i];
//			
//			
//			
//		
//for(j=i+1;i<arr.length-1;j++) {
//			
//			//sum=sum+arr[j];
//	if(sum==11) {
//		
//		System.out.println("Found !!"+sum);
//	}
//			
//			
//			
//		}
//
//		}
		
		String sorted=Arrays.toString(arr);
		
		System.out.println(" total is :"+ total1);
		
		System.out.println(" sum is :"+ sum);
		
		System.out.println(" max is :"+ max);
		
		System.out.println(" min is :"+ min);
		
		System.out.println("sorted Arrays1 "+Arrays.toString(arr));
		
		
		System.out.println("sorted Arrays2 "+sorted);
		//sum=arr[i]+arr[j];
		
		
		
		//sum(new int[] {3,7,5,90});
		
		//sum();
	
			
			
			
		}
		
	//public static void sum(int[] ab) {
		
		public static void sum() {
		
		int[] abc= {9,3,2,100,6,7};
		
		int total=0;
		
		for (int a:abc) {
			
			total=total+a;
			
		}
		
		System.out.println("total of arrays is:"+total);
		
	}
}
		
		
//		Integer[] arr1= {1,666,33,78,-3,99,4,99,0,-6};
//		
//		int min1= Collections.min(Arrays.asList(arr1));
//		int max1= Collections.max(Arrays.asList(arr1));
//		
//		int max2=Collections.max(Arrays.asList(arr));
//		
//		
//		
//		int max = arr[0];
//		int min = arr[0];
//		
//		
//		for(Integer ar1:arr) {
//			
//			if(ar1>max) {
//				
//				max=ar1;
//				
//			}
//			else if(ar1<min) {
//				
//				min=ar1;
//			}
//		}
//		
//		System.out.println("max is :" +max);
//		
//		System.out.println("min is: "+min);
//		
//		System.out.println("From Collections max is :" +max1);
//		
//		System.out.println("From Collections min is: "+min1);
//		
//		
//		System.out.println("From Collections max2 is: "+max2);
//		//main2();
//	}
//	
//	
//	
//	
//	
//	
//	public static void duplicateNum() {
//		
//		
//		
//		
//		int num1[]= {1,5,9,34,99,-2};
//		
//		int max=num1[0];
//		
//		for(Integer val1:num1) {
//			
//			if(val1>num1[0]) {
//				
//				max=val1;
//				
//			}
//			
//		}
//		
//		System.out.println("My Max is: "+max);
//		
//		int num[]= {99,12,-2, 4, 98, 67, 25 ,5,999, 4, 5 };
//		//int max= num[0];
//		//int min= num[0];
//		//int i=0;
//		//int j=0;
//		
//		for(int i=0;i<num.length; i++) {
//			
//			for(int j=i+1;j<num.length;j++) {
//				
//				if(num[i]==num[j]) 
//					
//					//System.out.println("duplicate nimber is: "+num[j]);
//					
//					//System.out.println("non duplicate nimber is: "+num[i]);
//				
//				
//				System.out.println("duplicate number is: "+num[j]);
//				
//			}
//			
//		
//		}
//		}
//		
//		
//	
//	
//	public static void main2() {
//		int[] arr= {201,20,10,60,5,0};
//		
//		int max=arr[0];
//		int min=arr[0];
//		
//		for(Integer ar:arr) {
//			
//			if(ar>max) {
//				
//				max=ar;
//				
//				
//			} else if(ar<min) {
//				
//				min=ar;
//			}
//			
//			else if(ar==max) {
//				
//				
//				
//			}
//			
//			
//		}
//		
//		//duplicateNum();
//		
//		System.out.println("Max number on list is: "+max);
//		System.out.println("Min number on list is: "+min);
//	}
//	
//	
//
//	public static void main1(String[] args) {
//		
//		
//	int num1[]= {1,5,9,34,99,-2,101};
//		
//		int max1=num1[0];
//		
//		for(Integer val1:num1) {
//			
//			if(val1>max1) {
//				
//				max1=val1;
//				
//			}
//			
//		}
//		
//		System.out.println("My Max is max1 = : "+max1);
//		
//		
//		
//		
//		
//		
//	int arr[]= {4,6,2,9,97,-2};
//	
//	
//	int max= arr[0];
//	int min=arr[0];
//	
//	for(int i=0;i<arr.length;i++) {
//		
//		if(arr[i]>max) {
//			max=arr[i];
//			
//		}
//		
//		
//	}
//	System.out.println("Max is: "+max);
//	
//	
//	for(Integer ar:arr) {
//		if(ar>max) {
//			max=ar;
//			
//			
//		}
//		
//	}
//	System.out.println("New max is max2: "+max);
//	}
//}
//		 
////		
////		//LargestAndSmallestNumber dup= new LargestAndSmallestNumber();
////		
////		
////		
////		int num[]= {99,12,-22, 4, 98, 67, 25 ,5,99 };
////		int max= num[0];
////		int min= num[0];
////		
//////		for(Integer val:num) {
//////		
//////		//for(int i=0;i<num.length; i++) {
//////			
//////			//for(int j=i+1;j<num.length;j++) {
//////				
//////				
//////				//if(num[i]==num[j]) {
//////					
//////					//System.out.println("duplicate nimber is: "+num[j]);
//////				//}
//////			if(val<min) {
//////				
//////				min=val;
//////			}
//////		
//////		if(val>max) {
//////			max=val;}
//////
//////	}
//////		for(Integer val: num) {
//////			if(val>max) {
//////			
////////			if(val>max) {
////////				max=val;
//////			}
//////				if(val<min) {
//////					
//////					min=val;
//////				}
////				
////				
////			}
////			
////		
////System.out.println("max number is ="+"\n"+max +" \nmin is="+"\n"+min);
////
//////dup.duplicateNum();
////}
////	
//	
