package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Employes.Employe;
import com.example.demo.Employes.InterfaceEmployes;

@SpringBootApplication
public class Company1Application implements CommandLineRunner {
	@Autowired
	private InterfaceEmployes interfaceEmployes;
	public static void main(String[] args) {
		SpringApplication.run(Company1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 interfaceEmployes.save(new Employe("Josephine","Bernard",123456)  );
	}

}
