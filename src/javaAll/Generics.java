package javaAll;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Generics {

	public static void main(String[] args) {
		
	Set<Integer> myData= new LinkedHashSet<Integer>();
	while(myData.size()<500) {
		myData.add(getRandomNumber());
		
		
	}
		
System.out.println(myData.size());
	}

	public static int getRandomNumber(){
		
		Random random= new Random();
		int randomNumber= random.nextInt(9000);
		
		return randomNumber;
			
			
			
		}
		
		
	}

