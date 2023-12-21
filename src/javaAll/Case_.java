package javaAll;

public class Case_ {

	public static void main(String[] args) {
	

		String day = "Tuesday";

		switch (day) {
		  case "Monday":
		    System.out.println("Monday opens 7:00 AM");
		    break;
		  case "Tuesday":
		    System.out.println("Tuesday opens 8:00 AM");
		    break;
		  case "Wednesday":
		    System.out.println("Wednesday opens 9:00 AM");
		    break;
		  case "Thursday":
		    System.out.println("Thursday opens 6:00 AM");
		    break;
		  case "Friday":
		    System.out.println("Friday opens 8:00 AM");
		    break;
		  case "Saturday":
		    System.out.println("Saturday opens 10:00 AM");
		    break;
		  case "Sunday":
		    System.out.println("Sunday closed");
		    break;
		  default:
		    System.out.println("Please check store hours before you come");
	}
	}

}
