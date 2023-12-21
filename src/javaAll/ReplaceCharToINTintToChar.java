package javaAll;

import java.sql.Types;

public class ReplaceCharToINTintToChar {

	public static void main(String[] args) {
		
		String text = "-Jaskdh 2@#$367sd.27askjdf h";
		text=text.toLowerCase();
		String digits = text.replaceAll("[^(a-z)(A-Z)]", "");
		System.out.println(" with ^a-z :  "+digits);
		
		String digits1 = text.replaceAll("[(a-z)(A-Z) -.$@]", "");
		System.out.println(" with (a-z)(A-Z) :  "+digits1);
		
		String digits2 = text.replaceAll("[(0-9)]", "");
		System.out.println(" with (0-9) digits1 only int :  "+digits2);
		
		String digits3 = text.replaceAll("[^(0-9)]", "");
		System.out.println(" with ^(0-9) digits3 only int :  "+digits3);
		
		

		
		String digitInt = text.replaceAll("[(a-z)(A-Z)$#@ .-]", "").trim();
		System.out.println(" with a-z :  "+digitInt);
		
		String digitInt1 = text.replaceAll("[^\\D]", "");
		System.out.println(" with \\\\D :  "+digitInt1);
		
		int textInt=Integer.valueOf(digitInt)/1000;
		String textString=String.valueOf(textInt);
		
		String delay="150";
		int delayInt= Integer.valueOf(delay);
		delay=String.valueOf(delayInt*1000);
		System.out.println(" delay : "+delay);
		
		
		
	
		
		System.out.println(" Multiply by 1000 :  "+delay);
		
		String delay1="200";
		int delayInt1= Integer.valueOf(delay1);
		System.out.println("DelayInt1 200: " +delayInt1);
		
		int delalyInt2=300;
		String delayString2=String.valueOf(delalyInt2);
		System.out.println("String 300: "+delayString2);
		
		
		
	}

}
