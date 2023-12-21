package javaAll;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		// HashMap is a class implements Map Interface
		// extends AbstractMap
		//it contains only unique elements
		//stores the value - key- value pair
		// it may have one null key and multiple null values
		// it maintains no order
		
		Map <Integer, String> hm= new TreeMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		
		System.out.println(hm.toString());
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		for(int k:hm.keySet()) {
			
			String value= hm.get(k);
			
			System.out.println("key is: "+k+"  and value is: "+value);
			
			
			
			
		}
		
	
		


	}

}
