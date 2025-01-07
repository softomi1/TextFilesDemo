package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedListDemo {

	public static void main(String[] args) {
	
		/////////////////////////////////
		
		String[] s = {"aa","aaa","a","1","2","3","579","23423","3243"};
				
		List<String> numberList = Arrays.asList("1","2","3","4","5","6","7","8","9","0");
		List<String> s2 = new ArrayList<>();
		List<Integer> listInteg = new ArrayList<>();
				
		
		////// for single values
		
//		for(String ss: s) {
//			if(numberList.contains(ss)) {
//				s2.add(ss);	
//			}
//		}
		

		// for string as number containing more values
		
		for(String ss: s) {
			
			String[] split = ss.split("");
			for(String sl:split) {
				if(numberList.contains(sl)) {
					s2.add(ss);	
				}	
			}
			
		}

		
		//System.out.println(s2);
		
		for(String a: s2) {
			listInteg.add(Integer.parseInt(a));
		}
		
		//System.out.println(listInteg);
		
		List<Integer> distinctNum = listInteg.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctNum);

		
		
		//////////////////////////////////////
		
		
		
		
		String sssss = "sfsdafasfa";
		
		String[] split = sssss.split("");
		for(String sj:split) {
			System.out.println(sj);
		}
		
		
		Arrays.stream(s).map((c)->{
			String[] split1 = c.split("");
			
			for(String sll:split1) {
				
				if(numberList.contains(sll)) {				
				Integer.parseInt(c);
			}
			}	
		});
		
		
	}
//	public static void main(String[] args) {
//	
//		
//		if(1==2) {
//			System.out.println(" 1 " );
//		}
//		
//		System.out.println("end");
//		
//		CustomeLinked<String> sss = new CustomeLinked<>();
//		
//		sss.add("s");
//		sss.add("ss");
//		sss.add("ss");
//		sss.add("s");
//		sss.add("sss");
//		sss.add("sss");
//		
//		System.out.println(sss);
//	}
	
//	public static void main(String[] args) {
//		
//	String [] sss= {"1","2","xyz","2","abc","3"};
//	
//	List<String> collect = Arrays.stream(sss).filter((c)-> c.length()==1).distinct().
//			collect(Collectors.toList());
//	
//	List<Integer> collect2 = Arrays.stream(sss).filter((c)-> c.length()==1).distinct().map((x)-> Integer.valueOf(x)).
//			collect(Collectors.toList());
//
//	System.out.println(collect);
//		
//	}
	
	
}
