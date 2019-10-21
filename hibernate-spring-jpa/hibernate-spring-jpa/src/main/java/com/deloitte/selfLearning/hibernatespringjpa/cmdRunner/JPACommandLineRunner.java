package com.deloitte.selfLearning.hibernatespringjpa.cmdRunner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.deloitte.selfLearning.hibernatespringjpa.entity.Book;
import com.deloitte.selfLearning.hibernatespringjpa.service.ReadExcelDataService;
import com.deloitte.selfLearning.hibernatespringjpa.repository.ActorRepository;
import com.deloitte.selfLearning.hibernatespringjpa.repository.BookRepository;
import com.deloitte.selfLearning.hibernatespringjpa.repository.ChapterRepository;
import com.deloitte.selfLearning.hibernatespringjpa.repository.MovieRepository;
import com.deloitte.selfLearning.hibernatespringjpa.repository.StudentRepository;
import com.deloitte.selfLearning.hibernatespringjpa.repository.UniversityRepository;

@Component
public class JPACommandLineRunner implements CommandLineRunner{
	
	private static Logger log= LoggerFactory.getLogger(JPACommandLineRunner.class); 
	
	@Autowired
	BookRepository bookRepository;

	@Autowired
	ChapterRepository chapterRepository;
	
    @Autowired 
    UniversityRepository universityRepository;
    
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    MovieRepository movieRepository;
    
    @Autowired
    ActorRepository actorRepository;
    
    @Autowired
    ReadExcelDataService readExcelDataService;
    
    
    @Autowired
    EntityManager em;
//    @Value("${server.servlet.context-path}")
//    String value;
	
    public void discuss()
    {
    	
		
    }
    @Transactional
	@Override
	public void run(String... args) throws Exception {
		
//		b2.setBookID(500L);
//		em.merge(b2);
//		log.info("*************************" + b2.getBookID());
		//bookRepository.save(b2);
		
		
		
		
//		Book b3 = new Book("Data Algorithms" , "Sumitra Das", "Mc Graw Hills", 5780.00);
//		Chapter ch3 = new Chapter("Introduction to Algorithms",b3);
//		chapterRepository.save(ch3);
//		log.info("*************************" + ch3.getChapterId());
		
//		Book b3 = new Book("Spring Data JPA" , "Sumitra Das", "Mc Graw Hills", 9080.00);
//		Chapter ch2 = new Chapter("Introduction to Spring",b3);
//		chapterRepository.save(ch2);
//		log.info("*************************" + ch2.getChapterId());
		
		
//      One to Many Bidirectional
		
//		
	
		//One to Many Bidirectional
//		Book b1 = bookRepository.findById(17l).map( book -> {
//			Chapter ch1 = new Chapter("Inversion Of Control", book);
//			book.getChapterSet().add(ch1);
//			return bookRepository.save(book);
//		}).orElse(null);
//		
//		if(b1 != null)
//		{
//			System.out.println("Successfull");
//			
//		}
		
		//Printing all chapters
		
//		Book b1 = bookRepository.findById(17l).orElse(null);
//		if(b1!=null)
//		{
//			Set<Chapter> chapters = b1.getChapterSet();
//			for(Chapter ch : chapters)
//				System.out.println(ch.getChapterName());
//		}
//		
		
//		University uni = new University("Amity University");
//		Student stu1 = new Student("Vaibhav", "Btech", uni);
//		Student stu2 = new Student("Rishikesh", "Mtech", uni);
//		Student stu3 = new Student("Sanjay", "LLB", uni);
//		
//		uni.getStudentList().add(stu1);
//		uni.getStudentList().add(stu2);
//		uni.getStudentList().add(stu3);
//		
//		universityRepository.save(uni);
		
	//	Deleting 
//		System.out.println(universityRepository.findById(28l).map(university -> {
//			 universityRepository.delete(university);
//			 return true;
//		}));
		
		//Updating sanjay's university
		
//		 studentRepository.findById(24l).map(student -> {
//			 University uni = universityRepository.findById(35l).orElse(null);
//			 if(uni != null)
//			 {
//				 uni.getStudentList().add(student);
//				 universityRepository.save(uni);
//			 }
//			return true;	 
//		});
		 
//		 University uni = universityRepository.findById(24l).orElse(null);
//		 studentRepository.findById(35l).map(student -> {
//			 
//			 student.setUniversity(uni);
//			 studentRepository.save(student);
//			 return true;
//			 
//		 });
		
		
		//Many to Many
//		Actor actor1 = new Actor("Saif ALi Khan");
//		Movie movie1 = new Movie("Money Money", "RSVP");
//		actor1.getMovie().add(movie1);
//		movie1.getActor().add(actor1);
//		movieRepository.save(movie1);
//		
//		Actor actor2 = new Actor("Disha Patani");
//	    Movie movie2 = new Movie("Bharat", "Aditya Chopra");
//	    actor2.getMovie().add(movie2);
//	  	movie2.getActor().add(actor2);
//	  	movieRepository.save(movie2);
		
		
		//actorRepository.findById(id)
//		movie2.getActor().add(actor1);
 
		
	
		//movieRepository.flush();
//		movieRepository.save(movie2);
		
//		University univ = universityRepository.findByName("Amity University");
//		
//			System.out.println(univ.getName());
//			System.out.println(univ.getStudentList());
    	
//    	University univ = universityRepository.findByName("Amity University");
//    	University univ2 = universityRepository.findByName("Amity University");
//    	
//    	System.out.println(univ.getName());
//    	System.out.println(univ2.getName());
//    	System.out.println(System.getProperty("${server.servlet.context-path}"));
//    	System.out.println(value);
    	
//    	Book b1 = new Book("Data Structures" , "Sumitra Das", "Mc Graw Hills", 5000.00);
//		bookRepository.save(b1);
//		log.info("*************************" + b1.getBookID());
//		
//		Book b2 = bookRepository.findById(1l).get();
//		bookRepository.flush();
//		Chapter ch1 = new Chapter("Introduction to DS",b2);
//		chapterRepository.save(ch1);
//		log.info("*************************" + ch1.getChapterId());
//		b2.setBookName("Data Structures Updated");
//		Chapter ch2 = new Chapter("Introduction to LinkedList",b2);
//		chapterRepository.save(ch2);
//		log.info("*************************" + ch2.getChapterId());
//		
//		Book b5 = new Book("Spring MVC" , "Sumitra Das", "Mc Graw Hills", 9090.00);
//		Chapter ch6 = new Chapter("Stereo Type Annotation",b5);
//		Chapter ch7 = new Chapter("Annotation Concept", b5);
//		
//		b5.getChapterSet().add(ch6);
//		b5.getChapterSet().add(ch7);
//		
//		bookRepository.save(b5);
//		
//		bookRepository.flush();
    	
//    	CriteriaBuilder cb = em.getCriteriaBuilder();
//    	CriteriaQuery<Book> cq = cb.createQuery(Book.class);
//    	Root<Book> root = cq.from(Book.class);
//    	Predicate p1 = cb.like(root.get("bookName"), "%Data%");
//    	Predicate p2 = cb.ge(root.get("bookID"),1);
//    	Predicate p3 = cb.or(p1,p2);
//    	cq.where(p3);
//    	TypedQuery<Book> q = em.createQuery(cq.select(root));
//    	System.out.println(q.getResultList());
    	
    	long startTime = System.currentTimeMillis();
    	readExcelDataService.saveData();
    	System.out.println(" time lapsed" + (startTime - System.currentTimeMillis()));
    	
    	
	}

}
