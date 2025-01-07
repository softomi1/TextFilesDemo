package com.practice1.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		
		String s="abcabbabcz";
	
		
		System.out.println("=====================================================");
		List<Entry<String,Long>> collect = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter((c)->c.getValue()>1).collect(Collectors.toList());
		
		System.out.println(" repeted  :"+collect);
		
		
		System.out.println("=====================================================");
		
		List<String> collect2 = Arrays.stream(s.split("")).distinct().collect(Collectors.toList());
		System.out.println(" removed duplicates  :"+collect2);

		
		System.out.println("=====================================================");
		List<Entry<String,Long>> collect3 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter((c)->c.getValue()==1).collect(Collectors.toList());
		
		System.out.println(" non repeted  :"+collect3);

		
	}
	
	
	
	
}
