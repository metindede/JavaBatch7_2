package com.syntax.class35;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String str="Java";
		
		try {
			System.out.println("I am a try block");
			char letter=str.charAt(10);
			System.out.println(letter);
		}finally {//always gets executed regardless if E occurs or not
			System.out.println("I am a finally block");
		}
		
		System.out.println("I am the end of the code");
	}
}