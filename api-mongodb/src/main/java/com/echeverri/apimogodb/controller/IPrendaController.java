package com.echeverri.apimogodb.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import com.echeverri.apimogodb.model.Prenda;

public interface IPrendaController {
	
	public void save(Prenda prenda);
	
	public List<Prenda> findAll();
	
	public Prenda findById(String id);
	
	public void deleteById(String id);
	
	public Prenda update(Prenda prenda);
	
	public Prenda patch(String id, Prenda prenda);
	
	public ResponseEntity<?> existById(String id);
	
	public String optionsPrenda();

}
