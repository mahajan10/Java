package com.naman;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Interface2 {

	public static void main(String[] args) {
		Map<String,String> phonebook = new HashMap<>();
		
		phonebook.put("Naman","7837960535");
		phonebook.put("Arjun","9417808988");
		phonebook.put("Divij","9417539191");
		phonebook.put("Gurpreet","950166926");
		
		Set<String> keys = phonebook.keySet();
		
		for(String key: keys) {
			System.out.println(key+"->"+phonebook.get(key));
		}


	}

}
