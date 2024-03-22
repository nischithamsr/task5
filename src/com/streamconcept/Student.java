package com.streamconcept;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Student {

	public static void main(String[] args) {
		// create a list of 10 students using list interface
	List<String>list=Arrays.asList("Akash","Akshay","Rahul","Kishore","Athish","Nisha","Swathi","Aditi","Spandana","Arun");
           
	//using lambda and stream to filter students
	 List<String>stream = list.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
	
	System.out.print("special gits to :" +stream);
	}

}
// output
//special gits to :[Akash, Akshay, Athish, Aditi, Arun]