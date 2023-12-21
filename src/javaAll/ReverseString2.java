package javaAll;

public class ReverseString2 {

	public static void main(String[] args) {
		
		
		
		String word="javal";
		
		
		
		String rev="";
		
		for (int i=word.length()-1;i>=0;i--) {
			
			rev=rev+word.charAt(i);
			
		}
		
		System.out.println("\"Reverse word from loop is :\""+rev);
		
		word="KamaL";
		
		StringBuffer strnbuf= new StringBuffer(word);
		
		System.out.println("Reverse word from StringBuffer is:"+strnbuf.reverse());
		
//		String ss="aakkl";
//		int len=ss.length();
//		String rev="";
//		
//		
//		for (int i=len-1;i>=0;i--) {
//			
//			rev=rev+ss.charAt(i);
//			
//			
//		}
//		
//		System.out.println("Reverse: "+rev);
//		
//		String str= "GGJJKK";
//		StringBuffer strbf= new StringBuffer(str);
//		System.out.println("reverse letter is:" + strbf.reverse());
//		
//		String sss="GGHH";
//		StringBuffer stbuf=new StringBuffer(sss);
//		
//		System.out.println("reverse word is: "+ stbuf.reverse());
		
//		String sss=" GGHH";
//		
//		StringBuffer sbf= new StringBuffer(sss);
//		
//		System.out.println("New reverse is from SBF: "+ sbf.reverse());
//		String s = "selenium";
//		int len =s.length();
//		
//		String rev="";
//		for(int i=len-1; i>=0;i--) {
//			rev=rev+s.charAt(i);
//						
//		}
//			System.out.println("===1st Options====...  is: "+rev);
//			
//			StringBuffer sf= new StringBuffer(s);
//			System.out.println("===2nd Options====.....is : "+sf.reverse());
	}
}
