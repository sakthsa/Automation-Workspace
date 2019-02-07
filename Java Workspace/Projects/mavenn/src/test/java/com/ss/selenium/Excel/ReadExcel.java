package com.ss.selenium.Excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.testng.annotations.Test;


public class ReadExcel {
	
	
	public static void main(String[] args) throws Exception {
		String filePath = "D:\\Java Workspace\\MyProject\\ExcelSheet.xls";
		ExcelLib excelObj = new ExcelLib(filePath);
		System.out.println(excelObj.getStringData(0, 1, 1));
		
		
		
		
	}
	
	@Test()
	void test1() {
		String filePath = "D:\\Java Workspace\\MyProject\\ExcelSheet.xls";
		ExcelLib eObj = new ExcelLib(filePath);
		eObj.readDataByName("Sheet2","Password");
	}

}
