package javaAll;

public class ReverseEachWord {

	public static String str = "AbC dEf HAT";

	public static void main(String[] args) {

		ReverseEachWord.reverseString();
		ReverseEachWord.reverseString1();

	}

	public static void reverseString() {

		String words[] = str.split(" ");

		String reverseString = "";

		for (String w : words) {

			String reverseWord = "";

			for (int i = w.length() - 1; i >= 0; i--) {

				reverseWord = reverseWord + w.charAt(i);

			}

			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println("Reverse String using 2 for loop is : " + reverseString);

	}
	

	public static void reverseString1() {

		String words[] = str.split("\\s");

		String reverseString = "";

		for (String w : words) {

			StringBuffer sb = new StringBuffer(w);

			reverseString = reverseString + sb.reverse() + " ";
			
		}

		System.out.println("Reverse String using String Buffer : " + reverseString);

	}
}
