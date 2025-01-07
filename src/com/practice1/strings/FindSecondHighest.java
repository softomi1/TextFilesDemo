package com.practice1.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindSecondHighest {
	
	public static void main(String[] args) {
		
		int[] intArr= {1,2,3,5,6,2,7};
		
		Integer limit = Arrays.stream(intArr).boxed().sorted((x,y)->y-x).skip(1).limit(1).findFirst().get();
		System.out.println(limit);

		String[] sss = {"av","afc","aaaaaaaaaaaaae","seraw","eaaaa","eawefafa","aefafaffffffffffff","faewfawaaaefaaf"};
		
		String bigs = Arrays.stream(sss).sorted((x,y)->y.length()-x.length()).findFirst().get();
		System.out.println(bigs);
		
//		Arrays.stream(sss).map(c->c=c+c.length()).collect(Collectors.toList());
		
		List<String> s =Arrays.asList("a","c","e","w","g","u");
		
		String joinStr = String.join("=", sss);
		
		System.out.println(joinStr);
		
		
	}
	

}
