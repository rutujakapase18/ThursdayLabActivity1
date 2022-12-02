package com.Stringbufferpractice;

public class Example1 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("prajwal");
		System.out.println(s);
		System.out.println(s.append("gadakh "));
		System.out.println(s);
		System.out.println(s.insert(14,"is a good boy"));
		s.delete(19,23);
		System.out.println(s);
		
		s.replace(7, 12,"gowda");
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.substring(7));
		System.out.println(s.reverse());
		System.out.println(s.capacity());
		
	}

}
