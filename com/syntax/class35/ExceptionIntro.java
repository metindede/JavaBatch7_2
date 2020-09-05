package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionIntro {

	public static void main(String[] args) throws FileNotFoundException {

		String xlFilePath = System.getProperty("user.dir") + "/SampleTestData.xlsx";
		// FileInputStream fis = new FileInputStream(xlFilePath); //will get
		// FileNotFoundException

		int a = 10;
		int b = 0;

		System.out.println(a / b); // will get ArithmeticException

		int[] arr = { 100, 200 };

		System.out.println(arr[2]);// will get ArrayIndexOutOfBoundsException
		// ArrayIndexOutOfBoundsException ae=new ArrayIndexOutOfBoundsException();
		// throw ae;

		System.out.println("End of the code");

	}
}