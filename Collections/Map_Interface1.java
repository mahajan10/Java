package com.naman;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Interface1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("myName","Naman");
		map.put("surname","Mahajan");
		map.put("actor","John");
		
		Set<String> keys = map.keySet();
		
		for(String key: keys) {
			System.out.println(key+"->"+map.get(key));
		}
		
		

	}

}
