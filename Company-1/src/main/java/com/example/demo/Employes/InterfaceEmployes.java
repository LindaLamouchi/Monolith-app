package com.example.demo.Employes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfaceEmployes  extends JpaRepository<Employe, Long>{
 @Override
default List<Employe> findAll() {
	// TODO Auto-generated method stub
	return null;
}
}
