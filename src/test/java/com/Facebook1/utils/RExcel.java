package com.Facebook1.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RExcel {
	
static String path="C:\\Users\\kesar\\eclipse-workspace\\FacebookNew-1\\src\\test\\resources\\testexcelD\\LoginTest.xlsx";

public static Object[][] getExcelData(String sheetname) throws Exception, IOException {
	FileInputStream fis = new FileInputStream(path);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet(sheetname);

	int row = sh.getLastRowNum();
	Row rowcell = sh.getRow(0);
	int column = rowcell.getLastCellNum();

	System.out.println("Total number of row =" + row);
	System.out.println("Total nuber of column=" + column);
	
	DataFormatter formatter=new DataFormatter();
	
	String testData [][]=new String [row][column];
	for(int i=1;i<=row;i++)
	{
		for(int j=0; j<column;j++)
		{
			testData[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
			System.out.println(testData[i-1][j]);
		}
	}
	return testData;

}

public static void main(String[] args) throws IOException, Exception {
	RExcel excel = new RExcel();
	excel.getExcelData("sheetname");
}
}