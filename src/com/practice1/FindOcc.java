package com.practice1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOcc {

	public static void main(String[] args) {
		
		String es="ahakhfjafkjafdkjao";
		
		String[] arres = es.split("");
		
		
		Map<String,List<String>> collect2 = Arrays.stream(arres).collect(Collectors.groupingBy(Function.identity()));
		
		Map<String,Long> collect = Arrays.stream(arres).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Arrays.stream(arres).collect(Collectors.groupingByConcurrent(Function.identity(), LinkedHashMap<String, Long>(), Collectors.counting()));
		
		
		
		
		
		
		
	}
	
}
