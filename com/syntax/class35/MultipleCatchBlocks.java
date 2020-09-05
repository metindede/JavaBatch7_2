package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		String xlFilePath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		try {
			FileInputStream fis = new FileInputStream(xlFilePath);
			fis.close();
			Workbook wb = new XSSFWorkbook(fis);
			// when we have 2 or more catch block
			// ALWAYS START WITH MOST SPECIFIC CATCH --> TO THE general
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("   -----  ");
	}
}