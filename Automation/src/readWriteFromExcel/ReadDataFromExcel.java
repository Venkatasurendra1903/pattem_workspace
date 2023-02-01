package readWriteFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
//		String excelfilepath = "C:\\Users\\Venkata.Pattem\\eclipse-workspace\\Automation\\datafolder\\API1.xlsx";
		File f=new File("C:\\Users\\Venkata.Pattem\\eclipse-workspace\\Automation\\datafolder\\Book6.xlsx");
		FileInputStream inputstream=new FileInputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(1).getLastCellNum();
		System.out.println(rows);
		System.out.println(cols);

		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				DataFormatter df=new DataFormatter();
				String s=df.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.print(s+"  ");
			}
			System.out.println();
		}
	}

}
