package javaAll;

//By Iteration

public class FactorialByIterationAndRecursion {
	

public static void main(String[] args) {
	
	int num=10, fact=1;
	
	for(int i=1; i<=num; i++) {
		
		
		fact= fact*i;
	}
	
	System.out.println("By Itration Factorial 10 is : "+ fact);
	
	FactorialByIterationAndRecursion1 fd= new FactorialByIterationAndRecursion1();
	
	int factorialByRecursion =fd.fact(10);
	
	System.out.println("By Recursion Factorial 10 is :"+factorialByRecursion);
	
	
	int factorialByRecursion1 =fd.fact(5);
	
	System.out.println("By Recursion Factorial 5 is :"+factorialByRecursion1);


}

}


//By Recursion

class FactorialByIterationAndRecursion1{
	
	//public static void main(String[] args) {
		
		int fact(int n) {
			
			if(n==1)
				return 1;
			else
				return n*fact(n-1);
			
			
		}
		
	}
	
