package javaAll;

import java.util.ArrayList;
import java.util.Arrays;

import javaAll_Generics.Cat1;

//import javaAll_Generics.Cat;

public class GenericsExample {

	// using Printer.java and called here

	public static void main(String[] args) {
		
		Printer<Integer> printer= new Printer<>(56);
		printer.print();
		
		Printer<String> stringprinter= new Printer<>("John");
		stringprinter.print();
		
		Printer<Double> doubleprinter= new Printer<>(65.7897576765765765765765767676576576);
		doubleprinter.print();
		
		ArrayList<Cat1> cats= new ArrayList<>();
		ArrayList<Dog> dogs= new ArrayList<>();
		cats.add(new Cat1());
		dogs.add(new Dog());
		
		ArrayList<String> allCat= new ArrayList<>(Arrays.asList("cat1","cat2"));
		
		System.out.println(allCat);
		
	
		

	}
}
