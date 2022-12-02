package com.Stringbufferpractice;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("dyandev");
		System.out.println(s);
		System.out.println(s.charAt(4));
		System.out.println(s.insert(0, false));
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.substring(7));
		System.out.println(s.reverse());
		System.out.println(s.capacity());
		
	}

}
