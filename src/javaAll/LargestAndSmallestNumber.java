package javaAll;

import java.util.Arrays;
import java.util.Collections;

public class LargestAndSmallestNumber {
	
	
	
	public static void main(String[] args) {
	
		Integer[] arr= {-200,666,11,555,33,78,-100,777,-9,99,4,99,0,-6};

int max = arr[0];
int min = arr[0];

	for(int ar:arr) {
		
		if(ar>max) {
			max=ar;
		}
		if (ar<min) {
			min=ar;
		}
		
		
	}
		System.out.println("max is: "+max);
		System.out.println("min is: "+min);
		
	}
	
	public static void main2(String[] args) {
		
		Integer[] arr= {666,11,555,33,78,-9,99,4,99,0,-6};
		
		//Integer[] arr1= {1,666,33,78,-3,99,4,99,0,-6};
		
		int min1= Collections.min(Arrays.asList(arr));
		int max1= Collections.max(Arrays.asList(arr));
		
		int max2=Collections.max(Arrays.asList(arr));
		int min2=Collections.min(Arrays.asList(arr));

		int min3=Collections.max(Arrays.asList(arr));
		int max3=Collections.max(Arrays.asList(arr));
		
		
		
		int max = arr[0];
		int min = arr[0];
		
		
		for(Integer ar1:arr) {
			
			if(ar1>max) {
				
				max=ar1;
				
			}
			else if(ar1<min) {
				
				min=ar1;
			}
		}
		
		System.out.println("max is :" +max);
		
		System.out.println("min is: "+min);
		
		System.out.println("From Collections max1 is :" +max1);
		
		System.out.println("From Collections min1 is: "+min1);
		
		
		
		
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
	
