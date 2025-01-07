package com.practice1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		
		String a="abcdeed";
		char[] charArray = a.toCharArray();
		System.out.println("Actual String : " + a);
		
		StringBuilder newString= new StringBuilder("");
		
		
		for(int c=(a.length()-1) ; c>=0; c--) {
			newString.append(charArray[c]);
		}
		
		System.out.println("Revereds String : "+ newString);

		
		// using String builder
		
		String reverString = new StringBuilder(a).reverse().toString();
		
		
		System.out.println(reverString);
		
		
	
		
		
		
		
		
			
		
	}
	
}
