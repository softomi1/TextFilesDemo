package com.practice.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsIterators {

	public static void main(String[] args) {

		List<String> listStrings = Arrays.asList("abc","and","qwa","erc","fgr","ewf","tht","rew","tyr");

		Iterator<String> iterator = listStrings.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

		
		
		Iterator<String> iterator1 = listStrings.listIterator();
		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
			
		}

		Set<String> setStr = new HashSet<>();
		setStr.add("afa");
		setStr.add("afa");
		setStr.add("dvg");
		setStr.add("fbs");
		setStr.add("bhu");
		
		Iterator<String> iterator2 = setStr.iterator();
		
		while (iterator2.hasNext()) {
			
			System.out.println(iterator2.next());
			
		}
		
		
		
		Map<Integer, String> hashStr= new HashMap<>();
		hashStr.put(1, "acd");
		hashStr.put(2, "acs");
		hashStr.put(3, "acv");
		hashStr.put(4, "ace");
		hashStr.put(6, "acy");
		
		Iterator<Entry<Integer, String>> iterator3 = hashStr.entrySet().iterator();
		
		while(iterator3.hasNext()) {
			System.out.println("////////////////////////////");
			Entry<Integer,String> entryy = iterator3.next();
			System.out.println( entryy.getKey() );
			System.out.println( entryy.getValue() );
			System.out.println("////////////////////////////");
		}
		
		
	}
	
	
	
	
	
	
}
