package com.framework.generics;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib {
	public static Workbook wb;

	public static String getPropertyValue(String propertyNmae) {

		String propertyValue = "";

		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("./properties"));
		} catch (Exception e) {

		}
		propertyValue = prop.getProperty(propertyNmae);

		return propertyValue;
	}

	public static String getCellValue(String sheetname, int rowNum, int cellNum) {

		try {
			wb = WorkbookFactory.create(new FileInputStream("./testdata\\data.xlsx"));
		} catch (Exception e) {

		}
		String cellValue = wb.getSheet(sheetname).getRow(rowNum).getCell(cellNum).toString();

		return cellValue;
	}

	public static int getRowCount(String sheetname) {
		int rowcount = 0;

		try {
			wb = WorkbookFactory.create(new FileInputStream("./testdata\\data.xlsx"));
		} catch (Exception e) {

		}
		rowcount = wb.getSheet(sheetname).getLastRowNum();

		return rowcount;
	}
}
