package javaAll_Generics;
import java.util.*;

public class WildCardGenericsExample {

	public static void main(String[] args) {
	
		
		
		List<Integer> intList= new ArrayList<>();
		intList.add(3);
		intList.add(5);
		printList(intList);
		
		

		
		
	}
	
	private static void printList(List<?> myList) {
		System.out.println(myList);
		
		
	}
		
	}


