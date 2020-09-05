package com.syntax.class34;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteIntoNewExcel3 {


	public static void main(String[] args) throws IOException {
		
	Workbook wbrook=new XSSFWorkbook();
	Sheet sheet= wbrook.createSheet("My Sheet1");
	sheet.createRow(0).createCell(0).setCellValue("I am writing");
	String filePath=System.getProperty("user.dir")+"/testdata/MyFile1.xlsx";
	FileOutputStream fos=new FileOutputStream(filePath);
	wbrook.write(fos);
	wbrook.close();
	fos.close();
}
}
