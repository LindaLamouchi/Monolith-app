package com.example.demo.Employes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controleur {

	@Autowired
	private InterfaceEmployes interfaceEmployes;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Employe> getAll(){
		return interfaceEmployes.findAll();
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Optional<Employe> getOne(@PathVariable Long id){
		 return interfaceEmployes.findById(id) ;
	}

	@RequestMapping(value="/",method=RequestMethod.POST)
	public Employe save(@RequestBody Employe c){
		 return interfaceEmployes.save(c) ;
	}

	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public boolean delete(@PathVariable Long id){
		interfaceEmployes.deleteById(id);
		 return true; 
	}
	
}
