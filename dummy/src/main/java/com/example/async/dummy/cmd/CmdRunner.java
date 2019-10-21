package com.example.async.dummy.cmd;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.async.dummy.service.ReadExcelDataService;

@Component
public class CmdRunner implements CommandLineRunner{

		@Autowired
	    ReadExcelDataService readExcelDataService;
	
	    @Transactional
		@Override
		public void run(String... args) throws Exception {
	    	long startTime = System.currentTimeMillis();
	    	readExcelDataService.saveData();
	    	System.out.println(" time lapsed" + (startTime - System.currentTimeMillis()));
	    	
	 }
}
