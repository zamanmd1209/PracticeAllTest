package javaAll_Generics;

public class Printer <T>{
	
	T thingToPrint;

	public Printer(T thingToPrint) {
//		super();
		this.thingToPrint = thingToPrint;
	}
	
	public void print() {
		
		System.out.println(thingToPrint);
	}

}
