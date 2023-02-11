package com.JpaExample.demoJpa;

import com.JpaExample.demoJpa.Repository.StudentDetailsRepository;
import com.JpaExample.demoJpa.model.StudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaApplication.class, args);

	}

	@Autowired
	StudentDetailsRepository studentDetailsRepository;

	public void run(String... args) throws Exception {
		StudentDetails st = new StudentDetails();
		//st.setId(1L);
		st.setStudentName("Ankit");
		System.out.println(st);
		studentDetailsRepository.save(st);
        System.exit(0);
	}

}
