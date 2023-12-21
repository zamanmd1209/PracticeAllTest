package javaAll;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sorting_ {

	public static void main1(String[] args) {

		Integer[] arr1 = { 66,7, 8, 3, 1, 2, 2, 3, 55, -5, 11 };

		Arrays.sort(arr1);

		System.out.println("Sorted with Arrays.sort(arr1):   " + Arrays.toString(arr1));
		System.out.println("Sorted with Arrays.asList(arr1): " + Arrays.asList(arr1));

		// time complexity = O(n^2)
		// bubble sort
		System.out.print("[");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length - 1; j++) {

				if (arr1[i] > arr1[j]) {
					// swap
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;

				}

			}

			System.out.print(arr1[i]);
			if (arr1.length - 1 > i)
				System.out.print(",");

		}
		System.out.print("]");
//	 printArray(arr1);

//		System.out.print("[");

//		for (int i = 0; i < arr1.length; i++) { // print ascending
//	for(int i=arr1.length-1;i>=0;i-- ) {  // print reverse

//			if (i < arr1.length)
//				System.out.print(arr1[i]);
//			if (arr1.length - 1 > i)
//				System.out.print(",");

	}
//		System.out.print("]");

//	}

	public static void printArray(Integer[] arr) {

		System.out.print("[");

		for (int i = 0; i < arr.length; i++) {
//			for(int j=0;i<arr.length-1;i++ ) {

			if (i < arr.length)
				System.out.print(arr[i] + ",");

		}
		System.out.print("]");
	}

	public static void main(String[] args) {

		int[] arr = { 66,17, 15, 2, 7, 2, 75,9, 15, 0, -3, -1, 55 ,-5};
		Integer[] arr1 = { 17, 15, 2, 7, 2, 9, 15, 0, -3, -1, 55 };

		System.out.print("[");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(",");


			}
			
			
			

		}

		System.out.print("]");

		Arrays.sort(arr);
		
		System.out.println();

		System.out.println("arr1 : " + Arrays.toString(arr));
		
		
	
		
	
			
			
		}


//		
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length-1;j++) {
//				
//				if(arr[i]>arr[j]) {
//					
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//					
//				}
//				
//			}
//			System.out.print(arr[i]+" ");
//			
//			
//			
//			
//		}
//		System.out.println();
//		System.out.println("second highest number is: "+arr[(arr.length-1)-(arr.length-3)]+" ");
	}

