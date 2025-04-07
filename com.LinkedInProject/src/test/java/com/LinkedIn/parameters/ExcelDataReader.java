package com.LinkedIn.parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
//This method reads data from excel file & return value of specified row as an array of string
	public String[] readExcelParameter(String filePath,int sheetNum, int rowNum) throws IOException{
		FileInputStream file=new FileInputStream(new File(filePath));
		XSSFWorkbook wb=new XSSFWorkbook(file);
		Sheet sheet=wb.getSheetAt(rowNum);
		Row row=sheet.getRow(rowNum);
		int colCount=row.getPhysicalNumberOfCells();
		String course[]=new String[colCount];
		
		for(int i=0;i<colCount;i++) {
			Cell cell=row.getCell(i);
			if(cell!=null) {
				switch(cell.getCellType()) {
				case STRING:
					course[i]=cell.getStringCellValue();
					break;
				case NUMERIC:
					course[i]=String.valueOf(cell.getNumericCellValue());
					break;
				default:
					course[i]="";
					break;
				}
			}
		}
		System.out.println(Arrays.toString(course));
		wb.close();
		file.close();
		return course;
		
	}
}
