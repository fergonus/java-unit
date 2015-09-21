// Java JUnit WebDriver Automation Tutorial 21 Keyword Framework Part 1-MSTdEyMNVds.mp4
// Reading from an Excel file
// Java JUnit WebDriver Automation Tutorial 21 Keyword Framework Part 3-PEVl6ciYquo.mp4
// Writing the test results back to the Excel file
// Date: 09-20-2015

package com.thetestroom.MavenWEbDriverKeyWordFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelFileHandler {
	
	public List<List<String>> readFromFile(String FileName)
	{
		List<List<String>> table = new ArrayList<List<String>>();
		
		try {
			FileInputStream file = new FileInputStream(new File(FileName));
			
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFSheet sheet = workbook.getSheetAt(0);
			
			Iterator<Row> rowIterator = sheet.iterator();
			
			while(rowIterator.hasNext())
			{
				List<String> rowData = new ArrayList<String>();
				
				Row row = rowIterator.next();
				
				Iterator<Cell> cellIterator = row.cellIterator();
				
				while(cellIterator.hasNext())
				{
					Cell cell = cellIterator.next(); // stops at 21.51
					
					switch(cell.getCellType())
					{
					case Cell.CELL_TYPE_BOOLEAN:
						rowData.add(String.valueOf(cell.getBooleanCellValue()));
						break;
						
					case Cell.CELL_TYPE_NUMERIC:
						rowData.add(String.valueOf(cell.getNumericCellValue()));
						break;
						
					case Cell.CELL_TYPE_STRING:
						rowData.add(cell.getStringCellValue());
						break;
					}
				}
				table.add(rowData);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return table;
	}
	
	public void writeToFile(String fileName, List<String> results)
	{
		try {
			FileInputStream file = new FileInputStream(new File(fileName));
			
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFSheet sheet = workbook.getSheetAt(0);
			
			Cell cell = null;
			
			for (int i = 0; i < results.size(); i ++)
			{
				cell = sheet.getRow(i).getCell(2);
				cell.setCellValue(results.get(i));
			}
			
			file.close();
			
			FileOutputStream updateFile = new FileOutputStream(new File("update" + fileName));
			workbook.write(updateFile);
			updateFile.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
