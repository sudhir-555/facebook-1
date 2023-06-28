package com.Facebook1.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice {
	String path="C:\\Users\\kesar\\eclipse-workspace\\FacebookNew-1\\src\\test\\resources\\testexcelD\\LoginTest.xlsx";
	public void getData() throws IOException
	{
		FileInputStream fis =new FileInputStream(path);
		Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Login");
	int Row=sh.getLastRowNum();
	org.apache.poi.ss.usermodel.Row rowcell=sh.getRow(0);
	int column=rowcell.getLastCellNum();
	
	System.out.println("Total Number of Row="+Row);
	System.out.println("Total Number of column"+column);
	
	DataFormatter formatter=new DataFormatter();
	String testD[][]=new String [Row][column];
	{
		for(int i=1;i<=Row;i++)
		{
			for(int j=0;j<column;j++)
			{
				testD[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
				System.out.println(testD[i-1][j]);
			}
			}
			
		}
	}
	
	
public static void main(String[]args) throws IOException
{
	Practice excel=new Practice();
	excel.getData();
	
	
	}
}
