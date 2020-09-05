package com.syntax.class34;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteIntoNewExcel2 {


	public static void main(String[] args) throws IOException {
		
	Workbook wbrook=new XSSFWorkbook();
	Sheet sheet= wbrook.createSheet("My Sheet3");
	sheet.createRow(0).createCell(0).setCellValue("username");
	sheet.createRow(0).createCell(1).setCellValue("password");
	sheet.createRow(1).createCell(0).setCellValue("Metin");
	sheet.getRow(1).createCell(1).setCellValue("Metin12345");
	sheet.createRow(2).createCell(0).setCellValue("Musa");
	sheet.getRow(2).createCell(1).setCellValue("Musa123");
	
	String filePath=System.getProperty("user.dir")+"/testdata/MyFile3.xlsx";
	FileOutputStream fos=new FileOutputStream(filePath);
	wbrook.write(fos);
	wbrook.close();
	fos.close();
}
}
