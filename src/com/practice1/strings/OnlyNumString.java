package com.practice1.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OnlyNumString {
	
	public static void main(String[] args) {

		// String questions
		String abc="a1vds3rvf4";
		char[] charArray = abc.toCharArray();
	
		StringBuilder sb=new StringBuilder("");
		for (char c:charArray) {
			if(!Character.isLetter(c)){
				sb.append(c);
			}
		}
				
		
		System.out.println(sb);

		
		stringCod();
		
		
		
		
	}
	
	
	
	public static void stringCod() {
		
		String[] sss = {"1","2","3","2","ascda","afdaf","dsafa","asdff","sdfsa","fsdgs","fdgs","err","erserg","rdgrd","gssf","123412","123","76"};
		
		
		List<String> numArr= Arrays.asList("1","2","3","4","5","6","7","8","9","0");
		
		Stream<Integer> distinct = Arrays.stream(sss).filter((y)-> numArr.contains(y)).map((p)->Integer.parseInt(p)).distinct();
		
		Stream<Integer> distinct1 = Arrays.stream(sss)
			    .filter(y -> y.chars().allMatch(ch -> numArr.contains(String.valueOf((char) ch)))) // Check if all characters in the string are digits
			    .map(Integer::parseInt) // Convert to Integer
			    .distinct(); // Remove duplicates
		
		System.out.println(" ================     ");
	//	distinct.forEach((s)->System.out.println(s));
		distinct1.forEach((s)->System.out.println(s));
		

		
		
		Stream<Integer> distinct12 = Arrays.stream(sss)
			    //.filter(y -> y.chars().allMatch(ch -> numArr.contains(String.valueOf((char) ch)))) // Check if all characters in the string are digits
				.filter(y -> Arrays.stream(y.split("")).allMatch((x)->numArr.contains(x))) // Check if all characters in the string are digits
			    .map(Integer::parseInt) // Convert to Integer
			    .distinct(); // Remove duplicates
		
		
		System.out.println(" ================     ");
		distinct12.forEach((s)->System.out.println(s));
		
		
		Stream<Integer> distinct15 = Arrays.stream(sss)
			    //.filter(y -> y.chars().allMatch(ch -> numArr.contains(String.valueOf((char) ch)))) // Check if all characters in the string are digits
				.filter(y -> Arrays.stream(y.split("")).allMatch((x)->!Character.isLetter(x.charAt(0)))) // Check if all characters in the string are digits
			    .map(Integer::parseInt) // Convert to Integer
			    .distinct(); // Remove duplicates
		
		
		System.out.println(" ================     ");
		distinct15.forEach((s)->System.out.println(s));

		
	}

	

}
