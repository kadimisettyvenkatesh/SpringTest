package com.example.SpringJwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.SpringJwt.repository.BookRepository;
import com.example.SpringJwt.repository.EmployeeRepository;
import com.example.SpringJwt.repository.PublisherRepository;

@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaAuditing
@EnableAspectJAutoProxy
public class SpringJwtApplication {
	
	  private static final Logger logger = LoggerFactory.getLogger(SpringJwtApplication
			  .class);

	    @Autowired
	    private BookRepository bookRepository;

	    @Autowired
	    private PublisherRepository publisherRepository;

	    @Autowired
	    private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtApplication.class, args);
	}
	
	@Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Transactional
//	 @Override
//    public void run(String... strings) throws Exception {
//    	 Employee employee = new Employee();
//         employee.setEmpName("JIP");
//         
//         EmployeeAddress employeeAddress1 = new EmployeeAddress();
//         employeeAddress1.setStreet("Street 1");
//         employeeAddress1.setCity("City 1");
//         employeeAddress1.setCountry("Country 1");
//         employeeAddress1.setState("State 1");
//         employeeAddress1.setEmployee(employee);
//         
//         
//         EmployeeAddress employeeAddress2 = new EmployeeAddress();
//         employeeAddress2.setStreet("Street 2");
//         employeeAddress2.setCity("City 2");
//         employeeAddress2.setCountry("Country 2");
//         employeeAddress2.setState("State 2");
//         employeeAddress2.setEmployee(employee);
//         
//         Set<EmployeeAddress> employeeAddressSet = new HashSet();
//         employeeAddressSet.add(employeeAddress1);
//         employeeAddressSet.add(employeeAddress2);
//         
//         employee.setEmployeeAddress(employeeAddressSet);
//         
//         employeeRepository.save(employee);
//         System.out.println("Employee and Employee Address saved successfully!!");
//    }
//	    @Transactional
//		 @Override
//	    public void run(String... strings) throws Exception {
//	        // save a couple of books
//	        Publisher publisherA = new Publisher("Publisher A");
//	        Publisher publisherB = new Publisher("Publisher B");
//	        Publisher publisherC = new Publisher("Publisher C");
//
//	        bookRepository.save(new Book("Book A", new HashSet<Publisher>(){{
//	                add(publisherA);
//	                add(publisherB);
//	            }}));
//	        
//	        bookRepository.save(new Book("Book B", new HashSet<Publisher>(){{
//                add(publisherA);
//                add(publisherC);
//            }}));
//
//	        // fetch all books
//	        for(Book book : bookRepository.findAll()) {
//	            logger.info(book.toString());
//	        }
//
//	        // save a couple of publishers
//	        Book bookA = new Book("Book A");
//	        Book bookB = new Book("Book B");
//
//	        publisherRepository.save(new Publisher("Publisher A", new HashSet<Book>() {{
//	                add(bookA);
//	                add(bookB);
//	            }}));
//
//	        publisherRepository.save(new Publisher("Publisher B", new HashSet<Book>() {{
//	                add(bookA);
//	                add(bookB);
//	            }}));
//
//	        // fetch all publishers
//	        for(Publisher publisher : publisherRepository.findAll()) {
//	            logger.info(publisher.toString());
//	        }
//	    }
}
