package com.example.demo;

import com.example.demo.entities.Laptop;
import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
@Autowired
	StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Student student = new Student();
		student.setName("ritesh shinde");
		student.setAbout("i am software engineer");

		Laptop laptop = new Laptop();
		laptop.setBrand("hp");
		laptop.setModelNumber("pavilion");
		laptop.setStudent(student);
		studentRepository.save(student);
	}
}
