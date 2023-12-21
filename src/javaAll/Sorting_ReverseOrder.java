package javaAll;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_ReverseOrder {

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");

		}
		// System.out.println();
	}

	public static void main1(String[] args) {

		Integer[] arr1 = { 7, 8, 3, 1, 2, 55, -5, 11, 8 };

//	Arrays.sort(arr1);

		Arrays.sort(arr1, Collections.reverseOrder());

		System.out.println("Sorted with Arrays.sort(arr)\n" + Arrays.toString(arr1));

	}

	public static void main2(String[] args) {

		Integer[] arr = { 3, 5, -7, 1, 99, 2 };

		Integer[] arr1 = { 1, 4, 3, 5, 7, 1, 99, 2 };

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr, Collections.reverseOrder());
		Arrays.sort(arr, Collections.reverseOrder());

		System.out.println("With reverse order : " + Arrays.asList(arr));

	}

	public static void main(String[] args) {

		int[] arr = { 12, 11, 13, 5, 6 };
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
									
				}
				
			}
			
			System.out.print(arr[i]+" ");
		}
		

//		int len = arr.length;
//		for (int i = 0; i < len; i++) {
//
//			int max_indx = i;
//			for (int j = i + 1; j < len; j++) {
//
//				if (arr[max_indx] < arr[j]) {
//
//					max_indx = j;
//
//				}
//
//			}
//			if (i != max_indx) {
//				int temp = arr[max_indx];
//				arr[max_indx] = arr[i];
//				arr[i] = temp;
//
//			}
//
//		}
//		for (int i = 0; i < len; i++) {
//
//			System.out.print(arr[i] + " ");
//
//		}
	}

//	 int arr[]= {7,8,3,1,2,55,-5,11};
//	 //time complexity = O(n^2)
//	 //bubble sort
//	 for (int i=0; i<arr.length-1; i++) {
//		 for(int j=0; j<arr.length-i-1; j++) {
//			 
//			 if(arr[j]> arr[j+1]) {
//				 //swap
//				 int temp = arr[j];
//				 arr[j]= arr[j+1];
//				 arr[j+1]= temp ;
//				 
//			 }
//			 
//		 }
//		 
//	 }
//	 printArray(arr);
//
//	}

}
