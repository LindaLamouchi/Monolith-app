package com.example.demo.Fournisseurs;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fournisseur implements Serializable {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nom,prenom;
private int cin;
public Fournisseur() {
	// TODO Auto-generated constructor stub
}
public Fournisseur(String nom, String prenom, int cin) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.cin = cin;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getCin() {
	return cin;
}
public void setCin(int cin) {
	this.cin = cin;
}

}
