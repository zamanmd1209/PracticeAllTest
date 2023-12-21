package javaAll;

public class SumOfAnArray {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 1, 4 };

		int sum = 0;

		for (int i : arr) {

			sum = sum + i;

		}

		evenOdd();
//		System.out.println("Sum is:" + sum);

	}
	
	public static void evenOdd() {
		
		
		int[] arr= {3,4,2,6,7,8,9,10};
		
		int sum=0;
		
		for(int i:arr) {
		sum=sum+i;
			
			if(i%2==0) {
				System.out.print(" ");
				System.out.print(i);
			
		}
		}
		System.out.println();
		
		System.out.println("sum is:"+sum);
		
	}
}
