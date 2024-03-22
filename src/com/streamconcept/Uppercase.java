package com.streamconcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Uppercase {

	public static void main(String[] args) {
		// list of strings
		
		List<String>list=Arrays.asList("abc","d","ef");
		System.out.println("list of strings: " + list);
	  
		// coverting strings to uppercase using streams
        List<String>stream = list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
			   System.out.println("the new list is:" +stream);  
	}

}
// output
//list of strings: [abc, d, ef]
//the new list is:[ABC, D, EF]
