package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadReview2 {
public static void main(String[] args) throws IOException {
	String xlFilePath=System.getProperty("user.dir")+"/testdata/SampleTestData1.xlsx";
	FileInputStream fis=new FileInputStream(xlFilePath);
	Workbook wbook=new XSSFWorkbook(fis);
	Sheet sheet=(Sheet) wbook.getSheet("Sample");
	Row row2=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(1);
	String cellValue=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(1).getCell(3).toString();
	System.out.println(cellValue);
	
	int rows=((org.apache.poi.ss.usermodel.Sheet) sheet).getPhysicalNumberOfRows();
	
	int cols=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getLastCellNum();
	for (int r=0; r<rows;r++) {
		for(int c=0;c<cols;c++) {
			String value=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(r).getCell(c).toString();
			System.out.println(value);
		}
	}
}
}

