package com.deloitte.selfLearning.hibernatespringjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.selfLearning.hibernatespringjpa.repository.EmployeeRepository;


@Service
public class ReadExcelDataService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Transactional
	public CompletableFuture<List<Employee>> saveData()
	{
//		
//		
//		 DataFormatter dataFormatter = new DataFormatter();
		 ArrayList<Employee> empList = new ArrayList<>();
//		  try
//	        {
//	            FileInputStream file = new FileInputStream(new File("howtodoinjava_demo.xlsx"));
//	 
//	            //Create Workbook instance holding reference to .xlsx file
//	            XSSFWorkbook workbook = new XSSFWorkbook(file);
//	 
//	            //Get first/desired sheet from the workbook
//	            XSSFSheet sheet = workbook.getSheetAt(0);
//	 
//	            
//	            for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
//	            	  Row  row = sheet.getRow(rowIndex);
//	            	  if (row != null) {
//	            	    Cell cell1 = row.getCell(1);
//	            	    Cell cell2 = row.getCell(2);
//	            	    if (cell1 != null && cell2 != null) {
//	            	    	empList.add(new Employee(cell1.getStringCellValue(), cell2.getStringCellValue())) ;
//	            	    }
//	            	  }
//	            	}
//	            
//	            file.close();
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//		 
//		  
		  CompletableFuture<List<Employee>> dataInserted = CompletableFuture.completedFuture(employeeRepository.saveAll(empList));
		  dataInserted.thenAccept(action -> {action.stream().forEach(System.out::println);});
		  
		  return dataInserted;
	}
	
	

}
