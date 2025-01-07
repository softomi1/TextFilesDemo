package com.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveReverse {

	public static void main(String[] args) {
		
		String s = "abc    ac    abc   abc   aksdj";
		System.out.println(""+s.trim());
		System.out.println(""+s.strip());
		
		String[] split = s.split(" ");
		
		System.out.println(split);
		
		StringBuilder sss = new StringBuilder("");
		
		for(String s1:split){
			//System.out.println("-----------"+s1);
			if(!s1.isBlank() && !s1.isEmpty()) {
				s1.strip();
				System.out.println("======================================");
				System.out.println(":"+s1);
				System.out.println("======================================");
				sss.append(s1.trim()+" ");
				//sss.append(" ");
			}
		}
		
		System.out.println(sss);
		
		List<String> collect = Arrays.stream(s.split(" ")).collect(Collectors.toList());
		System.out.println(collect);
		
		String string = Arrays.stream(s.split(" ")).filter((c)->!c.isBlank()).collect(Collectors.toList()).toString();
		System.out.println(string);
		
	}
	
}
