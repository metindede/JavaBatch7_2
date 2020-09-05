package com.syntax.class35;

public class CatchingException {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try {
			System.out.println(a/b);
			//throw new ArithmeticException();
		
		}catch (Exception ae) {
			//Exception ae = new ArithmeticException();
			ae.printStackTrace();
			System.out.println(ae);
			//System.out.println(ae.getMessage());
		}
		
		System.out.println("End of the code");
	}
}