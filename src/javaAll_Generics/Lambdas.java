package javaAll_Generics;

public class Lambdas {
	
	public static void main(String[] args) {
		
		//Cat1 myCat= new Cat1();
//		myCat.print();  
	//	printThing(myCat);  // also can use
		
		// lanbda Expression
		
//		printThing(
//				public void print() {
//			System.out.println("Meow");
//			
//		});
		
//		printThing(
//				
//				()->{
//					
//					System.out.println("Meow ww");
//				}
//				);
		
		//printThing(()->System.out.println("Meow ww"));  // or use this
		
		//Printable lambdaPrintable= (S) -> "Meowgggg"+S;//for more then one object
		
		Printable lambdaPrintable= (s)-> "Meowgggg"+s;
		
		printThing(lambdaPrintable);
		
	}

	static void printThing(Printable thing) {
		
		//thing.print("#$ ","  @!");
		
		thing.print("  @!"); //for single object
		
		
	}
	
	//not Printing need to fix
}
