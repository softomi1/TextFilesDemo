package com.practice;

import java.util.ArrayList;

public class CustomeLinked<E> extends ArrayList<E>{

	
	public boolean add(E e) {
		if (this.contains(e)) {
			return false;
		}
		return super.add(e);
	};
}
