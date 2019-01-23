package com.ss.selenium.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class ExcelLib {
	File file;
	Workbook wb;
	
	
	public ExcelLib(String filePath) {
		try {
			file = new File(filePath);
			FileInputStream fis = new FileInputStream(file);
			wb = new HSSFWorkbook(fis);
			
			}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}}
	public String getStringData(int sheetIndex, int rowIndex, int columnIndex) {
		String data = wb.getSheetAt(sheetIndex).getRow(rowIndex).getCell(columnIndex).getStringCellValue();
		return data;
	}
	public void writeData(int sheetIndex, int rowIndex, int columnIndex, String value) {
		wb.getSheetAt(sheetIndex).getRow(rowIndex).createCell(columnIndex).setCellValue(value);
	
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(file);
			wb.write(fos);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	public void readDataByName(String sheetName, String columnName) {
		int columnStart = wb.getSheet(sheetName).getRow(0).getFirstCellNum();
		int columnEnd = wb.getSheet(sheetName).getRow(0).getLastCellNum();
		int rowStart = wb.getSheet(sheetName).getFirstRowNum();
		int rowEnd = wb.getSheet(sheetName).getLastRowNum();
		Sheet sheet= wb.getSheet(sheetName);
		Iterator<Cell> cellIterator=  sheet.getRow(0).iterator();
		
		while(cellIterator.hasNext()) {
			Cell cell = cellIterator.next();
			
			if(cell.getStringCellValue().equals(columnName)) {
				System.out.println("Column index : "+cell.getColumnIndex());	
				System.out.println("Column Value : "+cell.getStringCellValue());
				int cellIndex = cell.getColumnIndex();
				Iterator<Row> rowIterator = sheet.rowIterator();
				
				while(rowIterator.hasNext()) {
					Row row = rowIterator.next();
					if(row.getRowNum()>0) {
						Cell cell1 = row.getCell(cellIndex);
						System.out.println("Cell Type : "+cell1.getCellType());
						
						
						System.out.println("Cell Type : "+cell1.getCellType());
						System.out.println("Cell Value : "+cell1.getStringCellValue());
					}
						
					
				}
			}
		}
		
		
		
		
		System.out.println(columnStart +" "+columnEnd+" "+rowStart+" "+rowEnd );
	}
			
		}
	


