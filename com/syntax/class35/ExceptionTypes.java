package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTypes {

	public static void main(String[] args)   {
		
		//Checked excpetion are the E that checked by the compiler
		
		//Thread.sleep(2000);
		String filePath=System.getProperty("user.dir") + "/testdata/SampleTestData.xls";
		//FileInputStream fis =new FileInputStream(filePath);//if file is not there object of FileNotFoundException will be thrown 

		
		//unchecked E - are E that not checked by the compiler
		int a=12;
		int b=0;
		
		//System.out.println(a/b);//ArithmeticException
		
		String str=null;
		System.out.println(str.length());
		//BREAK TILL 11:45
	}
}