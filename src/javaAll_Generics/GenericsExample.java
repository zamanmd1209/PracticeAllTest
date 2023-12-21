package javaAll_Generics;

import java.awt.print.Printable;
import java.util.*;

public class GenericsExample {

	public static void main(String[] args) {
		
		IntegerPrinter intPrinter= new IntegerPrinter(23);
		intPrinter.print();
		
		DoublePrinter DoublePrinter= new DoublePrinter(23.0);
		DoublePrinter.print();
		
		StringPrinter strPrint= new StringPrinter("Something to print");
		strPrint.print();
		
		
//		@SuppressWarnings("unchecked")
		Printer<String> printer= new Printer<>("what to print");
		printer.print();
		
		Printer<Double> printer1= new Printer<>(23.9);
		printer1.print();
		
		Printer<Integer> printer2= new Printer<>(23);
		printer2.print();
		
		
//		ArrayList<Cat> cats1= new ArrayList<>();
//		cats.add(new Cat());
//		//cats.add(new Dog());
		
		//Cat myCat= (Cat)cats.get(0);
		
		
//		ArrayList<Cat> cats= new ArrayList<>();
//		cats.add(new Cat());
		//cats.add(new Dog());
		
		shout1("John", 74, 7.9);
//		shout(57);
//		shout(new Cat());
		shout(2,3,4);
		
		
		
		
	}
	
	private static <T,V,P> void shout1(T thingToShout, V otherThingToShout,P otherAddedShout) {
		
		System.out.println(thingToShout+"!!!!!!");
		System.out.println(otherThingToShout+"!!!!!!");
		System.out.println(otherAddedShout+"!!!!!!");
		
	}
private static <T,V,P> P shout(T thingToShout, V otherThingToShout,P otherAddedShout) {
		
		System.out.println(thingToShout+"!!!!!!");
		System.out.println(otherThingToShout+"!!!!!!");
		System.out.println(otherAddedShout+"!!!!!!");
		return otherAddedShout;
		
	}

}
