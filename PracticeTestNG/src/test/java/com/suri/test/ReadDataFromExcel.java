package com.suri.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File("C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\API1.xlsx");
		FileInputStream fis = new FileInputStream(src); 
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		XSSFSheet sheet = xsf.getSheetAt(0);
		int i=0;
		while(i<=6)
		{
			 String s = sheet.getRow(i).getCell(i).getStringCellValue();
			 System.out.println(s);
			 i=i+1;
		}

	}

}
