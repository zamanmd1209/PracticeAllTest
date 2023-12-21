package javaAll;

//By Iteration

public class FactorialByIterationAndRecursion2 {
	

public static void main(String[] args) {
	
	int num=10, fact=1;
	
	for(int i=1; i<=num; i++) {
		
		
		fact= fact+i;
	}
	
	System.out.println("By Itration Factorial 10 is : "+ fact);
	
	int factorialByRecursion =fact(10);
	
//	FactorialByIterationAndRecursion3 fd= new FactorialByIterationAndRecursion3();
//	
//	int factorialByRecursion =fd.fact(10);
//	
	System.out.println("By Recursion Factorial 10 is :"+factorialByRecursion);
//	
//	
	int factorialByRecursion1 =fact(5);
//	
	System.out.println("By Recursion Factorial 5 is :"+factorialByRecursion1);


}

public static 	int fact(int n) {
	
	if(n==1)
		return 1;
	else
		return n*fact(n-1);
	
	
}

}


//By Recursion

//class FactorialByIterationAndRecursion3{
//	
//	//public static void main(String[] args) {
//		
//	
//		
//	}
	
