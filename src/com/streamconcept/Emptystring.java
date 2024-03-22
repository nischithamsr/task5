package com.streamconcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Predicate;
public class Emptystring {

	public static void main(String[] args) {
		// list of strings
		
	List<String>list=Arrays.asList("abc","","bc","efg","abcd","","jkl");
     // check list is empty or not using empty() method
	
	Stream<String> stream = list.stream();
	
	Predicate<String> empty= String::isEmpty;
	
	Predicate<String> emptyrev= empty.negate();
	
	System.out.println("non empty strings ="+stream.filter(emptyrev).collect(Collectors.toList()));
	
	// output 
	//non empty strings =[abc, bc, efg, abcd, jkl]
		
	
	
	
	
	
	
}
	
	}
	
	


