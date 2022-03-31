package com.naman;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();
		values.add(85);
		values.add(97);
		values.add(7);
		values.add(6);
		
		for(int i: values) {
			System.out.println(i);
		}
	}

}
