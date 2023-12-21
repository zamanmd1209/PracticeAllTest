package javaAll;

public class Pyramid {

	public static void main(String[] args) {

		int numberOfRows=9;
		int rowCount=1;
		
		for(int i=numberOfRows;i>0;i--) {
//		for(int i=1;i<numberOfRows;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
				
				
			}
			
			for(int j=1;j<=rowCount;j++) {
				System.out.print("* ");
				
				
			}
			System.out.println();
			rowCount++;
			
		}
		
		

	}

}
