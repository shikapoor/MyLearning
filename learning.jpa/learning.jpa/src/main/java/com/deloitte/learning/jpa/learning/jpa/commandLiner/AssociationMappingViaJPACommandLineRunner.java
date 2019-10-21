package com.deloitte.learning.jpa.learning.jpa.commandLiner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.deloitte.learning.jpa.learning.jpa.entity.Book;
import com.deloitte.learning.jpa.learning.jpaRespository.BookRepository;
import com.deloitte.learning.jpa.learning.jpaRespository.ChapterRepository;

@Component
public class AssociationMappingViaJPACommandLineRunner  implements CommandLineRunner{

	private static Logger log= LoggerFactory.getLogger(AssociationMappingViaJPACommandLineRunner.class); 

	@Autowired
	private ChapterRepository chapterRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Book b1 = new Book("FRee India", "Rabindranath Teqore", "MAcGraw Hills", 25000);
		
		bookRepository.save(b1);
		
		
		log.info("***************************Book ID *************" +b1.getBookID());;
		
	}

}
