package com.echeverri.apimogodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import com.echeverri.apimogodb.model.Prenda;

public interface IPrendaService {
	
	public void save (Prenda prenda);
	
	public Prenda update(Prenda prenda);
	
	public Prenda patch(String id, Prenda prenda);
	
	public List<Prenda> findAll();
	
	public Optional<Prenda> findById(String id);
	
	public void deleteById (String id);
	
	public boolean existById(String id);
	
	public HttpHeaders optionsPrenda();
}
