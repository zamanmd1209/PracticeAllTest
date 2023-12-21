package javaAll_Generics;

//public class Printer_T_Extends_Animal <T extends Animal & Serializable>{
	public class Printer_T_Extends_Animal <T ,V>{
	
	T thingToPrint;
	V otherThing;

	public Printer_T_Extends_Animal(T thingToPrint) {
		super();
		this.thingToPrint = thingToPrint;
	}
	
	public void print() {
		
		//thingToPrint.eat();
		System.out.println(thingToPrint);
	}

}
