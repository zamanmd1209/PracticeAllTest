package javaAll;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Generics3 {

	public static void main(String[] args) {
		
		int n=100;
		
	//Set<Integer> myData= new LinkedHashSet<Integer>();
	Set<Integer> myData= new TreeSet<Integer>();
	
	
	while(myData.size()<120) {
		myData.add(getRandomNumber());
		
		
	}
	System.out.println(myData);
		
//System.out.println(myData.size());

Object[] x = myData.toArray();
System.out.println(x[n-1]);


	}

	public static int getRandomNumber(){
		
		Random random= new Random();
		int randomNumber= random.nextInt(120)+100;
		
		return randomNumber;
			
			
			
		}
		
		
	}

