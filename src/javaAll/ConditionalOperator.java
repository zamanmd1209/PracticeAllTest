package javaAll;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		
		// boolean-expression ? expression1:expression2  ( if true expression1 will execute. if false expression2 will execute)
		
		int a=10;
		int b=15;
		
		String name=" java";
		String name1="";
		
		int max=(a>b ? a:b);
		
		System.out.println("max is: "+max);
		
		int max2=  (a<b? b:a);
		System.out.println("max2 is: "+max2);
		
		
		String cName= name.isEmpty() ? "Name not valid" : name;
		String cName1= name.isEmpty() ? name1:"Name Can not be Empty" ;
		
		System.out.println("printed name is: "+cName);
		System.out.println("printed name1 is: "+cName1);
		System.out.println("output is: " + ( a> b ? a:b));
		
		

	}

}
