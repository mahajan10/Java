package com.naman;
import java.util.HashSet;

public class Hash_Set {



	public static void main(String[] args) {
		 HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
	        myHashSet.add(6);
	        myHashSet.add(8);
	        myHashSet.add(3);
	        myHashSet.add(11);
	        myHashSet.add(11); // This element will be ignored

	        System.out.println(myHashSet);


	}

}
