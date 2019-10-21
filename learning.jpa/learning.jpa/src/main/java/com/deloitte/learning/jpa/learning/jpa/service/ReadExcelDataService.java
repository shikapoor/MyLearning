package com.deloitte.learning.jpa.learning.jpa.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.deloitte.learning.jpa.learning.jpa.entity.Employee;

@Service
public class ReadExcelDataService {
	
	public boolean saveData()
	{
		 DataFormatter dataFormatter = new DataFormatter();
		 ArrayList<Employee> empList = new ArrayList<>();
		  try
	        {
	            FileInputStream file = new FileInputStream(new File("howtodoinjava_demo.xlsx"));
	 
	            //Create Workbook instance holding reference to .xlsx file
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	            //Get first/desired sheet from the workbook
	            XSSFSheet sheet = workbook.getSheetAt(0);
	 
	            
	            for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
	            	  Row  row = sheet.getRow(rowIndex);
	            	  if (row != null) {
	            	    Cell cell1 = row.getCell(1);
	            	    Cell cell2 = row.getCell(2);
	            	    if (cell1 != null && cell2 != null) {
	            	    	empList.add(new Employee(cell1.getStringCellValue(), cell2.getStringCellValue())) ;
	            	    }
	            	  }
	            	}
	            
	            file.close();
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
		  
	}
	
	

}
