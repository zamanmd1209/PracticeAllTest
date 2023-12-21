package javaAll;

public abstract class StringDemo {

	public static void main1(String[] args) {
		
		
		String a = "Java";  // String Literal immutable
		String b = "Java"; // Same content will create single object 
		a.concat("World");// will not print Java_World, need to create new string below
		
		String c= a.concat("_World");
		System.out.println("1. *****  concat a.concat('World')"+a.concat("_World"));
		
		System.out.println("2. "+a);// Prints only Java.
		
		System.out.println("3. "+c); // Prints Java_World
		
		
		String s= new String ("Java");
		String s1=new String ("Java");//String class creates new object every time in memory
		
		StringBuffer sb = new StringBuffer(a);
		sb.reverse();
		System.out.println("4. Reverse is :"+sb);
		sb.reverse();
		
		sb.append("_World");
		System.out.println("5. Appended : "+sb);
		
		sb.insert(2, "Ta");
		System.out.println("6. inserted : "+sb);
		
		sb.replace(0, 2, "GG");
		System.out.println("7. Replaced  : "+sb);
		
		sb.delete(0, 9);
		System.out.println("8.  0-9 Deleted  : "+sb);
		
		//StringBuilder is not Thread safe or it is not Synchronized but faster then SBuffer
		
		StringBuilder sbb= new StringBuilder(a);
		
		sbb.reverse();
		System.out.println("9.  SBB reverse is : "+sbb);
		
		System.out.println("10. "+!a.equals(b)); //true
		System.out.println("11. "+a==b);       //true
		System.out.println("12. "+a.equals(s)); //true
		System.out.println("13. "+a==s); //False because both not referring same object
		System.out.println("14. "+s==s1); //False because both not referring same object
		
		System.out.println("15. "+s.equals(s1)); //true
		
		

	}
	
	public  static void main(String[] args) {
		
		
		String word= "Python";
		
		StringBuffer sb= new StringBuffer(word);
		sb.reverse();
		System.out.println("Reverse is: "+sb);
		sb.reverse();
		sb.replace(0, 1, "GGGGGGGGGG");
		System.out.println("Replaced 0-2 index with none : "+sb);
	} ;

}
