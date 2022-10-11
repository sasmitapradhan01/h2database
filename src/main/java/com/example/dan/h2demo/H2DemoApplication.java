package com.example.dan.h2demo;

import com.example.dan.h2demo.model.Book;
import com.example.dan.h2demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2DemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(H2DemoApplication.class, args);
	Object dataSource = context.getBean("dataSource");
	System.out.println(dataSource);
	}

	@Bean
	CommandLineRunner commandLineRunner(BookRepository repository){
		return args -> {
			//add some data
			repository.save(new Book(null,"spring Boot: Up and Running",999,"Mark"));
		};
	}

}
