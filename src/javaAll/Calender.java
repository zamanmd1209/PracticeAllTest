package javaAll;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Calender {

	public static void main(String[] args) {
		
//	Date date = new Date();
////	DateFormatter formatter=new DateFormatter(); 
//	
//	SimpleDateFormat formatter= new SimpleDateFormat("yyyy.dd.MMM_hh.mm.ss.aa"); //aa for AM/PM
//	

		SimpleDateFormat formatter= new SimpleDateFormat("MMM.dd.yyyy__hh.mm.ss.aa");
		System.out.println(formatter.format(new Date()));
				
		

	}
	
	public void myDate() {
		
//		Date date= new Date();
		
//		SimpleDateFormat formatter= new SimpleDateFormat("yyyy.dd.MM_hh.mm.ss");
		
//		System.out.println(formatter.format(date));
	}

}
