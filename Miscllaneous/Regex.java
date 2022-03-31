package com.naman;

import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		String a = "12345";//validate all char. are number only, Ex. entering  amount
		String b = "1Abb345";
		
		boolean rs = Pattern.matches("[0-9]+", b);
		
		System.out.print(rs);

	}

}
