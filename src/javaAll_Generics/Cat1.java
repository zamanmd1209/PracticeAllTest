package javaAll_Generics;

public class Cat1 implements Printable{
	
	public String name;
	public int age;

	
	public Cat1() {
		
		
		
	}


	public void print() {
		System.out.println("Meow");
		
	}


	@Override
	//public void print(String prefix,String suffix) {
		public String print(String suffix) {
			return suffix;  // for single object
		
		
	}

}
