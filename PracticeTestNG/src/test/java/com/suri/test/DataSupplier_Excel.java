package com.suri.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataSupplier_Excel {

   public static void main(String[] args) throws IOException {
	   
	   File excelFile = new File("C:\\Users\\Venkata.Pattem.ACS\\Downloads\\mobile_store.xlsx");
       FileInputStream fis = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("store");
        int noOfRows = sheet.getPhysicalNumberOfRows();
        System.out.println(noOfRows);
        int noOfColumns = sheet.getRow(0).getLastCellNum();
        System.out.println(noOfColumns);
    
//            String[][] data = new String[noOfRows-1][noOfColumns];
        for (int i = 1; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
            	DataFormatter df=new DataFormatter();
            	String v=df.formatCellValue(sheet.getRow(i).getCell(j));
//                    System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
            	System.out.print(v+ " ");
                
            }
            System.out.println();
        }
        workbook.close();
        fis.close();
            
             
        }



   }