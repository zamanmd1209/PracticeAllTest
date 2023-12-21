package javaAll;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Dog  implements Serializable

{
int i= 10;
int j=20;
	
}


 class SerializeTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		Dog d1= new Dog();
		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis= new FileInputStream("abc.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Dog d2= (Dog)ois.readObject();
		
		System.out.println(d2.i+".........."+d2.j);
	}
 
 }