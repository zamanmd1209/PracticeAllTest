package javaAll;

public class ReverseString1 {

	public static void main(String[] args) {
		
		
		//String r = rrv.reverse("D H A K A");
		//System.out.println(r);
		
//		ultaLekha();
		revrseStringUsingCharArray("Thomas");
		System.out.println(recursiveMethod("java"));
		

	}
	
	
	public static void revrseStringUsingCharArray(String word) {
		
		
		char[] stringArray= word.toCharArray();
		
		for(int i=stringArray.length-1;i>=0;i--) {
			
			System.out.print(stringArray[i]);
			
			
		}
		
		System.out.println();
		
	}
	
	public static String recursiveMethod(String str)
	{
	     if ((null == str) || (str.length() <= 1))
	     {
	            return str;
	     }
	 
	     return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

	
//	public String reverse(String s) {
//		
//		char[] letters= new char[s.length()];
//		int letterIndex=0;
//		
//		for(int i=s.length()-1; i>=0; i--) {
//			letters[letterIndex]=s.charAt(i);
//			letterIndex++;
//			
//		}
//		String rev="";
//		for(int i=0;i<s.length(); i++) {
//			rev=rev+ letters[i];
//		}
//		return rev;
//			
//	}
//	
	public static void ultaLekha() {
		
		String ss="rac";
		
		String rev="";
		
		for(int i=ss.length()-1;i>0;i--) {
			
			
			rev=rev+ss.charAt(i);
		}
		
		System.out.println("Naveen method is: "+rev);
		
//		String ss="rac";
//		
//		String rev="";
//		
//		for(int i=ss.length()-1;i>=0;i--) {
//			rev=rev+ss.charAt(i);
//			
//		}
//		System.out.println("Naveen method is: "+rev);
	}
}
