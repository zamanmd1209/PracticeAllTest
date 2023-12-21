package javaAll_Generics;

public class Cat extends Animal{
	
	private String litterPreference;
	//private String name;
	
	public Cat(String name) {
		
		this.name=name;
	}

	public Cat() {
		
		System.out.println("Meow");
		
	}

	public String getLitterPreference() {
		return litterPreference;
	}

	public void setLitterPreference(String litterPreference) {
		this.litterPreference = litterPreference;
	}

}
