package javaAll;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 23; // number to be checked
		
		  int i,m=0,flag=0;
				       
//		  m=n/2;      
		  
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=n/2;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  

	}

}
