package javaAll;

import java.util.HashSet;
import java.util.Set;

//import java.util.HashSet;
//import java.util.Set;

public class add2NumTrueFalse {
	
	
	public static void main(String[] args) {
		
		 int[] arr= {1,2,3,8,10};
		int fNum=arr[0];
		int sum=0;
		
		//int i = 0,j=0;
		
		//arr[i]=0;
		//arr[j]=0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==11) {
					
					sum=arr[i]+arr[j];
//					System.out.println(" FOUND ...and sum is : "+sum);
					System.out.println("found!!  i = "+arr[i]+"  and j = "+arr[j]+" and sum is : "+sum);
				}
				
				else {
					System.out.println("Not equals 11 : !! "+" i="+arr[i]+"  and j="+arr[j]+"  and sum is : "+(arr[i]+arr[j]));
				}
				
				//System.out.println("found i="+arr[i]+"found j="+arr[j]+" and sum is : "+sum);
				
			}
			
			
			
		}
//		System.out.println(" FOUND ...and sum is : "+sum);
		//System.out.println("found i="+arr[i]+"found j="+arr[j]+" and sum is : "+sum);
		
		//else {}
//		for(Integer val:arr) {
//			
//			if(val+arr[0]==11) {
//				
//				int sum=val+fNum;
//				
//				System.out.println(" FOUND..... Number is: " + sum);
//			
//			}else 
//				
//				if(val+fNum>3 ||val+fNum<3) {
//					
//					System.out.println("NOT FOUND>>>>>>");
//			}
//			
//				
//				
//				
//				
//			}
			
		
		
//		for(int i=0;i<arr.length;i++) {
//			
//			for(int j=i+1;j<arr.length;j++) {
//				
//				if(arr[i]+arr[j]==9) {
//					int sum=arr[i]+arr[j];
//					System.out.println("FOUND.....sum is : "+sum);
//					
//				} if(arr[i]+arr[j]>9){
//					
//					System.out.println("NOT FOUND....");
//					
//				}
//				
//				
////				System.out.println("FOUND....."+sum);
//				
//			}
//			
//		}
	
			
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
		//public static void main(String[] args) {
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
		//public static void duplicateNunber() {
//			int arr[] = {1,3,5,6,7,5,6};
//			int num[]= {99,12,-2, 4, 98, 67, 25 ,5,999, 4, 5 };
			//int max= num[0];
			//int min= num[0];
			//int i=0;
			//int j=0;
			
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
	//		}
	
	


