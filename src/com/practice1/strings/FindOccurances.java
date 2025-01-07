package com.practice1.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurances {

	public static void main(String[] args) {
		
		String s= "abcnanckaab";
		
		Map<String,Long> collect = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(collect);
		
		
		
		
	}
	
}
