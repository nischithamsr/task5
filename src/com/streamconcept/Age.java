package com.streamconcept;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Age {

	public static void main(String[] args) {
   // TO read input from user
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your DOB = YYYY-MM-DD");
    // TO read input
	String D1=sc.nextLine(); //1990 05 15
	LocalDate dob = LocalDate.of(1990,05,15);
	
	// to caluclate age using localDate API and 
	
   LocalDate D2 = LocalDate.of(2023, 04 , 13);
    // calculate the difference btw two dates
   
   Period period=Period.between(dob, D2);
   // prints the difference in years , month, and days
   System.out.println(period);
   
}
}
// output 
//Enter your DOB = YYYY-MM-DD
//1990,05,15
//P32Y10M29D






