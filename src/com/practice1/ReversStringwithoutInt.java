package com.practice1;

import java.security.Identity;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReversStringwithoutInt {

	public static void main(String[] args) {
		
		
		String s= "1asfda2vdsf3";
		
		StringBuilder stringrever=new StringBuilder("");
	
		

		char[] charArray = s.toCharArray();
		
		for(int i=(charArray.length-1);i>=0; i--) {
			
			if(Character.isLetter(charArray[i]) ) {
				stringrever.append(charArray[i]);				
			}
		}
		
		System.out.println(stringrever);
		
		
		// reverses the string and remove the duplicate also ints 
		
		
		StringBuilder stringrever1=new StringBuilder("");
		Set<Character> newHah= new LinkedHashSet<>();
		

		for(int i=(charArray.length-1);i>=0; i--) {
			if(Character.isLetter(charArray[i]) ) {
				
				if(newHah.add(charArray[i])==true) {
					stringrever1.append(charArray[i]);							
				}
					
				}

			}
		
		
		System.out.println(stringrever1);

		
		//////// reverse only vowels 
		
		String strVowels= "aeiouAEIOU";
		
		StringBuilder newvowel= new StringBuilder("");
		
		for(int i=(charArray.length-1);i>=0; i--) {
			
			
			if(strVowels.indexOf(charArray[i])==0) {
				
				newvowel.append(charArray[i]);
			}
			
		}
				
		System.out.println(newvowel);
		
		
		
		Map<String,Long> collect = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		System.out.println(collect);
		
		
		LinkedHashMap<String,Long> collect2 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		System.out.println(collect2);
		
		
		TreeMap<String,Long> collect3 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
		
		
		System.out.println(collect3);
		
		
	}
	
}
