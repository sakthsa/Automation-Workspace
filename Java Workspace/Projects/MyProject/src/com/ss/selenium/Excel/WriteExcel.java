package com.ss.selenium.Excel;

public class WriteExcel {

	public static void main(String[] args) {
		String filePath = "D:\\Java Workspace\\MyProject\\ExcelSheet.xls";
		ExcelLib excelObj = new ExcelLib(filePath);
		excelObj.writeData(0, 1, 3, "newvalue");
		System.out.println("done");

	}

}
