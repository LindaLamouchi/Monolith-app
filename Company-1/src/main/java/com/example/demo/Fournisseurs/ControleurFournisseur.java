package com.example.demo.Fournisseurs;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/fournisseurs")
public class ControleurFournisseur {

	@Autowired
	private InterfaceFournisseurs interfaceFournisseurs;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Fournisseur> getAll(){
		return interfaceFournisseurs.findAll();
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Optional<Fournisseur> getOne(@PathVariable Long id){
		 return interfaceFournisseurs.findById(id) ;
	}

	@RequestMapping(value="/",method=RequestMethod.POST)
	public Fournisseur save(@RequestBody Fournisseur c){
		 return interfaceFournisseurs.save(c) ;
	}

	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public boolean delete(@PathVariable Long id){
		interfaceFournisseurs.deleteById(id);
		 return true; 
	}
	
}
