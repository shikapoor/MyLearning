package com.example.async.demo.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.transaction.Transactional;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.async.demo.entity.Employee;
import com.example.async.demo.repository.EmployeeRepository;




@Service
public class ReadExcelDataService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Transactional
	@Async
	public CompletableFuture<List<Employee>> saveData()
	{
		
		
		 DataFormatter dataFormatter = new DataFormatter();
		 ArrayList<Employee> empList = new ArrayList<>();
		  try
	        {
	            FileInputStream file = new FileInputStream(new File("C:\\Users\\shikApoor\\Desktop\\howtodoinjava_demo.xlsx"));
	 
	            //Create Workbook instance holding reference to .xlsx file
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	            //Get first/desired sheet from the workbook
	            XSSFSheet sheet = workbook.getSheetAt(0);
	 
	            
	            for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
	            	  Row  row = sheet.getRow(rowIndex);
	            	  if (row != null) {
	            	    Cell cell1 = row.getCell(0);
	            	    Cell cell2 = row.getCell(1);
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
		 
		  
		  CompletableFuture<List<Employee>> dataInserted = CompletableFuture.completedFuture(employeeRepository.saveAll(empList));
		  dataInserted.thenAccept(action -> {action.stream().forEach(System.out::println);});
		  
		  return dataInserted;
	}
	
	

}
