package javaAll;

public class ConstructorType {

	String username;
	String password;

	/*Copied constructor /*Copy Constructor
	 * A copy constructor is used to create an exact copy of an object. It takes an
	 * object of the same class as a parameter and copies its attributes.\
	 *   What: The bank is migrating user data to a new system, and they want to 
	 *   create a backup of user profiles in the process.
	 *   
	 *   In this scenario, the copy constructor is invaluable. It lets you create 
	 *   an exact replica of an existing user object, ensuring data consistency 
	 *   during the migration process without altering the original data.
	 */
	
	
	
	//copy constructor
	ConstructorType(ConstructorType newUser) {

		this.username = newUser.username;
		this.password = newUser.password;

	}

	
	//default constructor same name as the class
	ConstructorType() {

		this.username = "admin";
		this.password = "123admin";

	}
	
	//Parameterized Constructor same name as the class with parameter
	
	ConstructorType(String username, String password) {

		this.username = username;
		this.password = password;

	}
	
}
