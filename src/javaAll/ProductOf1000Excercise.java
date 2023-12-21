package javaAll;

public class ProductOf1000Excercise {

	public static void main(String[] args) {

		product_or_sum(40,30);
		
		int num1=40;
		int num2=30;
		int result = num1+num2;
		int product=num1*num2;
		
		
		if(product>=1000) {
			
//			System.out.println("Product is "+product);
			
			
			
		}
		else {
			
//			System.out.println("result is:" +result);
		}
		
		
		
//        int product1=1000;
//        int number1=20;
//        int number2=30;
//        int result1= number1+number2;
//
//if(result>product){
//    
//    System.out.println(result);
//}        
//        else{
//            
//            System.out.println("not found");
//            
//        }
	}
	
	/* Given two integer numbers return their product.
	If the product is greater than 1000, then return their sum
	 * 
	 */
	public static void product_or_sum(int num1,int num2) {
		
		System.out.println("product is:"+ num1*num2);
		
		if(num1*num2>1000) {
			
			System.out.println("sum= "+(num1+num2));
		}
		
		
		else {
			
			System.out.println("product is less then 1000");
		}
		
	}

}
