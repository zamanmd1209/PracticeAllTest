package javaAll;

public class Pelindrom {

	public static void main(String[] args) {
		
		
		String word= "avan";
		String word1= "racecar";
		
		System.out.println(word1);
		StringBuffer sb= new StringBuffer(word1);
		
		String reverseWord= sb.reverse().toString();
		System.out.println(reverseWord);
		
		if (word1.equals(reverseWord)) {
			
			System.out.println("word is pelindrom");
			
		}
		
		else {
			
			System.out.println("word is Not pelindrom");
		}
	}

}
