package javaAll;

public class Generics2 {

	public static void main(String[] args) {
		
		String[] a= {"mango","apple", "orange"};
		Integer[] b=  {1,4,7,8,9};
		Object[] c= {"name",6,'a',22.01234874847565757577};
		
		for(Object a1:c) {
			
			System.out.println(a1);
			
			
			
		}
		
		System.out.println("##################################");
		//Boolean[] c = {true,false};
		
		printArray(a);
		System.out.println("=================================");
		printArray(b);
		System.out.println("*********************************");
//		printArray(c);
		

	}

	
		
		public static<T> void printArray(T[] x){
			for(T item:x) {
				
				System.out.println(item);
				
			}
		
	}
}
