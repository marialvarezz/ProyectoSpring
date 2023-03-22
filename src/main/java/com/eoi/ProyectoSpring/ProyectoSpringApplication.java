package com.eoi.ProyectoSpring;

import com.eoi.ProyectoSpring.entities.Customer;
import com.eoi.ProyectoSpring.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class ProyectoSpringApplication implements CommandLineRunner {
	@Autowired
	CustomerRepository customerRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Customer customer=new Customer("Juan",
				"Cuesta",
				LocalDate.of(1972,11,16),
				LocalDateTime.now());

		Customer customer1=new Customer("Juriji",
				"Der Klee",
				LocalDate.of(1992,04,19),
				LocalDateTime.now());
		customerRepository.save(customer);
		customerRepository.save(customer1);
	}
}
