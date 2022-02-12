package com.TheTrueHooha.MySchool;

import com.TheTrueHooha.MySchool.entity.Student;
import com.TheTrueHooha.MySchool.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MySchoolApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MySchoolApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository ;

	@Override
	public void run(String... args) throws Exception {
		//parsing student data that gets save into the student repo object

		Student student1 = new Student("Kings", "Bright", "brightog@gmail.com",
				"male", "02/2/2022", "22 abiola stree");
		studentRepository.save(student1);

		Student student2 = new Student("Jadon", "praise", "jp@gmail.com",
				"male", "19/5/1992", "22 bright street");
		studentRepository.save(student2);

		Student student3 = new Student("Vicky", "praise", "jp@gmail.com",
				"female", "19/5/1992", "22 bright street");
		studentRepository.save(student3);

		Student student4 = new Student("Agnes", "praise", "jp@gmail.com",
				"female", "19/5/1992", "22 bright street");
		studentRepository.save(student4);

		Student student5 = new Student("Grace", "praise", "jp@gmail.com",
				"female", "19/5/1992", "22 bright street");
		studentRepository.save(student5);
	}
}
