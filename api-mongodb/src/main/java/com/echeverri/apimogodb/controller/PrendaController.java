package com.echeverri.apimogodb.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.echeverri.apimogodb.model.Prenda;
import com.echeverri.apimogodb.service.PrendaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PrendaController implements IPrendaController {
	
	private final PrendaService prendaService;
	
	@PostMapping("/prenda")
	public void save(@RequestBody Prenda prenda) {
		prendaService.save(prenda);
	}
	
	@GetMapping("/prendas")
	public List<Prenda> findAll(){
		return prendaService.findAll();
	}
	
	@GetMapping("/prenda/{id}")
	public Prenda findById(@PathVariable String id) {
		return prendaService.findById(id).get();
	}
	
	@DeleteMapping("/prenda/{id}")
	public void deleteById(@PathVariable String id) {
		prendaService.deleteById(id);
	}
	
	@PutMapping("/prenda")
	public Prenda update(@RequestBody Prenda prenda) {
		return prendaService.update(prenda);
	}

	@PatchMapping("/prenda/{id}")
	public Prenda patch(@PathVariable String id,@RequestBody Prenda prenda) {
		return prendaService.patch(id, prenda);
	}

	@RequestMapping(path="/prenda/{id}", method = RequestMethod.HEAD)
	public ResponseEntity<?> existById(@PathVariable String id) {
		return prendaService.existById(id) ? new ResponseEntity(HttpStatus.OK):new ResponseEntity(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(path="/prenda", method = RequestMethod.OPTIONS)
	public HttpHeaders optionsPrenda() {
		return prendaService.optionsPrenda();
	}
	
	
}
